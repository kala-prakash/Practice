package com.Pen;

/*

/**
 *
 * @author kala
 */
abstract class Pen {

    public abstract void write();

    public abstract void refill();

}

class FountainPen extends Pen {

    @Override
    public void write() {
        System.out.println("Writes");
    }

    @Override
    public void refill() {
        System.out.println("Refill");
    }

    public void changeNib() {
        System.out.println("Change nib");
    }

}

class Monkey {

    public void jump() {
        System.out.println(" Monkey Jumps");
    }

    public void bite() {
        System.out.println("Monkey bites");
    }
}

interface basicAnimal {

    void sleep();

    void eat();
}

class Human extends Monkey implements basicAnimal {

    public void speak() {
        System.out.println("Hello?? Human speaking");
    }

    @Override
    public void sleep() {
        System.out.println("Human sleeps");
    }

    @Override
    public void eat() {
        System.out.println("Human eats");
    }
}

abstract class telephone {

    public abstract void lift();

    public abstract void disconnected();
}

class smartTelephone extends telephone {

    @Override
    public void lift() {
        System.out.println("Smart Phone lifted");
    }

    @Override
    public void disconnected() {
        System.out.println("Smart Phone disconnected");
    }

}
