public class cafe {
    public static void main(String[] args) {
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        double mochaPrice = 3.5;
        double drip_coffee = 4.5;
        double latte = 5.5;
        double cappuccino = 6.5;

        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = false;
////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println(generalGreeting + customer1 + pendingMessage);
        System.out.println(customer1 + readyMessage);
        System.out.println(displayTotalMessage+drip_coffee);
////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println(generalGreeting + customer4);
        if(isReadyOrder4) {
            System.out.println(pendingMessage);
        }
        else {
            System.out.println(displayTotalMessage + cappuccino);
        }
////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println(generalGreeting + customer2);
        if(isReadyOrder2) {
            System.out.println(pendingMessage);
        }
        else {
            System.out.println(displayTotalMessage + (2*latte));
        }
////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println(generalGreeting + customer3);
        if(isReadyOrder3) {
            System.out.println("Sorry for the mistake "+displayTotalMessage + (latte-drip_coffee));
        }
        else {
            System.out.println(displayTotalMessage + drip_coffee);
        }
////////////////////////////////////////////////////////////////////////////////////////////

}
}