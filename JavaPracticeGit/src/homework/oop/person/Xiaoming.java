package homework.oop.person;

import homework.oop.Food.Food;
import homework.oop.State;

import java.util.List;

public class Xiaoming extends ChinesePeople {

    String name = "xiaoming";

    public State eat(List<Food> food) {
        System.out.println(food.toString());
        return new State(1, "²»ºÃ³Ô");
    }
}
