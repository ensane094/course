package lesson7;

public class Plate {
    private int food;

    static final int MINIMAL_FOOD = 0;

    Plate() {
    }

    /**
     * Чтобы предотвратить отрицательное значение еды
     * я подставил такое вот условие
     */

    Plate(int food) {
        if (food <= MINIMAL_FOOD) this.food = 0;
        else this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void addFood(int addFood) {
        if(addFood>=0){
        this.food += addFood;
        System.out.println("Добавили " + addFood + " еды. Текущее значение еды:" + this.food);}
    }
}
