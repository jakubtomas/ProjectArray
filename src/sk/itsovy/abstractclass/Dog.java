package sk.itsovy.abstractclass;

public class Dog extends Animal {

    @Override
    public void getPicture() {
        System.out.println("get picture from dog");
    }

    @Override
    public void sound() {
        System.out.println("woof woof woof  I am dog and you ");
    }


    public void Hunter() {
        System.out.println("function only from dog  dog");
    }
}
