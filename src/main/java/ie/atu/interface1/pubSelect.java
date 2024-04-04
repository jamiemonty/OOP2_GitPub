package ie.atu.interface1;

import java.util.Scanner;

public class pubSelect {
    private String[] drinks;
    private double[] prices;
    public String[] reviewCat;
    public double[] rating;
    private String darcys;

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
        //System.out.println("\n\nWelcome to the Pub Overview\n\n");
        System.out.println("Please enter the number which corresponds to the pub you would like to explore!\n");
        System.out.println("1. Mary Mullins\t\t2. McGettigan's\n3. Skeff\t\t4. Darcy's");
        //System.out.println("1. Barr an Chaladh\t\t2. Blue Note\n3. Buskers\t\t\t\t4. Darcy's\n5. Mary Mullens\t\t\t6. Massimos\n7. McGettigan's\t\t\t8. Monroes\n9. Roisin Dubh\t\t\t10. Skeff\n11. Taaffes\t\t\t\t12. Taylor's ");
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
        //System.out.println("\n\nWelcome to the Pub Overview\n\n");
        System.out.println("Please enter the number which corresponds to the pub you would like to explore!\n");
        System.out.println("1. Barr an Chaladh\t\t2. Busker Brownes\t\t3. Taffees");
        //System.out.println("1. Barr an Chaladh\t\t2. Blue Note\n3. Buskers\t\t\t\t4. Darcy's\n5. Mary Mullens\t\t\t6. Massimos\n7. McGettigan's\t\t\t8. Monroes\n9. Roisin Dubh\t\t\t10. Skeff\n11. Taaffes\t\t\t\t12. Taylor's ");
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
                System.out.println("Invalid choice.");

        }

    }
    public static void displayPubsLatinQ(){
        Scanner scanner = new Scanner(System.in);
        //System.out.println("\n\nWelcome to the Pub Overview\n\n");
        System.out.println("Please enter the number which corresponds to the pub you would like to explore!\n");
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
