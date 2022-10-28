import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class CafeUtil {
    public int getStreakGoal() {
        int sum=0;
        for(int i=1 ;i<=10; i++){
            sum+=i;
        }
        return sum;
    }
    public double getOrderTotal(double[] lineItems) {
        double sum=0.0;
        for (int i=0; i<lineItems.length; i++){
            sum+=lineItems[i];
        }
        return sum;
    }
    public void displayMenu(ArrayList<String> menu) {
        for (int i=0; i<menu.size(); i++){
            String n = menu.get(i);
            System.out.println(i+" "+n);
        }
    }
    public String addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name: ");
        String userName = System.console().readLine();
        System.out.println("Hello, "+userName+"!");
        customers.add(userName);
        return userName;
        }
    
}