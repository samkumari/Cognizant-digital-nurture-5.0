class Animal {
    void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }
}

class InheritanceDemo {
    public static void main(String[] args) {
        Animal ob = new Animal();
        ob.makeSound();

        Dog d = new Dog();
        d.makeSound();
    }
}