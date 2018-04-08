package homework.oop.Factory.abs;

import homework.oop.Food.Food;

import java.util.List;

/**
 * 餐馆食物工厂
 */
public abstract class AbstractResturantFoodFactory {

    /**
     * 得到餐馆食物菜单
     * @retrn
     */
   abstract List<Food> getResturantFood();

}
