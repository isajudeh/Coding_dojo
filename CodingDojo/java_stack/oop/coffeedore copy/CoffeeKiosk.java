import java.util.ArrayList;

public class CoffeeKiosk{
    //Member variables
    ArrayList<Item> menu= new ArrayList<Item>();
    ArrayList<Order> orders= new ArrayList<Order>();
    //Constructors
    public CoffeeKiosk() {
        this.menu = menu;
        this.orders = orders;
    }
    //Getter & Setter
    public ArrayList<Item> getMenu() {
        return this.menu;
    }
    public void setMenu(ArrayList<Item> menu) {
        this.menu = menu;
    }
    public ArrayList<Order> getOrders() {
        return this.orders;
    }
    public void setOrders(ArrayList<Order> orders){
        this.orders = orders;
    }
    //Methods(1)//
    public void addMenuItem(String name, double price){
        Item itm = new Item();
            itm.name = name;
            itm.price = price;
        menu.add(itm);
    }
    //Methods(2)//
    public void displayMenu(){
        for (int i=0; i < menu.size(); i++){
            System.out.println(i + " " + menu.get(i).name + " -- $" + menu.get(i).price);
        }
    }
    //Methods(3)//
    public void newOrder() {
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
        Order ord = new Order(name);
            ord.name = name;
            ord.menu = new ArrayList<Item>();
            ArrayList<Item> arr = ord.menu;
        displayMenu();
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        while(!itemNumber.equals("q")) 
        {
            int num = Integer.parseInt(itemNumber);
            // ord(name).items=ord(name).add(menu.get(num));
            arr.add(menu.get(num));
            System.out.println("Please enter a menu item index or q to quit:");
            itemNumber = System.console().readLine();
        }
        System.out.println("Thank you, "+name+". Here are your order details:");
        System.out.println("Customer Name: "+name);
        //////////////////////////////////////////////////////////////////////////
        double sum= 0.0;
        for (int i=0; i < arr.size(); i++){
        System.out.println(arr.get(i).name + " -- $" + arr.get(i).price);
        sum += arr.get(i).price;
        }
        System.out.println("Total is: $" + sum);
        //////////////////////////////////////////////////////////////////////////
    }
}