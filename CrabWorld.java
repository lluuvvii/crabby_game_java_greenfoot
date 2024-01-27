import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class CrabWorld extends World
{
    /**
     * Constructor for objects of class CrabWorld.
     * 
     */
    Counter counter = new Counter();
    public CrabWorld()
    {    
        super(700, 700, 1);
        prepare();
        addObject(counter, 90, 30);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab = new Crab();
        addObject(crab,344,337);
        Worm worm = new Worm();
        addObject(worm,486,222);
        Worm worm2 = new Worm();
        addObject(worm2,162,488);
        Worm worm3 = new Worm();
        addObject(worm3,155,207);
        Worm worm4 = new Worm();
        addObject(worm4,285,437);
        Worm worm5 = new Worm();
        addObject(worm5,645,669);
        Lobster lobster = new Lobster();
        addObject(lobster,447,520);
        LeftButton leftButton = new LeftButton();
        addObject(leftButton,200,620);
        RightButton rightButton = new RightButton();
        addObject(rightButton,500,620);
    }
}
