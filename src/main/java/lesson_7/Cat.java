package lesson_7;

public class Cat {
    private String name;
    private int appetite;
    protected boolean satiety; //третье задание
    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety=satiety;
    }
    public void eat(Plate p ) {
        //четвертое задание
        boolean b = p.decreaseFood(appetite);
        if (b) {
            this.satiety=true;
            System.out.println("Кот сыт.");
        }
        else {
            System.out.println("Кот все еще голоден.");
            this.satiety=false;
        }
    }

    public int getAppetite() {
        return appetite;
    }
}
