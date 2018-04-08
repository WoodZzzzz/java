package homework.oop;

import homework.oop.Factory.abs.ChineseCookFoodFactory;
import homework.oop.person.Person;
import homework.oop.person.Xiaoming;

public class Test {

    public static void main(String[] args) {
        Xiaoming xm = new Xiaoming();
        ChineseCookFoodFactory factory = new ChineseCookFoodFactory();

        xm.eat(factory.getCookFood(""));
    }
}
