package Replit;

public class repl_145_Dog {
    String dogName;
    double dogWeight;
    static String dogBreed = "Mutt";
    void dogqualification (String n, double w) {
        this.dogName=n;
        this.dogWeight=w;
    }
    void display(){
        System.out.println(dogName +" "+ dogBreed +" "+dogWeight);
    }
}


