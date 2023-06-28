package Inheritance;

public class ClassB extends Inheritance.ClassA {

    public ClassB(String someString) {
        super(someString);
    }

    @Override
    public void print () {
        System.out.println("This is a class classB.");
        System.out.println("It has a value from Class A, it is:");
        System.out.println(someString);
    }
}
