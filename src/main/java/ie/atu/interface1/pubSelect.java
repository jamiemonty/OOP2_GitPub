package ie.atu.interface1;

import java.util.Scanner;

public class pubSelect {

    private static double[] prices;
    public static String[] drinks;
    static public String[] eyreSqPub = {"1. Mary Mullins", "2. McGettigan's", "3. Skeff", "4. Darcy's"};
    static public String[] shopStPub = {"1. Barr an Chaladh", "2. Busker Brownes", "3. Taffees"};
    static public String[] latinQrPub = {"1. Blue Note", "2. Massimo's", "3. Monroe's", "4.Roisin Dubh", "5. Taylor's"};
    static public String[] otherPub = {""};
    public String[] reviewCat;
    public double[] rating;


    private String BarrNaCh;


    public pubSelect(double[] prices){
        this.prices = prices;
        initializeDrinks();

    }

    private void initializeDrinks(){
        drinks = new String[]{"Guinness ", "Heineken ", "Orchard Thieves ", "\nVodka ", "Jameson ", "Bacardi ", "Gin ", "\nDash" ,
                "Mineral ", "Tonic ", "\nBaby Guinness ", "Tequila ", "Sambucca ", "AfterShock ", "\nOld Fashioned ", "Daquiri ",
                "Sex On The Beach ", "Martini ", "Whiskey Sours "};
    }

    public void displayinfo() {
        System.out.println("Drink Menu + Prices\n_____________________ ");
        for (int i = 0; i < drinks.length; i++) {
            System.out.println(drinks[i] + "- €" + prices[i]);
        }
    }
    public static void displayPubsEyreSq() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number which corresponds to the pub you would like to explore!\n");

        for(int x = 0; x < eyreSqPub.length; x++){
            System.out.println(eyreSqPub[x]);
        }

        System.out.println("Pub number: ");
        int EyreSqoverview = scanner.nextInt();
        switch (EyreSqoverview) {

            case 1:
                System.out.println("\nYou have chosen Mary Mullens\n\n*Overview*\nLocated 300 yards from the train" +
                        "station, Mullens has quickly transformed into one of the most popular pubs in the city");
                pubOverview.maryMullinsPD();
                break;
            case 2:
                System.out.println("\nYou have chosen McGettigan's\n\n*Overview*\nMcGettigan's GWY is located on Eyre Square" +
                        " in Galway. Pop in and try award-winning pub grub, " +
                        "watch live sports, or enjoy live music! ");
                pubOverview.mcGettiganPD();
                break;
            case 3:
                System.out.println("\nYou have chosen Skeff\n\n*Overview*\nUniquely designed busy bar in the heart of Galway " +
                        "city center serving wholesome, quality food.");
                pubOverview.skeffPD();
                break;
            case 4:
                System.out.println("\nYou have chosen Darcy's\n\n*Overview*\nDarcy's is a Traditional Irish bar located on " +
                        "Eyre Square in the heart of Galway city, just beside the train station");
                pubOverview.darcysPD();
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    public static void displayPubsShopSt(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number which corresponds to the pub you would like to explore!\n");
        String[] shopStPub = {"1. Barr an Chaladh", "2. Busker Brownes", "3. Taffees"};

        for(int x = 0; x < shopStPub.length; x++){
            System.out.println(shopStPub[x]);
        }

        System.out.println("Pub number: ");
        int ShopStoverview = scanner.nextInt();
        switch (ShopStoverview) {
            case 1:
                System.out.println("\nYou have chosen Barr an Chaladh\n\n*Overview*\nA country " +
                        "pub in the heart of the city, " +
                        "Barr an Chaladh is just a stone's throw from Eyre Square and " +
                        "features traditional music performances seven nights a week.");
                pubOverview.barrNaChPD();
                break;
            case 2:
                System.out.println("\nYou have chosen Buskers\n\n*Overview*\nFunky cafe, bar and restaurant with ancient " +
                        "stonework and modern art, serving an international menu");
                pubOverview.buskersPD();
                break;
            case 3:
                System.out.println("\nYou have chosen Taaffes\n\n*Overview*\nFantastic traditional Irish bar with great pints" +
                        " of Guinness! Really good location and the staff are all very friendly too");
                pubOverview.taaffesPD();
                break;
            default:
                System.out.println("Invalid choice.\n");
                System.out.println("This Pub is under construction/maintenance, check back soon!");

        }

    }
    public static void displayPubsLatinQ(){
        Scanner scanner = new Scanner(System.in);
        //System.out.println("\n\nWelcome to the Pub Overview\n\n");
        System.out.println("Please enter the number which corresponds to the pub you would like to explore!\n");
        String[] latinQrPub = {"1. Blue Note", "2. Massimo's", "3. Monroe's", "4.Roisin Dubh", "5. Taylor's"};
        for(int x = 0; x < latinQrPub.length; x++){
            System.out.println(latinQrPub[x]);
        }
        System.out.println("1. Blue Note\t\t2. Massimo's\n3. Monroe's\t\t4.Roisin Dubh\n5. Taylor's");
        //System.out.println("1. Barr an Chaladh\t\t2. Blue Note\n3. Buskers\t\t\t\t4. Darcy's\n5. Mary Mullens\t\t\t6. Massimos\n7. McGettigan's\t\t\t8. Monroes\n9. Roisin Dubh\t\t\t10. Skeff\n11. Taaffes\t\t\t\t12. Taylor's ");
        System.out.println("Pub number: ");

        int LatinQoverview = scanner.nextInt();
        switch (LatinQoverview) {
            case 1:
                System.out.println("\nYou have chosen Blue note\n\n*Overview*\nHas outdoor seating, " +
                        "Serves great cocktails Doesn't accept reservations");
                pubOverview.blueNotePD();
                break;
            case 2:
                System.out.println("\nYou have chosen Massimos\n\n*Overview*\nCocktails, beer & dancing in a long-running " +
                        "neighbourhood bar that has a covered patio.");
                pubOverview.massimosPD();
                break;
            case 3:
                System.out.println("\nYou have chosen Monroes\n\n*Overview*\nMonroe's Tavern is renowned for it's friendly " +
                        "staff, warm atmosphere and live music.");
                pubOverview.monroesPD();
                break;
            case 4:
                System.out.println("\nYou have chosen Roisin Dubh\n\n*Overview*\nBar and club with two separate stages " +
                        "showcasing local and international live music and comedy acts.");
                pubOverview.roisinDubhPD();
                break;
            case 5:
                System.out.println("\nYou have chosen Taylor's\n\n*Overview*\nAuthentic and award-winning Irish Whiskey Bar " +
                        "with a long history, dating back to the early 19th Century.");
                pubOverview.taylorsPD();
                break;
            default:
                System.out.println("Invalid choice.");
        }

    }

    public static void addPub(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What area would you like to add the pub to? ");
        System.out.println("\n1. Eyre Square\t 2. Shop Street\t 3. The Latin Quarter\t 4. Other\nArea: ");
        int area = scanner.nextInt();

        switch(area){
            case 1:
                System.out.println("You selected Eyre Square.\n");
                try {
                    Scanner newPub = new Scanner(System.in);
                    System.out.println("Enter the name of the new pub: ");
                    String newPubName = newPub.nextLine();

                    String[] updatedEyreSqPub = new String[eyreSqPub.length + 1];

                    // Copy existing elements to the new array
                    for (int i = 0; i < eyreSqPub.length; i++) {
                        updatedEyreSqPub[i] = eyreSqPub[i];
                    }

                    updatedEyreSqPub[eyreSqPub.length] = newPubName;

                    eyreSqPub = updatedEyreSqPub;

                    System.out.println("The new Pub has been listed");
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a valid name for the new pub.");
                }
                displayPubsEyreSq();
                break;

            case 2:
                System.out.println("You selected Shop Street.\n");
                try {
                    Scanner newPub = new Scanner(System.in);
                    System.out.println("Enter the name of the new pub: ");
                    String newPubName = newPub.nextLine();

                    // add on to the array by creating a new array with one extra space
                    String[] updatedShopStPub = new String[shopStPub.length + 1];

                    // Copy existing strings to the new array
                    for (int i = 0; i < shopStPub.length; i++) {
                        updatedShopStPub[i] = shopStPub[i];
                    }

                    // Add the new pub name to the end of the new array
                    updatedShopStPub[shopStPub.length] = newPubName;

                    // put back into the old array
                    shopStPub = updatedShopStPub;

                    System.out.println("The new Pub has been listed");
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a valid name for the new pub.");
                }
                displayPubsShopSt();
                break;
            case 3:
                System.out.println("You selected the Latin Quarter.\n");
                try {
                    Scanner newPub = new Scanner(System.in);
                    System.out.println("Enter the name of the new pub: ");
                    String newPubName = newPub.nextLine();

                    // add on to the array by creating a new array with one extra space
                    String[] updatedLatinQrPub = new String[latinQrPub.length + 1];

                    // Copy existing strings to the new array
                    for (int i = 0; i < shopStPub.length; i++) {
                        updatedLatinQrPub[i] = shopStPub[i];
                    }

                    // Add the new pub name to the end of the new array
                    updatedLatinQrPub[latinQrPub.length] = newPubName;

                    // put back into the old array
                    shopStPub = updatedLatinQrPub;

                    System.out.println("The new Pub has been listed");
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a valid name for the new pub.");
                }
                displayPubsLatinQ();
                break;
            case 4:
                System.out.println("You selected Other.\n");
                try {
                    Scanner newPub = new Scanner(System.in);
                    System.out.println("Enter the name of the new pub: ");
                    String newPubName = newPub.nextLine();

                    // add on to the array by creating a new array with one extra space
                    String[] updatedOtherPub = new String[otherPub.length + 1];

                    // Copy existing strings to the new array
                    for (int i = 0; i < otherPub.length; i++) {
                        updatedOtherPub[i] = otherPub[i];

                    }

                    // Add the new pub name to the end of the new array
                    updatedOtherPub[otherPub.length] = newPubName;

                    // put back into the old array
                    shopStPub = updatedOtherPub;

                    System.out.println("The new Pub has been listed");
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a valid name for the new pub.");
                }
                addDrinkPrice(prices);

                break;

        }
    }

    public static void addDrinkPrice(double[] prices) {
        try {
            Scanner newPrice = new Scanner(System.in);

             for (int i = 0; i <= drinks.length; i++) {
                 if (prices[i] == 0)
                     System.out.println("\nEnter the price of " + drinks[i]);
                 double price = newPrice.nextDouble();
             }
             }
        catch(Exception e){
            System.out.println("\nDrink prices added.");
        }
    }

    public static void reviewDarcys(){
        System.out.println("\nReviews:\n\n“Best pub in Galway”\n" +
                "“Great bar, friendly staff and live music.”\n.\n" +
                "Best bar we visited while in galway, Philip and robert are an absolute tonic, \n" +
                "they greeted everyone that walked in like old friends, thank you both for a great experience\n" +
                "\n" +
                "Date of visit: January 2024\n.\n" +
                "Great bar, friendly staff and live music. Popped in on our way past for a quick drink. \n" +
                "The staff were really friendly so we came back in later the same day and had a great Sunday " +
                "night out!\n" +
                "\n");

    }

    public static void reviewBarrNaCh(){
        System.out.println("\nReviews:\n\nBrilliant pub ,live music seven nights a week \n" +
                        "and owner Michael a gent and a character good upstairs \n" +
                        "in mama rich a lovely experience make sure to book\n" +
                        "Date of visit: February 2024\n.\n" +
                        "Great place for a night out or a drink before dinner. \n" +
                        "Was lucky to get the snug next to the bar last time and spent a few hours with friends.\n" +
                        "Date of visit: November 2023\n.\n" +
                        "Monty! Where can I start? The best bartender out there. \n" +
                        "Remembers all of our names. Remembers all of our orders.\n" +
                        " Just made our night! Give this guy a raise asap!\n" +
                        "Date of visit: August 2022\n\n");
    }

    public static void reviewBlueNote(){
        System.out.println("\nReviews:\n\nA pub in the heart of Galway. \n" +
                        "A DJ played some nice music, we got drunk and had a good time. \n" +
                        "Alway tip your bartenders!\n" +
                        "Date of visit: August 2023\n.\n" +
                        "Lovely warm pub in Galway near Kai Restaurant. \n" +
                        "Serves my favourite drink Beekon Batches, honey refresher.\n" +
                        "Date of visit: February 2020\n.\n" +
                        "Had a great Monday night in ‘the blue’ as the locals call it. Bartenders were full\n" +
                        "of banter and although it was quiet there was plenty of craic. \n" +
                        "Casual and relaxed with friendly service. Oh and board games too\n" +
                        "Date of visit: April 2019\n\n");
    }

    public static void reviewTaffes(){
        System.out.println("\nReviews:\n\nNice old time vibe. \n" +
                        "This was a quiet little bar when we first stepped in, \n" +
                        "but got busy while we sat there. Lots of locals and they all seemed to know each other.\n" +
                        "Date of visit: April 2024\n.\n" +
                        "Great pub with the best Irish coffee \n" +
                        "Cosy place to get away from the stormy Irish weather.  The delicious Irish coffee will\n" +
                        "give you a warm hug and a great mood. Food was delicious and well priced.\n" +
                        "Date of visit: January 2024\n.\n" +
                        "90 craic at Taaffes\n" +
                        "Incredible live music, excellent drinks, and good craic! Every night they have live\n" +
                        "traditional Irish music. I went 3 times in my week in Galway and loved my experience\n" +
                        "every time I came here. \n" +
                        "Date of visit: January 2024\n\n");
    }

    public static void reviewTaylors(){
        System.out.println("\nReviews:\n\nCocktails are top tier \n" +
                        "Lucy makes the most excellent cocktails, and is a really lovely friendly staff member, could not \n" +
                        "recommend her enough! try the six notions cocktail also, it's delish!\n" +
                        "Date of visit: February 2024\n.\n" +
                        "Party experience \n" +
                        "All the staff were absolutely amazing. Couldn’t do enough for us when I arranged a surprise party for\n" +
                        "my daughter. Live music. Drink was great. I can’t praise everyone enough. Always enjoyed going to\n" +
                        "Taylor’s but last night was such a memorable experience. Can’t wait to go back\n" +
                        "Date of visit: March 2023\n.\n" +
                        "Great buzz and great cocktails\n" +
                        "Great beer garden with great music and friendly bouncers which is always nice to see! Cocktails are\n" +
                        "amazing ! The cocktail making guy who looks like Sam Thompson makes the tastiest drinks \n" +
                        "Date of visit: August 2022\n\n");
    }

   /* public static void reviewFibbers(){
        System.out.println("\nReviews:\n\nMust visit \n" +
                        "This pub is in the heart of galway, it has been my best experience in a pub in galway.\n" +
                        "The staff are exceptional, they cater to your every need. Would definitely recommend\n" +
                        "Date of visit: January 2024\n.\n" +
                        "Top Tier \n" +
                        "Staff are good fun and great spot to meet a random lad and talk politics, Guinness is\n" +
                        "very good and loads of options on draught\n" +
                        "Date of visit: January 2024\n.\n" +
                        "Not honouring it's bookings.\n" +
                        "Not willing to fulfill it's bookings. Not very welcoming to visitors. Probably best left to\n" +
                        "the locals. Disgusting attitude to customers. \n" +
                        "Date of visit: August 2021\n\n");
    }*/

    public static void reviewMassimos(){
        System.out.println("\nReviews:\n\nMy birthday \n" +
                        "Went here for my birthday on Monday the 29th of August with my family. From start to\n" +
                        "finish the service and food was amazing. Great value for money and fresh food.\n" +
                        "Brilliant service. \n" +
                        "Date of visit: August 2022\n.\n" +
                        "Best staff in Galway\n" +
                        "Incredible customer service staff really went above and beyond to make our visit\n" +
                        "special! I was served by Emily A and Aaron and they were amazing!\n" +
                        "Date of visit: January 2022\n.\n" +
                        "Booking fee at Massimos\n" +
                        "The booking fee is not necessary! We all showed up, bought multiple rounds of drink\n" +
                        "and were still charged a booking fee! \n" +
                        "Date of visit: October 2021\n\n");
    }

    public static void reviewSkeff(){
        System.out.println("\nReviews:\n\nWell worth a visit..great staff superb food.. \n" +
                        "I found this bar to be an amazing place to visit...The staff were excellent and did an\n" +
                        "amazing job considering they were flat out and under pressure but at no time did I\n" +
                        "see any of them buckle...Congrats to you all..\n" +
                        "Date of visit: March 2024\n.\n" +
                        "Arrived 6pm 11pm still here!\n" +
                        "Came in for quick bite to eat and still here. Food amazing, staff spectacular. What an\n" +
                        "amazing place. Will be back. Awesome.\n" +
                        "Date of visit:  March 2024\n.\n" +
                        "Fab night\n" +
                        "We discovered the bar within an hour of arriving & we returned a few times over the\n" +
                        "weekend we were in Galway. It was amazing - the team working were fab & there was\n" +
                        "never any waiting at the bar.\n" +
                        "Date of visit: March 2024\n\n");
    }

    public static void reviewBuskers(){
        System.out.println("\nReviews:\n\nGood drinks and fun times!\n" +
                        "The drinks, especially cocktails are so good. The bartenders are all super nice and\n" +
                        "helpful, Darren and Aaron made me the best gin brambles I’ve ever had. Would come\n" +
                        "back anytime!\n" +
                        "Date of visit: March 2024\n.\n" +
                        "Good food on a rainy day\n" +
                        "Great food, great service, lovely atmosphere, would definitely come back again, try\n" +
                        "the fish and chips \n" +
                        "Date of visit:  March 2024\n.\n" +
                        "Fab night\n" +
                        "We discovered the bar within an hour of arriving & we returned a few times over the\n" +
                        "weekend we were in Galway. It was amazing - the team working were fab & there was\n" +
                        "never any waiting at the bar.\n" +
                        "Date of visit: September 2023\n\n");
    }

    public static void reviewMaryMullins(){
        System.out.println("\nReviews:\n\nFantastic new bar!!\n" +
                        "Great craic, entertainment, service and location.\n" +
                        "Date of visit: December 2023\n.\n" +
                        "Galway's newest bar and restaurant\n" +
                        "opened just a few weeks, has been given a major boost after one \n" +
                        "social media foodie star gave it a roaring review.\n" +
                        "Date of visit:  January 2024\n.\n");
    }

    public static void reviewMonroes(){
        System.out.println("\nReviews:\n\nNice spot - lively and fun.\n" +
                        "Had an early dinner here. Pretty good selection of food. Food came out quickly. It\n" +
                        "was good. Fish and chips was very good. Stew was also very good. \n" +
                        "Date of visit: March 2024\n.\n" +
                        "Delicious and fun!\n" +
                        "Food was delicious! Wait staff was very friendly. Live music and atmosphere were\n" +
                        "fantastic! We popped in here for lunch the day we arrived and are so glad we did.\n" +
                        "The live music was wonderful and so many people were up and dancing.\n" +
                        "Date of visit:  February 2024\n.\n" +
                        "A nice pint !\n" +
                        "Went for a drink and a bit of live music last night here . Asked could my 6 year old\n" +
                        "come in for the music for a half hour till 9 . Not a bother even a guy called Gary\n" +
                        "working there made sure we got seats asap. Staff great , kids brownie great and nice\n" +
                        "atmosphere. Well done to all concerned!\n" +
                        "Date of visit: February 2024\n\n");
    }

    public static void reviewRoisinDubh(){
        System.out.println("\nReviews:\n\nGreat fun!\n" +
                        "Great pub- friendly faces, fun music and a buzzing dance floor downstairs! Always a fun night in the\n" +
                        "Roisin. Very decent open mic nights too :) The best late bar in Galway. Highly recommended!\n" +
                        "Date of visit: October 2022\n.\n" +
                        "Great Pub\n" +
                        "Great pub, always have cool gigs on and a lovely atmosphere.\n" +
                        "Staff are excellent, Debi in particular is an exemplary member of the team.\n" +
                        "Date of visit:  May 2022\n.\n" +
                        "Great venue\n" +
                        "Excellent venue, come here Everytime I get the chance to visit Galway, it's always buzzing, great music\n" +
                        "played and the bands they get in are top notch, worth a night in Galway just to drink here\n" +
                        "Date of visit: February 2022\n\n");
    }

    public static void reviewMcGettigans(){
        System.out.println("\nReviews:\n\nHidden gem of Galway\n" +
                        "Walked in for a Guinness, found 2 seats at the bar. Nathan and Monisha welcomed us\n" +
                        "like family and were awesome! They gave the best recommendations.\n" +
                        "Date of visit: September 2023\n.\n" +
                        "Great time\n" +
                        "Jack was great to talk to about local history and the rest of the young staff were\n" +
                        "friendly and very attentive. Highly recommend.\n" +
                        "Date of visit:  September 2023\n.\n" +
                        "Absolutely fabulous\n" +
                        "Absolutely fab!! Came here to watch a game and get some snacks and drinks and\n" +
                        "was delicious and the staff were lovely! Will definitely be coming here again!!!\n" +
                        "Date of visit: August 2023\n\n");
    }

}
