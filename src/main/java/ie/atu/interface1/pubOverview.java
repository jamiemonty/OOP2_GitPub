package ie.atu.interface1;

//import java.sql.SQLException;
//import java.sql.SQLOutput;
import java.util.Scanner;

public class pubOverview extends pubSelect{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\nWelcome to the Pub Overview\n\n");
        int overview = scanner.nextInt();
        int select = scanner.nextInt();



        switch (overview) {

            case 1:
                System.out.println("\n\n1.  You have chosen Barr an Chaladh\nOverview\nA country " +
                        "pub in the heart of the city, " +
                        "Barr an Chaladh is just a stone's throw from Eyre Square and " +
                        "features traditional music performances seven nights a week.");
                break;

            case 2:
                System.out.println("\n\n2.  You have chosen Blue note\nOverview\nHas outdoor seating, " +
                        "Serves great cocktails Doesn't accept reservations");
                break;

            case 3:
                System.out.println("\n\n3.  You have chosen Buskers\nOverview\nFunky cafe, bar and restaurant with ancient " +
                        "stonework and modern art, serving an international menu");
                break;

            case 4:
                System.out.println("\n\n4.  You have chosen Darcy's\nOverview\nDarcy's is a Traditional Irish bar located on " +
                        "Eyre Square in the heart of Galway city, just beside the train station");
                break;

            case 5:
                System.out.println("\n\n5.  You have chosen Mary Mullens\nOverview\nLocated 300 yards from the train" +
                        "station, Mullens has quickly transformed into one of the most popular pubs in the city");
                break;

            case 6:
                System.out.println("\n\n6.  You have chosen Massimos\nOverview\nCocktails, beer & dancing in a long-running " +
                        "neighbourhood bar that has a covered patio.");
                break;

            case 7:
                System.out.println("\n\n7.  You have chosen McGettigan's\nOverview\nMcGettigan's GWY is located on Eyre Square" +
                        " in Galway. Pop in and try award-winning pub grub, " +
                        "watch live sports, or enjoy live music! ");
                break;

            case 8:
                System.out.println("\n\n8.  You have chosen Monroes\nOverview\nMonroe's Tavern is renowned for it's friendly " +
                        "staff, warm atmosphere and live music.");
                break;

            case 9:
                System.out.println("\n\n9.  You have chosen Roisin Dubh\nOverview\nBar and club with two separate stages " +
                        "showcasing local and international live music and comedy acts.");
                break;

            case 10:
                System.out.println("\n\n10. You have chosen Skeff\nOverview\nUniquely designed busy bar in the heart of Galway " +
                        "city center serving wholesome, quality food.");
                break;

            case 11:
                System.out.println("\n\n11. You have chosen Taaffes\nOverview\nFantastic traditional Irish bar with great pints" +
                        " of Guinness! Really good location and the staff are all very friendly too");
                break;

            case 12:
                System.out.println("\n\n12. You have chosen Taylor's\nOverview\nAuthentic and award-winning Irish Whiskey Bar " +
                        "with a long history, dating back to the early 19th Century.");
                break;

            default:
                System.out.println("Invalid choice.");

        }

        System.out.println("1. Pub Price\t 2. Pub Reviews\t 3. Pub Details\n :");

        switch (select){
            case 1:
                System.out.println("Pub Prices\n");
                break;
            case 2:
                System.out.println("Pub Reviews\n");
                break;

            case 3:
                System.out.println("Pub Details\n");
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }
}
