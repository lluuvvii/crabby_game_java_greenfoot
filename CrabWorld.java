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
        addObject(crab,269,298);
        Worm worm = new Worm();
        addObject(worm,323,406);
        worm.setLocation(317,400);
        worm.act();
        crab.setLocation(254,295);
        worm.setLocation(321,404);
        worm.setLocation(321,404);
        crab.setLocation(261,310);
        crab.eat();
        Worm worm2 = new Worm();
        addObject(worm2,465,241);
        Worm worm3 = new Worm();
        addObject(worm3,317,192);
        Worm worm4 = new Worm();
        addObject(worm4,181,122);
        Worm worm5 = new Worm();
        addObject(worm5,125,396);
        Worm worm6 = new Worm();
        addObject(worm6,353,82);
        Worm worm7 = new Worm();
        addObject(worm7,466,455);
        Worm worm8 = new Worm();
        addObject(worm8,128,497);
        Worm worm9 = new Worm();
        addObject(worm9,67,226);
        Lobster lobster = new Lobster();
        addObject(lobster,422,357);
        Lobster lobster2 = new Lobster();
        addObject(lobster2,393,294);
        Lobster lobster3 = new Lobster();
        addObject(lobster3,134,151);
        removeObject(worm);
        removeObject(worm8);
        worm3.setLocation(315,178);
        removeObject(worm3);
        worm6.setLocation(362,84);
        removeObject(worm6);
        removeObject(lobster);
        removeObject(lobster2);
    }
}
