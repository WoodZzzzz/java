package homework.oop1.factory;

import homework.oop1.food.Food;

import java.util.Map;

public abstract class AbstractFoodFactory {

    /**
     * 从外卖获取食物
     * @return
     */
    public abstract Map<String, Food> getTakeoutFood();

    /**
     * 自己家里获取食物
     * @return
     */
    public abstract Map<String, Food> getCookForFood();

    /**
     * 去外面获取食物
     * @return
     */
    public abstract Map<String, Food> getGoOutForFood();
}
