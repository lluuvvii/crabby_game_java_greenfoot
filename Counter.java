import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Counter extends Actor
{
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int score = 0;
    public void act()
    {
        UpdateScore();
    }
    public void UpdateScore()
    {
        setImage(new GreenfootImage("SCORE: " + score, 40, Color.BLACK, new Color (0,0,0,0)));
    }
}
