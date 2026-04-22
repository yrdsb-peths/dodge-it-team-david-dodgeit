import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Enemy extends Actor
{       
    public void act()
    {        
        setLocation(getX(), getY() + 6);
        
         if(isTouching(Hero.class)) {
            // add gameover symbol
            getWorld().addObject(new GameOver(), 300, 200);
            getWorld().removeObject(this); 
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