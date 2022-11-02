import java.util.ArrayList;

public class Order{
    private String name;
    public double total;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<Item>();
    /////////////////////////////////////////////////////////////////////
    public void addItem(ArrayList<Item> items) {
        this.items.add(items);
    /////////////////////////////////////////////////////////////////////
    public Order (){
    this ("Guest",[]);
    }
    public Order (String name, ArrayList<Item> items){
        this.name=name;
        this.items=items;
    }
    ////////////////////////////////////////////////////////////////////
    public ArrayList<Item> getItems() {
        return items;
    }
    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean getReady() {
        return ready;
    }
    public void setReady(boolean ready) {
        this.ready = ready;
    }
    /////////////////////////////////////////////////////////////////////
    public double total(){
        double sum=0.0;
        for (int i=0; i<items.size(); i++){
            sum = sum+(items.get(i).price);
        }
        return sum;
    }
    //////////////////////////////////////////////////////////////////////
        public Order (String name){
        this.name=name;
    }
    //////////////////////////////////////////////////////////////////////
}