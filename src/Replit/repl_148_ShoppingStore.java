package Replit;

public class repl_148_ShoppingStore {
    String item;
    double price;    int quantity;
    void itemTotalPrice(String item, double price, int quantity){
        this.item=item;
        this.price=price;
        this.quantity=quantity;

        double total=price*quantity;
        System.out.println(item+" "+"Total Value "+total);
    }
}
