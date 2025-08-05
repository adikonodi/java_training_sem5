package javaday3.Abstraction;

abstract class Animal {
    abstract void eat();
    void run(){

    }
}

class Cat extends Animal {
    void eat(){
        System.out.println("Fish");
    }
}
class Dog extends Animal {
    void eat(){
        System.out.println("Egg");
    }
}
class DriverCode3{
    public static void main(String[] args) {
        Animal a = new Cat();
        a.run();
        a.eat();
        Animal d = new Dog();
        d.run();
        d.eat();

    }
}