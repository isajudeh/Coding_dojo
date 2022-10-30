import java.util.ArrayList;

public class Order{
    public String name;
    public double total;
    public boolean ready;
    public ArrayList<Item> items = new ArrayList<Item>();
    public double total(){
        double sum=0.0;
        for (int i=0; i<items.size(); i++){
            sum = sum+(items.get(i).price);
        }
        return sum;
    }
}