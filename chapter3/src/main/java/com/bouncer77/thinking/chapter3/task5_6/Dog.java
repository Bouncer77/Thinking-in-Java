package com.bouncer77.thinking.chapter3.task5_6;

public class Dog {

    private String name;
    private String says;

    public Dog(String name, String says) {
        this.name = name;
        this.says = says;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", says='" + says + '\'' +
                '}';
    }

    public static void main(String[] args) {

        // Упражнение 5
        Dog dog1 = new Dog("spot", "say spot");
        Dog dog2 = new Dog("scruffy", "say scruffy");


        System.out.println(dog1);
        System.out.println(dog2);

        // Упражнение 6
        Dog dog = dog1;
        System.out.println(dog == dog1);
        System.out.println(dog.equals(dog1));
    }
}
