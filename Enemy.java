import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Enemy extends Actor
{       
    public void act()
    {        
        setLocation(getX(), getY() + 6);
        
         if(isTouching(Hero.class)) {
            // add gameover symbol
            setImage("GameOver.png");
            setLocation(300, 200);
            return;   
        }
        
        if(getY() >= getWorld().getHeight() -1)
        {
            int randomX = Greenfoot.getRandomNumber(getWorld().getWidth());
            setLocation(randomX, 0);
        }
    
        if(Greenfoot.getRandomNumber(100) <50)
        {
            setLocation(getX(), getY() + 10);
            
            if(getY() > getWorld().getHeight())
            {
                getWorld().removeObject(this);
            }
        }
    }
}