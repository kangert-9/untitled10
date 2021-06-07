package lesson_7;

import java.util.spi.AbstractResourceBundleProvider;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        //второе задание
        if (food >= n) {
            food -= n;
            return true;
        }
        else {
            System.out.println("В тарелке слишком мало еды((( Всего осталось: " + food);
            return false;
        }
    }
//шестое задание
    public void increaseFood(int n) {
            food += n;
        System.out.println("Мы добавили в тарелку еды");
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
}
