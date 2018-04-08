package homework.oop1;

import homework.oop1.factory.FoodFactory;

import java.util.Map;

public enum FoodFactoryTypeEnum {

    CHOOSE1(new FoodFactory().getCookForFood()),
    CHOOSE2(new FoodFactory().getGoOutForFood());

    private Map menu;

    FoodFactoryTypeEnum(Map map) {
        this.menu = map;
    }

    public Map get() {
        return this.menu;
    }
}
