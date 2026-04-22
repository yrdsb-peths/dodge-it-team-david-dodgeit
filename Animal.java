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
            // add gameover symbol
            GameOver gameOver = new GameOver();
            getWorld().addObject(gameOver, 300, 200);
            getWorld().removeObject(this);
        }   
    }
        public void resetAnimal() {
            int num = Greenfoot.getRandomNumber(2);
            if(num == 0) {
                setLocation(600, 100);
        }   else {
            setLocation(600, 300);
        }
    
        setLocation(600, 100);
    }
}
