import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Hero Hero = new Hero();
        addObject(Hero, 100, 100);
        
        Animal animal = new Animal();
        addObject(animal, 600, 100);
    }
}
