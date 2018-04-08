package homework.oop1.factory;

import homework.oop1.food.Fish;
import homework.oop1.food.Food;
import homework.oop1.food.Noodles;
import homework.oop1.food.Rice;

import java.util.HashMap;
import java.util.Map;

public class FoodFactory extends AbstractFoodFactory {
    @Override
    public Map<String, Food> getTakeoutFood() {
        Map<String, Food> menu = new HashMap<String, Food>();
        //从其他地方比如数据库获取食物，这里模拟几个菜
        menu.put("fish", new Fish());
        menu.put("noodles", new Noodles());
        return menu;
    }

    @Override
    public Map<String, Food> getCookForFood() {
        Map<String, Food> menu = new HashMap<String, Food>();
        //从其他地方比如数据库获取食物，这里模拟几个菜
        menu.put("fish", new Fish());
        menu.put("rice", new Rice());
        return menu;
    }

    @Override
    public Map<String, Food> getGoOutForFood() {
        Map<String, Food> menu = new HashMap<String, Food>();
        //从其他地方比如数据库获取食物，这里模拟几个菜
        menu.put("noodles", new Noodles());
        menu.put("rice", new Rice());
        return menu;
    }
}
