import java.util.ArrayList;
import java.util.HashMap;

public class TestSnackMachine {
    public static void main(String[] args) {
        SnackMachine snacky = new SnackMachine();

        HashMap<Integer, Double> snack = new HashMap<Integer, Double>();
     // snack.put("the number of the snack that shows in the machine", "the price of the sncak")
        snack.put(11, 1.30);
        snack.put(12, 2.00);
        snack.put(13, 3.40);
        snack.put(14, 6.90);
        snack.put(15, 1.70);
        snack.put(21, 7.20);
        snack.put(22, 3.10);
        snack.put(23, 4.30);
        snack.put(24, 1.30);
        snack.put(25, 6.40);
        snack.put(31, 3.50);
        snack.put(32, 7.90);
        snack.put(33, 3.40);
        snack.put(34, 2.30);
        snack.put(35, 3.60);
        snack.put(41, 4.10);
        snack.put(42, 7.90);
        snack.put(43, 3.70);
        snack.put(44, 3.30);
        snack.put(45, 4.50);
        snack.put(51, 9.30);
        snack.put(52, 2.70);
        snack.put(53, 4.40);
        snack.put(54, 7.60);
        snack.put(55, 4.40);
     // money.put("the type of the coin or payment", "the value for each type")
        HashMap<String, Double> money = new HashMap<String, Double>();
        money.put("10c", 0.1);
        money.put("20c", 0.2);
        money.put("50c", 0.5);
        money.put("1$", 1.0);
        money.put("20$", 20.0);
        money.put("50$", 50.0);
        money.put("Card", 0.0);
        money.put("Card", 0.0);
     // calling the method from the main
        snacky.Main(snack,money);
    }
}