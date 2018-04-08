package homework.oop1;

import homework.oop1.food.Food;
import homework.oop1.food.Noodles;
import homework.oop1.food.Rice;

public enum FoodTypeEnum {

    CHOOSE1(new Noodles()),
    CHOOSE2(new Rice());

    private Food food;

    FoodTypeEnum(Food food) {
        this.food = food;
    }

    public Food get() {
        return this.food;
    }
}
