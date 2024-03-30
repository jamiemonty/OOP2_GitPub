package ie.atu.interface1;

public class pubSelect {
    private String[] drinks;
    private double[] prices;
    public String[] reviewCat;
    public double[] rating;
    private String darcys;


    public pubSelect(String[] drinks, double[] prices){
        this.drinks = drinks;
        this.prices = prices;

    }
    public pubSelect(String darcys){
        this.darcys = darcys;
    }

   // public pubSelect(String[] reviewCat, double[] rating){
    //    this.reviewCat = reviewCat;
    //    this.rating = rating;
   // }
    public void displayinfo() {
        System.out.println("Drink Menu + Prices: ");
        for (int i = 0; i < drinks.length; i++) {
            System.out.println(drinks[i] + "- €" + prices[i]);
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
   // public void displayReviewInfo(){
    //    System.out.println("Ratings and Reviews: ");
    //    for(int i = 0; i <= reviewCat.length; i++){
    //        System.out.println(reviewCat[i] + ": " + rating[i] + "/10.");
      //  }
   // }

}
