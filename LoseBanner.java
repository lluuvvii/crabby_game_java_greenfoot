import greenfoot.*;  
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class LoseBanner extends Actor
{
    private ScheduledExecutorService executorService;
    private int value;

    public LoseBanner() {
        value = 0;
        executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.scheduleAtFixedRate(() -> countScore(), 0, 1000, TimeUnit.MILLISECONDS);
    }

    public void act()
    {
        countScore();
    }
    
    private void countScore() {
        World world = getWorld();
        CrabWorld crabWorld = (CrabWorld) world;
        Counter counter = crabWorld.counter;

        int[] scoreArray = new int[counter.score];
        
        world.removeObject(counter);

        // menambahkan nilai dalam array berdasarkan ukuran skor
        for (int i = 0; i < counter.score; i++) {
            scoreArray[i] = i + 1;
        }

        if (value < counter.score) {
            setImage(new GreenfootImage("YOU LOSE\n SCORE: " + scoreArray[value], 40, Color.BLACK, new Color(0, 0, 0, 0)));
            value++;
        } else {
            // Jika semua elemen array sudah ditampilkan, hentikan executorService
            executorService.shutdown();
        }
    }
}

