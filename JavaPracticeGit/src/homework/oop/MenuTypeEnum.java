package homework.oop;

import homework.oop.Food.ChineseFood;
import homework.oop.Food.Food;
import homework.oop.Food.WesternFood;

/**
 * ²ËÆ×ÀàÐÍÑ¡Ôñ
 */
public enum MenuTypeEnum {

    CHOOSE_1(new ChineseFood()),
    CHOOSE_2(new WesternFood());

    private Food food;

    MenuTypeEnum(Food food) {
        this.food = food;
    }

    public Food get() {
        return this.food;
    }
}
