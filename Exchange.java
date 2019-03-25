import java.util.*;
/**
 * Write a description of class Exchange here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Exchange
{
    // instance variables - replace the example below with your own
    private int[] available = {10000, 1000, 100, 10, 1};
    private String[] names = {"AAPL", "AMZN", "JD", "ROKU", "SIRI"};
    private double[] prices = {188.74, 1778.37, 28.39, 66.75, 5.74};
    private int numberOfStocks = 5;
    ArrayList <Stock> stocks = new ArrayList<Stock>();
    
    /**
     * Constructor for objects of class Exchange
     */
    public Exchange()
    {
        // initialise instance variables
        for(int i = 0; i < numberOfStocks; i++)
        {
            Stock stock = new Stock(available[i], names[i], prices[i]);
            stocks.add(stock);
        }
    }
    
    public void buyStock(int index, int number)
    {
        Stock stock = stocks.get(index);
        stock.buyStock(number);
    }
    
    public void sellStock(int index, int number)
    {
        Stock stock = stocks.get(index);
        stock.sellStock(number);
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double returnAssets()
    {
        // put your code here
        double total = 0;
        for(int i = 0; i < numberOfStocks; i++)
        {
            Stock stock = stocks.get(i);
            total += stock.returnOwned() * stock.returnPrice();
        }
        return total;
    }
    
    
}