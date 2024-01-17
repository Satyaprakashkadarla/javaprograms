// Define a class named "Person"
class Person {
    // Data members or instance variables
    String name;
    int age;

    // Constructor to initialize the object
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person's information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Method to calculate and return the year of birth
    public int calculateYearOfBirth() {
        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        return currentYear - age;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of the Person class
        Person person1 = new Person("Alice", 30);

        // Access and display person's information using object methods
        person1.displayInfo();

        // Calculate and display the year of birth
        int yearOfBirth = person1.calculateYearOfBirth();
        System.out.println("Year of Birth: " + yearOfBirth);
    }
}
