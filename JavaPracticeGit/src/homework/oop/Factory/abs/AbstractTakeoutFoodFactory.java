package homework.oop.Factory.abs;

import homework.oop.Food.Food;

import java.util.List;

/**
 * 外卖食物工厂
 */
public abstract class AbstractTakeoutFoodFactory {

    /**
     * 得到外卖食物菜单列表
     * @return
     */
    abstract List<Food> getTakeoutFood();
}
