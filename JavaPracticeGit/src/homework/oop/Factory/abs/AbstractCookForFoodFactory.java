package homework.oop.Factory.abs;

import homework.oop.Food.Food;

import java.util.List;

/**
 * ��ʽ����������
 */
public abstract class AbstractCookForFoodFactory {

    /**
     * �õ��Լ���ʽʳ��˵�
     * @retrn
     */
    abstract List<Food> getCookFood(String type);

}
