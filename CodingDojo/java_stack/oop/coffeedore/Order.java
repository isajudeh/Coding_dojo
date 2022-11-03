import java.util.ArrayList;

public class Order{
    public String name;
    public double total;
    // public boolean ready;
    public ArrayList<Item> menu = new ArrayList<Item>();
    public double total(){
        double sum=0.0;
        for (int i=0; i<menu.size(); i++){
            sum = sum+(menu.get(i).price);
        }
        return sum;
    }
// , double total, boolean ready, ArrayList<Item> items
    public Order(String name) {
        this.name = name;
        this.total = total();
        // this.ready = ready;
        this.menu = menu;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotal() {
        return this.total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    // public boolean isReady() {
    //     return this.ready;
    // }

    // public boolean getReady() {
    //     return this.ready;
    // }

    // public void setReady(boolean ready) {
    //     this.ready = ready;
    // }

    public ArrayList<Item> getMenu() {
        return this.menu;
    }

    public void setMenu(ArrayList<Item> menu) {
        this.menu = menu;
    }

}