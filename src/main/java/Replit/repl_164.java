package Replit;

/*
Create a method hello() in parent class that will print
"method in Parent class" then override  that method
is 3 Subclasses implementing login to print
"method in Child1/Child2/Child3 class"
In Main Class create 3 object of the child classes
and store in into an array and call method hello():
**Expected Output:**
method in Child1 class
method in Child2 class
method in Child3 class
 */
public class repl_164 {
    public static void main(String[] args) {
        repl_164_Child1 obj = new repl_164_Child1();
        repl_164_Child2 obj1 = new repl_164_Child2();
        repl_164_Child3 obj2 = new repl_164_Child3();

        repl_164 [] array = new repl_164 [3];
        array[0] = obj.hello();
        array[1] = obj1.hello();
        array[2] = obj2.hello();
    }
}

class repl_164_Parent {
    repl_164 hello() {
        System.out.println("method in Parent class");
        return null;
    }
}

class repl_164_Child1 extends repl_164_Parent {
    @Override
    repl_164 hello() {
        System.out.println("method in Child1 class");
        return null;
    }
}

class repl_164_Child2 extends repl_164_Parent {
    @Override
    repl_164 hello() {
        System.out.println("method in Child2 class");
        return null;
    }
}

class repl_164_Child3 extends repl_164_Parent {
    @Override
    repl_164 hello() {
        System.out.println("method in Child3 class");
        return null;
    }
}