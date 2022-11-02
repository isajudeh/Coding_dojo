class Vehicle {
    private int numberOfWheels;
    private String color;

    // constructore
    public Vehicle (int numberOfWheels,String color){
        this.color = color;
        this.numberOfWheels = numberOfWheels;
    }
    public String getColor() {
        return color;
        }
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

//     // getter
//     public int getNumberOfWheels() {
//         return numberOfWheels;
//     }
//     // setter
//     public void setNumberOfWheels(int number) {
//         numberOfWheels = number;
//     }
//     // getter
//     public String getColor() {
//         return color;
//     }
//     // setter
//     public void setColor(String color) {
//         this.color = color;
//     }
}