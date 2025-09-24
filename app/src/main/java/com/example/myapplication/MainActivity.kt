package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.BorderStroke
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.myapplication.model.ChefRole
import com.example.myapplication.model.Recipe
import com.example.myapplication.model.RecipeCategory
import com.example.myapplication.model.RecipeRepository
import com.example.myapplication.ui.theme.DeepIndigo
import com.example.myapplication.ui.theme.FrostedWhite
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                YemekYapalimmiApp()
            }
        }
    }
}

private sealed class AppScreen {
    data object RoleSelection : AppScreen()
    data class CategorySelection(val role: ChefRole) : AppScreen()
    data class RecipeList(val role: ChefRole, val category: RecipeCategory) : AppScreen()
    data class RecipeDetail(val role: ChefRole, val category: RecipeCategory, val recipe: Recipe) : AppScreen()
}

@Composable
private fun YemekYapalimmiApp() {
    val categories = remember { RecipeRepository.categories }
    var currentScreen by remember { mutableStateOf<AppScreen>(AppScreen.RoleSelection) }

    val roleForBackground = when (val screen = currentScreen) {
        AppScreen.RoleSelection -> null
        is AppScreen.CategorySelection -> screen.role
        is AppScreen.RecipeList -> screen.role
        is AppScreen.RecipeDetail -> screen.role
    }

    val gradient = roleForBackground?.gradient ?: listOf(Color(0xFFFDF6FF), Color(0xFFEFF4FF))

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.Transparent
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Brush.verticalGradient(gradient))
        ) {
            when (val screen = currentScreen) {
                AppScreen.RoleSelection -> RoleSelectionScreen(onRoleSelected = {
                    currentScreen = AppScreen.CategorySelection(it)
                })

                is AppScreen.CategorySelection -> {
                    BackHandler { currentScreen = AppScreen.RoleSelection }

                    CategoryScreen(

                        role = screen.role,
                        categories = categories,
                        onCategorySelected = { category ->
                            currentScreen = AppScreen.RecipeList(screen.role, category)
                        },
                        onBack = { currentScreen = AppScreen.RoleSelection }
                    )
                }

                is AppScreen.RecipeList -> {
                    BackHandler { currentScreen = AppScreen.CategorySelection(screen.role) }
                    RecipeListScreen(
                        role = screen.role,
                        category = screen.category,
                        onRecipeSelected = { recipe ->
                            currentScreen = AppScreen.RecipeDetail(screen.role, screen.category, recipe)
                        },
                        onBack = { currentScreen = AppScreen.CategorySelection(screen.role) }
                    )
                }

                is AppScreen.RecipeDetail -> {
                    BackHandler { currentScreen = AppScreen.RecipeList(screen.role, screen.category) }

                    RecipeScreen(

                        role = screen.role,
                        category = screen.category,
                        recipe = screen.recipe,
                        onBack = { currentScreen = AppScreen.RecipeList(screen.role, screen.category) }
                    )
                }
            }
        }
    }
}

@Composable
private fun RoleSelectionScreen(onRoleSelected: (ChefRole) -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp, vertical = 48.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(32.dp)
        ) {
            Text(
                text = "Yemek Yapalım mı?",
                style = MaterialTheme.typography.headlineLarge.copy(
                    color = DeepIndigo,
                    fontWeight = FontWeight.Bold
                ),
                textAlign = TextAlign.Center
            )
            Text(
                text = "Tarifi paylaş, birlikte tamamlayalım",
                style = MaterialTheme.typography.bodyLarge.copy(
                    color = DeepIndigo.copy(alpha = 0.7f)
                ),
                textAlign = TextAlign.Center
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(24.dp)
            ) {
                RoleCard(role = ChefRole.Female, modifier = Modifier.weight(1f)) {
                    onRoleSelected(ChefRole.Female)
                }
                RoleCard(role = ChefRole.Male, modifier = Modifier.weight(1f)) {
                    onRoleSelected(ChefRole.Male)
                }
            }
        }
    }
}

@Composable
private fun RoleCard(role: ChefRole, modifier: Modifier = Modifier, onClick: () -> Unit) {
    val shape = RoundedCornerShape(32.dp)
    val interactionSource = remember { MutableInteractionSource() }
    Column(
        modifier = modifier
            .shadow(elevation = 8.dp, shape = shape, clip = false)
            .clip(shape)
            .background(color = FrostedWhite)
            .border(width = 1.dp, color = role.primaryColor.copy(alpha = 0.4f), shape = shape)
            .clickable(
                interactionSource = interactionSource,
                indication = null,
                onClick = onClick
            )
            .padding(horizontal = 24.dp, vertical = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Box(
            modifier = Modifier
                .size(96.dp)
                .clip(CircleShape)
                .background(Brush.linearGradient(role.gradient))
                .border(1.dp, role.primaryColor.copy(alpha = 0.5f), CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = role.icon),
                contentDescription = role.displayName,
                modifier = Modifier.size(56.dp)
            )
        }
        Text(
            text = role.displayName,
            style = MaterialTheme.typography.titleMedium.copy(
                color = DeepIndigo,
                fontWeight = FontWeight.SemiBold
            ),
            textAlign = TextAlign.Center
        )
        Text(
            text = role.mission,
            style = MaterialTheme.typography.bodyMedium.copy(color = DeepIndigo.copy(alpha = 0.65f)),
            textAlign = TextAlign.Center
        )
    }
}

@Composable

private fun CategoryScreen(

    role: ChefRole,
    categories: List<RecipeCategory>,
    onCategorySelected: (RecipeCategory) -> Unit,
    onBack: () -> Unit
) {
    val topPadding = 16.dp
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            YemekTopBar(
                title = "${role.shortLabel} Şef",
                subtitle = "Bir kategori seç",
                role = role,
                onBack = onBack
            )
        },
        containerColor = Color.Transparent
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .padding(innerPadding)
                .padding(horizontal = 20.dp)
                .fillMaxSize(),
            contentPadding = PaddingValues(top = topPadding, bottom = 32.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            items(categories) { category ->
                CategoryCard(
                    category = category,
                    onClick = { onCategorySelected(category) }
                )
            }
        }
    }
}

@Composable
private fun CategoryCard(category: RecipeCategory, onClick: () -> Unit) {
    val shape = RoundedCornerShape(28.dp)
    Card(
        onClick = onClick,
        shape = shape,
        colors = CardDefaults.cardColors(containerColor = FrostedWhite),
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(64.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .background(category.accentColor.copy(alpha = 0.35f)),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = category.iconRes),
                    contentDescription = category.title,
                    modifier = Modifier.size(36.dp)
                )
            }
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = category.title,
                    style = MaterialTheme.typography.titleMedium.copy(
                        color = DeepIndigo,
                        fontWeight = FontWeight.SemiBold
                    )
                )
                Text(
                    text = "${category.recipes.size} tarif",
                    style = MaterialTheme.typography.bodySmall.copy(color = DeepIndigo.copy(alpha = 0.6f))
                )
            }
            Image(
                painter = painterResource(id = category.iconRes),
                contentDescription = null,
                modifier = Modifier
                    .size(56.dp)
                    .clip(RoundedCornerShape(18.dp))
                    .background(category.accentColor.copy(alpha = 0.2f)),
                contentScale = ContentScale.Fit
            )
        }
    }
}

@Composable
private fun RecipeListScreen(
    role: ChefRole,
    category: RecipeCategory,
    onRecipeSelected: (Recipe) -> Unit,
    onBack: () -> Unit
) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            YemekTopBar(
                title = category.title,
                subtitle = "${role.shortLabel} şef için adımı seç",
                role = role,
                onBack = onBack
            )
        },
        containerColor = Color.Transparent
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .padding(innerPadding)
                .padding(horizontal = 20.dp)
                .fillMaxSize(),
            contentPadding = PaddingValues(vertical = 24.dp),
            verticalArrangement = Arrangement.spacedBy(18.dp)
        ) {
            items(category.recipes) { recipe ->
                RecipeCard(
                    category = category,
                    recipe = recipe,
                    onClick = { onRecipeSelected(recipe) }
                )
            }
        }
    }
}

@Composable
private fun RecipeCard(category: RecipeCategory, recipe: Recipe, onClick: () -> Unit) {
    val shape = RoundedCornerShape(26.dp)
    Card(
        onClick = onClick,
        shape = shape,
        colors = CardDefaults.cardColors(containerColor = FrostedWhite),
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(18.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(56.dp)
                    .clip(RoundedCornerShape(18.dp))
                    .background(category.accentColor.copy(alpha = 0.35f)),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = category.iconRes),
                    contentDescription = recipe.name,
                    modifier = Modifier.size(32.dp)
                )
            }
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = recipe.name,
                    style = MaterialTheme.typography.titleSmall.copy(
                        color = DeepIndigo,
                        fontWeight = FontWeight.SemiBold
                    ),
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    text = "Tarifin iki aşaması",
                    style = MaterialTheme.typography.bodySmall.copy(color = DeepIndigo.copy(alpha = 0.6f))
                )
            }
            Image(
                painter = painterResource(id = recipe.thumbnailRes),
                contentDescription = null,
                modifier = Modifier
                    .size(64.dp)
                    .clip(RoundedCornerShape(20.dp)),
                contentScale = ContentScale.Crop
            )
        }
    }
}

@Composable

private fun RecipeScreen(
    role: ChefRole,
    category: RecipeCategory,
    recipe: Recipe,
    onBack: () -> Unit
) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            YemekTopBar(
                title = recipe.name,
                subtitle = role.mission,
                role = role,
                onBack = onBack
            )
        },
        containerColor = Color.Transparent
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(horizontal = 20.dp)
                .fillMaxSize()
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            RecipeHeroCard(category = category, recipe = recipe)
            RoleInstructionSection(
                role = role,
                recipe = recipe
            )
            CollaborationCard(role = role, recipe = recipe)
            Spacer(modifier = Modifier.height(32.dp))
        }
    }
}

@Composable
private fun RecipeHeroCard(category: RecipeCategory, recipe: Recipe) {
    val shape = RoundedCornerShape(32.dp)
    val imageShape = RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp)
    Card(
        shape = shape,
        colors = CardDefaults.cardColors(containerColor = FrostedWhite),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Image(
                painter = painterResource(id = recipe.thumbnailRes),
                contentDescription = recipe.name,
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(1.6f)
                    .clip(imageShape),
                contentScale = ContentScale.Crop
            )
            Column(modifier = Modifier.padding(horizontal = 20.dp, vertical = 16.dp)) {
                Text(
                    text = category.title,
                    style = MaterialTheme.typography.labelLarge.copy(color = category.accentColor.darken(0.3f)),
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = recipe.name,
                    style = MaterialTheme.typography.titleLarge.copy(
                        color = DeepIndigo,
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(
                    text = "Tarif iki aşamada tamamlanır: hazırlık ve pişirme adımlarını birleştirin.",
                    style = MaterialTheme.typography.bodyMedium.copy(color = DeepIndigo.copy(alpha = 0.6f))
                )
            }
        }
    }
}

@Composable
private fun RoleInstructionSection(role: ChefRole, recipe: Recipe) {
    val partnerRole = role.opposite()
    var showPartnerSteps by remember { mutableStateOf(false) }

    Column(verticalArrangement = Arrangement.spacedBy(18.dp)) {
        Text(
            text = "Adımlar",
            style = MaterialTheme.typography.titleMedium.copy(
                color = DeepIndigo,
                fontWeight = FontWeight.SemiBold
            )
        )
        InstructionCard(
            role = role,
            steps = recipe.stepsFor(role),
            isHighlighted = true
        )
        InstructionCard(
            role = partnerRole,
            steps = recipe.stepsFor(partnerRole),
            isHighlighted = false,
            showSteps = showPartnerSteps,
            extraContent = { isExpanded ->
                if (!isExpanded) {
                    Text(
                        text = "Partnerinin adımlarını görmek için dokun.",
                        style = MaterialTheme.typography.bodySmall.copy(color = DeepIndigo.copy(alpha = 0.65f))
                    )
                }
                Button(
                    onClick = { showPartnerSteps = !showPartnerSteps },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = partnerRole.primaryColor.copy(alpha = 0.7f),
                        contentColor = DeepIndigo
                    ),
                    shape = RoundedCornerShape(18.dp)
                ) {
                    Text(text = if (isExpanded) "Gizle" else "Göster")
                }
            }
        )
    }
}

@Composable
private fun InstructionCard(
    role: ChefRole,
    steps: List<String>,
    isHighlighted: Boolean,
    showSteps: Boolean = true,

    extraContent: (@Composable ColumnScope.(Boolean) -> Unit)? = null

) {
    val shape = RoundedCornerShape(28.dp)
    Card(
        shape = shape,
        colors = CardDefaults.cardColors(containerColor = FrostedWhite),
        elevation = CardDefaults.cardElevation(defaultElevation = if (isHighlighted) 10.dp else 4.dp),
        border = if (isHighlighted) BorderStroke(2.dp, role.primaryColor.copy(alpha = 0.5f)) else null
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Box(
                    modifier = Modifier
                        .size(48.dp)
                        .clip(RoundedCornerShape(16.dp))
                        .background(role.primaryColor.copy(alpha = if (isHighlighted) 0.45f else 0.25f)),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = role.icon),
                        contentDescription = null,
                        modifier = Modifier.size(28.dp)
                    )
                }
                Column {
                    Text(
                        text = role.displayName,
                        style = MaterialTheme.typography.titleMedium.copy(
                            color = DeepIndigo,
                            fontWeight = FontWeight.SemiBold
                        )
                    )
                    Text(
                        text = role.mission,
                        style = MaterialTheme.typography.bodySmall.copy(color = DeepIndigo.copy(alpha = 0.6f))
                    )
                }
            }
            AnimatedVisibility(visible = showSteps) {
                Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                    steps.forEachIndexed { index, step ->
                        StepRow(index = index + 1, text = step, accent = role.primaryColor)
                    }
                }
            }
            extraContent?.invoke(this, showSteps)
        }
    }
}

@Composable
private fun StepRow(index: Int, text: String, accent: Color) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalAlignment = Alignment.Top
    ) {
        Box(
            modifier = Modifier
                .size(28.dp)
                .clip(CircleShape)
                .background(accent.copy(alpha = 0.6f)),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = index.toString(),
                style = MaterialTheme.typography.labelLarge.copy(
                    color = DeepIndigo,
                    fontWeight = FontWeight.Bold
                )
            )
        }
        Text(
            text = text,
            style = MaterialTheme.typography.bodyMedium.copy(color = DeepIndigo.copy(alpha = 0.85f)),
            modifier = Modifier.weight(1f)
        )
    }
}

@Composable
private fun CollaborationCard(role: ChefRole, recipe: Recipe) {
    val shape = RoundedCornerShape(28.dp)
    val partnerRole = role.opposite()
    Card(
        shape = shape,
        colors = CardDefaults.cardColors(containerColor = FrostedWhite),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Text(
                text = "Birlikte daha lezzetli",
                style = MaterialTheme.typography.titleMedium.copy(
                    color = DeepIndigo,
                    fontWeight = FontWeight.SemiBold
                )
            )
            Text(
                text = "Partnerin ${partnerRole.displayName} adımlarını tamamladığında ${recipe.name} servise hazır olacak. Aşamaları birleştirip sofraya beraber taşıyın!",
                style = MaterialTheme.typography.bodyMedium.copy(color = DeepIndigo.copy(alpha = 0.7f))
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun YemekTopBar(title: String, subtitle: String, role: ChefRole, onBack: () -> Unit) {
    val scrollBehavior = TopAppBarDefaults.exitUntilCollapsedScrollBehavior(rememberTopAppBarState())
    androidx.compose.material3.CenterAlignedTopAppBar(
        title = {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = title,
                    style = MaterialTheme.typography.titleLarge.copy(
                        color = DeepIndigo,
                        fontWeight = FontWeight.Bold
                    ),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    textAlign = TextAlign.Center
                )
                AnimatedVisibility(visible = subtitle.isNotEmpty(), enter = fadeIn(), exit = fadeOut()) {
                    Text(
                        text = subtitle,
                        style = MaterialTheme.typography.bodySmall.copy(color = DeepIndigo.copy(alpha = 0.65f)),
                        textAlign = TextAlign.Center
                    )
                }
            }
        },
        navigationIcon = {
            IconButton(onClick = onBack) {
                Image(
                    painter = painterResource(id = R.drawable.ic_arrow_back),
                    contentDescription = "Geri"
                )
            }
        },
        actions = {
            Image(
                painter = painterResource(id = role.icon),
                contentDescription = role.displayName,
                modifier = Modifier
                    .padding(end = 12.dp)
                    .size(36.dp)
            )
        },
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = Color.Transparent,
            scrolledContainerColor = role.secondaryColor.copy(alpha = 0.2f),
            navigationIconContentColor = DeepIndigo,
            titleContentColor = DeepIndigo
        ),
        scrollBehavior = scrollBehavior
    )
}

private fun Color.darken(factor: Float): Color {
    val newRed = (red * (1f - factor)).coerceIn(0f, 1f)
    val newGreen = (green * (1f - factor)).coerceIn(0f, 1f)
    val newBlue = (blue * (1f - factor)).coerceIn(0f, 1f)
    return Color(newRed, newGreen, newBlue, alpha)
}
