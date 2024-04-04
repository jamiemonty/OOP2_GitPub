package ie.atu.interface1;

//import java.sql.SQLException;
//import java.sql.SQLOutput;
import java.util.Scanner;

public class pubOverview extends pubSelect {

    public pubOverview(/*String[] drinks,*/ double[] prices, String[] reviewCat, double[] rating) {
        super(prices);
        this.reviewCat = reviewCat;
        this.rating = rating;
    }
    /*public pubOverview(String[] reviewCat, double[] rating) {
        super(reviewCat, rating);
    }*/

    public void displaydrinkinfo() {
        displayinfo();
    }

    public static double calcAverage(double[] rating) {
        int totalSum = 0;
        for (double num : rating) {
            totalSum += num;
        }
        return (double) totalSum / rating.length;
    }

    public static void maryMullinsPD(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Pub Price\t 2. Pub Reviews\t 3. Pub Details ");

        int select = scanner.nextInt();

        switch (select) {
            case 1:
                System.out.println("Pub Prices\n");
                double[] prices = {5.70, 6.70, 6.30, 6.50, 6.80, 4.50, 6.00, 1.00, 3.00, 2.50, 5.50, 5.50, 6.00, 6.20, 11.50, 13.00, 13.60, 13.00, 11.90};

                pubSelect pub= new pubSelect(prices);
                pub.displayinfo();
                break;
            case 2:
                System.out.println("Pub Reviews\n");
                String[] reviewCat = {"Cleanliness", "Friendliness", "Accessibility", "Uniqueness", "Range"};
                double[] rating = {10, 7, 10, 10, 7};
                double average = calcAverage(rating);
                System.out.println("Ratings and Reviews: ");
                for (int i = 0; i < reviewCat.length; i++) {
                    System.out.println(reviewCat[i] + ": " + rating[i] + "/10.");
                }
                System.out.println("-Score: " + average);
                //pubSelect review1 = new pubSelect(".");
                //review1.reviewMaryMullins();
                break;

            case 3:
                System.out.println("Pub Details\n");
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }

    public static void mcGettiganPD(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Pub Price\t 2. Pub Reviews\t 3. Pub Details ");

        int select = scanner.nextInt();

        switch (select) {
            case 1:
                System.out.println("Pub Prices\n");
                double[] prices = {5.40, 5.80, 5.80, 5.20, 5.50, 4.70, 5.00, 0.50, 3.00, 2.50, 5.80, 5.80, 5.20, 5.30, 12.00, 12.50, 12.50, 12.50, 12.50};

                pubSelect pub= new pubSelect(prices);
                pub.displayinfo();
                break;
            case 2:
                System.out.println("Pub Reviews\n");
                String[] reviewCat = {"Cleanliness", "Friendliness", "Accessibility", "Uniqueness", "Range"};
                double[] rating = {10, 8, 9, 9, 10};
                double average = calcAverage(rating);
                System.out.println("Ratings and Reviews: ");
                for (int i = 0; i < reviewCat.length; i++) {
                    System.out.println(reviewCat[i] + ": " + rating[i] + "/10.");
                }
                System.out.println("-Score: " + average);
                //pubSelect review1 = new pubSelect(".");
                //review1.reviewMaryMullins();
                break;

            case 3:
                System.out.println("Pub Details\n");
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }
    public static void skeffPD() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Pub Price\t 2. Pub Reviews\t 3. Pub Details ");

        int select = scanner.nextInt();

        switch (select) {
            case 1:
                System.out.println("Pub Prices\n");
                double[] prices = {5.20, 6.00, 6.40, 6.00, 6.00, 5.70, 6.00, 1.00, 3.40, 2.40, 5.80, 5.60, 5.60, 5.60, 14.00, 10.00, 12.50, 13.50, 11 };

                pubSelect pub= new pubSelect(prices);
                pub.displayinfo();
                break;
            case 2:
                System.out.println("Pub Reviews\n");
                String[] reviewCat = {"Cleanliness", "Friendliness", "Accessibility", "Uniqueness", "Range"};
                double[] rating = {8, 6, 10, 7, 9};
                double average = calcAverage(rating);
                System.out.println("Ratings and Reviews: ");
                for (int i = 0; i < reviewCat.length; i++) {
                    System.out.println(reviewCat[i] + ": " + rating[i] + "/10.");
                }
                System.out.println("-Score: " + average);
                //pubSelect review1 = new pubSelect(".");
                //review1.reviewDarcys();
                break;

            case 3:
                System.out.println("Pub Details\n");
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }

    public static void darcysPD(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Pub Price\t 2. Pub Reviews\t 3. Pub Details ");

        int select = scanner.nextInt();

        switch (select) {
            case 1:
                System.out.println("Pub Prices\n");
                double[] prices = {5.50, 6.00, 6.20, 6.00, 6.00, 6.00, 6.00, 1.50, 2.80, 2.40, 6.00, 6.00, 6.00, 6.50, 0, 0, 0, 0, 0 };

                pubSelect pub= new pubSelect(prices);
                pub.displayinfo();
                break;
            case 2:
                System.out.println("Pub Reviews\n");
                String[] reviewCat = {"Cleanliness", "Friendliness", "Accessibility", "Uniqueness", "Range"};
                double[] rating = {7, 8, 10, 7, 6};
                double average = calcAverage(rating);
                System.out.println("Ratings and Reviews: ");
                for (int i = 0; i < reviewCat.length; i++) {
                    System.out.println(reviewCat[i] + ": " + rating[i] + "/10.");
                }
                System.out.println("-Score: " + average);
                //pubSelect review1 = new pubSelect(".");
                //review1.reviewDarcys();
                break;

            case 3:
                System.out.println("Pub Details\n");
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }
    }



