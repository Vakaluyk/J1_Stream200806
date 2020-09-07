package ru.geekbrains.j.five.lesson_5.home.zoo;

import ru.geekbrains.j.five.lesson_5.home.Animal;

public class Cat extends Animal {
    float jump;
    float running;


    public Cat(String name,String color,int age, float jump, float running){
        super(name, color, age);
        this. jump = jump;
        this. running = running;

    }
    public void jump(){
        System.out.println(name + " jump "+ jump +" meters ");
    }
    public void running(){
        System.out.println(name + " running " + running + " meters ");
    }



}
