package ie.atu.interface1;

import java.util.Scanner;

public class pubSelect {
    private String darcys;
    private String[] drinks;
    private double[] prices;
    static public String[] eyreSqPub = {"1. Mary Mullins", "2. McGettigan's", "3. Skeff", "4. Darcy's"};
    static public String[] shopStPub = {"1. Barr an Chaladh", "2. Busker Brownes", "3. Taffees"};
    static public String[] latinQrPub = {"1. Blue Note", "2. Massimo's", "3. Monroe's", "4.Roisin Dubh", "5. Taylor's"};
    static public String[] otherPub = {""};
    public String[] reviewCat;
    public double[] rating;


    private String BarrNaCh;


    public pubSelect(/*String[] drinks,*/ double[] prices){
        //this.drinks = drinks;
        this.prices = prices;

    }

   // public pubSelect(String[] reviewCat, double[] rating){
    //    this.reviewCat = reviewCat;
    //    this.rating = rating;
   // }
    public void displayinfo() {
        System.out.println("Drink Menu + Prices\n_____________________ ");
        String[] drinks = {"Guinness ", "Heineken ", "Orchard Thieves ", "\nVodka ", "Jameson ", "Bacardi ", "Gin ", "\nDash" ,
                "Mineral ", "Tonic ", "\nBaby Guinness ", "Tequila ", "Sambucca ", "AfterShock ", "\nOld Fashioned ", "Daquiri ",
                "Sex On The Beach ", "Martini ", "Whiskey Sours "};
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
                //displayPubsOther();, make this and populate it with the array. There is no other pubs only
                // when a new pub is created in this area
                break;

        }
    }
    public void reviewDarcys(){
        System.out.println("\nReviews:\n\n“Best pub in Galway”\n" +
                "“Great bar, friendly staff and live music.”\n.\n" +
                "Best bar we visited while in galway, Philip and robert are an absolute tonic, \n" +
                "they greeted everyone that walked in like old friends, thank you both for a great experience\n" +
                "\n" +
                "Date of visit: January 2024\n.\n" +
                "Great bar, friendly staff and live music. Popped in on our way past for a quick drink. \n" +
                "The staff were really friendly so we came back in later the same day and had a great Sunday " +
                "night out!\n" +
                "\n" +
                "Date of visit: August 2023\n\n"
                + darcys);
    }

    public void BarrNaCh(){
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
                "Date of visit: August 2022\n\n"
        /*+ BarrNaChalladh*/);
    }




}
