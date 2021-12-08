import java.io.FileWriter;
import java.io.IOException;

/**
 * Author: Fowzy Alsaud
 * Date: Oct, 9th, 2021
 * Class: CMPS 4143 - Dr. Das
 * Description: This program will show the aspect of multiple inheritance and as
 * you can see we have created 5 animals of each family that professor asked for
 * and then ended having 110 objects/animals As we see here we set random values
 * for each animal/object like neurons, precision, food habit and we changed the
 * habit of 20 animals like what is requested in the
 * {@link org.graalvm.compiler.lir.InstructionStateProcedure} last steps we set
 * a speed, hunting habit, hunting process for 10 different animals. As the
 * following and last thing we done Out put the result into an output file.
 */
public class Main {
        public static void main(String[] args) throws IOException {
                // Create a file to write the data out
                FileWriter myWriter = new FileWriter("allData");

                // C. CREATE 5 ANIMALS OF EACH FAMILY 5*22 = 110 ANIMALS HAS BEEN CREATED
                // D. CHANGE FEATURES: NEURONS, PRECISION, FOOD HABITS FOR 20 ANIMALS
                // BEFORE WE CHANGE IT
                Mammalia CITRINE = new Mammalia(1, 74.84, "Asparagus");
                Mammalia DENIM = new Mammalia(20, 19.56, "Apples");
                Mammalia TORTAS = new Mammalia(14, 56.78, "Avacado");
                Mammalia NUZZLE = new Mammalia(14, 60.2, "Alfalfa");
                Mammalia BIANCHA = new Mammalia(19, 1.11, "Acorn squash");
                Monotremata EARNIE = new Monotremata(14, 43.31, "Almond");
                Monotremata TWOEY = new Monotremata(15, 30.07, "Arugala");
                Monotremata BALOU = new Monotremata(4, 53.1, "Artichoke");
                Monotremata FLOOZIE = new Monotremata(8, 67.11, "Applesauce");
                Monotremata LITT = new Monotremata(14, 75.97, "Asian noodles");
                Theria LARKIN = new Theria(20, 52.41, "Antelope");
                Theria CAMOTE = new Theria(5, 39.3, "Ahi tuna");
                Theria KALONA = new Theria(12, 0.9, "Albacore tuna");
                Theria BEAUTIFUL = new Theria(6, 31.92, "Apple juice");
                Theria BLANQUITO = new Theria(10, 66.95, "Avocado roll");
                Marsupialia KOOKY = new Marsupialia(4, 44.75, "Bruscetta");
                Marsupialia BOGGIENIGHTS = new Marsupialia(20, 23.77, "Bacon");
                Marsupialia MANLY = new Marsupialia(20, 24.6, "Black beans");
                Marsupialia GD = new Marsupialia(2, 87.94, "Bagels");
                Marsupialia ROCIEN = new Marsupialia(11, 45.25, "Baked beans");
                // D. SHOW CHANGES BEFORE CHANGING NEURONS, PRECISION AND FOOD
                CITRINE.getAllData();
                DENIM.getAllData();
                TORTAS.getAllData();
                NUZZLE.getAllData();
                BIANCHA.getAllData();
                EARNIE.getAllData();
                TWOEY.getAllData();
                BALOU.getAllData();
                FLOOZIE.getAllData();
                LITT.getAllData();
                LARKIN.getAllData();
                CAMOTE.getAllData();
                KALONA.getAllData();
                BEAUTIFUL.getAllData();
                BLANQUITO.getAllData();
                KOOKY.getAllData();
                BOGGIENIGHTS.getAllData();
                MANLY.getAllData();
                GD.getAllData();
                ROCIEN.getAllData();
                // APPLY CHANGES ON NEURONS, PRECISION AND FOOD
                CITRINE.firstChange(148, 15.55, "Cheese");
                DENIM.firstChange(55, 29.67, "Egg");
                TORTAS.firstChange(232, 47.9, "Butter");
                NUZZLE.firstChange(281, 30.72, "Margarine");
                BIANCHA.firstChange(17, 28.29, "Yogurt");
                EARNIE.firstChange(158, 44.79, "Cottage cheese");
                TWOEY.firstChange(89, 16.81, "Ice cream");
                BALOU.firstChange(114, 44.28, "Cream");
                FLOOZIE.firstChange(71, 5.33, "Sandwich");
                LITT.firstChange(97, 31.95, "Sausage");
                LARKIN.firstChange(247, 20.86, "Hamburger");
                CAMOTE.firstChange(73, 17.09, "Hot dog");
                KALONA.firstChange(37, 20.79, "Bread");
                BEAUTIFUL.firstChange(9, 22.74, "Pizza");
                BLANQUITO.firstChange(65, 42.81, "Steak");
                KOOKY.firstChange(268, 17.79, "Roast chicken");
                BOGGIENIGHTS.firstChange(193, 15.39, "Fish");
                MANLY.firstChange(6, 35.54, "Seafood");
                GD.firstChange(69, 26.52, "Ham");
                ROCIEN.firstChange(99, 30.25, "Kebab");
                // D. SHOW CHANGES AFTER CHANGING NEURONS, PRECISION AND FOOD
                CITRINE.getAllData();
                DENIM.getAllData();
                TORTAS.getAllData();
                NUZZLE.getAllData();
                BIANCHA.getAllData();
                EARNIE.getAllData();
                TWOEY.getAllData();
                BALOU.getAllData();
                FLOOZIE.getAllData();
                LITT.getAllData();
                LARKIN.getAllData();
                CAMOTE.getAllData();
                KALONA.getAllData();
                BEAUTIFUL.getAllData();
                BLANQUITO.getAllData();
                KOOKY.getAllData();
                BOGGIENIGHTS.getAllData();
                MANLY.getAllData();
                GD.getAllData();
                ROCIEN.getAllData();
                // D. Change Speed, hunting Process, food habit for at least 10 animals for
                // those who are 6-8 level animals
                Cetartiodactyla PONYO = new Cetartiodactyla(1, 32.35, "Syrian food", 20, "meats", "quick");
                Cetartiodactyla CHUCHA = new Cetartiodactyla(19, 27.38, "Italian bread", 50, "vegan", "quick");
                Cetartiodactyla TANGERINE = new Cetartiodactyla(1, 19.25, "Jambalaya", 60, "meats", "slow");
                Cetartiodactyla ARRO = new Cetartiodactyla(16, 73.24, "Jelly / jam", 70, "meats", "aggressive");
                Cetartiodactyla BALTO = new Cetartiodactyla(5, 87.53, "Jerky", 120, "vegetarian", "aggressive");
                Carnivora TAGHD = new Carnivora(6, 81.28, "Lasagna", 55, "vegetarian", "bites");
                Carnivora DUNJA = new Carnivora(15, 45.62, "Meatballs", 99, "vegetarian", "stalk");
                Carnivora AKEELA = new Carnivora(18, 58.33, "Moose", 122, "vegetarian", "slow");
                Carnivora JACKI = new Carnivora(2, 34.23, "Milk", 299, "vegan", "walking around the target");
                Carnivora MAYROULA = new Carnivora(8, 19.5, "Milkshake", 512, "meats", "jump");
                // D. RESET OF THE ANIMALS WITH THEIR NORMAL REQUIRMENTS
                Placentalia LIEUTENANT = new Placentalia(7, 45.93, "Bbq");
                Placentalia WAFFLE = new Placentalia(5, 59.62, "Bison");
                Placentalia KIIRO = new Placentalia(17, 15.65, "Barley");
                Placentalia KEATON = new Placentalia(15, 32.49, "Beer");
                Placentalia PATSEY = new Placentalia(5, 30.56, "Bisque");
                Atlantogenata MIZMO = new Atlantogenata(17, 50.12, "Bluefish");
                Atlantogenata PATCHIE = new Atlantogenata(18, 62.69, "Bread");
                Atlantogenata PHILOMENA = new Atlantogenata(14, 66.21, "Broccoli");
                Atlantogenata SAGA = new Atlantogenata(6, 27.09, "Buritto");
                Atlantogenata CARABU = new Atlantogenata(18, 47.36, "Babaganoosh");
                Boreoeutheria HUMPERDINCK = new Boreoeutheria(17, 49.7, "Cabbage");
                Boreoeutheria CHEYANNE = new Boreoeutheria(6, 72.11, "Cake");
                Boreoeutheria DAIGOW = new Boreoeutheria(8, 33.15, "Carrots");
                Boreoeutheria SASHA = new Boreoeutheria(3, 8.81, "Carne asada");
                Boreoeutheria PITSL = new Boreoeutheria(10, 82.28, "Celery");
                Afrotheria BUDDYTON = new Afrotheria(18, 46.55, "Cheese");
                Afrotheria REED = new Afrotheria(7, 61.8, "Chicken");
                Afrotheria BAUER = new Afrotheria(6, 30.15, "Catfish");
                Afrotheria RONCON = new Afrotheria(6, 23.8, "Chips");
                Afrotheria ARIEL = new Afrotheria(20, 13.21, "Chocolate");
                Xenarthra HONEYBUN = new Xenarthra(18, 24.61, "Chowder");
                Xenarthra PHELAN = new Xenarthra(8, 24.85, "Clams");
                Xenarthra MUDEEB = new Xenarthra(16, 49.85, "Coffee");
                Xenarthra COZE = new Xenarthra(8, 57.95, "Cookies");
                Xenarthra POQUI = new Xenarthra(10, 65.15, "Corn");
                Euarchontoglires CLUE = new Euarchontoglires(5, 73.38, "Cupcakes");
                Euarchontoglires ROSTEN = new Euarchontoglires(14, 34.7, "Crab");
                Euarchontoglires ISMAEL = new Euarchontoglires(6, 71.84, "Curry");
                Euarchontoglires TAFFETA = new Euarchontoglires(8, 72.22, "Cereal");
                Euarchontoglires CHARM = new Euarchontoglires(20, 52.7, "Chimichanga");
                Laurasiatheria YAKO = new Laurasiatheria(11, 82.51, "Dates");
                Laurasiatheria NOVI = new Laurasiatheria(19, 75.52, "Dips");
                Laurasiatheria BUELLER = new Laurasiatheria(18, 31.72, "Duck");
                Laurasiatheria ADELINA = new Laurasiatheria(13, 88.28, "Dumplings");
                Laurasiatheria DOGGEH = new Laurasiatheria(15, 74.15, "Donuts");
                Euarchonta LINC = new Euarchonta(13, 67.73, "Eggs");
                Euarchonta MIREYA = new Euarchonta(9, 77.52, "Enchilada");
                Euarchonta CHESBAR = new Euarchonta(3, 98.32, "Eggrolls");
                Euarchonta DROGO = new Euarchonta(14, 42.26, "English muffins");
                Euarchonta NEITA = new Euarchonta(12, 37.46, "Edimame");
                Glires CLARITA = new Glires(6, 78.05, "Eel sushi");
                Glires ZAHAVA = new Glires(9, 3, "Fajita");
                Glires CHEBA = new Glires(13, 36.3, "Falafel");
                Glires KUSHPO = new Glires(4, 25.69, "Fish");
                Glires BEO = new Glires(4, 22.39, "Franks");
                Scrotifera DANGER = new Scrotifera(11, 20.2, "Fondu");
                Scrotifera BOOKER = new Scrotifera(5, 60.9, "French toast");
                Scrotifera APONTE = new Scrotifera(15, 29.84, "French dip");
                Scrotifera SURIS = new Scrotifera(9, 55.5, "Garlic");
                Scrotifera LENARD = new Scrotifera(17, 42.96, "Ginger");
                Eulipotyphia STEEL = new Eulipotyphia(7, 50.41, "Gnocchi");
                Eulipotyphia AYUMI = new Eulipotyphia(20, 48.58, "Goose");
                Eulipotyphia MYGEE = new Eulipotyphia(8, 32, "Granola");
                Eulipotyphia LAMAR = new Eulipotyphia(10, 34.96, "Grapes");
                Eulipotyphia NEXXUS = new Eulipotyphia(18, 49.54, "Green beans");
                Chirpotera BANIT = new Chirpotera(1, 69.04, "Guancamole");
                Chirpotera PEEVE = new Chirpotera(18, 67.83, "Gumbo");
                Chirpotera CHUBY = new Chirpotera(15, 38.55, "Grits");
                Chirpotera JIZMO = new Chirpotera(6, 45.12, "Graham crackers");
                Chirpotera BENICIO = new Chirpotera(6, 78.24, "Ham");
                Euungulata SCOOTER = new Euungulata(19, 39.95, "Halibut");
                Euungulata CIAN = new Euungulata(2, 50.48, "Hamburger");
                Euungulata BOE = new Euungulata(16, 57.71, "Honey");
                Euungulata JEA = new Euungulata(18, 99.31, "Huenos rancheros");
                Euungulata CHICCO = new Euungulata(5, 12.13, "Hash browns");
                Ferae SAVEY = new Ferae(1, 82.7, "Hot dogs");
                Ferae MICHA = new Ferae(2, 40.96, "Haiku roll");
                Ferae MYSTERIO = new Ferae(19, 72.08, "Hummus");
                Ferae PANCHA = new Ferae(3, 0.22, "Ice cream");
                Ferae SALOME = new Ferae(3, 29.45, "Irish stew");
                // Part e. is printing out the data on an output file
                Perissodactyla CALISEE = new Perissodactyla(11, 24, "Jalapeño");
                Perissodactyla YORK = new Perissodactyla(1, 3.25, "Kale");
                Perissodactyla ADE = new Perissodactyla(4, 2.71, "Kabobs");
                Perissodactyla RAINNEY = new Perissodactyla(11, 5.07, "Ketchup");
                Perissodactyla FACEBOOK = new Perissodactyla(5, 93.68, "Kiwi");
                Pholidota EDNA = new Pholidota(6, 37.12, "Kidney beans");
                Pholidota TATI = new Pholidota(11, 70.24, "Kingfish");
                Pholidota MENDEZ = new Pholidota(1, 80.72, "Lobster");
                Pholidota IZZY = new Pholidota(2, 46.45, "Lamb");
                Pholidota SAGGA = new Pholidota(19, 79.29, "Linguine");
                // PRINT OUT DATA ON CONSOLE
                System.out.print("\n\n\nPrintin All the data for all animals....\n\n\n");
                CITRINE.getAllData();
                DENIM.getAllData();
                TORTAS.getAllData();
                NUZZLE.getAllData();
                BIANCHA.getAllData();
                EARNIE.getAllData();
                TWOEY.getAllData();
                BALOU.getAllData();
                FLOOZIE.getAllData();
                LITT.getAllData();
                LARKIN.getAllData();
                CAMOTE.getAllData();
                KALONA.getAllData();
                BEAUTIFUL.getAllData();
                BLANQUITO.getAllData();
                KOOKY.getAllData();
                BOGGIENIGHTS.getAllData();
                MANLY.getAllData();
                GD.getAllData();
                ROCIEN.getAllData();
                LIEUTENANT.getAllData();
                WAFFLE.getAllData();
                KIIRO.getAllData();
                KEATON.getAllData();
                PATSEY.getAllData();
                MIZMO.getAllData();
                PATCHIE.getAllData();
                PHILOMENA.getAllData();
                SAGA.getAllData();
                CARABU.getAllData();
                HUMPERDINCK.getAllData();
                CHEYANNE.getAllData();
                DAIGOW.getAllData();
                SASHA.getAllData();
                PITSL.getAllData();
                BUDDYTON.getAllData();
                REED.getAllData();
                BAUER.getAllData();
                RONCON.getAllData();
                ARIEL.getAllData();
                HONEYBUN.getAllData();
                PHELAN.getAllData();
                MUDEEB.getAllData();
                COZE.getAllData();
                POQUI.getAllData();
                CLUE.getAllData();
                ROSTEN.getAllData();
                ISMAEL.getAllData();
                TAFFETA.getAllData();
                CHARM.getAllData();
                YAKO.getAllData();
                NOVI.getAllData();
                BUELLER.getAllData();
                ADELINA.getAllData();
                DOGGEH.getAllData();
                LINC.getAllData();
                MIREYA.getAllData();
                CHESBAR.getAllData();
                DROGO.getAllData();
                NEITA.getAllData();
                CLARITA.getAllData();
                ZAHAVA.getAllData();
                CHEBA.getAllData();
                KUSHPO.getAllData();
                BEO.getAllData();
                DANGER.getAllData();
                BOOKER.getAllData();
                APONTE.getAllData();
                SURIS.getAllData();
                LENARD.getAllData();
                STEEL.getAllData();
                AYUMI.getAllData();
                MYGEE.getAllData();
                LAMAR.getAllData();
                NEXXUS.getAllData();
                BANIT.getAllData();
                PEEVE.getAllData();
                CHUBY.getAllData();
                JIZMO.getAllData();
                BENICIO.getAllData();
                SCOOTER.getAllData();
                CIAN.getAllData();
                BOE.getAllData();
                JEA.getAllData();
                CHICCO.getAllData();
                SAVEY.getAllData();
                MICHA.getAllData();
                MYSTERIO.getAllData();
                PANCHA.getAllData();
                SALOME.getAllData();
                PONYO.getAllData();
                CHUCHA.getAllData();
                TANGERINE.getAllData();
                ARRO.getAllData();
                BALTO.getAllData();
                CALISEE.getAllData();
                YORK.getAllData();
                ADE.getAllData();
                RAINNEY.getAllData();
                FACEBOOK.getAllData();
                EDNA.getAllData();
                TATI.getAllData();
                MENDEZ.getAllData();
                IZZY.getAllData();
                SAGGA.getAllData();
                TAGHD.getAllData();
                DUNJA.getAllData();
                AKEELA.getAllData();
                JACKI.getAllData();
                MAYROULA.getAllData();
                // PRINT OUTDATA ONTO THE OUTPUT FILE USING .write
                myWriter.write(CITRINE.getNeurons() + " " + CITRINE.getPrecision() + " " + CITRINE.favoriteFoods()
                                + " \n");
                myWriter.write(DENIM.getNeurons() + " " + DENIM.getPrecision() + " " + DENIM.favoriteFoods() + " \n");
                myWriter.write(TORTAS.getNeurons() + " " + TORTAS.getPrecision() + " " + TORTAS.favoriteFoods()
                                + " \n");
                myWriter.write(NUZZLE.getNeurons() + " " + NUZZLE.getPrecision() + " " + NUZZLE.favoriteFoods()
                                + " \n");
                myWriter.write(BIANCHA.getNeurons() + " " + BIANCHA.getPrecision() + " " + BIANCHA.favoriteFoods()
                                + " \n");
                myWriter.write(EARNIE.getNeurons() + " " + EARNIE.getPrecision() + " " + EARNIE.favoriteFoods()
                                + " \n");
                myWriter.write(TWOEY.getNeurons() + " " + TWOEY.getPrecision() + " " + TWOEY.favoriteFoods() + " \n");
                myWriter.write(BALOU.getNeurons() + " " + BALOU.getPrecision() + " " + BALOU.favoriteFoods() + " \n");
                myWriter.write(FLOOZIE.getNeurons() + " " + FLOOZIE.getPrecision() + " " + FLOOZIE.favoriteFoods()
                                + " \n");
                myWriter.write(LITT.getNeurons() + " " + LITT.getPrecision() + " " + LITT.favoriteFoods() + " \n");
                myWriter.write(LARKIN.getNeurons() + " " + LARKIN.getPrecision() + " " + LARKIN.favoriteFoods()
                                + " \n");
                myWriter.write(CAMOTE.getNeurons() + " " + CAMOTE.getPrecision() + " " + CAMOTE.favoriteFoods()
                                + " \n");
                myWriter.write(KALONA.getNeurons() + " " + KALONA.getPrecision() + " " + KALONA.favoriteFoods()
                                + " \n");
                myWriter.write(BEAUTIFUL.getNeurons() + " " + BEAUTIFUL.getPrecision() + " " + BEAUTIFUL.favoriteFoods()
                                + " \n");
                myWriter.write(BLANQUITO.getNeurons() + " " + BLANQUITO.getPrecision() + " " + BLANQUITO.favoriteFoods()
                                + " \n");
                myWriter.write(KOOKY.getNeurons() + " " + KOOKY.getPrecision() + " " + KOOKY.favoriteFoods() + " \n");
                myWriter.write(BOGGIENIGHTS.getNeurons() + " " + BOGGIENIGHTS.getPrecision() + " "
                                + BOGGIENIGHTS.favoriteFoods() + " \n");
                myWriter.write(MANLY.getNeurons() + " " + MANLY.getPrecision() + " " + MANLY.favoriteFoods() + " \n");
                myWriter.write(GD.getNeurons() + " " + GD.getPrecision() + " " + GD.favoriteFoods() + " \n");
                myWriter.write(ROCIEN.getNeurons() + " " + ROCIEN.getPrecision() + " " + ROCIEN.favoriteFoods()
                                + " \n");
                myWriter.write(LIEUTENANT.getNeurons() + " " + LIEUTENANT.getPrecision() + " "
                                + LIEUTENANT.favoriteFoods() + " \n");
                myWriter.write(WAFFLE.getNeurons() + " " + WAFFLE.getPrecision() + " " + WAFFLE.favoriteFoods()
                                + " \n");
                myWriter.write(KIIRO.getNeurons() + " " + KIIRO.getPrecision() + " " + KIIRO.favoriteFoods() + " \n");
                myWriter.write(KEATON.getNeurons() + " " + KEATON.getPrecision() + " " + KEATON.favoriteFoods()
                                + " \n");
                myWriter.write(PATSEY.getNeurons() + " " + PATSEY.getPrecision() + " " + PATSEY.favoriteFoods()
                                + " \n");
                myWriter.write(MIZMO.getNeurons() + " " + MIZMO.getPrecision() + " " + MIZMO.favoriteFoods() + " \n");
                myWriter.write(PATCHIE.getNeurons() + " " + PATCHIE.getPrecision() + " " + PATCHIE.favoriteFoods()
                                + " \n");
                myWriter.write(PHILOMENA.getNeurons() + " " + PHILOMENA.getPrecision() + " " + PHILOMENA.favoriteFoods()
                                + " \n");
                myWriter.write(SAGA.getNeurons() + " " + SAGA.getPrecision() + " " + SAGA.favoriteFoods() + " \n");
                myWriter.write(CARABU.getNeurons() + " " + CARABU.getPrecision() + " " + CARABU.favoriteFoods()
                                + " \n");
                myWriter.write(HUMPERDINCK.getNeurons() + " " + HUMPERDINCK.getPrecision() + " "
                                + HUMPERDINCK.favoriteFoods() + " \n");
                myWriter.write(CHEYANNE.getNeurons() + " " + CHEYANNE.getPrecision() + " " + CHEYANNE.favoriteFoods()
                                + " \n");
                myWriter.write(DAIGOW.getNeurons() + " " + DAIGOW.getPrecision() + " " + DAIGOW.favoriteFoods()
                                + " \n");
                myWriter.write(SASHA.getNeurons() + " " + SASHA.getPrecision() + " " + SASHA.favoriteFoods() + " \n");
                myWriter.write(PITSL.getNeurons() + " " + PITSL.getPrecision() + " " + PITSL.favoriteFoods() + " \n");
                myWriter.write(BUDDYTON.getNeurons() + " " + BUDDYTON.getPrecision() + " " + BUDDYTON.favoriteFoods()
                                + " \n");
                myWriter.write(REED.getNeurons() + " " + REED.getPrecision() + " " + REED.favoriteFoods() + " \n");
                myWriter.write(BAUER.getNeurons() + " " + BAUER.getPrecision() + " " + BAUER.favoriteFoods() + " \n");
                myWriter.write(RONCON.getNeurons() + " " + RONCON.getPrecision() + " " + RONCON.favoriteFoods()
                                + " \n");
                myWriter.write(ARIEL.getNeurons() + " " + ARIEL.getPrecision() + " " + ARIEL.favoriteFoods() + " \n");
                myWriter.write(HONEYBUN.getNeurons() + " " + HONEYBUN.getPrecision() + " " + HONEYBUN.favoriteFoods()
                                + " \n");
                myWriter.write(PHELAN.getNeurons() + " " + PHELAN.getPrecision() + " " + PHELAN.favoriteFoods()
                                + " \n");
                myWriter.write(MUDEEB.getNeurons() + " " + MUDEEB.getPrecision() + " " + MUDEEB.favoriteFoods()
                                + " \n");
                myWriter.write(COZE.getNeurons() + " " + COZE.getPrecision() + " " + COZE.favoriteFoods() + " \n");
                myWriter.write(POQUI.getNeurons() + " " + POQUI.getPrecision() + " " + POQUI.favoriteFoods() + " \n");
                myWriter.write(CLUE.getNeurons() + " " + CLUE.getPrecision() + " " + CLUE.favoriteFoods() + " \n");
                myWriter.write(ROSTEN.getNeurons() + " " + ROSTEN.getPrecision() + " " + ROSTEN.favoriteFoods()
                                + " \n");
                myWriter.write(ISMAEL.getNeurons() + " " + ISMAEL.getPrecision() + " " + ISMAEL.favoriteFoods()
                                + " \n");
                myWriter.write(TAFFETA.getNeurons() + " " + TAFFETA.getPrecision() + " " + TAFFETA.favoriteFoods()
                                + " \n");
                myWriter.write(CHARM.getNeurons() + " " + CHARM.getPrecision() + " " + CHARM.favoriteFoods() + " \n");
                myWriter.write(YAKO.getNeurons() + " " + YAKO.getPrecision() + " " + YAKO.favoriteFoods() + " \n");
                myWriter.write(NOVI.getNeurons() + " " + NOVI.getPrecision() + " " + NOVI.favoriteFoods() + " \n");
                myWriter.write(BUELLER.getNeurons() + " " + BUELLER.getPrecision() + " " + BUELLER.favoriteFoods()
                                + " \n");
                myWriter.write(ADELINA.getNeurons() + " " + ADELINA.getPrecision() + " " + ADELINA.favoriteFoods()
                                + " \n");
                myWriter.write(DOGGEH.getNeurons() + " " + DOGGEH.getPrecision() + " " + DOGGEH.favoriteFoods()
                                + " \n");
                myWriter.write(LINC.getNeurons() + " " + LINC.getPrecision() + " " + LINC.favoriteFoods() + " \n");
                myWriter.write(MIREYA.getNeurons() + " " + MIREYA.getPrecision() + " " + MIREYA.favoriteFoods()
                                + " \n");
                myWriter.write(CHESBAR.getNeurons() + " " + CHESBAR.getPrecision() + " " + CHESBAR.favoriteFoods()
                                + " \n");
                myWriter.write(DROGO.getNeurons() + " " + DROGO.getPrecision() + " " + DROGO.favoriteFoods() + " \n");
                myWriter.write(NEITA.getNeurons() + " " + NEITA.getPrecision() + " " + NEITA.favoriteFoods() + " \n");
                myWriter.write(CLARITA.getNeurons() + " " + CLARITA.getPrecision() + " " + CLARITA.favoriteFoods()
                                + " \n");
                myWriter.write(ZAHAVA.getNeurons() + " " + ZAHAVA.getPrecision() + " " + ZAHAVA.favoriteFoods()
                                + " \n");
                myWriter.write(CHEBA.getNeurons() + " " + CHEBA.getPrecision() + " " + CHEBA.favoriteFoods() + " \n");
                myWriter.write(KUSHPO.getNeurons() + " " + KUSHPO.getPrecision() + " " + KUSHPO.favoriteFoods()
                                + " \n");
                myWriter.write(BEO.getNeurons() + " " + BEO.getPrecision() + " " + BEO.favoriteFoods() + " \n");
                myWriter.write(DANGER.getNeurons() + " " + DANGER.getPrecision() + " " + DANGER.favoriteFoods()
                                + " \n");
                myWriter.write(BOOKER.getNeurons() + " " + BOOKER.getPrecision() + " " + BOOKER.favoriteFoods()
                                + " \n");
                myWriter.write(APONTE.getNeurons() + " " + APONTE.getPrecision() + " " + APONTE.favoriteFoods()
                                + " \n");
                myWriter.write(SURIS.getNeurons() + " " + SURIS.getPrecision() + " " + SURIS.favoriteFoods() + " \n");
                myWriter.write(LENARD.getNeurons() + " " + LENARD.getPrecision() + " " + LENARD.favoriteFoods()
                                + " \n");
                myWriter.write(STEEL.getNeurons() + " " + STEEL.getPrecision() + " " + STEEL.favoriteFoods() + " \n");
                myWriter.write(AYUMI.getNeurons() + " " + AYUMI.getPrecision() + " " + AYUMI.favoriteFoods() + " \n");
                myWriter.write(MYGEE.getNeurons() + " " + MYGEE.getPrecision() + " " + MYGEE.favoriteFoods() + " \n");
                myWriter.write(LAMAR.getNeurons() + " " + LAMAR.getPrecision() + " " + LAMAR.favoriteFoods() + " \n");
                myWriter.write(NEXXUS.getNeurons() + " " + NEXXUS.getPrecision() + " " + NEXXUS.favoriteFoods()
                                + " \n");
                myWriter.write(BANIT.getNeurons() + " " + BANIT.getPrecision() + " " + BANIT.favoriteFoods() + " \n");
                myWriter.write(PEEVE.getNeurons() + " " + PEEVE.getPrecision() + " " + PEEVE.favoriteFoods() + " \n");
                myWriter.write(CHUBY.getNeurons() + " " + CHUBY.getPrecision() + " " + CHUBY.favoriteFoods() + " \n");
                myWriter.write(JIZMO.getNeurons() + " " + JIZMO.getPrecision() + " " + JIZMO.favoriteFoods() + " \n");
                myWriter.write(BENICIO.getNeurons() + " " + BENICIO.getPrecision() + " " + BENICIO.favoriteFoods()
                                + " \n");
                myWriter.write(SCOOTER.getNeurons() + " " + SCOOTER.getPrecision() + " " + SCOOTER.favoriteFoods()
                                + " \n");
                myWriter.write(CIAN.getNeurons() + " " + CIAN.getPrecision() + " " + CIAN.favoriteFoods() + " \n");
                myWriter.write(BOE.getNeurons() + " " + BOE.getPrecision() + " " + BOE.favoriteFoods() + " \n");
                myWriter.write(JEA.getNeurons() + " " + JEA.getPrecision() + " " + JEA.favoriteFoods() + " \n");
                myWriter.write(CHICCO.getNeurons() + " " + CHICCO.getPrecision() + " " + CHICCO.favoriteFoods()
                                + " \n");
                myWriter.write(SAVEY.getNeurons() + " " + SAVEY.getPrecision() + " " + SAVEY.favoriteFoods() + " \n");
                myWriter.write(MICHA.getNeurons() + " " + MICHA.getPrecision() + " " + MICHA.favoriteFoods() + " \n");
                myWriter.write(MYSTERIO.getNeurons() + " " + MYSTERIO.getPrecision() + " " + MYSTERIO.favoriteFoods()
                                + " \n");
                myWriter.write(PANCHA.getNeurons() + " " + PANCHA.getPrecision() + " " + PANCHA.favoriteFoods()
                                + " \n");
                myWriter.write(SALOME.getNeurons() + " " + SALOME.getPrecision() + " " + SALOME.favoriteFoods()
                                + " \n");
                myWriter.write("\n\n\nNow I'm printing out the animals that I changes their speed, food habit, and hunting process.\n\n\n\n");

                myWriter.write(PONYO.getNeurons() + " " + PONYO.getPrecision() + " " + PONYO.favoriteFoods() + " "
                                + PONYO.huntingProcess + " " + PONYO.huntingType + " " + PONYO.speed + " \n");
                myWriter.write(CHUCHA.getNeurons() + " " + CHUCHA.getPrecision() + " " + CHUCHA.favoriteFoods() + " "
                                + CHUCHA.huntingProcess + " " + CHUCHA.huntingType + " " + CHUCHA.speed + " \n");
                myWriter.write(TANGERINE.getNeurons() + " " + TANGERINE.getPrecision() + " " + TANGERINE.favoriteFoods()
                                + " " + TANGERINE.huntingProcess + " " + TANGERINE.huntingType + " " + TANGERINE.speed
                                + " \n");
                myWriter.write(ARRO.getNeurons() + " " + ARRO.getPrecision() + " " + ARRO.favoriteFoods() + " "
                                + ARRO.huntingProcess + " " + ARRO.huntingType + " " + ARRO.speed + " \n");
                myWriter.write(BALTO.getNeurons() + " " + BALTO.getPrecision() + " " + BALTO.favoriteFoods() + " "
                                + BALTO.huntingProcess + " " + BALTO.huntingType + " " + BALTO.speed + " \n");
                myWriter.write(TAGHD.getNeurons() + " " + TAGHD.getPrecision() + " " + TAGHD.favoriteFoods() + " "
                                + TAGHD.huntingProcess + " " + TAGHD.huntingType + " " + TAGHD.speed + " \n");
                myWriter.write(DUNJA.getNeurons() + " " + DUNJA.getPrecision() + " " + DUNJA.favoriteFoods() + " "
                                + DUNJA.huntingProcess + " " + DUNJA.huntingType + " " + DUNJA.speed + " \n");
                myWriter.write(AKEELA.getNeurons() + " " + AKEELA.getPrecision() + " " + AKEELA.favoriteFoods() + " "
                                + AKEELA.huntingProcess + " " + AKEELA.huntingType + " " + AKEELA.speed + " \n");
                myWriter.write(JACKI.getNeurons() + " " + JACKI.getPrecision() + " " + JACKI.favoriteFoods() + " "
                                + JACKI.huntingProcess + " " + JACKI.huntingType + " " + JACKI.speed + " \n");
                myWriter.write(MAYROULA.getNeurons() + " " + MAYROULA.getPrecision() + " " + MAYROULA.favoriteFoods()
                                + " " + MAYROULA.huntingProcess + " " + MAYROULA.huntingType + " " + MAYROULA.speed
                                + " \n");
                myWriter.write(CALISEE.getNeurons() + " " + CALISEE.getPrecision() + " " + CALISEE.favoriteFoods()
                                + " \n");
                myWriter.write(YORK.getNeurons() + " " + YORK.getPrecision() + " " + YORK.favoriteFoods() + " \n");
                myWriter.write(ADE.getNeurons() + " " + ADE.getPrecision() + " " + ADE.favoriteFoods() + " \n");
                myWriter.write(RAINNEY.getNeurons() + " " + RAINNEY.getPrecision() + " " + RAINNEY.favoriteFoods()
                                + " \n");
                myWriter.write(FACEBOOK.getNeurons() + " " + FACEBOOK.getPrecision() + " " + FACEBOOK.favoriteFoods()
                                + " \n");
                myWriter.write(EDNA.getNeurons() + " " + EDNA.getPrecision() + " " + EDNA.favoriteFoods() + " \n");
                myWriter.write(TATI.getNeurons() + " " + TATI.getPrecision() + " " + TATI.favoriteFoods() + " \n");
                myWriter.write(MENDEZ.getNeurons() + " " + MENDEZ.getPrecision() + " " + MENDEZ.favoriteFoods()
                                + " \n");
                myWriter.write(IZZY.getNeurons() + " " + IZZY.getPrecision() + " " + IZZY.favoriteFoods() + " \n");
                myWriter.write(SAGGA.getNeurons() + " " + SAGGA.getPrecision() + " " + SAGGA.favoriteFoods() + " \n");
                myWriter.close(); // CLOSE OUT THE FILE
        }
}