package com.example.myapplication.model


object RecipeRepository {
    fun loadCategories(): List<RecipeCategory> = RecipeData.categories

import androidx.compose.ui.graphics.Color
import com.example.myapplication.R

object RecipeRepository {
    val categories: List<RecipeCategory> = listOf(
        RecipeCategory(
            id = "pasta",
            title = "Makarna",
            iconRes = R.drawable.ic_category_pasta,
            accentColor = Color(0xFFFFB1C1),
            recipes = listOf(
                Recipe(
                    id = "pasta_kremali_mantarli",
                    name = "Kremalı Mantarlı Makarna",
                    thumbnailRes = R.drawable.ic_recipe_thumb_peach,
                    femaleSteps = listOf(
                        "Mantarları ince dilimleyip zeytinyağı ve tereyağıyla soteleyin.",
                        "Krema, sarımsak ve muskatı ekleyip sosu kıvam alana kadar karıştırın.",
                        "Taze fesleğen ve limon kabuğu rendesiyle sosu aromalandırın."
                    ),
                    maleSteps = listOf(
                        "Geniş bir tencerede suyu kaynatıp bolca tuz ekleyin.",
                        "Makarnayı al dente kıvamına gelene kadar haşlayıp süzün.",
                        "Makarnayı sosla karıştırıp parmesan ve karabiberle servis edin."
                    )
                ),
                Recipe(
                    id = "pasta_domates_spagetti",
                    name = "Domates Soslu Spagetti",
                    thumbnailRes = R.drawable.ic_recipe_thumb_mint,
                    femaleSteps = listOf(
                        "Rendelenmiş domatesleri soğan ve sarımsakla kısık ateşte pişirin.",
                        "Kuru fesleğen, kekik ve bir tutam şeker ekleyerek sosu derinleştirin.",
                        "Servis öncesi sosu zeytinyağıyla parlatın."
                    ),
                    maleSteps = listOf(
                        "Spagettiyi tuzlu suda al dente olana dek haşlayın.",
                        "Süzülen makarnayı geniş bir tavada sosla harmanlayın.",
                        "Taze rendelenmiş kaşar ve iri karabiber taneleriyle tabaklayın."
                    )
                ),
                Recipe(
                    id = "pasta_pesto_penne",
                    name = "Pesto Soslu Penne",
                    thumbnailRes = R.drawable.ic_recipe_thumb_lilac,
                    femaleSteps = listOf(
                        "Fesleğen, dolmalık fıstık ve parmesanla taze pesto hazırlayın.",
                        "Zeytinyağını ince akıtarak pesto sosunu kremamsı hale getirin.",
                        "Servisten önce cherry domatesleri ikiye bölüp marine edin."
                    ),
                    maleSteps = listOf(
                        "Penne makarnayı diri kalacak şekilde haşlayın.",
                        "Makarnayı pesto sosla karıştırıp domatesleri ekleyin.",
                        "Tabakları roka yapraklarıyla süsleyip servis edin."
                    )
                ),
                Recipe(
                    id = "pasta_tavuk_fettuccine",
                    name = "Tavuklu Fettuccine",
                    thumbnailRes = R.drawable.ic_recipe_thumb_sky,
                    femaleSteps = listOf(
                        "Tavuk göğsünü julien doğrayıp krema ve mantarla marine edin.",
                        "Tereyağı, sarımsak ve beyaz şarapla zengin bir sos hazırlayın.",
                        "Kıyılmış maydanozla sosu tazeleyin."
                    ),
                    maleSteps = listOf(
                        "Fettuccine'yi haşlayıp hafifçe zeytinyağıyla karıştırın.",
                        "Marine edilen tavukları yüksek ateşte mühürleyin.",
                        "Makarnayı tavuklu sosla buluşturup tabaklayın."
                    )
                ),
                Recipe(
                    id = "pasta_sebzeli_linguine",
                    name = "Sebzeli Linguine",
                    thumbnailRes = R.drawable.ic_recipe_thumb_sunrise,
                    femaleSteps = listOf(
                        "Kabak, kapya biber ve kuşkonmazı ince şeritler halinde kesin.",
                        "Limon kabuğu, fesleğen ve zeytinyağıyla canlı bir sos yapın.",
                        "Sebzeleri hafifçe soteleyip diri kalmalarını sağlayın."
                    ),
                    maleSteps = listOf(
                        "Linguine'yi hafif diri kalacak şekilde haşlayın.",
                        "Makarnayı sebze sotesiyle karıştırıp nar taneleri ekleyin.",
                        "Servis tabaklarını kabak çiçekleriyle süsleyin."
                    )
                ),
                Recipe(
                    id = "pasta_ton_balıklı_fusilli",
                    name = "Ton Balıklı Fusilli",
                    thumbnailRes = R.drawable.ic_recipe_thumb_peach,
                    femaleSteps = listOf(
                        "Ton balığını zeytinyağı, kapari ve limon suyuyla harmanlayın.",
                        "Mor soğanları pembeleştirip karışıma ekleyin.",
                        "Dereotu ve maydanozla taze bir aroma oluşturun."
                    ),
                    maleSteps = listOf(
                        "Fusilli'yi haşlayıp soğuk sudan geçirerek tazeleyin.",
                        "Makarnayı ton balıklı karışımla buluşturun.",
                        "Servis kaselerini limon dilimleriyle süsleyin."
                    )
                ),
                Recipe(
                    id = "pasta_ricottali_ravioli",
                    name = "Ricottalı Ravioli",
                    thumbnailRes = R.drawable.ic_recipe_thumb_mint,
                    femaleSteps = listOf(
                        "Ricotta, ıspanak ve muskatla dolguyu hazırlayın.",
                        "Ev yapımı ravioli hamurunu açıp içlerini doldurun.",
                        "Tereyağı ve adaçayıyla aromatik bir sos hazırlayın."
                    ),
                    maleSteps = listOf(
                        "Raviolileri kaynar tuzlu suda 3-4 dakika pişirin.",
                        "Pişen raviolileri tereyağlı adaçayı sosuna aktarın.",
                        "Tabaklara paylaştırıp kızarmış fındıkla süsleyin."
                    )
                ),
                Recipe(
                    id = "pasta_acili_arrabbiata",
                    name = "Acılı Arrabbiata",
                    thumbnailRes = R.drawable.ic_recipe_thumb_lilac,
                    femaleSteps = listOf(
                        "Sarımsak ve acı biberleri zeytinyağında hafifçe kızdırın.",
                        "Domates püresi ve taze kekikle sosu pişirin.",
                        "Birkaç damla bal ekleyerek acılığı dengeleyin."
                    ),
                    maleSteps = listOf(
                        "Penne makarnayı tuzlu suda haşlayın.",
                        "Makarnayı acılı sosla karıştırıp dinlendirin.",
                        "Üzerini maydanoz ve peynirle tamamlayıp servis edin."
                    )
                ),
                Recipe(
                    id = "pasta_beyaz_peynirli_farfalle",
                    name = "Beyaz Peynirli Farfalle",
                    thumbnailRes = R.drawable.ic_recipe_thumb_sky,
                    femaleSteps = listOf(
                        "Beyaz peyniri zeytinyağı ve taze kekikle ezerek krema yapın.",
                        "Renkli cherry domatesleri fırınlayıp karamelize edin.",
                        "Sosu nane yapraklarıyla ferahlatın."
                    ),
                    maleSteps = listOf(
                        "Farfalle'yi haşlayıp süzün.",
                        "Fırınlanmış domatesleri makarnaya ekleyip peynir sosuyla harmanlayın.",
                        "Servis tabağında narenciye kabuğuyla süsleyin."
                    )
                ),
                Recipe(
                    id = "pasta_karidesli_tagliatelle",
                    name = "Karidesli Tagliatelle",
                    thumbnailRes = R.drawable.ic_recipe_thumb_sunrise,
                    femaleSteps = listOf(
                        "Karidesleri sarımsak, limon ve pul biberle marine edin.",
                        "Beyaz şarapla kısa bir sos indirgeme yapın.",
                        "Maydanoz ve tereyağıyla sosu tamamlayın."
                    ),
                    maleSteps = listOf(
                        "Tagliatelle'yi haşlayıp süzün.",
                        "Karidesleri yüksek ateşte soteleyip sosla birleştirin.",
                        "Tabakları limon kabuğu rendesiyle süsleyin."
                    )
                ),
                Recipe(
                    id = "pasta_napolitan_rigatoni",
                    name = "Napolitan Soslu Rigatoni",
                    thumbnailRes = R.drawable.ic_recipe_thumb_peach,
                    femaleSteps = listOf(
                        "Soğan ve sarımsağı kavurup domates püresiyle klasik sosu pişirin.",
                        "Zeytin, kapari ve fesleğen ekleyerek sosu zenginleştirin.",
                        "Biraz tereyağıyla sosu parlak hale getirin."
                    ),
                    maleSteps = listOf(
                        "Rigatoni'yi haşlayıp sosu içine çekecek şekilde dinlendirin.",
                        "Makarnayı sosla karıştırıp rendelenmiş parmesan ekleyin.",
                        "Servis tabaklarına paylaştırıp fesleğen yapraklarıyla süsleyin."
                    )
                )
            )
        ),
        RecipeCategory(
            id = "chicken",
            title = "Tavuk",
            iconRes = R.drawable.ic_category_chicken,
            accentColor = Color(0xFFFFC7A4),
            recipes = listOf(
                Recipe(
                    id = "chicken_ballihardal",
                    name = "Ballı Hardallı Tavuk",
                    thumbnailRes = R.drawable.ic_recipe_thumb_mint,
                    femaleSteps = listOf(
                        "Bal, hardal ve yoğurtla kremamsı bir marine hazırlayın.",
                        "Taze kekik ve sarımsak ekleyerek aromayı derinleştirin.",
                        "Tavukları en az 30 dakika marine edin."
                    ),
                    maleSteps = listOf(
                        "Marine edilmiş tavukları fırın tepsisine dizin.",
                        "200°C'de kızarana kadar pişirin.",
                        "Pişen tavukları taze roka yatağında servis edin."
                    )
                ),
                Recipe(
                    id = "chicken_kremali_mantar",
                    name = "Kremalı Mantarlı Tavuk",
                    thumbnailRes = R.drawable.ic_recipe_thumb_lilac,
                    femaleSteps = listOf(
                        "Mantarları tereyağında soteleyip krema ekleyin.",
                        "Tavuk suyu ve adaçayıyla sosu yoğunlaştırın.",
                        "Limon kabuğu rendesiyle ferahlatın."
                    ),
                    maleSteps = listOf(
                        "Tavuk göğüslerini mühürleyip fırında dinlendirin.",
                        "Tavukları sosla kaplayıp pilav eşliğinde tabaklayın.",
                        "Üzerine karamelize soğan serpiştirin."
                    )
                ),
                Recipe(
                    id = "chicken_teriyaki",
                    name = "Teriyaki Soslu Tavuk",
                    thumbnailRes = R.drawable.ic_recipe_thumb_sky,
                    femaleSteps = listOf(
                        "Soya sosu, zencefil ve bal ile teriyaki sosu hazırlayın.",
                        "Susam yağı ve pirinç sirkesi ekleyerek dengeli bir tat yakalayın.",
                        "Sosu tavuklarla harmanlayıp bekletin."
                    ),
                    maleSteps = listOf(
                        "Tavukları döküm tavada karamelize olana dek pişirin.",
                        "Sosun geri kalanını ekleyip parlatın.",
                        "Jasmine pilavı üzerine yerleştirip susam serpin."
                    )
                ),
                Recipe(
                    id = "chicken_firinda_sebze",
                    name = "Sebzeli Fırın Tavuk",
                    thumbnailRes = R.drawable.ic_recipe_thumb_sunrise,
                    femaleSteps = listOf(
                        "Patates, havuç ve kabakları zeytinyağı, kekik ve limonla karıştırın.",
                        "Sarımsaklı yoğurt sosu hazırlayın.",
                        "Tavuk butlarını biberiye ile aromalandırın."
                    ),
                    maleSteps = listOf(
                        "Sebzeleri fırın kabına yayın, tavukları üzerine yerleştirin.",
                        "Önceden ısıtılmış 190°C fırında kızarana kadar pişirin.",
                        "Serviste yoğurt sosu ve limon dilimleri ekleyin."
                    )
                ),
                Recipe(
                    id = "chicken_kori",
                    name = "Hindistan Cevizli Körili Tavuk",
                    thumbnailRes = R.drawable.ic_recipe_thumb_peach,
                    femaleSteps = listOf(
                        "Soğan, sarımsak ve zencefili kavurup körili baz oluşturun.",
                        "Hindistan cevizi sütü ve limon otu ekleyin.",
                        "Taze kişnişle sosu tamamlayın."
                    ),
                    maleSteps = listOf(
                        "Tavuk kuşbaşılarını wok tavada pişirin.",
                        "Köri sosunu ekleyip hafifçe kaynatın.",
                        "Basmatı pilavı eşliğinde kaselere alın."
                    )
                ),
                Recipe(
                    id = "chicken_citir_parmesan",
                    name = "Çıtır Parmesanlı Tavuk",
                    thumbnailRes = R.drawable.ic_recipe_thumb_mint,
                    femaleSteps = listOf(
                        "Parmesan, galeta unu ve baharatlı bir kaplama hazırlayın.",
                        "Yumurtalı karışımla tavukları paneleyin.",
                        "Domates sosu ve mozarella ile servis sosu hazırlayın."
                    ),
                    maleSteps = listOf(
                        "Panelediğiniz tavukları altın rengi olana dek kızartın.",
                        "Tavukları fırın kabına alıp sos ve peynir ekleyin.",
                        "Peynir eriyene kadar kısa süre fırınlayın."
                    )
                ),
                Recipe(
                    id = "chicken_limonlu",
                    name = "Limonlu Tava Tavuk",
                    thumbnailRes = R.drawable.ic_recipe_thumb_lilac,
                    femaleSteps = listOf(
                        "Limon kabuğu, kekik ve sarımsakla marine hazırlayın.",
                        "Bebe patatesleri zeytinyağında ön pişirme yapın.",
                        "Marine sosuna bal ekleyerek karamelleşmeyi artırın."
                    ),
                    maleSteps = listOf(
                        "Tavukları döküm tavada kızartıp fırına atın.",
                        "Patatesleri tava suyuyla harmanlayın.",
                        "Serviste limon dilimleri ve taze kekik ekleyin."
                    )
                ),
                Recipe(
                    id = "chicken_feslegen_pesto",
                    name = "Fesleğenli Tavuk Sote",
                    thumbnailRes = R.drawable.ic_recipe_thumb_sky,
                    femaleSteps = listOf(
                        "Fesleğen, sarımsak ve çam fıstığıyla hızlı bir pesto yapın.",
                        "Cherry domatesleri hafifçe kavurun.",
                        "Sosu limon suyu ile dengeli hale getirin."
                    ),
                    maleSteps = listOf(
                        "Tavuk parçalarını wokta yüksek ateşte soteleyin.",
                        "Pesto sosunu ekleyip hızlıca çevirin.",
                        "Serviste parmesan pulları serpiştirin."
                    )
                ),
                Recipe(
                    id = "chicken_biberiyeli",
                    name = "Biberiyeli Tavuk Kanat",
                    thumbnailRes = R.drawable.ic_recipe_thumb_sunrise,
                    femaleSteps = listOf(
                        "Bal, biberiye ve sarımsakla yapışkan bir sos hazırlayın.",
                        "Kanatları sosla kaplayıp buzdolabında dinlendirin.",
                        "Yanına servis için yoğurtlu dip sos hazırlayın."
                    ),
                    maleSteps = listOf(
                        "Kanatları fırın ızgarasında çıtır olana kadar pişirin.",
                        "Pişerken sosla birkaç kez fırçalayın.",
                        "Servis tabağında limon dilimleri ve sosla sunun."
                    )
                ),
                Recipe(
                    id = "chicken_portakal",
                    name = "Portakallı Tavuk",
                    thumbnailRes = R.drawable.ic_recipe_thumb_peach,
                    femaleSteps = listOf(
                        "Taze portakal suyu, soya sosu ve zencefille sos hazırlayın.",
                        "Portakal kabuğu ve bal ekleyerek sosu yoğunlaştırın.",
                        "Mısır nişastasıyla kıvam verin."
                    ),
                    maleSteps = listOf(
                        "Tavuk parçalarını kızgın yağda kısa süre kızartın.",
                        "Hazırlanan sosla tavada buluşturup karamelize edin.",
                        "Buharda pişmiş brokoli ile servis edin."
                    )
                )
            )
        ),
        RecipeCategory(
            id = "dessert",
            title = "Tatlı",
            iconRes = R.drawable.ic_category_dessert,
            accentColor = Color(0xFFFFBEE3),
            recipes = listOf(
                Recipe(
                    id = "dessert_cikolatali_sufle",
                    name = "Çikolatalı Sufle",
                    thumbnailRes = R.drawable.ic_recipe_thumb_lilac,
                    femaleSteps = listOf(
                        "Bitter çikolatayı tereyağıyla benmari usulü eritin.",
                        "Yumurta sarıları ve şekeri çırpıp çikolata ile birleştirin.",
                        "Kalıpları tereyağı ve kakao ile hazırlayın."
                    ),
                    maleSteps = listOf(
                        "Yumurta aklarını sertleşene dek çırpıp harca yedirin.",
                        "Kalıplara paylaştırıp önceden ısıtılmış fırında pişirin.",
                        "Pudra şekeri serpip hemen servis edin."
                    )
                ),
                Recipe(
                    id = "dessert_firinda_cheesecake",
                    name = "Fırında Cheesecake",
                    thumbnailRes = R.drawable.ic_recipe_thumb_sky,
                    femaleSteps = listOf(
                        "Labne, krema ve şekerle ipeksi bir karışım hazırlayın.",
                        "Vanilya ve limon kabuğuyla aromalandırın.",
                        "Bisküvi tabanını tereyağı ile karıştırıp kalıba bastırın."
                    ),
                    maleSteps = listOf(
                        "Harçları kalıba döküp su banyosunda pişirin.",
                        "Fırından çıkarıp çatlamaması için dinlendirin.",
                        "Meyve sosuyla dilimleyerek servis edin."
                    )
                ),
                Recipe(
                    id = "dessert_magnolia",
                    name = "Çilekli Magnolia",
                    thumbnailRes = R.drawable.ic_recipe_thumb_peach,
                    femaleSteps = listOf(
                        "Süt, yumurta sarısı ve nişastayla pürüzsüz krema pişirin.",
                        "Krema soğuyunca labne ekleyerek hafifletin.",
                        "Çilekleri ince dilimleyip hazırlayın."
                    ),
                    maleSteps = listOf(
                        "Servis bardaklarına bisküvi kırıntıları yerleştirin.",
                        "Kremayı kat kat döküp aralarına çilek dizin.",
                        "Soğutarak servis edin."
                    )
                ),
                Recipe(
                    id = "dessert_tiramis_u",
                    name = "Klasik Tiramisu",
                    thumbnailRes = R.drawable.ic_recipe_thumb_mint,
                    femaleSteps = listOf(
                        "Mascarpone, yumurta sarısı ve şekerle kremayı hazırlayın.",
                        "Espresso ve likörle kedidillerini ıslatmak için karışım yapın.",
                        "Kakao ve rendelenmiş çikolata hazırlayın."
                    ),
                    maleSteps = listOf(
                        "Kedidillerini espressoya batırıp kalıba dizin.",
                        "Mascarpone kremasını kat kat yayın.",
                        "Üzerini kakao ile süsleyip dinlendirin."
                    )
                ),
                Recipe(
                    id = "dessert_profiterol",
                    name = "Profiterol",
                    thumbnailRes = R.drawable.ic_recipe_thumb_sunrise,
                    femaleSteps = listOf(
                        "Pâte à choux hamuru için tereyağı ve un karışımını hazırlayın.",
                        "Yumurtaları teker teker ekleyerek elastik hamur elde edin.",
                        "Pastacı kreması pişirip soğutun."
                    ),
                    maleSteps = listOf(
                        "Hamuru sıkma torbasıyla tepsiye dizip pişirin.",
                        "Pişen topları pastacı kremasıyla doldurun.",
                        "Üzerine sıcak çikolata sosu gezdirin."
                    )
                ),
                Recipe(
                    id = "dessert_suffle_limon",
                    name = "Limonlu Puding",
                    thumbnailRes = R.drawable.ic_recipe_thumb_peach,
                    femaleSteps = listOf(
                        "Taze limon suyu, şeker ve yumurta sarılarıyla baz hazırlayın.",
                        "Mısır nişastasıyla kıvam verip tereyağı ekleyin.",
                        "Limon kabuğu rendesiyle aromalandırın."
                    ),
                    maleSteps = listOf(
                        "Karışımı kaselere paylaştırıp buzdolabında soğutun.",
                        "Beze hazırlayıp üzerlerine sıkın.",
                        "Mutfak aleviyle hafifçe kızartıp servis edin."
                    )
                ),
                Recipe(
                    id = "dessert_meyveli_tart",
                    name = "Meyveli Tart",
                    thumbnailRes = R.drawable.ic_recipe_thumb_lilac,
                    femaleSteps = listOf(
                        "Tart hamuru için un, tereyağı ve pudra şekeriyle kumlu hamur yapın.",
                        "Hamuru dinlendirip kalıba yerleştirin.",
                        "Vanilyalı krema pişirip soğutun."
                    ),
                    maleSteps = listOf(
                        "Hamuru kör pişirip soğutun.",
                        "Kremayı doldurup meyveleri düzenli dizin.",
                        "Jel parlatıcı ile meyvelerin üzerini kaplayın."
                    )
                ),
                Recipe(
                    id = "dessert_san_sebastian",
                    name = "San Sebastian Cheesecake",
                    thumbnailRes = R.drawable.ic_recipe_thumb_sky,
                    femaleSteps = listOf(
                        "Labne, krema ve şekerle yoğun bir karışım hazırlayın.",
                        "Yumurtaları tek tek ekleyip karışımı pürüzsüzleştirin.",
                        "Un yerine mısır nişastası kullanarak hafiflik katın."
                    ),
                    maleSteps = listOf(
                        "Kalıbı yağlı kağıtla kaplayıp harcı dökün.",
                        "Yüksek ısıda karamelize kabuk oluşana dek pişirin.",
                        "Soğutup dilimleyerek servis edin."
                    )
                ),
                Recipe(
                    id = "dessert_kup_mousse",
                    name = "Çikolatalı Mousse",
                    thumbnailRes = R.drawable.ic_recipe_thumb_peach,
                    femaleSteps = listOf(
                        "Çikolatayı eritip içine portakal kabuğu ekleyin.",
                        "Yumurta sarıları ve şekerle köpüklü bir baz hazırlayın.",
                        "Soğuyan karışıma krema ekleyin."
                    ),
                    maleSteps = listOf(
                        "Yumurta aklarını kar haline getirip karışıma yedirin.",
                        "Kuplara paylaştırıp soğutun.",
                        "Serviste kakaolu toz ve file badem serpin."
                    )
                ),
                Recipe(
                    id = "dessert_gullac",
                    name = "Güllaç",
                    thumbnailRes = R.drawable.ic_recipe_thumb_mint,
                    femaleSteps = listOf(
                        "Sütü şekerle ısıtıp gül suyu ekleyin.",
                        "Ceviz içini iri çekip hazırlayın.",
                        "Nar tanelerini temizleyin."
                    ),
                    maleSteps = listOf(
                        "Güllaç yapraklarını sütle ıslatıp kat kat yerleştirin.",
                        "Aralara ceviz serperek devam edin.",
                        "Üzerini nar taneleriyle süsleyip soğutun."
                    )
                )
            )
        ),
        RecipeCategory(
            id = "soup",
            title = "Çorba",
            iconRes = R.drawable.ic_category_soup,
            accentColor = Color(0xFFBEE4FF),
            recipes = listOf(
                Recipe(
                    id = "soup_mercimek",
                    name = "Klasik Mercimek Çorbası",
                    thumbnailRes = R.drawable.ic_recipe_thumb_sunrise,
                    femaleSteps = listOf(
                        "Soğan, havuç ve patatesi tereyağında kavurun.",
                        "Kırmızı mercimeği ekleyip baharatlarla aromalandırın.",
                        "Sebze suyunu ilave edip yumuşayana kadar pişirin."
                    ),
                    maleSteps = listOf(
                        "Çorbayı blenderdan geçirip pürüzsüz hale getirin.",
                        "Üzerine tereyağlı pul biber gezdirin.",
                        "Kaselere paylaştırıp limonla servis edin."
                    )
                ),
                Recipe(
                    id = "soup_domates",
                    name = "Fesleğenli Domates Çorbası",
                    thumbnailRes = R.drawable.ic_recipe_thumb_peach,
                    femaleSteps = listOf(
                        "Taze domatesleri fırınlayıp karamelize edin.",
                        "Soğan ve sarımsakla birlikte tencerede pişirin.",
                        "Taze fesleğen ve krema ekleyerek sosu zenginleştirin."
                    ),
                    maleSteps = listOf(
                        "Çorbayı pürüzsüz hale getirip geri tencereye alın.",
                        "Üzerini pesto ve krutonla süsleyin.",
                        "Sıcak kaselerde servis edin."
                    )
                ),
                Recipe(
                    id = "soup_mantar",
                    name = "Kremalı Mantar Çorbası",
                    thumbnailRes = R.drawable.ic_recipe_thumb_mint,
                    femaleSteps = listOf(
                        "Mantarları tereyağında soteleyip un ekleyin.",
                        "Et suyu ve krema ile kıvamlı bir baz oluşturun.",
                        "Taze kekik ve karabiber ekleyin."
                    ),
                    maleSteps = listOf(
                        "Çorbayı blenderdan geçirerek pürüzsüzleştirin.",
                        "Krema ile son dokunuş yapın.",
                        "Kaseyi sote mantar ve yağ gezdirerek tamamlayın."
                    )
                ),
                Recipe(
                    id = "soup_tarhana",
                    name = "Ev Yapımı Tarhana",
                    thumbnailRes = R.drawable.ic_recipe_thumb_lilac,
                    femaleSteps = listOf(
                        "Tarhana karışımını yoğurtla açıp bekletin.",
                        "Tereyağı ve domates salçasını kavurun.",
                        "Nane ve kırmızı biberle tatlandırın."
                    ),
                    maleSteps = listOf(
                        "Tarhana karışımını tencereye ekleyip karıştırın.",
                        "Sürekli karıştırarak kaynatın.",
                        "Topak kalmayana kadar çırpıp servis edin."
                    )
                ),
                Recipe(
                    id = "soup_brokoli",
                    name = "Brokoli Çorbası",
                    thumbnailRes = R.drawable.ic_recipe_thumb_sky,
                    femaleSteps = listOf(
                        "Brokoli ve patatesleri sebze suyunda haşlayın.",
                        "Sarımsak ve soğanı zeytinyağında soteleyin.",
                        "Badem sütü ekleyerek hafif bir kremamsı tat yakalayın."
                    ),
                    maleSteps = listOf(
                        "Haşlanan sebzeleri blenderdan geçirip kıvam verin.",
                        "Kaselere alıp üzerine kavrulmuş badem serpin.",
                        "Zeytinyağı gezdirerek servis edin."
                    )
                ),
                Recipe(
                    id = "soup_balkabak",
                    name = "Zencefilli Balkabağı Çorbası",
                    thumbnailRes = R.drawable.ic_recipe_thumb_peach,
                    femaleSteps = listOf(
                        "Balkabağını fırınlayıp karamelize edin.",
                        "Zencefil, muskat ve tarçınla baharatlayın.",
                        "Portakal suyu ile ferah bir aroma ekleyin."
                    ),
                    maleSteps = listOf(
                        "Pişen balkabağını sebze suyuyla püre yapın.",
                        "Kremayla kıvam ayarlayıp kaynatın.",
                        "Üzerine kavrulmuş çekirdek serpiştirerek servis edin."
                    )
                ),
                Recipe(
                    id = "soup_sebze",
                    name = "Renkli Sebze Çorbası",
                    thumbnailRes = R.drawable.ic_recipe_thumb_mint,
                    femaleSteps = listOf(
                        "Kereviz, havuç ve kabakları küp küp doğrayın.",
                        "Domates ve sarımsakla aromatik bir baz hazırlayın.",
                        "Taze otlarla tatlandırın."
                    ),
                    maleSteps = listOf(
                        "Sebzeleri sırayla ekleyip diri kalmalarını sağlayın.",
                        "Kıvamı ayarlamak için su ilave edin.",
                        "Serviste limon ve zeytinyağı gezdirin."
                    )
                ),
                Recipe(
                    id = "soup_lahana",
                    name = "Lahanalı Beyaz Çorba",
                    thumbnailRes = R.drawable.ic_recipe_thumb_lilac,
                    femaleSteps = listOf(
                        "Lahanayı ince doğrayıp tuzla ovun.",
                        "Yoğurt, yumurta ve unla terbiyeyi hazırlayın.",
                        "Nane ve dereotu ekleyin."
                    ),
                    maleSteps = listOf(
                        "Tereyağında un kavurup su ekleyin.",
                        "Lahanayı ekleyip yumuşatın.",
                        "Terbiyeyi yavaşça ekleyip kaynatın."
                    )
                ),
                Recipe(
                    id = "soup_kremali_pirasa",
                    name = "Kremalı Pırasa Çorbası",
                    thumbnailRes = R.drawable.ic_recipe_thumb_sky,
                    femaleSteps = listOf(
                        "Pırasaları tereyağında düşük ateşte yumuşatın.",
                        "Patates ve tavuk suyuyla lezzet tabanı oluşturun.",
                        "Krema ve muskat ekleyin."
                    ),
                    maleSteps = listOf(
                        "Çorbayı blenderdan geçirip ipeksi hale getirin.",
                        "Krema ilave edip kaynatın.",
                        "Taze soğan ve krutonla servis edin."
                    )
                ),
                Recipe(
                    id = "soup_anadolu_erb",
                    name = "Anadolu Otlu Çorba",
                    thumbnailRes = R.drawable.ic_recipe_thumb_sunrise,
                    femaleSteps = listOf(
                        "Taze ısırgan, semizotu ve dereotunu temizleyin.",
                        "Yoğurtlu terbiyeyi hazırlayıp nane ekleyin.",
                        "Bulguru önceden ıslatın."
                    ),
                    maleSteps = listOf(
                        "Bulguru pişirip otları ekleyin.",
                        "Terbiyeyi yavaşça ekleyerek bağlayın.",
                        "Üzerine kızgın yağda pul biber gezdirin."
                    )
                )
            )
        ),
        RecipeCategory(
            id = "salad",
            title = "Salata",
            iconRes = R.drawable.ic_category_salad,
            accentColor = Color(0xFFBEECC4),
            recipes = listOf(
                Recipe(
                    id = "salad_akdeniz",
                    name = "Akdeniz Salatası",
                    thumbnailRes = R.drawable.ic_recipe_thumb_mint,
                    femaleSteps = listOf(
                        "Domates, salatalık ve kırmızı soğanı ince doğrayın.",
                        "Zeytinyağı, limon suyu ve kekikle sos hazırlayın.",
                        "Zeytin ve beyaz peynir ekleyin."
                    ),
                    maleSteps = listOf(
                        "Marulu iri parçalar halinde tabaklara yerleştirin.",
                        "Hazırlanan karışımı marulların üzerine dağıtın.",
                        "Kıtır ekmek parçalarıyla servis edin."
                    )
                ),
                Recipe(
                    id = "salad_kinoali",
                    name = "Kinoalı Yeşil Salata",
                    thumbnailRes = R.drawable.ic_recipe_thumb_lilac,
                    femaleSteps = listOf(
                        "Kinoayı sebze suyunda haşlayıp soğutun.",
                        "Avokado, salatalık ve yeşil elmayı doğrayın.",
                        "Lime suyu ve balzamik ile sos hazırlayın."
                    ),
                    maleSteps = listOf(
                        "Servis tabaklarına roka ve ıspanak serin.",
                        "Kinoayı ve sebzeleri karıştırıp kaselere paylaştırın.",
                        "Üzerine ceviz ve peynir serpin."
                    )
                ),
                Recipe(
                    id = "salad_sebzeli_noodle",
                    name = "Sebzeli Noodle Salata",
                    thumbnailRes = R.drawable.ic_recipe_thumb_sky,
                    femaleSteps = listOf(
                        "Pirinç eriştesini kaynar suyla yumuşatın.",
                        "Havuç, kırmızı lahana ve biberi jülyen doğrayın.",
                        "Susam yağı, soya ve limonla sos hazırlayın."
                    ),
                    maleSteps = listOf(
                        "Erişteyi süzüp soğuk sudan geçirin.",
                        "Sebzelerle birlikte karıştırıp servis kaselerine alın.",
                        "Üzerine kavrulmuş susam ekleyin."
                    )
                ),
                Recipe(
                    id = "salad_tavuklu_sezar",
                    name = "Tavuklu Sezar",
                    thumbnailRes = R.drawable.ic_recipe_thumb_sunrise,
                    femaleSteps = listOf(
                        "Sezar sosu için yumurta sarısı, sarımsak ve ançüezleri ezin.",
                        "Zeytinyağı ekleyerek emülsiyon oluşturun.",
                        "Parmesan ve limon suyuyla sosu tamamlayın."
                    ),
                    maleSteps = listOf(
                        "Izgara tavuk dilimlerini hazırlayın.",
                        "Marulu sosla harmanlayıp tabaklayın.",
                        "Kruton ve parmesanla süsleyin."
                    )
                ),
                Recipe(
                    id = "salad_narlı_bulgur",
                    name = "Narlı Bulgur Salatası",
                    thumbnailRes = R.drawable.ic_recipe_thumb_peach,
                    femaleSteps = listOf(
                        "İnce bulguru sıcak suyla ıslatıp kabarmaya bırakın.",
                        "Nar taneleri, yeşillikler ve salatalığı doğrayın.",
                        "Nar ekşisi ve zeytinyağı ile sos hazırlayın."
                    ),
                    maleSteps = listOf(
                        "Bulguru çatal yardımıyla kabartıp geniş kaseye alın.",
                        "Hazırlanan malzemeleri karıştırın.",
                        "Serviste ceviz ve taze nane ekleyin."
                    )
                ),
                Recipe(
                    id = "salad_kabak_makarna",
                    name = "Kabak Spagetti Salatası",
                    thumbnailRes = R.drawable.ic_recipe_thumb_mint,
                    femaleSteps = listOf(
                        "Kabakları spiralize ederek spagetti formuna getirin.",
                        "Yoğurt, limon ve dereotuyla sos hazırlayın.",
                        "Çeri domatesleri ikiye bölün."
                    ),
                    maleSteps = listOf(
                        "Kabak spagettiyi hafifçe soteyip yumuşatın.",
                        "Servis kaselerine alın ve sosu ekleyin.",
                        "Üzerine ceviz ve dereotu serpin."
                    )
                ),
                Recipe(
                    id = "salad_mexican",
                    name = "Meksika Fasulyeli Salata",
                    thumbnailRes = R.drawable.ic_recipe_thumb_lilac,
                    femaleSteps = listOf(
                        "Siyah fasulyeyi haşlayıp süzün.",
                        "Mısır, kırmızı soğan ve kişnişi doğrayın.",
                        "Lime suyu ve kimyonlu sos hazırlayın."
                    ),
                    maleSteps = listOf(
                        "Fasulye karışımını büyük bir kasede birleştirin.",
                        "Servis kaselerine bölüştürün.",
                        "Avokado dilimleri ve tortilla kıtırları ekleyin."
                    )
                ),
                Recipe(
                    id = "salad_pancar_keçi",
                    name = "Pancarlı Keçi Peynirli Salata",
                    thumbnailRes = R.drawable.ic_recipe_thumb_sky,
                    femaleSteps = listOf(
                        "Pancarları fırınlayıp dilimleyin.",
                        "Balzamik ve bal ile sos hazırlayın.",
                        "Cevizleri hafifçe kavurun."
                    ),
                    maleSteps = listOf(
                        "Roka ve kuzukulağını tabaklara yerleştirin.",
                        "Pancar dilimlerini ve keçi peynirini ekleyin.",
                        "Sosu gezdirip cevizle tamamlayın."
                    )
                ),
                Recipe(
                    id = "salad_asya_susam",
                    name = "Susamlı Asya Salatası",
                    thumbnailRes = R.drawable.ic_recipe_thumb_sunrise,
                    femaleSteps = listOf(
                        "Lahana, havuç ve salatalığı ince şerit doğrayın.",
                        "Zencefil, soya ve bal ile sos hazırlayın.",
                        "Taze kişniş ve nane doğrayın."
                    ),
                    maleSteps = listOf(
                        "Sebzeleri büyük bir kasede karıştırın.",
                        "Sosu ekleyip nazikçe harmanlayın.",
                        "Üzerine kavrulmuş susam ekleyip servis edin."
                    )
                ),
                Recipe(
                    id = "salad_karpuz_peynir",
                    name = "Karpuz & Beyaz Peynir",
                    thumbnailRes = R.drawable.ic_recipe_thumb_peach,
                    femaleSteps = listOf(
                        "Karpuzu üçgen dilimler halinde kesin.",
                        "Nane ve fesleğeni ince kıyın.",
                        "Balzamik glaze hazırlayın."
                    ),
                    maleSteps = listOf(
                        "Karpuz dilimlerini tabaklara dizin.",
                        "Beyaz peynir kırıntıları ve yeşillikleri ekleyin.",
                        "Balzamik glaze gezdirerek servis edin."
                    )
                )
            )
        ),
        RecipeCategory(
            id = "fish",
            title = "Balık",
            iconRes = R.drawable.ic_category_fish,
            accentColor = Color(0xFFB6D7FF),
            recipes = listOf(
                Recipe(
                    id = "fish_izgara_somon",
                    name = "Izgara Somon",
                    thumbnailRes = R.drawable.ic_recipe_thumb_mint,
                    femaleSteps = listOf(
                        "Somonu zeytinyağı, limon kabuğu ve dereotuyla marine edin.",
                        "Bal ve soya sosu ekleyerek glaze hazırlayın.",
                        "Somon üzerini lime dilimleriyle süsleyin."
                    ),
                    maleSteps = listOf(
                        "Somonu ızgarada her iki yüzünü mühürleyin.",
                        "Marine sosunu pişerken fırçalayın.",
                        "Kinoa salatası eşliğinde servis edin."
                    )
                ),
                Recipe(
                    id = "fish_firinda_levrek",
                    name = "Fırında Levrek",
                    thumbnailRes = R.drawable.ic_recipe_thumb_lilac,
                    femaleSteps = listOf(
                        "Levrek içini limon, sarımsak ve biberiyeyle doldurun.",
                        "Zeytinyağı ve beyaz şarapla sos hazırlayın.",
                        "Sebze garnitürü için patates ve havucu doğrayın."
                    ),
                    maleSteps = listOf(
                        "Balığı yağlı kağıda sarıp fırın tepsisine alın.",
                        "Önceden ısıtılmış fırında 25 dakika pişirin.",
                        "Sebze garnitürüyle birlikte servis edin."
                    )
                ),
                Recipe(
                    id = "fish_bugulama_uskumru",
                    name = "Soğanlı Uskumru Buğulama",
                    thumbnailRes = R.drawable.ic_recipe_thumb_sky,
                    femaleSteps = listOf(
                        "Soğan, domates ve limonu ince dilimleyin.",
                        "Zeytinyağı, defne yaprağı ve tane karabiberle sos hazırlayın.",
                        "Balıkları sosla ovun."
                    ),
                    maleSteps = listOf(
                        "Balıkları tencereye dizip sebzelerle kat kat yerleştirin.",
                        "Kısık ateşte suyunu salıp çekene kadar pişirin.",
                        "Sıcak servis edin."
                    )
                ),
                Recipe(
                    id = "fish_soslu_karides",
                    name = "Tereyağlı Sarımsaklı Karides",
                    thumbnailRes = R.drawable.ic_recipe_thumb_sunrise,
                    femaleSteps = listOf(
                        "Karidesleri sarımsak, limon ve pul biberle marine edin.",
                        "Maydanoz ve tereyağını hazırlayın.",
                        "Servis için limon dilimleri kesin."
                    ),
                    maleSteps = listOf(
                        "Karidesleri kızgın tavada hızlıca soteleyin.",
                        "Marine sosunu ekleyip karamelize edin.",
                        "Sıcak tava ile masaya getirip servis edin."
                    )
                ),
                Recipe(
                    id = "fish_firinda_alabalik",
                    name = "Fırında Tereyağlı Alabalık",
                    thumbnailRes = R.drawable.ic_recipe_thumb_peach,
                    femaleSteps = listOf(
                        "Alabalıkları tereyağı ve bademle doldurun.",
                        "Limon suyu ve kapariyle sos hazırlayın.",
                        "Taze otları hazırlayın."
                    ),
                    maleSteps = listOf(
                        "Balıkları folyo ile sarıp fırınlayın.",
                        "Pişerken tereyağını ara ara gezdirin.",
                        "Serviste kapari sosunu üzerine dökün."
                    )
                ),
                Recipe(
                    id = "fish_baliksandwich",
                    name = "Akdeniz Balık Sandviç",
                    thumbnailRes = R.drawable.ic_recipe_thumb_mint,
                    femaleSteps = listOf(
                        "Balığı zeytinyağı ve limonla marine edin.",
                        "Yoğurtlu sarımsak sosu hazırlayın.",
                        "Roka ve turşu karışımı hazırlayın."
                    ),
                    maleSteps = listOf(
                        "Balığı ızgarada pişirip bagetlere yerleştirin.",
                        "Sosu ekleyip yeşilliklerle tamamlayın.",
                        "Sandviçleri dilimleyerek servis edin."
                    )
                ),
                Recipe(
                    id = "fish_kremali_midye",
                    name = "Kremalı Midye",
                    thumbnailRes = R.drawable.ic_recipe_thumb_lilac,
                    femaleSteps = listOf(
                        "Midyeleri temizleyip tuzlu suda bekletin.",
                        "Sarımsak, soğan ve tereyağını hazırlayın.",
                        "Krema ve beyaz şarapla sos hazırlayın."
                    ),
                    maleSteps = listOf(
                        "Midyeleri derin tencerede açılana kadar pişirin.",
                        "Sosu ekleyip birkaç dakika kaynatın.",
                        "Kızarmış ekmekle sıcak servis edin."
                    )
                ),
                Recipe(
                    id = "fish_tavada_hamsi",
                    name = "Tavada Hamsi",
                    thumbnailRes = R.drawable.ic_recipe_thumb_sky,
                    femaleSteps = listOf(
                        "Hamsileri ayıklayıp mısır unlu karışıma bulayın.",
                        "Soğanlı salata için malzemeleri doğrayın.",
                        "Limonlu sos hazırlayın."
                    ),
                    maleSteps = listOf(
                        "Tavada hamsileri kızartıp fazla yağı süzdürün.",
                        "Sıcak servis tabağına alın.",
                        "Soğanlı salata ve limonla servis edin."
                    )
                ),
                Recipe(
                    id = "fish_buharda_levrek",
                    name = "Buharda Zencefilli Levrek",
                    thumbnailRes = R.drawable.ic_recipe_thumb_sunrise,
                    femaleSteps = listOf(
                        "Levrek filetoyu zencefil ve soya ile marine edin.",
                        "Taze soğan ve kişniş doğrayın.",
                        "Susam yağıyla sos hazırlayın."
                    ),
                    maleSteps = listOf(
                        "Levrekleri buharda pişirin.",
                        "Üzerine sıcak yağ gezdirip aromalandırın.",
                        "Jasmin pilavıyla servis edin."
                    )
                ),
                Recipe(
                    id = "fish_firinda_kefal",
                    name = "Fırında Sebzeli Kefal",
                    thumbnailRes = R.drawable.ic_recipe_thumb_peach,
                    femaleSteps = listOf(
                        "Kefali limon, sarımsak ve kekikle marine edin.",
                        "Soğan, patates ve biberi doğrayın.",
                        "Domates sosu hazırlayın."
                    ),
                    maleSteps = listOf(
                        "Sebzeleri tepsiye yayarak balığı üzerine yerleştirin.",
                        "Fırında altın rengini alana kadar pişirin.",
                        "Servis tabağında sosu gezdirip sunun."
                    )
                )
            )
        )
    )

}
