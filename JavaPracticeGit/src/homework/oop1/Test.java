package homework.oop1;

import homework.oop1.factory.FoodFactory;
import homework.oop1.food.Food;
import homework.oop1.food.Noodles;

import java.util.Map;

public class Test {

    public static void main(String[] args) {
        //1��С��ֱ�ӳ�����
        Person xm = new Person("С��");
        Noodles n = new Noodles();
        //xm.eat(n);
        //2��С��ѡ�������������ģʽ��
//        xm.eat(FoodTypeEnum.CHOOSE2.get());
        //3��С��ѡ��ص㡢Ȼ��ȥ�Է�
        FoodFactory factory = new FoodFactory();
        Map<?, ?> map = factory.getCookForFood();
        xm.eat((Food)map.get("rice"));

    }
}
