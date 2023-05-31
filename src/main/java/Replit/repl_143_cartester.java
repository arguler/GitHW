package Replit;

public class repl_143_cartester {
    String make;    String model;    int numberOfDoors;    int topSpeed;    double price;
    void showall(String m, String mo, int nod, int ts, double p) {
        this.make = m;
        this.model = mo;
        this.numberOfDoors = nod;
        this.topSpeed = ts;
        this.price = p;
        System.out.println(make + " " + model + " " + numberOfDoors + " " + topSpeed + " " + price);
    }
    void showexceptone(String m1, String mo1, int ts1, double p1) {
        numberOfDoors=4;
        this.make = m1;
        this.model = mo1;
        //this.numberOfDoors=nod;
        this.topSpeed = ts1;
        this.price = p1;
        System.out.println(make + " " + model + " "+numberOfDoors +" "+ topSpeed + " " + price);
    }
    void showexcepttwo(int nod2, int ts2, double p2) {
        make = "unknown";
        model ="unknown";
        this.numberOfDoors=nod2;
        this.topSpeed = ts2;
        this.price = p2;
        System.out.println(make + " " + model + " "+numberOfDoors +" "+ topSpeed + " " + price);
    }
    void showexceptthree(String m3, String mo3, int nod3) {
        make = m3;
        model = mo3;
        this.numberOfDoors =nod3;
        topSpeed = 90;
        price = 0;
        System.out.println(make + " " + model + " " + numberOfDoors + " " + topSpeed + " " + price);
    }
}
