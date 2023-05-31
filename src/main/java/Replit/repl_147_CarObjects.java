package Replit;
class repl_147_CarObjects {
    String model;
    int year;
    double quantity,price;

    void carStockValue(String model, int year, double quantity, double price){
        this.model=model;
        this.year=year;
        this.quantity=quantity;
        this.price=price;

        double stockvalue=(quantity*price);
        System.out.println(model+" "+year+" "+" Stock Value "+" "+stockvalue);
    }
}
