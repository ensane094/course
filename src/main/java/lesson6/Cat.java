package lesson6;

public class Cat extends Animal {
    private static int catCount = 0;
    private int maxRunDistance = 200;
    private int maxSwimDistance = 0;

    Cat(String catName) {
        super(catName);
        catCount++;
    }

    public int getCatCount() {
        return catCount;
    }

    @Override
    public void run(int distance) {
        if (distance > maxRunDistance) {
            System.out.println(getAnimalName() + " пробежал " + maxRunDistance + " метров");
        } else {
            System.out.println(getAnimalName() + " пробежал " + distance + " метров");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(getAnimalName() + " утонул");
    }

    @Override
    public String toString() {
        return "Name: "+getAnimalName()+"\nMax run distance is: "+maxRunDistance+"\nMax swim distance is: "+maxSwimDistance;

    }
}
