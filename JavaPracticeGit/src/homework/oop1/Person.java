package homework.oop1;

import homework.oop1.food.Food;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void eat(Food food) {
        if (food == null) {
            System.out.println("所选的食物没有");
            return;
        }
        System.out.println(name + "正在吃" + food);
    }
}
