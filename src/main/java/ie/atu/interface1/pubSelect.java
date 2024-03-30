package ie.atu.interface1;

public class pubSelect {
    private String[] drinks;
    private double[] prices;
    public String[] reviewCat;
    public double[] rating;
    private String darcys;

    private String BarrNaCh;


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
