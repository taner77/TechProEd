package day16_overloading;

public class Car {
    int price;
    String make;
    String model;

    public Car(int price, String make, String model){
        this.price = price;
        this.make =make;
        this.model= model;
    }

    public static void main(String[] args) {
       // Car car1 = new Car();
        Car car2 = new Car(5000, "audi", "Q5");
        Car car3 = new Car(4000, "GMC", "Yukon");

        System.out.println(car2.price+" "+car2.make+ " "+car2.model);
        System.out.println(car3.price+" "+car3.make+ " "+car3.model);
    }
}
