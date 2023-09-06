package Box;

import java.util.ArrayList;

import Fruits.Fruit;

public class Box<E extends Fruit> {
    private ArrayList<E> fruitBox;
    private double boxWeight;
    private int id;

    private static int counter;

    {

        this.id = ++counter;

    }

    public Box() {
        this.fruitBox = new ArrayList<E>();
        this.boxWeight = 1.0;
    }

    public void addFruit(E newFruit) {
        this.fruitBox.add(newFruit);
    }

    public double getWeight() {
        if (this.fruitBox.size() == 0)
            return boxWeight;

        return this.fruitBox.get(0).getWeight() * this.fruitBox.size() + boxWeight;
    }

    public int getId(){
        return this.id;
    }

    public boolean compare(Box<?> otherBox) {
        return this.getWeight() == otherBox.getWeight();
    }

    public void emptyToBox(Box<E> otherBox) {
        if (this.fruitBox.size() == 0)
            System.out.println("Из данной коробки нечего пересыпать, она пустая!!!");
        else{
            System.out.printf("Происходит пересыпание фруктов из коробки №%d в коробку №%d\n", this.id, otherBox.id);

            otherBox.fruitBox = (ArrayList<E>) this.fruitBox.clone();

            this.fruitBox.clear();
        }
        
    }

    @Override
    public String toString() {
        if (this.getWeight() == 1.0)
            return String.format("Коробка №%d | Наполнение - Пустая | Вес - %.1f кг", this.id, this.getWeight());

        String boxType = this.fruitBox.get(0).getClass().getSimpleName();

        switch (boxType) {
            case "Orange":
                return String.format("Коробка №%d | Наполнение - Апельсины | Вес - %.1f кг", this.id,
                        this.getWeight());
            case "Apple":
                return String.format("Коробка №%d | Наполнение - Яблоки | Вес - %.1f кг", this.id,
                        this.getWeight());
            default:
                return "Неизвестная коробка";
        }
    }
}
