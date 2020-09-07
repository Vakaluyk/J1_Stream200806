package ru.geekbrains.j.five.lesson_5.home;

import ru.geekbrains.j.five.lesson_5.home.zoo.Cat;
import ru.geekbrains.j.five.lesson_5.home.zoo.Dog;
public class Main{

    public static void main(String[] args){
          Cat a = new Cat("Vasiliy","black", 2,2,200);
          Dog b = new Dog( "Sharik","Chery",5, 0.5f,10,500);

          a.running();
          a.jump();
          b.running();
          b.jump();
          b.swim();
    }

}