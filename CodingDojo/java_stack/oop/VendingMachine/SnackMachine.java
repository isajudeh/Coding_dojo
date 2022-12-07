import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
public class SnackMachine{
    public void Main(HashMap<Integer, Double> snack,HashMap<String, Double> money){
        System.out.println("Please enter the number of the snack:");
        String x = System.console().readLine();
        Integer number=Integer.parseInt(x);
// checking if the input number are available in the machine or no
        if(snack.containsKey(number)){
            System.out.println("The snack is available for the selected number and its price "+ snack.get(number) +"0$");
            System.out.println("If you want to purchase the snack please choose your method for payment!");
            System.out.println("we only accept: ");
            Set<String> keys = money.keySet();
            int i=0;
            ArrayList<String> collect = new ArrayList<String>();
            System.out.println("*****************************************************");
            for(String key : keys) {
                System.out.println("  "+i++ +" |  "+ key );
                collect.add(key);
            }
            System.out.println("*****************************************************");
            System.out.println("   click on the number next to the payment method!");
            System.out.println("*****************************************************");
            String itemNumber = System.console().readLine();
            int num = Integer.parseInt(itemNumber);
            Double total = money.get(collect.get(num));
// there is two option pay via coin or card and there is two cases for this situation
            if (!collect.get(num).equals("Card")){
                System.out.printf("Your balance: %.2f $",total);
                System.out.println("");
                while (total < snack.get(number)){
                    itemNumber = System.console().readLine();
                    num = Integer.parseInt(itemNumber);
                    total = total + money.get(collect.get(num));
                    System.out.printf("Your balance: %.2f $",total);
                    System.out.println("");
                }
                if (total.equals(snack.get(number)) || total-(snack.get(number))<0.01){
                    System.out.println("Thanks for purchase with us, enjoy your snack!");
                    System.out.println("Have a nice day!");
                }
                else if (total > (snack.get(number))){
                    System.out.println("Thanks! for purchase with us, Please wait for your change!");
                    System.out.printf("Your change amount is: %.2f $",(total-(snack.get(number))));
                    System.out.println("");
                    System.out.println("Have a nice day!");
                }
            }
// I just show this case didn't go deeper throw more classes such as : user , bank_account  ... etc
            else if(collect.get(num).equals("Card")){
                System.out.println("....... loading .......");
                System.out.println("Thanks! for purchase with us your charge amount is: "+ snack.get(number) +"0$");
                System.out.println("Have a nice day!");
            }
//alternative scenarios : if the customer click wrong number he will be transfer to purchase again
        }else {
            System.out.println("The selected number is unavailable.");
            Main(snack,money);
        }
    }
}