package ie.atu.interface1;

import java.util.Scanner;

public class pubOverview extends pubSelect {

    static double[] MMprices = {5.70, 6.70, 6.30, 6.50, 6.80, 4.50, 6.00, 1.00, 3.00, 2.50, 5.50, 5.50, 6.00, 6.20, 11.50, 13.00, 13.60, 13.00, 11.90};
    static double[] mcG_prices = {5.40, 5.80, 5.80, 5.20, 5.50, 4.70, 5.00, 0.50, 3.00, 2.50, 5.80, 5.80, 5.20, 5.30, 12.00, 12.50, 12.50, 12.50, 12.50};
    static double[] sK_prices = {5.20, 6.00, 6.40, 6.00, 6.00, 5.70, 6.00, 1.00, 3.40, 2.40, 5.80, 5.60, 5.60, 5.60, 14.00, 10.00, 12.50, 13.50, 11 };
    static double[] dar_prices = {5.50, 6.00, 6.20, 6.00, 6.00, 6.00, 6.00, 1.50, 2.80, 2.40, 6.00, 6.00, 6.00, 6.50, 0, 0, 0, 0, 0 };
    static double[] barrNa_prices = {5.50, 6.00, 6.20, 6.00, 6.00, 6.00, 6.00, 1.50, 2.80, 2.40, 6.00, 6.00, 6.00, 6.50, 0, 0, 0, 0, 0 };
    static double[] bus_prices = {5.95, 6.50, 6.50, 6.00, 6.00, 6.00, 6.00, 1.25, 3.00, 2.40, 6.00, 6.00, 6.00, 6.00, 12.50, 12.00, 12.50, 12.50, 12.00};
    static double[] blueN_prices = {5.80, 6.40, 6.50, 6.20, 6.20, 6.20, 6.20, 1.00, 3.00, 2.80, 6.20, 6.20, 6.20, 6.20, 12.50, 12.50, 12.00, 12.00, 12.75};
    static double[] massimosPrices = {5.20, 5.90, 6.20, 6.00, 6.00, 6.00, 6.00, 1.20, 3.00, 2.20, 5.70, 5.70, 5.70, 5.70, 13.00, 13.00, 0, 12.50, 12.50};
    static double[] monroesPrices = {5.20, 6.50, 6.80, 6.50, 7.00, 5.50, 5.50, 1.20, 2.80, 2.30, 4.80, 5.00, 5.10, 5.40, 11.90, 13.80, 12.00, 12.80, 12.30};
    static double[] roisinPrices = {5.50, 6.60, 6.60, 6.00, 6.30, 5.40, 4.50, 0.50, 3.20, 2.90, 5.80, 6.00, 5.50, 5.50, 12.50, 12.90, 13.00, 14.20, 13.00};
    static double[] taaffesPrices = {5.40, 6.20, 5.80, 6.00, 4.50, 6.00, 6.30, 1.00, 2.80, 2.50, 6.00, 5.60, 5.70, 5.40, 12.00, 13.00, 12.80, 13.20, 13.00};
    static double[] taylorsPrices = {5.60, 6.00, 6.50, 6.20, 6.00, 5.80, 5.00, 0, 2.40, 2.60, 6.00, 6.00, 6.00, 0, 15.00, 12.00, 12.50, 12.00, 12.00};


    public pubOverview(/*String[] drinks,*/ double[] prices, String[] reviewCat, double[] rating) {
        super(prices);
        this.reviewCat = reviewCat;
        this.rating = rating;
    }

    public static double calcAverage(double[] rating) {
        int totalSum = 0;
        for (double num : rating) {
            totalSum += (int) num;
        }
        return (double) totalSum / rating.length;
    }

    public static void maryMullinsPD(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n1. Pub Price\t 2. Pub Reviews\t 3. Pub Details ");

        int select = scanner.nextInt();

        switch (select) {
            case 1:
                System.out.println("Pub Prices\n");

                pubSelect pub= new pubSelect(MMprices);

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
                pubSelect.reviewMaryMullins();
                break;

            case 3:
                System.out.println("Pub Details\n");
                System.out.println("Phone number: 091 331214\nE-mail: INFO@MARYMULLENS.IE\nAddress: 12/14 Prospect Hill " +
                        "Galway\n");
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }

    public static void mcGettiganPD(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n1. Pub Price\t 2. Pub Reviews\t 3. Pub Details ");

        int select = scanner.nextInt();

        switch (select) {
            case 1:
                System.out.println("Pub Prices\n");

                pubSelect pub= new pubSelect(mcG_prices);

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
            
                pubSelect.reviewMcGettigans();

                break;

            case 3:
                System.out.println("Pub Details\n");
                System.out.println("Phone number: 091 331010\nE-mail: galway@mcgettigans.com\nAddress: 9-11, Prospect Hill, Eyre Square Galway\n");
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }
    public static void skeffPD() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n1. Pub Price\t 2. Pub Reviews\t 3. Pub Details ");

        int select = scanner.nextInt();

        switch (select) {
            case 1:
                System.out.println("Pub Prices\n");

                pubSelect pub= new pubSelect(sK_prices);

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

                pubSelect.reviewSkeff();

                break;

            case 3:
                System.out.println("Pub Details\n");
                System.out.println("Phone number: 091 563 173\nE-mail: party@theskeff.ie\nAddress: Skeffington Arms Hotel 27 Eyre Square Galway\n");
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }

    public static void darcysPD(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n1. Pub Price\t 2. Pub Reviews\t 3. Pub Details ");

        int select = scanner.nextInt();

        switch (select) {
            case 1:
                System.out.println("Pub Prices\n");

                pubSelect pub= new pubSelect(dar_prices);

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

                pubSelect.reviewDarcys();

                break;

            case 3:
                System.out.println("Pub Details\n");
                System.out.println("Phone number: 086 070 9576\nE-mail: info@darcys.ie\nAddress: 2 Forster Street Galway\n");
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }

    public static void barrNaChPD(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n1. Pub Price\t 2. Pub Reviews\t 3. Pub Details ");

        int select = scanner.nextInt();

        switch (select) {
            case 1:
                System.out.println("Pub Prices\n");

                pubSelect pub= new pubSelect(barrNa_prices);

                pub.displayinfo();
                break;
            case 2:
                System.out.println("Pub Reviews\n");
                String[] reviewCat = {"Cleanliness", "Friendliness", "Accessibility", "Uniqueness", "Range"};
                double[] rating = {6, 8, 8, 7, 6};
                double average = calcAverage(rating);
                System.out.println("Ratings and Reviews: ");
                for (int i = 0; i < reviewCat.length; i++) {
                    System.out.println(reviewCat[i] + ": " + rating[i] + "/10.");
                }
                System.out.println("-Score: " + average);

                pubSelect.reviewBarrNaCh();

                break;

            case 3:
                System.out.println("Pub Details\n");
                System.out.println("Phone number: 091 895762\nE-mail: info@barranchaladh.ie\nAddress: 3 Dalys Place Woodquay Galway\n");
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }

    public static void buskersPD(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n1. Pub Price\t 2. Pub Reviews\t 3. Pub Details ");

        int select = scanner.nextInt();

        switch (select) {
            case 1:
                System.out.println("Pub Prices\n");

                pubSelect pub= new pubSelect(bus_prices);

                pub.displayinfo();
                break;
            case 2:
                System.out.println("Pub Reviews\n");
                String[] reviewCat = {"Cleanliness", "Friendliness", "Accessibility", "Uniqueness", "Range"};
                double[] rating = {6, 6, 7, 5, 9};
                double average = calcAverage(rating);
                System.out.println("Ratings and Reviews: ");
                for (int i = 0; i < reviewCat.length; i++) {
                    System.out.println(reviewCat[i] + ": " + rating[i] + "/10.");
                }
                System.out.println("-Score: " + average);

                pubSelect.reviewBuskers();
            
                break;

            case 3:
                System.out.println("Pub Details\n");
                System.out.println("Phone number: 091 563377\nE-mail: events@buskerbrownes.com\nAddress: 5 Cross Street Upper" +
                        "Galway\n");
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }

    public static void blueNotePD(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n1. Pub Price\t 2. Pub Reviews\t 3. Pub Details ");

        int select = scanner.nextInt();

        switch (select) {
            case 1:
                System.out.println("Pub Prices\n");

                pubSelect pub= new pubSelect(blueN_prices);

                pub.displayinfo();
                break;
            case 2:
                System.out.println("Pub Reviews\n");
                String[] reviewCat = {"Cleanliness", "Friendliness", "Accessibility", "Uniqueness", "Range"};
                double[] rating = {8, 8, 6, 9, 7};
                double average = calcAverage(rating);
                System.out.println("Ratings and Reviews: ");
                for (int i = 0; i < reviewCat.length; i++) {
                    System.out.println(reviewCat[i] + ": " + rating[i] + "/10.");
                }
                System.out.println("-Score: " + average);

                pubSelect.reviewBlueNote();

                break;

            case 3:
                System.out.println("Pub Details\n");
                System.out.println("Phone number: 091 589116\nE-mail: bookings@bluenote.ie\nAddress: 3 West William Street Galway\n");
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }

    public static void massimosPD(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n1. Pub Price\t 2. Pub Reviews\t 3. Pub Details ");

        int select = scanner.nextInt();

        switch (select) {
            case 1:
                System.out.println("Pub Prices\n");

                pubSelect pub= new pubSelect(massimosPrices);

                pub.displayinfo();
                break;
            case 2:
                System.out.println("Pub Reviews\n");
                String[] reviewCat = {"Cleanliness", "Friendliness", "Accessibility", "Uniqueness", "Range"};
                double[] rating = {7, 8, 5, 6, 8};
                double average = calcAverage(rating);
                System.out.println("Ratings and Reviews: ");
                for (int i = 0; i < reviewCat.length; i++) {
                    System.out.println(reviewCat[i] + ": " + rating[i] + "/10.");
                }
                System.out.println("-Score: " + average);
            
                pubSelect.reviewMassimos();

                break;

            case 3:
                System.out.println("Pub Details\n");
                System.out.println("Phone number: 091 582239\nE-mail: massimogalway@gmail.com\nAddress: 10 William Street West Galway\n");
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }

    public static void monroesPD(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n1. Pub Price\t 2. Pub Reviews\t 3. Pub Details ");

        int select = scanner.nextInt();

        switch (select) {
            case 1:
                System.out.println("Pub Prices\n");

                pubSelect pub= new pubSelect(monroesPrices);
                pub.displayinfo();
                break;
            case 2:
                System.out.println("Pub Reviews\n");
                String[] reviewCat = {"Cleanliness", "Friendliness", "Accessibility", "Uniqueness", "Range"};
                double[] rating = {8, 5, 6, 6, 6};
                double average = calcAverage(rating);
                System.out.println("Ratings and Reviews: ");
                for (int i = 0; i < reviewCat.length; i++) {
                    System.out.println(reviewCat[i] + ": " + rating[i] + "/10.");
                }
                System.out.println("-Score: " + average);

                pubSelect.reviewMonroes();
            
                break;

            case 3:
                System.out.println("Pub Details\n");
                System.out.println("Phone number: 091 583397\nE-mail: Info@monroes.ie\nAddress: 14 Dominick Street Upper Galway\n");
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }

    public static void roisinDubhPD(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n1. Pub Price\t 2. Pub Reviews\t 3. Pub Details ");

        int select = scanner.nextInt();

        switch (select) {
            case 1:
                System.out.println("Pub Prices\n");

                pubSelect pub= new pubSelect(roisinPrices);
                pub.displayinfo();
                break;
            case 2:
                System.out.println("Pub Reviews\n");
                String[] reviewCat = {"Cleanliness", "Friendliness", "Accessibility", "Uniqueness", "Range"};
                double[] rating = {1, 3, 6, 8, 5};
                double average = calcAverage(rating);
                System.out.println("Ratings and Reviews: ");
                for (int i = 0; i < reviewCat.length; i++) {
                    System.out.println(reviewCat[i] + ": " + rating[i] + "/10.");
                }
                System.out.println("-Score: " + average);

                pubSelect.reviewRoisinDubh();

                break;

            case 3:
                System.out.println("Pub Details\n");
                System.out.println("Phone number: 091 586540\nE-mail: info@roisindubh.net\nAddress: Róisín Dubh" +
                        "9 Dominic Street Upper" + "Galway\n");
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }

    public static void taylorsPD(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n1. Pub Price\t 2. Pub Reviews\t 3. Pub Details ");

        int select = scanner.nextInt();

        switch (select) {
            case 1:
                System.out.println("Pub Prices\n");

                pubSelect pub= new pubSelect(taylorsPrices);

                pub.displayinfo();
                break;
            case 2:
                System.out.println("Pub Reviews\n");
                String[] reviewCat = {"Cleanliness", "Friendliness", "Accessibility", "Uniqueness", "Range"};
                double[] rating = {9, 10, 8, 8, 9};
                double average = calcAverage(rating);
                System.out.println("Ratings and Reviews: ");
                for (int i = 0; i < reviewCat.length; i++) {
                    System.out.println(reviewCat[i] + ": " + rating[i] + "/10.");
                }
                System.out.println("-Score: " + average);

                pubSelect.reviewTaylors();

                break;

            case 3:
                System.out.println("Pub Details\n");
                System.out.println("Phone number: 091 450475\nE-mail: reservations@taylorsgalway.ie\nAddress: 7 Dominick Street Upper," +
                        "Galway’s Westend");
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }

    public static void taaffesPD(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n1. Pub Price\t 2. Pub Reviews\t 3. Pub Details ");

        int select = scanner.nextInt();

        switch (select) {
            case 1:
                System.out.println("Pub Prices\n");

                pubSelect pub= new pubSelect(taaffesPrices);

                pub.displayinfo();
                break;
            case 2:
                System.out.println("Pub Reviews\n");
                String[] reviewCat = {"Cleanliness", "Friendliness", "Accessibility", "Uniqueness", "Range"};
                double[] rating = {9, 10, 8, 8, 9};
                double average = calcAverage(rating);
                System.out.println("Ratings and Reviews: ");
                for (int i = 0; i < reviewCat.length; i++) {
                    System.out.println(reviewCat[i] + ": " + rating[i] + "/10.");
                }
                System.out.println("-Score: " + average);

                pubSelect.reviewTaffes();
            
                break;

            case 3:
                System.out.println("Pub Details\n");
                System.out.println("Phone number: 091 564066\nE-mail: taaffesbar@gmail.com\nAddress: 19 Shop Street Galway\n");
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }

}

