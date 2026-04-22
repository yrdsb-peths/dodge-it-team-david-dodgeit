import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Hero Hero = new Hero();
        addObject(Hero, 100, 100);
    
        Enemy Enemy = new Enemy();
        addObject(Enemy, 300, 0);
    }
}
