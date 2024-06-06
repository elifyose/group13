//Encapsulation
class Person {
    private String name;
    private int age;
    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        System.out.println("Name: " + person.getName());
      
        System.out.println("Age: " + person.getAge());

        
    }
}
/*Output Name: Alice
Age: 30
*/

//Inheritance
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.makeSound(); 
    }
}
//Output: "Dog barks"

//Polymorphism:

abstract class Vehicle {
    public abstract void startEngine();
}

class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("The car's engine starts with a roar!");
    }
}

class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("The motorcycle's engine starts with a vroom!");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myMotorcycle = new Motorcycle();

        myCar.startEngine(); 
        myMotorcycle.startEngine(); 
    }
}
/*Outputs: The car's engine starts with a roar!
Outputs: The motorcycle's engine starts with a vroom!*/

