import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RightButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RightButton extends Actor
{
    /**
     * Act - do whatever the RightButton wants to do. This method is called whenever
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

            // Memanggil metode turnRight pada objek Crab
            crab.turnRight();
        }
    }
}
