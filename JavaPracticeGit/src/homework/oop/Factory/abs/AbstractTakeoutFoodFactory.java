package homework.oop.Factory.abs;

import homework.oop.Food.Food;

import java.util.List;

/**
 * ����ʳ�﹤��
 */
public abstract class AbstractTakeoutFoodFactory {

    /**
     * �õ�����ʳ��˵��б�
     * @return
     */
    abstract List<Food> getTakeoutFood();
}
