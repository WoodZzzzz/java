package homework.oop.Factory.abs;

import homework.oop.Food.Food;

import java.util.List;

/**
 * 中式自做工厂类
 */
public abstract class AbstractCookForFoodFactory {

    /**
     * 得到自家中式食物菜单
     * @retrn
     */
    abstract List<Food> getCookFood(String type);

}
