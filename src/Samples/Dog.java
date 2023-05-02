package Samples;

public class Dog {
    String name;
    String bark;
    String run;
    String play;
    Dog(String n, String b, String r, String p) {
        this.name = n;
        this.bark = b;
        this.run = r;
        this.play = p;
    }
    void whatcan() {
        System.out.println(this.name + " can " + this.bark);
        System.out.println(this.name + " can " + this.run);
        System.out.println(this.name + " can " + this.play);
    }

    public static void main(String[] args) {
        Dog r1 = new Dog("Husky", "bark", "run", "play");
        Dog r2 = new Dog("Bulldog", "bark", "run", "play");
        Dog r3 = new Dog("Labrador", "bark", "run", "play");
        r1.whatcan();
        r2.whatcan();
        r3.whatcan();
    }
}