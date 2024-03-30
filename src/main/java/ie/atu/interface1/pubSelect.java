package ie.atu.interface1;

public class pubSelect {
    private String[] drinks;
    private double[] prices;

    public pubSelect(String[] drinks, double[] prices){
        this.drinks = drinks;
        this.prices = prices;
    }

    public void displayinfo(){
        System.out.println("Drink Menu + Prices: ");
        for(int i = 0; i < drinks.length; i++){
            System.out.println(drinks[i] + ": €" + prices[i]);
        }
    }
}
