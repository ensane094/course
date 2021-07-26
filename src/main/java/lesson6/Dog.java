package lesson6;

public class Dog extends Animal {
    private static int count=0;
     Dog(String dogName) {
        super(dogName);
        count++;
        System.out.println("Dog " + count + " is created");
    }

    public String toString() {
        return getAnimalName();
    }
}
