package Replit;

public class repl_144_StoreProduct {
    String label;
    double price;
    String category;
    boolean hasExpiration;
    int stock;
    void StoreProduct(String label, double price, String category, boolean hasExpiration, int stock){
        this.label=label;
        this.price=price;
        this.category=category;
        this.hasExpiration=hasExpiration;
        this.stock=stock;
    }
    void StoreProduct(String label, double price, int stock){
        this.label=label;
        this.price=price;
        this.stock=24;
        this.category="misc";
        hasExpiration=false;
    }
    void StoreProduct(String label, double price){
        this.label=label;
        this.price=price;
        stock=0;
    }
    public void display(){
        System.out.println(label +" "+ price +" "+ category +" "+ hasExpiration +" "+ stock);
    }
}
