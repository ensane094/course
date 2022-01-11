package lesson6;

public abstract class Animal {
    private String animalName;
    private static int animalCount;
    Animal(String animalName){
        this.animalName=animalName;
        animalCount+=1;
    }
    String getAnimalName(){
        return animalName;
    }
    public abstract void run(int distance);
    public abstract void swim(int distance);
    public int getAnimalCount(){return animalCount;}
}
