package Replit;

/*
Create a class Animal in which define instance variable type,
constructor that will initialize instance variables and
2 methods eat and sleep.
Create a subclass Cat in which override method sleep
Create 3 Kitten subclasses of a Cat class and override method eat
for 1 kitten - eats milk
for 2 kitten - eats snack
for 3 kitten - eats everything
In main method create object of Cat class and all 3 kittens classes
and store into an array of Animals. Call available methods:
**Expected Output:**
Cat eats
Cat sleeps a lot
kitten1 eats milk
kitten1 sleeps a lot
kitten2 eats snacks
kitten2 sleeps a lot
kitten3 eats everything
kitten3 sleeps a lot
*/
class repl_166_Animal {
    public static String type;

    repl_166_Animal(String type) {
        this.type = type;
    }

    void eat() {
        System.out.println(type + " eats");
    }

    void sleep() {
        System.out.println(type + " sleeps");
    }
}

class repl_166_Cat extends repl_166_Animal {
    repl_166_Cat(String type) {
        super(type);
    }

    @Override
    void sleep() {
        System.out.println(type + " sleeps a lot");
    }
}

class repl_166_kitten1 extends repl_166_Cat {
    repl_166_kitten1(String type) {
        super(type);
    }

    @Override
    void eat() {
        System.out.println(type + " eats milk");
    }
}

class repl_166_kitten2 extends repl_166_Cat {
    repl_166_kitten2(String type) {
        super(type);
    }

    @Override
    void eat() {
        System.out.println(type + " eats snacks");
    }
}

class repl_166_kitten3 extends repl_166_Cat {
    repl_166_kitten3(String type) {
        super(type);
    }

    @Override
    void eat() {
        System.out.println(type + " eats everything");
    }
}

class repl_166_Animal_Tester {
    public static void main(String[] args) {
        repl_166_Animal obj = new repl_166_Animal("Cat");
        obj.eat();
        repl_166_Cat obj1 = new repl_166_Cat("Cat");
        obj1.sleep();

        repl_166_kitten1 obj2 = new repl_166_kitten1("kitten1");
        obj2.eat();
        repl_166_Cat obj3 = new repl_166_Cat("kitten1");
        obj3.sleep();

        repl_166_kitten1 obj4 = new repl_166_kitten1("kitten2");
        obj4.eat();
        repl_166_Cat obj5 = new repl_166_Cat("kitten2");
        obj5.sleep();

        repl_166_kitten1 obj6 = new repl_166_kitten1("kitten3");
        obj6.eat();
        repl_166_Cat obj7 = new repl_166_Cat("kitten3");
        obj7.sleep();
    }
}
