package homework.oop.Factory.abs;

import homework.oop.Food.Food;

import java.util.List;

/**
 * �͹�ʳ�﹤��
 */
public abstract class AbstractResturantFoodFactory {

    /**
     * �õ��͹�ʳ��˵�
     * @retrn
     */
   abstract List<Food> getResturantFood();

}
