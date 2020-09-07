package ru.geekbrains.j.five.lesson_5.home.zoo;

import ru.geekbrains.j.five.lesson_5.home.Animal;

public class Dog extends Animal {
    float jump;
    float swim;
    float running;

    public Dog(String name,String color,int age, float jump,float swim,float running){
        super(name, color, age);
        this. jump = jump;
        this. running = running;
        this. swim = swim;
    }
    public void jump(){
        System.out.println(name + " jump "+ jump +" meters ");
    }
    public void running(){
        System.out.println(name + " running " + running + " meters ");
    }
    public void swim(){
        System.out.println(name + " swim " + swim + " meters ");
    }
}
