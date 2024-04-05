package ie.atu.interface1;
import java.util.Scanner;

public class adminChanges {
    public static void addPub(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Eyre Square\t 2. Shop Street\t 3. The Latin Quarter\t 4. Other\nArea: ");
        int area = scanner.nextInt();
        switch (area) {
            case 1:
                System.out.println("\nEyre Square's Pubs\n");
                //calls for pubSelect then populates the page with the pubs, the user then enters what pub they'd like
                pubSelect.displayPubsEyreSq();
                //then the pub prices for drinks is shown along with a review.

                break;
            case 2:
                System.out.println("\nShop Street's Pubs\n");
                pubOverview.displayPubsShopSt();

                break;

            case 3:
                System.out.println("\nLatin Quarter's Pub's");
                pubOverview.displayPubsLatinQ();
                break;

            case 4:
                System.out.println("\nOther\n");
                break;
        }
        System.out.println("Enter the name of the new pub: ");
        String newPub = scanner.nextLine();
        //Add a new pub into the arrayList
        //pubSelect.add(newPub);
        System.out.println("\nPub added.");
    }

}
