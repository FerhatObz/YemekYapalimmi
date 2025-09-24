package com.example.myapplication.model

import androidx.compose.ui.graphics.Color
import com.example.myapplication.R

object RecipeData {
    val categories = listOf(
        RecipeCategory(
            id = "makarna",
            title = "Makarna",
            iconRes = R.drawable.ic_category_pasta,
            accentColor = Color(0xFFFFB1C1),
            recipes = listOf(
                Recipe(
                    id = "makarna_domatesli_spagetti",
                    name = "Klasik Domatesli Spagetti",
                    thumbnailRes = R.drawable.ic_recipe_thumb_peach,
                    prepMinutes = 15,
                    cookMinutes = 20,
                    totalMinutes = 35,
                    calories = 520,
                    ingredients = listOf(
                        "400 g spagetti",
                        "6 adet olgun domates",
                        "3 yemek kaşığı zeytinyağı",
                        "2 diş sarımsak",
                        "1 tatlı kaşığı kuru fesleğen",
                        "1 çay kaşığı toz şeker",
                        "Tuz ve karabiber",
                        "Servis için rendelenmiş peynir"
                    ),
                    femaleSteps = listOf(
                        "Domatesleri sıcak suya batırıp kabuklarını soyun ve küp doğrayın.",
                        "Geniş tavada zeytinyağını ısıtıp ezilmiş sarımsakları kokusu çıkana kadar çevirin.",
                        "Domates, fesleğen, şeker ve baharatları ekleyip sosu kıvam alana dek pişirin."
                    ),
                    maleSteps = listOf(
                        "Büyük bir tencerede suyu kaynatıp bolca tuz ekleyin.",
                        "Spagettiyi paketteki süreye göre al dente olacak şekilde haşlayın.",
                        "Süzülen makarnayı domates sosuyla karıştırıp üzerine peynir serpip servis edin."
                    )
                ),
                Recipe(
                    id = "makarna_kremali_mantarli_fettuccine",
                    name = "Kremalı Mantarlı Fettuccine",
                    thumbnailRes = R.drawable.ic_recipe_thumb_mint,
                    prepMinutes = 20,
                    cookMinutes = 15,
                    totalMinutes = 35,
                    calories = 610,
                    ingredients = listOf(
                        "350 g fettuccine",
                        "300 g kültür mantarı",
                        "1 adet küçük soğan",
                        "2 yemek kaşığı tereyağı",
                        "200 ml krema",
                        "1/2 su bardağı rendelenmiş parmesan",
                        "Taze çekilmiş karabiber",
                        "Maydanoz"
                    ),
                    femaleSteps = listOf(
                        "Mantarı temizleyip ince dilimler halinde doğrayın, soğanı küp kesin.",
                        "Tavada tereyağı eritip soğan ve mantarı kızarana kadar soteleyin.",
                        "Kremayı ekleyip kıvam alınca parmesan ve maydanozla sosu tamamlayın."
                    ),
                    maleSteps = listOf(
                        "Fettuccine'yi tuzlu kaynar suda al dente pişirin.",
                        "Makarnayı süzüp sos tavasına ekleyin ve her yerine sos bulaşana dek çevirin.",
                        "Tabakları doldurup üzerine ekstra parmesan ve karabiber serpin."
                    )
                ),
                Recipe(
                    id = "makarna_pesto_penne",
                    name = "Fesleğenli Pesto Penne",
                    thumbnailRes = R.drawable.ic_recipe_thumb_lilac,
                    prepMinutes = 15,
                    cookMinutes = 12,
                    totalMinutes = 27,
                    calories = 480,
                    ingredients = listOf(
                        "350 g penne",
                        "1 demet taze fesleğen",
                        "1/2 su bardağı zeytinyağı",
                        "1/3 su bardağı dolmalık fıstık",
                        "1/2 su bardağı rendelenmiş parmesan",
                        "1 diş sarımsak",
                        "Tuz",
                        "10 adet cherry domates"
                    ),
                    femaleSteps = listOf(
                        "Fesleğen yaprakları, sarımsak, fıstık ve parmesanla pesto sosunu rondoda çekin.",
                        "Zeytinyağını ince ince ekleyerek parlak bir kıvam elde edin.",
                        "Cherry domatesleri ikiye bölüp az zeytinyağıyla marine edin."
                    ),
                    maleSteps = listOf(
                        "Penne makarnayı bol tuzlu suda diri kalacak şekilde pişirin.",
                        "Süzdükten sonra pesto sosu ve domateslerle geniş bir kapta harmanlayın.",
                        "Tabakları roka yapraklarıyla süsleyerek servis edin."
                    )
                ),
                Recipe(
                    id = "makarna_firin_beşamel",
                    name = "Fırın Beşamel Makarna",
                    thumbnailRes = R.drawable.ic_recipe_thumb_sunrise,
                    prepMinutes = 25,
                    cookMinutes = 30,
                    totalMinutes = 55,
                    calories = 690,
                    ingredients = listOf(
                        "400 g burgu makarna",
                        "2 yemek kaşığı tereyağı",
                        "2 yemek kaşığı un",
                        "4 su bardağı süt",
                        "2 su bardağı rendelenmiş kaşar",
                        "1 su bardağı haşlanmış bezelye",
                        "1 adet havuç",
                        "Tuz, karabiber, muskat"
                    ),
                    femaleSteps = listOf(
                        "Beşamel için tereyağını eritip unla kavurun, sütü ekleyip sürekli çırpın.",
                        "Muskat ve baharatlarla sosu lezzetlendirin, kıvam alınca ocaktan alın.",
                        "Bezelye ve havucu küçük küpler halinde doğrayıp hafifçe soteleyin."
                    ),
                    maleSteps = listOf(
                        "Makarnayı 8 dakika haşlayıp süzün.",
                        "Makarnayı beşamel, sebzeler ve kaşarın yarısıyla karıştırıp fırın kabına alın.",
                        "Üzerine kalan peyniri serpip 190°C fırında kızarana kadar pişirin."
                    )
                ),
                Recipe(
                    id = "makarna_deniz_mahsullu_linguine",
                    name = "Deniz Mahsullü Linguine",
                    thumbnailRes = R.drawable.ic_recipe_thumb_sky,
                    prepMinutes = 20,
                    cookMinutes = 15,
                    totalMinutes = 35,
                    calories = 540,
                    ingredients = listOf(
                        "350 g linguine",
                        "200 g karides",
                        "150 g kalamar halkası",
                        "1 adet soğan",
                        "2 diş sarımsak",
                        "1 çay bardağı beyaz şarap",
                        "1 su bardağı cherry domates",
                        "Taze fesleğen"
                    ),
                    femaleSteps = listOf(
                        "Karides ve kalamarı zeytinyağı, limon kabuğu ve pul biberle marine edin.",
                        "Soğan ve sarımsağı soteleyip marine deniz mahsullerini ekleyin.",
                        "Beyaz şarapla deglaze edip cherry domateslerle sosu tamamlayın."
                    ),
                    maleSteps = listOf(
                        "Linguine'yi tuzlu kaynar suda 10 dakika haşlayın.",
                        "Makarnayı süzüp deniz mahsullü sosla buluşturun.",
                        "Servis ederken fesleğen yaprakları ve limon dilimleri ekleyin."
                    )
                ),
                Recipe(
                    id = "makarna_kabak_spagetti",
                    name = "Kabaklı Hafif Spagetti",
                    thumbnailRes = R.drawable.ic_recipe_thumb_peach,
                    prepMinutes = 15,
                    cookMinutes = 10,
                    totalMinutes = 25,
                    calories = 430,
                    ingredients = listOf(
                        "300 g spagetti",
                        "2 adet kabak",
                        "1 diş sarımsak",
                        "1 adet limon kabuğu rendesi",
                        "1/2 su bardağı rendelenmiş beyaz peynir",
                        "Taze nane ve dereotu",
                        "2 yemek kaşığı zeytinyağı",
                        "Tuz"
                    ),
                    femaleSteps = listOf(
                        "Kabakları spiralizer ile ince şeritler haline getirin.",
                        "Zeytinyağında sarımsağı hafifçe çevirip kabak şeritlerini kısa süre soteleyin.",
                        "Limon kabuğu, nane ve dereotuyla karışımı ferahlatın."
                    ),
                    maleSteps = listOf(
                        "Spagettiyi 8 dakika haşlayıp süzün.",
                        "Makarnayı kabak karışımı ve peynirle harmanlayın.",
                        "Servis tabaklarında taze otlarla süsleyin."
                    )
                ),
                Recipe(
                    id = "makarna_eriste_kofte",
                    name = "Kıvırcık Erişte ve Misket Köfte",
                    thumbnailRes = R.drawable.ic_recipe_thumb_mint,
                    prepMinutes = 25,
                    cookMinutes = 25,
                    totalMinutes = 50,
                    calories = 680,
                    ingredients = listOf(
                        "300 g erişte",
                        "300 g kıyma",
                        "1 adet soğan",
                        "1 adet yumurta",
                        "2 yemek kaşığı galeta unu",
                        "2 yemek kaşığı tereyağı",
                        "1 su bardağı yoğurt",
                        "Pul biber, kimyon"
                    ),
                    femaleSteps = listOf(
                        "Kıymayı soğan, yumurta, galeta unu ve baharatlarla yoğurup küçük köfteler yapın.",
                        "Yoğurdu sarımsakla karıştırarak sosu hazırlayın.",
                        "Köfteleri az yağda kızartıp fazla yağını kağıt havluda süzdürün."
                    ),
                    maleSteps = listOf(
                        "Erişteyi tereyağıyla kavurup üzerine sıcak su ekleyerek pişirin.",
                        "Pişen erişteleri servis tabağına alın, köfteleri üzerine yerleştirin.",
                        "Yoğurt sosu gezdirip pul biberle süsleyin."
                    )
                ),
                Recipe(
                    id = "makarna_peynirli_ravioli",
                    name = "Peynirli Ispanaklı Ravioli",
                    thumbnailRes = R.drawable.ic_recipe_thumb_lilac,
                    prepMinutes = 35,
                    cookMinutes = 10,
                    totalMinutes = 45,
                    calories = 560,
                    ingredients = listOf(
                        "2 su bardağı un",
                        "2 adet yumurta",
                        "200 g ricotta",
                        "150 g ıspanak",
                        "1/3 su bardağı parmesan",
                        "2 yemek kaşığı tereyağı",
                        "Taze adaçayı",
                        "Tuz"
                    ),
                    femaleSteps = listOf(
                        "Ispanağı hafifçe soteleyip ince kıyın, ricotta ve parmesanla iç harcı hazırlayın.",
                        "Hamuru yoğurup ince açın ve iç harçla küçük kareler oluşturun.",
                        "Adaçayını tereyağında kızdırarak servis sosu hazırlayın."
                    ),
                    maleSteps = listOf(
                        "Raviolileri kaynar tuzlu suda 3-4 dakika haşlayın.",
                        "Süzülen raviolileri adaçaylı tereyağa aktararak karıştırın.",
                        "Tabaklara paylaştırıp üzerine parmesan rendeleyin."
                    )
                ),
                Recipe(
                    id = "makarna_acili_arrabbiata",
                    name = "Acılı Arrabbiata",
                    thumbnailRes = R.drawable.ic_recipe_thumb_sunrise,
                    prepMinutes = 10,
                    cookMinutes = 15,
                    totalMinutes = 25,
                    calories = 450,
                    ingredients = listOf(
                        "350 g penne",
                        "4 yemek kaşığı zeytinyağı",
                        "4 diş sarımsak",
                        "2 adet kurutulmuş acı biber",
                        "400 g doğranmış domates",
                        "Tuz, karabiber",
                        "Taze maydanoz"
                    ),
                    femaleSteps = listOf(
                        "Sarımsakları ince dilimleyip zeytinyağında hafifçe kızartın.",
                        "Acı biberleri ekleyip aromasını yağa bırakmasını sağlayın.",
                        "Domatesi ve baharatları ekleyip sosu koyulaştırın."
                    ),
                    maleSteps = listOf(
                        "Penne makarnayı 9 dakika haşlayın.",
                        "Süzdüğünüz makarnayı sosla karıştırın.",
                        "Serviste kıyılmış maydanoz ve parmesan ilave edin."
                    )
                ),
                Recipe(
                    id = "makarna_karidesli_tagliatelle",
                    name = "Karidesli Tagliatelle",
                    thumbnailRes = R.drawable.ic_recipe_thumb_sky,
                    prepMinutes = 18,
                    cookMinutes = 12,
                    totalMinutes = 30,
                    calories = 510,
                    ingredients = listOf(
                        "300 g tagliatelle",
                        "250 g jumbo karides",
                        "1 adet limon",
                        "2 diş sarımsak",
                        "2 yemek kaşığı tereyağı",
                        "1/2 su bardağı beyaz şarap",
                        "Maydanoz",
                        "Pul biber"
                    ),
                    femaleSteps = listOf(
                        "Karidesleri sarımsak, limon kabuğu ve pul biberle marine edin.",
                        "Tereyağında karidesleri kısaca soteleyin, beyaz şarapla lezzetlendirin.",
                        "Sosun içine limon suyu ve maydanoz ekleyin."
                    ),
                    maleSteps = listOf(
                        "Tagliatelle'yi bol tuzlu suda 7 dakika haşlayın.",
                        "Makarnayı süzüp sosla karıştırın.",
                        "Servis tabaklarına alıp limon dilimleriyle sunun."
                    )
                )
            )
        ),
        RecipeCategory(
            id = "corba",
            title = "Çorba",
            iconRes = R.drawable.ic_category_soup,
            accentColor = Color(0xFFFFDCC1),
            recipes = listOf(
                Recipe(
                    id = "corba_mercimek",
                    name = "Klasik Mercimek Çorbası",
                    thumbnailRes = R.drawable.ic_recipe_thumb_peach,
                    prepMinutes = 10,
                    cookMinutes = 30,
                    totalMinutes = 40,
                    calories = 220,
                    ingredients = listOf(
                        "1 su bardağı kırmızı mercimek",
                        "1 adet soğan",
                        "1 adet havuç",
                        "1 yemek kaşığı tereyağı",
                        "1 yemek kaşığı un",
                        "6 su bardağı su",
                        "Tuz, kimyon",
                        "Üzeri için pul biber"
                    ),
                    femaleSteps = listOf(
                        "Soğan ve havucu küp doğrayıp tereyağında yumuşatın.",
                        "Unu ekleyip hafifçe kavurduktan sonra mercimeği ilave edin.",
                        "Suyu ve baharatları ekleyip mercimekler yumuşayana kadar pişirin."
                    ),
                    maleSteps = listOf(
                        "Pişen çorbayı blenderdan geçirip pürüzsüz hale getirin.",
                        "Tuzu ayarlayıp birkaç dakika daha kaynatın.",
                        "Servis kaselerine alıp pul biberli tereyağı gezdirin."
                    )
                ),
                Recipe(
                    id = "corba_yayla",
                    name = "Yayla Çorbası",
                    thumbnailRes = R.drawable.ic_recipe_thumb_mint,
                    prepMinutes = 15,
                    cookMinutes = 25,
                    totalMinutes = 40,
                    calories = 210,
                    ingredients = listOf(
                        "1 su bardağı yoğurt",
                        "1 adet yumurta",
                        "2 yemek kaşığı un",
                        "1/2 su bardağı pirinç",
                        "6 su bardağı su",
                        "2 yemek kaşığı tereyağı",
                        "Nane, pul biber",
                        "Tuz"
                    ),
                    femaleSteps = listOf(
                        "Yoğurt, yumurta ve unu çırparak terbiyeyi hazırlayın.",
                        "Pirinçleri yıkayıp tencerede suyla haşlamaya başlayın.",
                        "Haşlanan pirince terbiyeyi yavaşça ekleyip sürekli karıştırın."
                    ),
                    maleSteps = listOf(
                        "Çorba kıvamını alana kadar kısık ateşte karıştırarak pişirin.",
                        "Tereyağını eritip nane ve pul biberle kızdırın.",
                        "Servis öncesi naneli yağı çorbanın üzerine gezdirin."
                    )
                ),
                Recipe(
                    id = "corba_ezogelin",
                    name = "Ezogelin Çorbası",
                    thumbnailRes = R.drawable.ic_recipe_thumb_lilac,
                    prepMinutes = 15,
                    cookMinutes = 35,
                    totalMinutes = 50,
                    calories = 240,
                    ingredients = listOf(
                        "1 su bardağı kırmızı mercimek",
                        "2 yemek kaşığı bulgur",
                        "1 yemek kaşığı pirinç",
                        "1 adet soğan",
                        "1 yemek kaşığı domates salçası",
                        "1 yemek kaşığı biber salçası",
                        "2 yemek kaşığı tereyağı",
                        "Nane, kimyon"
                    ),
                    femaleSteps = listOf(
                        "Soğanı tereyağında kavurup salçaları ekleyin.",
                        "Mercimek, bulgur ve pirinci ekleyip birkaç dakika çevirin.",
                        "Üzerine sıcak su ekleyip taneler yumuşayana kadar pişirin."
                    ),
                    maleSteps = listOf(
                        "Çorbayı blenderdan geçirip kıvamını ayarlayın.",
                        "Baharatları ekleyip 5 dakika daha kaynatın.",
                        "Serviste limon dilimleri ve naneli tereyağı ekleyin."
                    )
                ),
                Recipe(
                    id = "corba_tarhana",
                    name = "Ev Tarhanası",
                    thumbnailRes = R.drawable.ic_recipe_thumb_sunrise,
                    prepMinutes = 10,
                    cookMinutes = 20,
                    totalMinutes = 30,
                    calories = 200,
                    ingredients = listOf(
                        "3 yemek kaşığı toz tarhana",
                        "1 yemek kaşığı tereyağı",
                        "1 yemek kaşığı domates salçası",
                        "5 su bardağı su",
                        "1 diş sarımsak",
                        "Nane, pul biber",
                        "Tuz"
                    ),
                    femaleSteps = listOf(
                        "Tarhanayı ılık suyla açıp topaklanmasını önleyin.",
                        "Tereyağında sarımsak ve salçayı kavurun.",
                        "Tarhana karışımını tencereye ekleyip karıştırarak kaynatın."
                    ),
                    maleSteps = listOf(
                        "Çorba koyulaşınca tuz ve baharatlarını ayarlayın.",
                        "Kısık ateşte 5 dakika daha pişirin.",
                        "Servis kaselerine alıp nane ve pul biberle süsleyin."
                    )
                ),
                Recipe(
                    id = "corba_brokoli",
                    name = "Kremalı Brokoli Çorbası",
                    thumbnailRes = R.drawable.ic_recipe_thumb_sky,
                    prepMinutes = 15,
                    cookMinutes = 20,
                    totalMinutes = 35,
                    calories = 230,
                    ingredients = listOf(
                        "1 adet brokoli",
                        "1 adet patates",
                        "1 adet soğan",
                        "1 yemek kaşığı tereyağı",
                        "1 yemek kaşığı un",
                        "2 su bardağı süt",
                        "3 su bardağı sebze suyu",
                        "Tuz, muskat"
                    ),
                    femaleSteps = listOf(
                        "Soğanı tereyağında kavurup un ekleyerek kısa süre çevirin.",
                        "Patates ve brokoliyi ekleyip sebze suyuyla yumuşayana kadar pişirin.",
                        "Sütü ekleyip blenderdan geçirerek pürüzsüz kıvam elde edin."
                    ),
                    maleSteps = listOf(
                        "Çorbayı tekrar ocağa alıp tuz ve muskatla tatlandırın.",
                        "Kısık ateşte 5 dakika daha kaynatın.",
                        "Servis kaselerine alıp krema ile süsleyin."
                    )
                ),
                Recipe(
                    id = "corba_balkabagi",
                    name = "Zencefilli Balkabağı Çorbası",
                    thumbnailRes = R.drawable.ic_recipe_thumb_peach,
                    prepMinutes = 15,
                    cookMinutes = 25,
                    totalMinutes = 40,
                    calories = 210,
                    ingredients = listOf(
                        "600 g balkabağı",
                        "1 adet soğan",
                        "1 diş sarımsak",
                        "1 yemek kaşığı taze zencefil",
                        "2 yemek kaşığı zeytinyağı",
                        "4 su bardağı sebze suyu",
                        "1/2 su bardağı krema",
                        "Tuz, karabiber"
                    ),
                    femaleSteps = listOf(
                        "Balkabağı ve soğanı küp doğrayıp zeytinyağında soteleyin.",
                        "Sarımsak ve zencefili ekleyip kokusu çıkana kadar pişirin.",
                        "Sebze suyunu ekleyip balkabakları yumuşayana dek kaynatın."
                    ),
                    maleSteps = listOf(
                        "Pişen çorbayı blenderdan geçirip krema ekleyin.",
                        "Tuz ve karabiberle tatlandırıp 5 dakika daha kaynatın.",
                        "Serviste kavrulmuş çekirdek ve krema ile süsleyin."
                    )
                ),
                Recipe(
                    id = "corba_arabasi",
                    name = "Geleneksel Arabaşı Çorbası",
                    thumbnailRes = R.drawable.ic_recipe_thumb_mint,
                    prepMinutes = 30,
                    cookMinutes = 45,
                    totalMinutes = 75,
                    calories = 360,
                    ingredients = listOf(
                        "500 g tavuk göğsü",
                        "1 adet soğan",
                        "1 yemek kaşığı biber salçası",
                        "1 yemek kaşığı domates salçası",
                        "1 yemek kaşığı un",
                        "8 su bardağı su",
                        "1 tatlı kaşığı toz kırmızı biber",
                        "Hamur için 2 su bardağı un"
                    ),
                    femaleSteps = listOf(
                        "Tavukları haşlayıp didikleyin, suyunu saklayın.",
                        "Soğanı kavurup salça ve unu ekleyerek karıştırın.",
                        "Tavuk suyunu ekleyip kaynatın, baharatlarla tatlandırın."
                    ),
                    maleSteps = listOf(
                        "Hamur için un ve suyu kaynatarak helme kıvamına getirin ve tepsiye dökün.",
                        "Didiklenmiş tavuk etlerini çorbaya ekleyip 10 dakika daha pişirin.",
                        "Hamuru kareler halinde kesip çorbayla birlikte servis edin."
                    )
                ),
                Recipe(
                    id = "corba_sogan",
                    name = "Karamelize Soğan Çorbası",
                    thumbnailRes = R.drawable.ic_recipe_thumb_lilac,
                    prepMinutes = 20,
                    cookMinutes = 40,
                    totalMinutes = 60,
                    calories = 250,
                    ingredients = listOf(
                        "4 adet büyük soğan",
                        "2 yemek kaşığı tereyağı",
                        "1 yemek kaşığı zeytinyağı",
                        "1 yemek kaşığı un",
                        "1 çay bardağı beyaz şarap",
                        "1 litre et suyu",
                        "Taze kekik",
                        "Tuz, karabiber"
                    ),
                    femaleSteps = listOf(
                        "Soğanları ince dilimleyip tereyağı ve zeytinyağında karamelleştirin.",
                        "Unu ekleyip kısa süre kavurun, beyaz şarapla tencereyi deglaze edin.",
                        "Et suyunu ve kekik dalını ekleyip kaynamaya bırakın."
                    ),
                    maleSteps = listOf(
                        "Çorbayı kısık ateşte 20 dakika kaynatıp tuz karabiber ayarını yapın.",
                        "Fırına dayanıklı kaselere alıp üzerine tost ekmeği ve kaşar koyun.",
                        "Fırında peynir eriyene kadar gratine edip servis edin."
                    )
                ),
                Recipe(
                    id = "corba_ispanakli_yogurt",
                    name = "Ispanaklı Yoğurt Çorbası",
                    thumbnailRes = R.drawable.ic_recipe_thumb_sunrise,
                    prepMinutes = 15,
                    cookMinutes = 20,
                    totalMinutes = 35,
                    calories = 190,
                    ingredients = listOf(
                        "500 g ıspanak",
                        "1 su bardağı yoğurt",
                        "1 adet yumurta",
                        "2 yemek kaşığı un",
                        "5 su bardağı tavuk suyu",
                        "2 yemek kaşığı tereyağı",
                        "Sarımsak",
                        "Tuz"
                    ),
                    femaleSteps = listOf(
                        "Yoğurt, yumurta ve unu çırparak terbiyeyi hazırlayın.",
                        "Ispanağı doğrayıp tereyağında hafifçe soldurun.",
                        "Tavuk suyunu ekleyip kaynatın ve terbiyeyi yavaşça karıştırarak ekleyin."
                    ),
                    maleSteps = listOf(
                        "Çorba koyulaştığında tuzunu ayarlayın.",
                        "Sarımsaklı tereyağ hazırlayıp üzerine gezdirin.",
                        "Servis kaselerini çıtır ekmekle tamamlayın."
                    )
                )
            )
        ),
        RecipeCategory(
            id = "tatli",
            title = "Tatlı",
            iconRes = R.drawable.ic_category_dessert,
            accentColor = Color(0xFFF8CFFE),
            recipes = listOf(
                Recipe(
                    id = "tatli_sutlac",
                    name = "Fırın Sütlaç",
                    thumbnailRes = R.drawable.ic_recipe_thumb_peach,
                    prepMinutes = 10,
                    cookMinutes = 50,
                    totalMinutes = 60,
                    calories = 310,
                    ingredients = listOf(
                        "1 litre süt",
                        "1 çay bardağı pirinç",
                        "1 su bardağı toz şeker",
                        "2 yemek kaşığı pirinç unu",
                        "1 adet vanilya çubuğu",
                        "Üzeri için tarçın"
                    ),
                    femaleSteps = listOf(
                        "Pirinçleri yıkayıp 2 su bardağı suyla yumuşayana kadar haşlayın.",
                        "Süt ve vanilyayı ekleyip karıştırarak kaynamaya bırakın.",
                        "Pirinç ununu az sütle açıp tencereye ilave edin ve şekerle tatlandırın."
                    ),
                    maleSteps = listOf(
                        "Kıvam alan sütlacı güveç kaplarına paylaştırın.",
                        "Fırın tepsisine kapları dizip yarısına kadar su doldurun.",
                        "Üstleri kızarana dek 200°C fırında pişirin ve tarçın serpin."
                    )
                ),
                Recipe(
                    id = "tatli_kazan_dibi",
                    name = "Kazandibi",
                    thumbnailRes = R.drawable.ic_recipe_thumb_mint,
                    prepMinutes = 15,
                    cookMinutes = 40,
                    totalMinutes = 55,
                    calories = 320,
                    ingredients = listOf(
                        "1 litre süt",
                        "1 su bardağı şeker",
                        "3 yemek kaşığı pirinç unu",
                        "2 yemek kaşığı nişasta",
                        "2 yemek kaşığı tereyağı",
                        "1 çay kaşığı damla sakızı"
                    ),
                    femaleSteps = listOf(
                        "Süt, şeker, pirinç unu ve nişastayı pürüzsüz olana dek çırpın.",
                        "Damla sakızını havanda dövüp karışıma ekleyin.",
                        "Karışımı kısık ateşte sürekli karıştırarak muhallebi kıvamına getirin."
                    ),
                    maleSteps = listOf(
                        "Tepsiyi tereyağıyla yağlayıp tabanına pudra şekeri serpin.",
                        "Muhallebiyi tepsiye döküp yüzeyi kaynayınca hafifçe karamelize edin.",
                        "Soğutup dilimleyin ve spatula ile rulo şeklinde servis edin."
                    )
                ),
                Recipe(
                    id = "tatli_baklava",
                    name = "Cevizli Baklava",
                    thumbnailRes = R.drawable.ic_recipe_thumb_lilac,
                    prepMinutes = 60,
                    cookMinutes = 40,
                    totalMinutes = 100,
                    calories = 430,
                    ingredients = listOf(
                        "500 g baklavalık yufka",
                        "300 g ceviz içi",
                        "250 g tereyağı",
                        "2 su bardağı toz şeker",
                        "2 su bardağı su",
                        "1 yemek kaşığı limon suyu"
                    ),
                    femaleSteps = listOf(
                        "Cevizi rondoda çekip iç harcı hazırlayın.",
                        "Yufkaları tepsi boyunda kesip her katı tereyağıyla yağlayın.",
                        "Orta katlara ceviz serperek kat kat dizin."
                    ),
                    maleSteps = listOf(
                        "Baklavayı baklava dilimi şeklinde kesin.",
                        "Kalan tereyağını üzerine gezdirip 180°C fırında kızartın.",
                        "Şerbeti hazırlayıp ılıkken sıcak baklavaya dökün."
                    )
                ),
                Recipe(
                    id = "tatli_sekerpare",
                    name = "Şekerpare",
                    thumbnailRes = R.drawable.ic_recipe_thumb_sunrise,
                    prepMinutes = 20,
                    cookMinutes = 25,
                    totalMinutes = 45,
                    calories = 310,
                    ingredients = listOf(
                        "125 g tereyağı",
                        "1 su bardağı pudra şekeri",
                        "2 adet yumurta",
                        "2,5 su bardağı un",
                        "1 paket kabartma tozu",
                        "Şerbet için 3 su bardağı su"
                    ),
                    femaleSteps = listOf(
                        "Tereyağı ve pudra şekerini krem kıvamına gelene dek çırpın.",
                        "Yumurtaları ekleyip unu ve kabartma tozunu ilave ederek yoğurun.",
                        "Hamurdan ceviz büyüklüğünde parçalar alıp tepsiye dizin."
                    ),
                    maleSteps = listOf(
                        "Hamurları 180°C fırında altın rengi alana kadar pişirin.",
                        "Şerbeti kaynatıp ılıtın ve fırından çıkan tatlıların üzerine dökün.",
                        "Tatlılar şerbeti çekince hindistan cevizi ile süsleyin."
                    )
                ),
                Recipe(
                    id = "tatli_revani",
                    name = "Portakallı Revani",
                    thumbnailRes = R.drawable.ic_recipe_thumb_sky,
                    prepMinutes = 15,
                    cookMinutes = 30,
                    totalMinutes = 45,
                    calories = 290,
                    ingredients = listOf(
                        "4 adet yumurta",
                        "1 su bardağı şeker",
                        "1 su bardağı irmik",
                        "1 su bardağı un",
                        "1 su bardağı yoğurt",
                        "1 portakal kabuğu rendesi",
                        "Şerbet için 3 su bardağı su"
                    ),
                    femaleSteps = listOf(
                        "Yumurta ve şekeri beyazlaşana kadar çırpın.",
                        "Yoğurt, irmik, un ve portakal kabuğunu ekleyip karıştırın.",
                        "Yağlanmış tepsiye döküp üzerini düzeltin."
                    ),
                    maleSteps = listOf(
                        "Revaninin içini 180°C fırında pişirip soğumaya bırakın.",
                        "Şerbeti kaynatıp ılıtın ve soğuyan kekin üzerine dökün.",
                        "Serviste kaymak ve fıstıkla süsleyin."
                    )
                ),
                Recipe(
                    id = "tatli_muhallebi_gul",
                    name = "Güllü Muhallebi",
                    thumbnailRes = R.drawable.ic_recipe_thumb_peach,
                    prepMinutes = 10,
                    cookMinutes = 15,
                    totalMinutes = 25,
                    calories = 250,
                    ingredients = listOf(
                        "4 su bardağı süt",
                        "1 su bardağı şeker",
                        "1/2 su bardağı nişasta",
                        "1 yemek kaşığı gül suyu",
                        "1 yemek kaşığı tereyağı",
                        "Üzeri için gül yaprağı"
                    ),
                    femaleSteps = listOf(
                        "Süt, şeker ve nişastayı karıştırarak tencerede pişirmeye başlayın.",
                        "Koyulaşınca tereyağı ve gül suyunu ekleyin.",
                        "Köpüğü alınmış karışımı kaselere paylaştırın."
                    ),
                    maleSteps = listOf(
                        "Kaseleri buzdolabında 2 saat soğutun.",
                        "Servis öncesi gül yaprakları ve file bademle süsleyin.",
                        "Yanında çıtır güllaç parçalarıyla servis edin."
                    )
                ),
                Recipe(
                    id = "tatli_kunefe",
                    name = "Fıstıklı Künefe",
                    thumbnailRes = R.drawable.ic_recipe_thumb_mint,
                    prepMinutes = 20,
                    cookMinutes = 20,
                    totalMinutes = 40,
                    calories = 420,
                    ingredients = listOf(
                        "500 g tel kadayıf",
                        "250 g tuzsuz künefe peyniri",
                        "200 g tereyağı",
                        "1 su bardağı toz Antep fıstığı",
                        "2 su bardağı şeker",
                        "2 su bardağı su",
                        "Yarım limon"
                    ),
                    femaleSteps = listOf(
                        "Kadayıfı tereyağıyla harmanlayıp tel tel açın.",
                        "Şerbet için su, şeker ve limonu kaynatıp soğumaya bırakın.",
                        "Peyniri ince dilimleyip hazırda tutun."
                    ),
                    maleSteps = listOf(
                        "Tavayı tereyağıyla yağlayıp kadayıfın yarısını tabana yayın.",
                        "Peyniri serip kalan kadayıfla kapatın, kısık ateşte her iki tarafını kızartın.",
                        "Sıcak künefenin üzerine soğuk şerbeti döküp fıstıkla süsleyin."
                    )
                ),
                Recipe(
                    id = "tatli_tavukgogsu",
                    name = "Tavuk Göğsü Tatlısı",
                    thumbnailRes = R.drawable.ic_recipe_thumb_lilac,
                    prepMinutes = 25,
                    cookMinutes = 20,
                    totalMinutes = 45,
                    calories = 280,
                    ingredients = listOf(
                        "500 ml süt",
                        "100 g haşlanmış tavuk göğsü",
                        "1/2 su bardağı şeker",
                        "3 yemek kaşığı nişasta",
                        "2 yemek kaşığı tereyağı",
                        "1 çay kaşığı tarçın"
                    ),
                    femaleSteps = listOf(
                        "Haşlanmış tavuk etini didikleyip nişastayla birlikte robottan geçirin.",
                        "Süt ve şekeri tencerede kaynayana dek karıştırın.",
                        "Nişastalı karışımı ekleyip muhallebi kıvamına getirin."
                    ),
                    maleSteps = listOf(
                        "Kıvam alan tatlıyı cam kaba döküp üzerini düzeltin.",
                        "Oda sıcaklığına geldikten sonra buzdolabında soğutun.",
                        "Servis ederken tarçınla süsleyin."
                    )
                ),
                Recipe(
                    id = "tatli_sobiyet",
                    name = "Şöbiyet",
                    thumbnailRes = R.drawable.ic_recipe_thumb_sunrise,
                    prepMinutes = 35,
                    cookMinutes = 30,
                    totalMinutes = 65,
                    calories = 360,
                    ingredients = listOf(
                        "400 g baklavalık yufka",
                        "200 g kaymak",
                        "200 g Antep fıstığı",
                        "200 g tereyağı",
                        "2 su bardağı şeker",
                        "2 su bardağı su"
                    ),
                    femaleSteps = listOf(
                        "Fıstıkları ince çekip kaymakla karıştırın.",
                        "Yufkaları üçgen olacak şekilde kesin.",
                        "Her üçgene tereyağı sürüp kaymaklı içten koyun."
                    ),
                    maleSteps = listOf(
                        "Üçgenleri kapatıp tepsiye dizin.",
                        "Üzerine kalan tereyağını gezdirip 190°C fırında kızartın.",
                        "Şerbeti ılıkken tatlıya dökün ve fıstık serpin."
                    )
                ),
                Recipe(
                    id = "tatli_magnolia",
                    name = "Çilekli Magnolia",
                    thumbnailRes = R.drawable.ic_recipe_thumb_sky,
                    prepMinutes = 20,
                    cookMinutes = 10,
                    totalMinutes = 30,
                    calories = 320,
                    ingredients = listOf(
                        "750 ml süt",
                        "1 çay bardağı şeker",
                        "3 yemek kaşığı un",
                        "2 yemek kaşığı mısır nişastası",
                        "1 paket vanilin",
                        "1 paket bebe bisküvisi",
                        "10 adet çilek"
                    ),
                    femaleSteps = listOf(
                        "Süt, şeker, un ve nişastayı tencerede karıştırıp pişirin.",
                        "Koyulaşınca vanilin ve tereyağı ekleyerek çırpın.",
                        "Çilekleri dilimleyip hazırlayın."
                    ),
                    maleSteps = listOf(
                        "Bisküvileri rondoda çekip taban için hazırlayın.",
                        "Kaselere sırayla bisküvi, muhallebi ve çilek katları yapın.",
                        "Servisten önce 2 saat buzdolabında dinlendirin."
                    )
                )
            )
        ),
        RecipeCategory(
            id = "tavuk",
            title = "Tavuk",
            iconRes = R.drawable.ic_category_chicken,
            accentColor = Color(0xFFCCE8FF),
            recipes = listOf(
                Recipe(
                    id = "tavuk_tas_kebabi",
                    name = "Taş Kebabı",
                    thumbnailRes = R.drawable.ic_recipe_thumb_peach,
                    prepMinutes = 20,
                    cookMinutes = 45,
                    totalMinutes = 65,
                    calories = 480,
                    ingredients = listOf(
                        "600 g tavuk but eti",
                        "2 adet soğan",
                        "2 adet patlıcan",
                        "2 adet domates",
                        "2 yemek kaşığı tereyağı",
                        "1 yemek kaşığı salça",
                        "Tuz, karabiber, kekik",
                        "1 su bardağı sıcak su"
                    ),
                    femaleSteps = listOf(
                        "Soğanları tereyağında kavurup salçayı ekleyin.",
                        "Domatesleri küp doğrayıp tencereye ilave edin.",
                        "Patlıcanları alacalı soyup tuzlu suda bekletin."
                    ),
                    maleSteps = listOf(
                        "Tavuk etlerini kızgın tavada mühürleyin.",
                        "Patlıcanları kızartıp tencereye dizin, tavuk ve sosu ekleyin.",
                        "Kapağı kapalı şekilde 30 dakika kısık ateşte pişirin."
                    )
                ),
                Recipe(
                    id = "tavuk_firinda_soslu",
                    name = "Fırında Sarımsaklı Soslu Tavuk",
                    thumbnailRes = R.drawable.ic_recipe_thumb_mint,
                    prepMinutes = 15,
                    cookMinutes = 40,
                    totalMinutes = 55,
                    calories = 520,
                    ingredients = listOf(
                        "8 adet tavuk baget",
                        "4 diş sarımsak",
                        "1/2 çay bardağı zeytinyağı",
                        "1 yemek kaşığı yoğurt",
                        "1 tatlı kaşığı hardal",
                        "1 tatlı kaşığı kırmızı toz biber",
                        "Taze kekik",
                        "Tuz"
                    ),
                    femaleSteps = listOf(
                        "Sarımsakları ezip yoğurt, hardal, baharat ve zeytinyağıyla sos hazırlayın.",
                        "Bagetleri sosa bulayıp buzdolabında 30 dakika dinlendirin.",
                        "Fırın tepsisini yağlı kağıtla hazırlayın."
                    ),
                    maleSteps = listOf(
                        "Marine edilmiş bagetleri tepsiye yerleştirip 200°C fırında pişirin.",
                        "Yarı pişme süresinde tepsiyi çevirerek eşit kızarmasını sağlayın.",
                        "Serviste kekik dalları ve limon dilimleri ekleyin."
                    )
                ),
                Recipe(
                    id = "tavuk_sebzeli_guvec",
                    name = "Sebzeli Tavuk Güveç",
                    thumbnailRes = R.drawable.ic_recipe_thumb_lilac,
                    prepMinutes = 25,
                    cookMinutes = 50,
                    totalMinutes = 75,
                    calories = 450,
                    ingredients = listOf(
                        "600 g tavuk göğsü",
                        "2 adet patates",
                        "2 adet havuç",
                        "1 adet kabak",
                        "1 su bardağı bezelye",
                        "2 yemek kaşığı tereyağı",
                        "1 yemek kaşığı un",
                        "1 su bardağı tavuk suyu"
                    ),
                    femaleSteps = listOf(
                        "Sebzeleri iri parçalar halinde doğrayın.",
                        "Tereyağında unu kavurup tavuk suyuyla beşamel benzeri sos hazırlayın.",
                        "Güveç kaplarını yağlayın."
                    ),
                    maleSteps = listOf(
                        "Tavukları küp doğrayıp mühürleyin.",
                        "Sebze ve tavukları güveçlere paylaştırıp sosu üzerine dökün.",
                        "200°C fırında 40 dakika pişirip sıcak servis edin."
                    )
                ),
                Recipe(
                    id = "tavuk_pilic_topkapi",
                    name = "Piliç Topkapı",
                    thumbnailRes = R.drawable.ic_recipe_thumb_sunrise,
                    prepMinutes = 30,
                    cookMinutes = 60,
                    totalMinutes = 90,
                    calories = 560,
                    ingredients = listOf(
                        "4 adet tavuk budu",
                        "1 su bardağı pirinç",
                        "2 yemek kaşığı tereyağı",
                        "1/2 su bardağı dolmalık fıstık",
                        "1/2 su bardağı kuş üzümü",
                        "1 çay kaşığı tarçın",
                        "Tuz, karabiber",
                        "1 yemek kaşığı biber salçası"
                    ),
                    femaleSteps = listOf(
                        "Pirinç pilavını tereyağı, fıstık ve kuş üzümüyle hazırlayın.",
                        "Tarçın ve baharatlarla pilavı tatlandırın.",
                        "Tavuk butlarının kemiklerini çıkarıp açın."
                    ),
                    maleSteps = listOf(
                        "Butların içine pilav doldurup ip ile bağlayın.",
                        "Salça ve zeytinyağı karışımıyla butları fırça yardımıyla kaplayın.",
                        "Önceden ısıtılmış 190°C fırında 50 dakika pişirin."
                    )
                ),
                Recipe(
                    id = "tavuk_incirli",
                    name = "İncirli Tavuk Sote",
                    thumbnailRes = R.drawable.ic_recipe_thumb_sky,
                    prepMinutes = 15,
                    cookMinutes = 20,
                    totalMinutes = 35,
                    calories = 430,
                    ingredients = listOf(
                        "500 g tavuk göğsü",
                        "6 adet kuru incir",
                        "1 adet soğan",
                        "2 yemek kaşığı tereyağı",
                        "1 yemek kaşığı balzamik sirke",
                        "1 tatlı kaşığı bal",
                        "Tuz, karabiber",
                        "Taze kekik"
                    ),
                    femaleSteps = listOf(
                        "İncirleri sıcak suda bekletip şeritler halinde doğrayın.",
                        "Soğanı tereyağında karamelize edin.",
                        "Balzamik ve bal ile sos tabanını oluşturun."
                    ),
                    maleSteps = listOf(
                        "Tavukları jülyen doğrayıp yüksek ateşte soteleyin.",
                        "İncirli sosla tavukları buluşturup birkaç dakika pişirin.",
                        "Serviste kekik dallarıyla süsleyin."
                    )
                ),
                Recipe(
                    id = "tavuk_kapama",
                    name = "Tavuk Kapama",
                    thumbnailRes = R.drawable.ic_recipe_thumb_peach,
                    prepMinutes = 25,
                    cookMinutes = 60,
                    totalMinutes = 85,
                    calories = 500,
                    ingredients = listOf(
                        "1 bütün tavuk",
                        "2 su bardağı pirinç",
                        "3 yemek kaşığı tereyağı",
                        "1 adet soğan",
                        "3 su bardağı tavuk suyu",
                        "1 tatlı kaşığı karabiber",
                        "2 adet defne yaprağı",
                        "Tuz"
                    ),
                    femaleSteps = listOf(
                        "Pirinçleri tuzlu suda bekletip süzün.",
                        "Tavuk suyunu defne yapraklarıyla kaynatın.",
                        "Soğanı tereyağında kavurup pirinci ekleyin."
                    ),
                    maleSteps = listOf(
                        "Bütün tavuğu tuzlayıp fırın tepsisine yerleştirin.",
                        "Pirinci tavuk suyuyla yarı pişirip tepsiye yayın.",
                        "Üzerine tavuğu yerleştirip 190°C fırında kızarana kadar pişirin."
                    )
                ),
                Recipe(
                    id = "tavuk_ciftlik",
                    name = "Kremalı Çiftlik Tavuğu",
                    thumbnailRes = R.drawable.ic_recipe_thumb_mint,
                    prepMinutes = 15,
                    cookMinutes = 25,
                    totalMinutes = 40,
                    calories = 470,
                    ingredients = listOf(
                        "600 g kemiksiz tavuk but",
                        "200 ml krema",
                        "150 g mantar",
                        "1 su bardağı bezelye",
                        "2 yemek kaşığı tereyağı",
                        "1 yemek kaşığı un",
                        "1 dal biberiye",
                        "Tuz, karabiber"
                    ),
                    femaleSteps = listOf(
                        "Mantarları dilimleyip tereyağında soteleyin.",
                        "Unu ekleyip hafifçe kavurduktan sonra kremayı ilave edin.",
                        "Bezelyeyi ekleyip sosu kaynatın."
                    ),
                    maleSteps = listOf(
                        "Tavuk butlarını mühürleyip sosun içine ekleyin.",
                        "Biberiye dalını yerleştirip kısık ateşte 15 dakika pişirin.",
                        "Serviste taze çekilmiş karabiber serpin."
                    )
                ),
                Recipe(
                    id = "tavuk_firinda_narenciye",
                    name = "Narenciye Soslu Fırın Tavuk",
                    thumbnailRes = R.drawable.ic_recipe_thumb_lilac,
                    prepMinutes = 20,
                    cookMinutes = 50,
                    totalMinutes = 70,
                    calories = 510,
                    ingredients = listOf(
                        "1 kg tavuk kanat ve but karışımı",
                        "1 adet portakal",
                        "1 adet limon",
                        "3 yemek kaşığı bal",
                        "2 yemek kaşığı soya sosu",
                        "2 diş sarımsak",
                        "Taze biberiye",
                        "Tuz, pul biber"
                    ),
                    femaleSteps = listOf(
                        "Narenciye suyunu sıkıp bal, soya ve sarımsakla marine hazırlayın.",
                        "Tavuğu marinasyona bulayıp en az 1 saat dinlendirin.",
                        "Fırın kabını yağlayın ve biberiye dallarını yerleştirin."
                    ),
                    maleSteps = listOf(
                        "Marine edilmiş tavukları 200°C fırında 40-45 dakika pişirin.",
                        "Pişerken arada kalan marine sosuyla tavukları fırça ile kaplayın.",
                        "Serviste portakal dilimleri ile süsleyin."
                    )
                ),
                Recipe(
                    id = "tavuk_sote_anadolu",
                    name = "Anadolu Usulü Tavuk Sote",
                    thumbnailRes = R.drawable.ic_recipe_thumb_sunrise,
                    prepMinutes = 15,
                    cookMinutes = 25,
                    totalMinutes = 40,
                    calories = 440,
                    ingredients = listOf(
                        "500 g tavuk göğsü",
                        "1 adet kırmızı biber",
                        "1 adet yeşil biber",
                        "2 adet domates",
                        "1 yemek kaşığı tereyağı",
                        "1 yemek kaşığı biber salçası",
                        "1 çay kaşığı kekik",
                        "Tuz, karabiber"
                    ),
                    femaleSteps = listOf(
                        "Biberleri jülyen, domatesleri küp doğrayın.",
                        "Tereyağında salçayı kokusu çıkana kadar kavurun.",
                        "Sebzeleri salçalı karışıma ekleyip 5 dakika pişirin."
                    ),
                    maleSteps = listOf(
                        "Tavukları kuşbaşı doğrayıp yüksek ateşte soteleyin.",
                        "Sebzeli karışıma tavukları ekleyip baharatlayın.",
                        "Kısık ateşte 10 dakika daha pişirip servis edin."
                    )
                ),
                Recipe(
                    id = "tavuk_kestaneli_pilav",
                    name = "Kestaneli Tavuk Pilavı",
                    thumbnailRes = R.drawable.ic_recipe_thumb_sky,
                    prepMinutes = 25,
                    cookMinutes = 35,
                    totalMinutes = 60,
                    calories = 520,
                    ingredients = listOf(
                        "500 g tavuk göğsü",
                        "2 su bardağı pirinç",
                        "1 su bardağı haşlanmış kestane",
                        "1 adet soğan",
                        "2 yemek kaşığı tereyağı",
                        "3 su bardağı tavuk suyu",
                        "1/2 çay kaşığı tarçın",
                        "Tuz, karabiber"
                    ),
                    femaleSteps = listOf(
                        "Pirinçleri ılık suda bekletip süzün.",
                        "Soğanı tereyağında kavurup kestaneleri ekleyin.",
                        "Tavuk suyunu ısıtıp hazırda tutun."
                    ),
                    maleSteps = listOf(
                        "Tavukları küp doğrayıp soteyin.",
                        "Pirinçleri tencereye ekleyip kavurun, tarçınla tatlandırın.",
                        "Tavuk suyu ekleyip demlenmeye bırakın ve servis edin."
                    )
                )
            )
        ),
        RecipeCategory(
            id = "balik",
            title = "Balık",
            iconRes = R.drawable.ic_category_fish,
            accentColor = Color(0xFFBEE4FF),
            recipes = listOf(
                Recipe(
                    id = "balik_firin_levrek",
                    name = "Fırında Levrek",
                    thumbnailRes = R.drawable.ic_recipe_thumb_peach,
                    prepMinutes = 15,
                    cookMinutes = 25,
                    totalMinutes = 40,
                    calories = 320,
                    ingredients = listOf(
                        "2 adet levrek",
                        "1 adet limon",
                        "2 diş sarımsak",
                        "3 yemek kaşığı zeytinyağı",
                        "1 dal biberiye",
                        "1 dal taze kekik",
                        "Tuz, karabiber",
                        "1 adet kırmızı soğan"
                    ),
                    femaleSteps = listOf(
                        "Balığın içini temizleyip kağıt havluyla kurulayın.",
                        "Limon dilimleri, sarımsak ve otlarla balığı doldurun.",
                        "Zeytinyağı ve baharatla dışını ovun."
                    ),
                    maleSteps = listOf(
                        "Soğan ve patates dilimleriyle fırın tepsisini hazırlayın.",
                        "Balıkları 200°C fırında 20-25 dakika pişirin.",
                        "Serviste limon suyu gezdirip roka ile sunun."
                    )
                ),
                Recipe(
                    id = "balik_hamsi_tava",
                    name = "Hamsi Tava",
                    thumbnailRes = R.drawable.ic_recipe_thumb_mint,
                    prepMinutes = 20,
                    cookMinutes = 15,
                    totalMinutes = 35,
                    calories = 380,
                    ingredients = listOf(
                        "600 g hamsi",
                        "1 su bardağı mısır unu",
                        "1/2 çay bardağı sıvı yağ",
                        "1 tatlı kaşığı tuz",
                        "1 tatlı kaşığı pul biber",
                        "1 limon",
                        "Maydanoz"
                    ),
                    femaleSteps = listOf(
                        "Hamsileri temizleyip iyice yıkayın.",
                        "Mısır unu, tuz ve pul biberi karıştırın.",
                        "Hamsileri una bulayıp fazla unu silkeleyin."
                    ),
                    maleSteps = listOf(
                        "Tavayı yağlayıp hamsileri yan yana dizin.",
                        "Her iki yüzünü de altın rengi olana kadar kızartın.",
                        "Serviste limon ve maydanozla sunun."
                    )
                ),
                Recipe(
                    id = "balik_somon_izgara",
                    name = "Izgara Somon",
                    thumbnailRes = R.drawable.ic_recipe_thumb_lilac,
                    prepMinutes = 10,
                    cookMinutes = 15,
                    totalMinutes = 25,
                    calories = 410,
                    ingredients = listOf(
                        "4 dilim somon",
                        "2 yemek kaşığı zeytinyağı",
                        "1 yemek kaşığı bal",
                        "1 yemek kaşığı soya sosu",
                        "1 diş sarımsak",
                        "Taze dereotu",
                        "Tuz, karabiber"
                    ),
                    femaleSteps = listOf(
                        "Zeytinyağı, bal, soya ve ezilmiş sarımsakla marine hazırlayın.",
                        "Somonları marineye bulayıp 15 dakika bekletin.",
                        "Dereotunu kıyıp servis için hazırlayın."
                    ),
                    maleSteps = listOf(
                        "Izgara tavasını ısıtıp somonları kızartın.",
                        "Her yüzünü 4-5 dakika pişirip dışını çıtır bırakın.",
                        "Serviste dereotu ve limon ekleyin."
                    )
                ),
                Recipe(
                    id = "balik_bugulama_lufer",
                    name = "Lüfer Buğulama",
                    thumbnailRes = R.drawable.ic_recipe_thumb_sunrise,
                    prepMinutes = 20,
                    cookMinutes = 25,
                    totalMinutes = 45,
                    calories = 350,
                    ingredients = listOf(
                        "2 adet lüfer",
                        "2 adet domates",
                        "2 adet soğan",
                        "2 adet yeşil biber",
                        "1 çay bardağı zeytinyağı",
                        "1 adet limon",
                        "Tuz, karabiber",
                        "1 demet maydanoz"
                    ),
                    femaleSteps = listOf(
                        "Sebzeleri halka halka doğrayın.",
                        "Balığı temizleyip tuzlayın.",
                        "Fırın tepsisine sebze yatak hazırlayın."
                    ),
                    maleSteps = listOf(
                        "Balıkları sebzelerin üzerine yerleştirip zeytinyağı ve limon gezdirin.",
                        "180°C fırında 25 dakika pişirin.",
                        "Serviste maydanozla süsleyin."
                    )
                ),
                Recipe(
                    id = "balik_palamut_pilaki",
                    name = "Palamut Pilaki",
                    thumbnailRes = R.drawable.ic_recipe_thumb_sky,
                    prepMinutes = 20,
                    cookMinutes = 35,
                    totalMinutes = 55,
                    calories = 370,
                    ingredients = listOf(
                        "2 adet palamut",
                        "2 adet havuç",
                        "2 adet patates",
                        "2 adet soğan",
                        "4 diş sarımsak",
                        "1 çay bardağı zeytinyağı",
                        "1 yemek kaşığı salça",
                        "1 bardak su"
                    ),
                    femaleSteps = listOf(
                        "Sebzeleri iri parçalar halinde doğrayın.",
                        "Zeytinyağında soğan ve sarımsağı kavurun, salçayı ekleyin.",
                        "Sebzeleri tencereye alıp hafifçe soteleyin."
                    ),
                    maleSteps = listOf(
                        "Palamut dilimlerini ekleyip üzerine su ekleyin.",
                        "Kısık ateşte balık pişene kadar yaklaşık 25 dakika pişirin.",
                        "Serviste limon ve maydanozla süsleyin."
                    )
                ),
                Recipe(
                    id = "balik_midye_dolma",
                    name = "Midye Dolma",
                    thumbnailRes = R.drawable.ic_recipe_thumb_peach,
                    prepMinutes = 40,
                    cookMinutes = 35,
                    totalMinutes = 75,
                    calories = 300,
                    ingredients = listOf(
                        "40 adet midye",
                        "2 su bardağı pirinç",
                        "2 adet soğan",
                        "1/2 su bardağı dolmalık fıstık",
                        "1/2 su bardağı kuş üzümü",
                        "3 yemek kaşığı zeytinyağı",
                        "Tarçın, yenibahar",
                        "Limon"
                    ),
                    femaleSteps = listOf(
                        "Soğanı zeytinyağında kavurup fıstık ve pirinci ekleyin.",
                        "Kuş üzümü ve baharatlarla iç pilavı hazırlayın.",
                        "Midyeleri temizleyip kabuklarını açın."
                    ),
                    maleSteps = listOf(
                        "İç pilavı midyelere paylaştırıp kapatın.",
                        "Tencerede dizip üzerini geçmeyecek kadar su ekleyin.",
                        "Kısık ateşte 30 dakika pişirip limonla servis edin."
                    )
                ),
                Recipe(
                    id = "balik_kalkan_tava",
                    name = "Kalkan Şinitzel",
                    thumbnailRes = R.drawable.ic_recipe_thumb_mint,
                    prepMinutes = 25,
                    cookMinutes = 20,
                    totalMinutes = 45,
                    calories = 360,
                    ingredients = listOf(
                        "600 g kalkan fileto",
                        "1 su bardağı galeta unu",
                        "2 adet yumurta",
                        "1 su bardağı un",
                        "1 çay bardağı ayçiçek yağı",
                        "Tuz, karabiber",
                        "1 limon"
                    ),
                    femaleSteps = listOf(
                        "Filetoları porsiyonlara ayırıp tuzlayın.",
                        "Pane için un, çırpılmış yumurta ve galeta ununu hazır edin.",
                        "Limon dilimlerini servis için hazırlayın."
                    ),
                    maleSteps = listOf(
                        "Balıkları sırasıyla una, yumurtaya ve galeta ununa bulayın.",
                        "Yağda her iki tarafını 3-4 dakika kızartın.",
                        "Kağıt havluda süzdürüp limonla servis edin."
                    )
                ),
                Recipe(
                    id = "balik_tursu_sardalya",
                    name = "Sardalya Turşusu",
                    thumbnailRes = R.drawable.ic_recipe_thumb_lilac,
                    prepMinutes = 30,
                    cookMinutes = 0,
                    totalMinutes = 30,
                    calories = 250,
                    ingredients = listOf(
                        "1 kg sardalya",
                        "1 su bardağı üzüm sirkesi",
                        "1 su bardağı su",
                        "5 diş sarımsak",
                        "1 yemek kaşığı tuz",
                        "2 defne yaprağı",
                        "10 adet tane karabiber",
                        "1 tatlı kaşığı kırmızı biber"
                    ),
                    femaleSteps = listOf(
                        "Sardalyaların kılçıklarını ayıklayıp fileto çıkarın.",
                        "Sirkeli turşu suyunu sarımsak ve baharatlarla hazırlayın.",
                        "Cam kavanozları sterilize edin."
                    ),
                    maleSteps = listOf(
                        "Balıkları kavanoza dizip turşu suyunu üzerine dökün.",
                        "Kavanozu kapatıp buzdolabında en az 24 saat dinlendirin.",
                        "Serviste zeytinyağı ve ince doğranmış soğan ekleyin."
                    )
                ),
                Recipe(
                    id = "balik_tekir_tava",
                    name = "Tekir Balığı Tava",
                    thumbnailRes = R.drawable.ic_recipe_thumb_sunrise,
                    prepMinutes = 15,
                    cookMinutes = 12,
                    totalMinutes = 27,
                    calories = 330,
                    ingredients = listOf(
                        "500 g tekir balığı",
                        "1 su bardağı mısır unu",
                        "1 tatlı kaşığı tuz",
                        "1/2 tatlı kaşığı karabiber",
                        "1 çay bardağı ayçiçek yağı",
                        "1 adet limon",
                        "Taze roka"
                    ),
                    femaleSteps = listOf(
                        "Balıkları temizleyip kurulayın.",
                        "Mısır unu ve baharatları karıştırın.",
                        "Roka ve limonu servis için hazırlayın."
                    ),
                    maleSteps = listOf(
                        "Balıkları una bulayıp tavada kızartın.",
                        "Her iki yüzünü 3-4 dakika pişirip çıtır hale getirin.",
                        "Serviste roka ve limonla sunun."
                    )
                ),
                Recipe(
                    id = "balik_firinda_somon_teriyaki",
                    name = "Teriyaki Soslu Fırın Somon",
                    thumbnailRes = R.drawable.ic_recipe_thumb_sky,
                    prepMinutes = 15,
                    cookMinutes = 18,
                    totalMinutes = 33,
                    calories = 400,
                    ingredients = listOf(
                        "4 dilim somon",
                        "3 yemek kaşığı soya sosu",
                        "2 yemek kaşığı bal",
                        "1 yemek kaşığı susam yağı",
                        "1 yemek kaşığı rendelenmiş zencefil",
                        "1 diş sarımsak",
                        "Susam",
                        "Taze soğan"
                    ),
                    femaleSteps = listOf(
                        "Soya, bal, zencefil ve sarımsakla teriyaki sos hazırlayın.",
                        "Somonları sosla kaplayıp 15 dakika marine edin.",
                        "Susam ve ince doğranmış taze soğanı hazırlayın."
                    ),
                    maleSteps = listOf(
                        "Somonları fırın kağıdı üzerine yerleştirip 200°C fırında 15-18 dakika pişirin.",
                        "Pişen balıkların üzerine sosundan gezdirin.",
                        "Serviste susam ve taze soğan serpin."
                    )
                )
            )
        ),
        RecipeCategory(
            id = "salata",
            title = "Salata",
            iconRes = R.drawable.ic_category_salad,
            accentColor = Color(0xFFD1F8D8),
            recipes = listOf(
                Recipe(
                    id = "salata_coban",
                    name = "Çoban Salata",
                    thumbnailRes = R.drawable.ic_recipe_thumb_peach,
                    prepMinutes = 15,
                    cookMinutes = 0,
                    totalMinutes = 15,
                    calories = 180,
                    ingredients = listOf(
                        "3 adet domates",
                        "2 adet salatalık",
                        "1 adet kırmızı biber",
                        "1 adet kuru soğan",
                        "1/2 demet maydanoz",
                        "4 yemek kaşığı zeytinyağı",
                        "1 yemek kaşığı nar ekşisi",
                        "Tuz"
                    ),
                    femaleSteps = listOf(
                        "Domates ve salatalıkları küp doğrayın.",
                        "Soğanı ince piyazlık doğrayıp tuzla ovalayın.",
                        "Maydanozu ince kıyıp sebzelerle harmanlayın."
                    ),
                    maleSteps = listOf(
                        "Zeytinyağı, nar ekşisi ve tuzla sos hazırlayın.",
                        "Sebzelerin üzerine gezdirip nazikçe karıştırın.",
                        "Serviste sumak ve limon dilimleri ekleyin."
                    )
                ),
                Recipe(
                    id = "salata_gavurdagi",
                    name = "Gavurdağı Salatası",
                    thumbnailRes = R.drawable.ic_recipe_thumb_mint,
                    prepMinutes = 20,
                    cookMinutes = 0,
                    totalMinutes = 20,
                    calories = 220,
                    ingredients = listOf(
                        "4 adet domates",
                        "2 adet salatalık",
                        "1 adet kapya biber",
                        "1 adet yeşil biber",
                        "1 avuç ceviz",
                        "1 yemek kaşığı nar ekşisi",
                        "4 yemek kaşığı zeytinyağı",
                        "1 tatlı kaşığı sumak"
                    ),
                    femaleSteps = listOf(
                        "Domatesleri minik küpler halinde doğrayın.",
                        "Biber ve salatalıkları aynı boyda doğrayın.",
                        "Cevizleri iri kıyıp salata kabına alın."
                    ),
                    maleSteps = listOf(
                        "Zeytinyağı, nar ekşisi ve sumağı çırparak sos hazırlayın.",
                        "Sebzelerin üzerine döküp karıştırın.",
                        "Serviste ceviz parçalarıyla süsleyin."
                    )
                ),
                Recipe(
                    id = "salata_piyaz",
                    name = "Antalya Usulü Piyaz",
                    thumbnailRes = R.drawable.ic_recipe_thumb_lilac,
                    prepMinutes = 25,
                    cookMinutes = 10,
                    totalMinutes = 35,
                    calories = 260,
                    ingredients = listOf(
                        "2 su bardağı haşlanmış kuru fasulye",
                        "2 adet yumurta",
                        "1 adet kırmızı soğan",
                        "1 demet maydanoz",
                        "2 yemek kaşığı tahin",
                        "2 yemek kaşığı sirke",
                        "3 yemek kaşığı zeytinyağı",
                        "1 diş sarımsak"
                    ),
                    femaleSteps = listOf(
                        "Yumurtaları haşlayıp dilimleyin.",
                        "Soğanı piyazlık doğrayıp tuzla ovun.",
                        "Tahin, sirke ve sarımsakla sosu hazırlayın."
                    ),
                    maleSteps = listOf(
                        "Fasulyeleri geniş kaseye alın, soğan ve maydanozu ekleyin.",
                        "Hazırlanan sosu salatanın üzerine gezdirin.",
                        "Yumurta dilimleriyle süsleyerek servis edin."
                    )
                ),
                Recipe(
                    id = "salata_kisir",
                    name = "Nar Ekşili Kısır",
                    thumbnailRes = R.drawable.ic_recipe_thumb_sunrise,
                    prepMinutes = 25,
                    cookMinutes = 10,
                    totalMinutes = 35,
                    calories = 280,
                    ingredients = listOf(
                        "2 su bardağı ince bulgur",
                        "2 yemek kaşığı domates salçası",
                        "1 yemek kaşığı biber salçası",
                        "1/2 su bardağı zeytinyağı",
                        "1 adet kuru soğan",
                        "1 demet taze soğan",
                        "1 demet maydanoz",
                        "Nar ekşisi"
                    ),
                    femaleSteps = listOf(
                        "Bulguru kaynar suyla ıslatıp üstünü kapatın.",
                        "Soğanı zeytinyağında salçalarla kavurun.",
                        "Maydanoz ve taze soğanı ince doğrayın."
                    ),
                    maleSteps = listOf(
                        "Şişen bulguru salça karışımıyla harmanlayın.",
                        "Yeşillikleri ve nar ekşisini ekleyip karıştırın.",
                        "Serviste limon dilimleriyle sunun."
                    )
                ),
                Recipe(
                    id = "salata_sezars",
                    name = "Yoğurtlu Sezar Salata",
                    thumbnailRes = R.drawable.ic_recipe_thumb_sky,
                    prepMinutes = 20,
                    cookMinutes = 10,
                    totalMinutes = 30,
                    calories = 290,
                    ingredients = listOf(
                        "1 baş marul",
                        "2 dilim kızarmış ekmek",
                        "150 g ızgara tavuk",
                        "3 yemek kaşığı süzme yoğurt",
                        "2 yemek kaşığı zeytinyağı",
                        "1 diş sarımsak",
                        "1 yemek kaşığı limon suyu",
                        "Parmesan"
                    ),
                    femaleSteps = listOf(
                        "Yoğurt, sarımsak ve limonla sosu çırpın.",
                        "Marulu iri parçalara bölün.",
                        "Tavuğu şerit halinde doğrayın."
                    ),
                    maleSteps = listOf(
                        "Marul, tavuk ve krutonları büyük kaseye alın.",
                        "Sosu ekleyip parmesan rendeleyin.",
                        "Serviste taze çekilmiş karabiber serpin."
                    )
                ),
                Recipe(
                    id = "salata_patlican",
                    name = "Köz Patlıcan Salatası",
                    thumbnailRes = R.drawable.ic_recipe_thumb_peach,
                    prepMinutes = 20,
                    cookMinutes = 25,
                    totalMinutes = 45,
                    calories = 230,
                    ingredients = listOf(
                        "4 adet patlıcan",
                        "2 adet kırmızı biber",
                        "2 diş sarımsak",
                        "3 yemek kaşığı zeytinyağı",
                        "1 yemek kaşığı nar ekşisi",
                        "1 yemek kaşığı limon suyu",
                        "Tuz, karabiber",
                        "Maydanoz"
                    ),
                    femaleSteps = listOf(
                        "Patlıcan ve biberleri közleyip kabuklarını soyun.",
                        "Sarımsakları ezip zeytinyağıyla karıştırın.",
                        "Sebzeleri doğrayıp sosla harmanlayın."
                    ),
                    maleSteps = listOf(
                        "Servis tabağına salatayı yayın.",
                        "Nar ekşisi ve limonla son dokunuşu yapın.",
                        "Maydanoz yapraklarıyla süsleyin."
                    )
                ),
                Recipe(
                    id = "salata_bulgur_kinoalı",
                    name = "Kinoa ve Bulgurlu Salata",
                    thumbnailRes = R.drawable.ic_recipe_thumb_mint,
                    prepMinutes = 25,
                    cookMinutes = 15,
                    totalMinutes = 40,
                    calories = 310,
                    ingredients = listOf(
                        "1 su bardağı kinoa",
                        "1 su bardağı ince bulgur",
                        "1 adet salatalık",
                        "1 adet kırmızı biber",
                        "1/2 demet dereotu",
                        "1/2 demet maydanoz",
                        "4 yemek kaşığı zeytinyağı",
                        "1 adet limon"
                    ),
                    femaleSteps = listOf(
                        "Kinoayı haşlayıp süzün.",
                        "Bulguru sıcak suyla demleyin.",
                        "Yeşillikleri ince kıyın."
                    ),
                    maleSteps = listOf(
                        "Kinoa ve bulguru büyük kapta birleştirin.",
                        "Sebzeleri ekleyip zeytinyağı ve limonla tatlandırın.",
                        "Serviste nar taneleri ekleyin."
                    )
                ),
                Recipe(
                    id = "salata_yesil_elmali",
                    name = "Yeşil Elmalı Ispanak Salatası",
                    thumbnailRes = R.drawable.ic_recipe_thumb_lilac,
                    prepMinutes = 15,
                    cookMinutes = 0,
                    totalMinutes = 15,
                    calories = 200,
                    ingredients = listOf(
                        "2 avuç bebek ıspanak",
                        "1 adet yeşil elma",
                        "1/2 su bardağı ceviz",
                        "1/3 su bardağı beyaz peynir",
                        "2 yemek kaşığı zeytinyağı",
                        "1 yemek kaşığı elma sirkesi",
                        "1 tatlı kaşığı bal",
                        "Tuz"
                    ),
                    femaleSteps = listOf(
                        "Elmayı ince dilimleyin.",
                        "Cevizi hafifçe kavurun.",
                        "Sos için zeytinyağı, sirke ve balı çırpın."
                    ),
                    maleSteps = listOf(
                        "Ispanak yapraklarını servis tabağına yayın.",
                        "Elma, ceviz ve peynir parçalarını ekleyin.",
                        "Sosu gezdirip hemen servis edin."
                    )
                ),
                Recipe(
                    id = "salata_narli_tabule",
                    name = "Narlı Tabule",
                    thumbnailRes = R.drawable.ic_recipe_thumb_sunrise,
                    prepMinutes = 20,
                    cookMinutes = 5,
                    totalMinutes = 25,
                    calories = 240,
                    ingredients = listOf(
                        "1 su bardağı ince bulgur",
                        "1 adet nar",
                        "1 demet maydanoz",
                        "1 demet taze nane",
                        "2 adet domates",
                        "4 yemek kaşığı zeytinyağı",
                        "2 yemek kaşığı limon suyu",
                        "Tuz"
                    ),
                    femaleSteps = listOf(
                        "Bulguru kaynar suyla ıslatın.",
                        "Narı ayıklayıp tanelerini çıkarın.",
                        "Nane ve maydanozu ince kıyın."
                    ),
                    maleSteps = listOf(
                        "Tüm malzemeleri geniş kaseye alın.",
                        "Zeytinyağı ve limonla tatlandırıp karıştırın.",
                        "Serviste nar tanelerini üstte bırakın."
                    )
                ),
                Recipe(
                    id = "salata_beyaz_lahana",
                    name = "Yoğurtlu Beyaz Lahana Salatası",
                    thumbnailRes = R.drawable.ic_recipe_thumb_sky,
                    prepMinutes = 15,
                    cookMinutes = 0,
                    totalMinutes = 15,
                    calories = 210,
                    ingredients = listOf(
                        "1/2 küçük beyaz lahana",
                        "1 adet havuç",
                        "1 su bardağı süzme yoğurt",
                        "2 yemek kaşığı mayonez",
                        "1 diş sarımsak",
                        "2 yemek kaşığı zeytinyağı",
                        "Tuz, karabiber",
                        "Dereotu"
                    ),
                    femaleSteps = listOf(
                        "Lahanayı ince jülyen doğrayıp tuzla ovalayın.",
                        "Havucu rendeleyin.",
                        "Yoğurt, mayonez ve sarımsakla sosu hazırlayın."
                    ),
                    maleSteps = listOf(
                        "Lahana ve havucu sosla karıştırın.",
                        "Zeytinyağı gezdirip dereotu ekleyin.",
                        "Servis kasesine alıp soğuk sunun."
                    )
                )
            )
        )
    )
}