import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item();
        item1.name="mocha";
        item1.price=3.5;

        Item item2 = new Item();
        item2.name="latte";
        item2.price=4.5;

        Item item3 = new Item();
        item3.name="drip coffee";
        item3.price=5.5;
        
        Item item4 = new Item();
        item4.name="capuccino";
        item4.price=6.5;

        // Order variables -- order1, order2 etc.
       

        ArrayList<Item> ItemOfOrder1 = new ArrayList<Item>();
        ItemOfOrder1.add(item1);
        ItemOfOrder1.add(item2);
        ItemOfOrder1.add(item3);
        ItemOfOrder1.add(item4);

        Order order1 = new Order();
        order1.name="Cindhuri";
        order1.ready=true;
        order1.items= ItemOfOrder1;
        order1.total= order1.total();

        // Order order2 = new Order(name:"Jimmy",total:,ready:,items:);
        // Order order3 = new Order(name:"Noah",total:,ready:,items:);
        // Order order4 = new Order(name:"Sam",total:,ready:,items:);
        // Application Simulations

        // Use this example code to test various orders' updates
        // System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        // System.out.printf("Ready: %s\n", order1.ready);
        // System.out.printf("Ready: %s\n", order1.total());
    }
}