package homework.oop1;

import homework.oop1.factory.FoodFactory;
import homework.oop1.food.Food;
import homework.oop1.food.Noodles;

import java.util.Map;

public class Test {

    public static void main(String[] args) {
        //1、小明直接吃面条
        Person xm = new Person("小明");
        Noodles n = new Noodles();
        //xm.eat(n);
        //2、小明选择吃面条（策略模式）
//        xm.eat(FoodTypeEnum.CHOOSE2.get());
        //3、小明选择地点、然后去吃饭
        FoodFactory factory = new FoodFactory();
        Map<?, ?> map = factory.getCookForFood();
        xm.eat((Food)map.get("rice"));

    }
}
