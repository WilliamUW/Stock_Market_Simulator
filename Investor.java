
/**
 * Write a description of class Investor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Investor extends Exchange
{
    // instance variables - replace the example below with your own
    private double assets;
    private String name;
    private Exchange exchange;
    private double previousAssets;
    /**
     * Constructor for objects of class Investor
     */
    public Investor()
    {
        // initialise instance variables
        name = "Elon Musk";
        assets = 1000;
        exchange = new Exchange();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double returnFinancialCapital()
    {
        // put your code here
        return assets;
    }
    
    public double returnCapital()
    {
        return exchange.returnAssets();
    }
    
    public String returnAllAssets()
    {
        String print = "";
        print += "Capital: $" + exchange.returnAssets() + ", Financial Capital: $" + assets + ".";
        return print;
    }
    
    public void buyStock(int index, int number)
    {
        Stock stock = stocks.get(index);
        if(assets >= stock.returnPrice()*number)
        {
            exchange.buyStock(index,number);
            assets = assets - stock.returnPrice()*number;
        }
    }
    
    public void sellStock(int index, int number)
    {
        Stock stock = stocks.get(index);
        if(stock.returnOwned() >= number)
        {
            exchange.sellStock(index,number);
            assets = assets + stock.returnPrice()*number;
        }
    }
    
    public void nextDay()
    {
        exchange.newDay();
    }
    
    public String toString()
    {
        String print = "";
        return print;
    }
    
    public void printInfo()
    {   
        System.out.println("Capital: $" + exchange.returnAssets() + ", Financial Capital: $" + assets + ".");
    }
}
