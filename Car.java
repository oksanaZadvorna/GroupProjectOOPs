package GroupProjectOOPs;

/*
8. Create a Class Car that would have the following fields: carPrice and
color and method calculateSalePrice() which should be returning a
price of the car.
Create 2 sub classes: Sedan and Truck. The Truck class has a field
as weight and has its own implementation of calculateSalePrice()
method in which returned price is calculated as following: if
weight>2000 then returned price car should include 10% discount,
otherwise 20% discount.
The Sedan class has field as length and also does it is own
implementation of calculateSalePrice(): if length of sedan is >20 feet
then returned car price should include 5% discount, otherwise 10%
discount
 */
public abstract class Car {
    double carPrice;
    String carColor;

    public Car(double carPrice, String carColor) {
        this.carPrice = carPrice;
        this.carColor = carColor;
    }

    abstract double calculateSalePrice();
}
class Sedan extends Car{
double length;
    public Sedan(double carPrice, String carColor, double length) {
        super(carPrice, carColor);
    }

    @Override
    double calculateSalePrice() {
        if(length >20){
            carPrice=carPrice-(carPrice*0.05);
        }else{
            carPrice=carPrice-(carPrice*0.01);
        }
        System.out.println("Discounted price of sedan is: ");
        return carPrice;
    }
}
class Truck extends Car{
    double weight;

    public Truck(double carPrice, String carColor, double weight) {
        super(carPrice, carColor);
        this.weight=weight;
    }
@Override
    double calculateSalePrice(){
        if(weight>2000){
            carPrice=carPrice-(carPrice*0.1);
        }else{
            carPrice=carPrice-(carPrice*0.2);
        }
        System.out.println("Discounted price of truck is: ");
        return carPrice;
    }
}
class CarTester{
    public static void main(String[] args) {
        Sedan sedan=new Sedan(45.000, "silver", 22.5);
        System.out.println("Discounted price of sedan is: "+sedan.calculateSalePrice());
        Truck truck=new Truck(65.000, "white", 30.9);
        System.out.println("Discounted price of truck is: "+truck.calculateSalePrice());
    }
}