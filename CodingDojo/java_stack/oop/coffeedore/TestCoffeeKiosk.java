import java.util.ArrayList;

public class TestCoffeeKiosk {
    public static void main(String[] args) {
        CoffeeKiosk cofe = new CoffeeKiosk();

        cofe.addMenuItem("banana",2.00);
        cofe.addMenuItem("coffee",1.50);
        cofe.addMenuItem("latte",4.50);
        cofe.addMenuItem("capuccino",3.00);
        cofe.addMenuItem("muffin",4.00);
        // cofe.displayMenu();
        cofe.newOrder();
    }
}