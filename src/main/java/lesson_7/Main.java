package lesson_7;

public class Main {
    public static void main(String[] args) {
        //пятое задание
        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Barsik", 195, false);
        cat[1] = new Cat("Masya", 60, false);
        cat[2] = new Cat("Ivan", 150, false);

        Plate plate = new Plate(100);

        //кормим Барсика
        plate.info();
        cat[0].eat(plate);
        plate.info();
        plate.increaseFood(100);
        cat[0].eat(plate);
        plate.info();

        //кормим всех котов пятое задание
        for (int i = 0; i < cat.length; i++) {
            cat[i].eat(plate);
        }
        //но не выходит всех накормить(((
        for (int i = 0; i < cat.length; i++) {
            while (cat[i].satiety = false) {
                cat[i].eat(plate);
                if (cat[i].satiety = true) {
                    break;
                     }
                plate.increaseFood(cat[i].getAppetite() - plate.getFood());
                }
            }

        }
   }
