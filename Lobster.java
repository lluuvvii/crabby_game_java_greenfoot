import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Lobster extends Actor
{
    World world;
    public void act()
    {
        moveAround();
        eat();
    }
    
    public void moveAround()
    {
        move(4);
        if (Greenfoot.getRandomNumber(100) < 10)
        {
            turn(Greenfoot.getRandomNumber(90 - 45));   
        }
        if (getX() <= 5 || getX() >= getWorld().getWidth() - 5)
        {
            turn(180);
        }
        if (getY() <= 5 || getY() >= getWorld().getHeight() - 5)
        {
            turn(180);
        }
    }
    
    public void eat()
    {
        Actor crab = getOneObjectAtOffset(0, 0, Crab.class);
        if (crab != null)
        {
            world = getWorld();
            world.removeObject(crab);
            Greenfoot.playSound("eating.m4a");
            lose();
        }
    }
    
    public void lose()
    {
        world = getWorld();
        world.addObject(new LoseBanner(), 350, 350);
    }
}
