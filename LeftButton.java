import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LeftButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LeftButton extends Actor
{
    /**
     * Act - do whatever the LeftButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean isPressed = false;
    public void act()
    {
        if (Greenfoot.mousePressed(this))
        {
            isPressed = !isPressed;
        }

        if (isPressed)
        {
            // Mengambil dunia (world) dan mencari objek Crab
            World world = getWorld();
            Crab crab = (Crab) world.getObjects(Crab.class).get(0);

            // Memanggil metode turnLeft pada objek Crab
            crab.turnLeft();
        }
    }
}
