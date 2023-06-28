package Inheritance;

public class ClassA {
    //This is a class for the task 2 of the simpler homework
    public String someString;

  public ClassA (String someString){
        this.someString = someString;
    }
    public String getSomeString () {
        return someString;
    }

    public void setSomeString(String someString) throws Exception {
        if (someString == null){
            try {
                throw new Exception("A color of this Car is unknown");
            }catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        this.someString = someString;
    }
    public void print () {
        System.out.println("This is a class classA.");
        System.out.println("It has a String value SomeString, it is: " + someString);

    }

}
