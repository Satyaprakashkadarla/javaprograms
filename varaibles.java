 class VariableTypesDemo {
    // Static variable (class-level variable)
    static int staticVariable = 10;

    // Instance variables
    int instanceVariable1;
    String instanceVariable2;

    public VariableTypesDemo(int instanceVariable1, String instanceVariable2) {
        // Assign values to instance variables using constructor
        this.instanceVariable1 = instanceVariable1;
        this.instanceVariable2 = instanceVariable2;
    }

    // Method that uses local variable
    public void localVarDemo() {
        // Local variable
        int localVar = 20;
        System.out.println("Local Variable: " + localVar);
    }

    // Method that uses instance variables
    public void instanceVarDemo() {
        System.out.println("Instance Variable 1: " + instanceVariable1);
        System.out.println("Instance Variable 2: " + instanceVariable2);
    }

    // Method that uses static variable
    public static void staticVarDemo() {
        System.out.println("Static Variable: " + staticVariable);
    }

    public static void main(String[] args) {
        // Create an object of the class
        VariableTypesDemo obj = new VariableTypesDemo(100, "Hello");

        // Access and demonstrate local variable
        obj.localVarDemo();

        // Access and demonstrate instance variables
        obj.instanceVarDemo();

        // Access and demonstrate static variable
        staticVarDemo();
    }
}
