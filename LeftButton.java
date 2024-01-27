import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

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
    public void act()
    {
        if (Greenfoot.mouseDragged(this))
        {
            World world = getWorld();
            List<Crab> crabs = world.getObjects(Crab.class);

            // Periksa apakah daftar tidak kosong sebelum mengakses elemennya
            if (!crabs.isEmpty()) {
                Crab crab = crabs.get(0);
                crab.turnLeft();
            }
        }
    }
}
