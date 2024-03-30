package ie.atu.interface1;

public class pubSelect {
    private String[] drinks;
    private double[] prices;
    public String[] reviewCat;
    public double[] rating;


    public pubSelect(String[] drinks, double[] prices){
        this.drinks = drinks;
        this.prices = prices;

    }

   // public pubSelect(String[] reviewCat, double[] rating){
    //    this.reviewCat = reviewCat;
    //    this.rating = rating;
   // }
    public void displayinfo() {
        System.out.println("Drink Menu + Prices: ");
        for (int i = 0; i <= drinks.length; i++) {
            System.out.println(drinks[i] + ": €" + prices[i]);
        }
    }
   // public void displayReviewInfo(){
    //    System.out.println("Ratings and Reviews: ");
    //    for(int i = 0; i <= reviewCat.length; i++){
    //        System.out.println(reviewCat[i] + ": " + rating[i] + "/10.");
      //  }
   // }

}
