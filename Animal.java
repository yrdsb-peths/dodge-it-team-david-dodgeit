import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Animal extends Actor
{
    
    public void act()
    {
        move(-15);
        
        if(getX() <= 0) {
            resetAnimal();
        }
        
        if(isTouching(Hero.class)){
            
            GameOver gameOver = new GameOver();
            getWorld().addObject(gameOver, 300, 200);
        }   
    }
        public void resetAnimal() {
            int num = Greenfoot.getRandomNumber(2);
            if(num == 0) {
                setLocation(600, 100);
        }   else {
            setLocation(600, 300);
        }
    
    
    }
}
