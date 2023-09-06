import Box.Box;
import Fruits.Orange;
import Fruits.Apple;

public class Program {
    public static void main(String[] args) throws Exception {

        /*
         * Создание коробки №1 и заполнение коробки Апельсинами.
         */

        Box<Orange> box1 = new Box<>();
        
        for (int i = 0; i <= 20; i++){
            box1.addFruit(new Orange());
        }
        System.out.println(box1);

        /*
         * Создание коробки №2 и заполнение коробки Яблоками.
         */

        Box<Apple> box2 = new Box<>();

        for (int i = 0; i <= 30; i++){
            box2.addFruit(new Apple());
        }
        System.out.println(box2);

        System.out.println("----------------");

        /*
         * Cравнение созданных коробок на равенство
         */

        System.out.println(box1.compare(box2));

        System.out.println("----------------");

        /*
         * Создание коробки №3 и пересыпание фруктов из коробки №1 в коробку №3.
         */
        Box<Orange> box3 = new Box<>();

        box1.emptyToBox(box3);
        System.out.println("----------------");

        System.out.println(box1);
        System.out.println(box3);

        /*
         * Проверка на невозможность пересыпание пустой коробки в другую.
         */
        System.out.println("----------------");
        box1.emptyToBox(box3);
    }
}
