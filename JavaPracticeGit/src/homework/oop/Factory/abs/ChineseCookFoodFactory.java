package homework.oop.Factory.abs;

import homework.oop.Food.Food;
import homework.oop.Food.HotDishes;
import homework.oop.Food.Noodles;

import java.util.ArrayList;
import java.util.List;

public class ChineseCookFoodFactory extends AbstractCookForFoodFactory {

    /**
     * 只会中式菜谱
     * @return
     */
    @Override
    public List<Food> getCookFood(String type) {
        List list = new ArrayList();
        list.add(new Noodles());
        list.add(new HotDishes());
        return list;
    }
}
