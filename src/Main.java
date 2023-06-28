import Inheritance.ClassA;
import Inheritance.ClassB;
import Inheritance.ClassC;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
       // System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.


            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
        ClassA anExampleObject = new ClassA("Something");
        ClassB anExampleObjectTwo = new ClassB("Some Object");
        ClassC anExmapleObjectThree = new ClassC("SomeName");
        anExampleObject.print();
        anExampleObjectTwo.print();
        anExmapleObjectThree.print();


        }
    }
