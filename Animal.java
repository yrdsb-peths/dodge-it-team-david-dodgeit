import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Animal extends Actor
{
    
    public void act()
    {
        move(-15);
        
        if(getX() <= 0) {
            resetAnimal();
        }
        
        if(isTouching(hero.class)){
            
            GameOver gameOver = new GameOver();
            getWorld().addObject(gameOver, 300, 200);
        }
    
    
    
    }
}
