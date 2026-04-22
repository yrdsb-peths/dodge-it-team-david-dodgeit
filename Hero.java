import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Hero extends Actor
{
    boolean atTop = true;
    
    public void act()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        
        if(mouse != null)
        {
            setLocation(mouse.getX(), mouse.getY());
        }
    }
}
