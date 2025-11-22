class Animal {
    String name;

    public void eat() {
        System.out.println("I can eat");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("I can bark");
    }

    public void display() {
        System.out.println("My name is " +name);
    }
}

class Main {
    public static void main(String[] args) {
        Dog labrador = new Dog();
        labrador.name = "Aditya";
        labrador.display();
        labrador.eat();
        labrador.bark();
    }
}
