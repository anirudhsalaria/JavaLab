class Parent {
    public Parent() {
        System.out.println("Parent Constructor");
    }
    static {
        System.out.println("Parent static block");
    }
    {
        System.out.println("Parent initialisation  block");
    }
}

class Child extends Parent {
    {
        System.out.println("Child initialisation block");
    }
    static {
        System.out.println("Child static block");
    }

    public Child() {
        System.out.println("Child Constructor");
    } 
}

public class q30_seq_of_output {
    public static void main(String[] args) {
        new Child();
    }
}

