package Homework_08_GroupExercise;


/*
Create a Class Car that would have the following fields: carPrice and
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

class hw_08_Sedan extends hw_08_Car {
    int length;
    double discountedcarprice;

    @Override
    void calculateSalePrice(int length, double carPrice) {
        if (length > 20) {
            discountedcarprice = carPrice - (carPrice * 0.05);
        } else if (length < 20) {
            discountedcarprice = carPrice - (carPrice * 0.1);
        }
        carPrice = discountedcarprice;
        System.out.println(carPrice);
    }

}

class hw_08_Truck extends hw_08_Car {
    int weight;
    double discountedcarprice;

    @Override
    void calculateSalePrice(int weight, double carPrice) {
        if (weight > 2000) {
            discountedcarprice = carPrice - (carPrice * 0.1);
        } else if (weight < 2000) {
            discountedcarprice = carPrice - (carPrice * 0.2);
        }
        carPrice = discountedcarprice;
        System.out.println(carPrice);
    }
}

abstract class hw_08_Car {
    public static double carPrice;
    String color;

    abstract void calculateSalePrice(int weight, double carPrice);

    public static void main(String[] args) {
        hw_08_Sedan obj = new hw_08_Sedan();
        obj.calculateSalePrice(24, 3000.0);

        hw_08_Truck obj1=new hw_08_Truck();
        obj1.calculateSalePrice(2500, 9000);
    }
}