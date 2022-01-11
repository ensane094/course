package lesson7;

public abstract class Animal {
    /**
     * Так как все животные едят, у всех есть такой параметр как голод,
     * я добавил эти параметры и методы сразу в класс Энимал
     */

    private String animalName;
    private int maxRunDistance;
    private int maxSwimDistance;
    private static int animalCount;
    private int animalAppetite;
    private boolean animalFullness = false;

    /**
     * Каждому для сытости нужно разное количество еды, поэтому
     * при создании животного задаём каждому необходимое количество еды
     * такой параметр как сытость я решил не включать в конструктор тк он у всех по умолчанию false
     */


    Animal(String animalName, int maxRunDistance, int maxSwimDistance, int animalAppetite) {
        this.animalName = animalName;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        this.animalAppetite = animalAppetite;
        animalCount += 1;
    }

    Animal(String animalName, int animalAppetite) {
        this(animalName, 0, 0, animalAppetite);
    }

    String getAnimalName() {
        return animalName;
    }
    public void toDododododo(){}

    public abstract void run(int distance);

    public abstract void swim(int distance);

    public int getAnimalCount() {
        return animalCount;
    }

    /**
     * Так как животные едят плюс минус одинаково то я решил
     * реализовывать метод еды сразу здесь, не делая его абстрактным
     * чтобы дальше не реализовывать его в классах-наследниках,
     * а просто напрямую из энимал его вызывать.
     */

    public boolean eating(Plate food) {
        if ((food.getFood() >= animalAppetite) && (food.getFood() - animalAppetite >= 0)) {
            food.setFood(food.getFood() - animalAppetite);
            System.out.println(animalName + " съел " + animalAppetite + " еды. Еды осталось: " + food.getFood());
            return animalFullness = true;
        } else {
            System.out.println(animalName + " голодает. Ему надо: " + animalAppetite + ". А еды в тарелке:" + food.getFood());
            return animalFullness = false;
        }

    }
}
