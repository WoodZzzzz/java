package homework.oop1.factory;

import homework.oop1.food.Food;

import java.util.Map;

public abstract class AbstractFoodFactory {

    /**
     * ��������ȡʳ��
     * @return
     */
    public abstract Map<String, Food> getTakeoutFood();

    /**
     * �Լ������ȡʳ��
     * @return
     */
    public abstract Map<String, Food> getCookForFood();

    /**
     * ȥ�����ȡʳ��
     * @return
     */
    public abstract Map<String, Food> getGoOutForFood();
}
