public class VariableExample {

    // Instance variable
    int instanceVar = 10;

    // Static variable
    static int staticVar = 20;

    public void exampleMethod() {
        // Local variable
        int localVar = 30;

        // Accessing instance variable
        System.out.println("Instance variable: " + instanceVar);

        // Accessing static variable
        System.out.println("Static variable: " + staticVar);

        // Accessing local variable
        System.out.println("Local variable: " + localVar);
    }

    public static void main(String[] args) {
        // Creating an object of VariableExample class
        VariableExample obj = new VariableExample();

        // Calling exampleMethod
        obj.exampleMethod();

        // Accessing static variable directly using class name
        System.out.println("Accessing static variable using class name: " + VariableExample.staticVar);
    }
}
