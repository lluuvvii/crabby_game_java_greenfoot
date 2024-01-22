import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Crab extends Actor
{
    public void act()
    {
        moveAndTurn();
        eat();
    }
    
    public void moveAndTurn()
    {
        move(4);
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            turn(3);
        }
    }
    
    public void eat()
    {
        Actor worm = getOneObjectAtOffset(0, 0, Worm.class);
        World world = getWorld();
        CrabWorld crabWorld = (CrabWorld)world; // casting the parent class to subclass based on receive object
        Counter counter = crabWorld.counter;
        Lobster lobster = new Lobster();
        if (worm != null)
        {
            world.removeObject(worm);
            world.addObject(worm, Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(700));
            Greenfoot.playSound("eating.m4a");
            counter.score += 10;
            if (counter.score % 50 == 0)
            {
                world.addObject(lobster, Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(700));
            }
        }
    }
}
