package lesson6;

public class Dog extends Animal {
    private static int dogCount = 0;
    private int maxRunDistance = 500;
    private int maxSwimDistance = 10;

    Dog(String dogName) {
        super(dogName);
        dogCount++;
    }

    public int getDogCount() {
        return dogCount;
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
        if (distance > maxSwimDistance) {
            System.out.println(getAnimalName() + " проплыл " + maxSwimDistance + " метров");
        } else {
            System.out.println(getAnimalName() + " проплыл " + distance + " метров");
        }
    }
    @Override
    public String toString() {
        return "Name: "+getAnimalName()+"\nMax run distance is: "+maxRunDistance+"\nMax swim distance is: "+maxSwimDistance;
    }
}
