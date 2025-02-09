package threads.philosophers;

import java.util.concurrent.Semaphore;

public class Philosopher extends Thread {
    Semaphore freePlace;
    int num = 0;
    int id;

    Philosopher(Semaphore place, int id){
        this.freePlace = place;
        this.id = id;
    }

    public void run(){
        try {
            while (num < 3){
                freePlace.acquire();
                System.out.println("Философ " + id + " садится за стол");
                sleep(500);
                num++;

                System.out.println ("Философ " + id+" выходит из-за стола");
                freePlace.release();
                sleep(500);
            }
        }
        catch (InterruptedException e){
            System.out.printf("У философa %d проблемы со здоровьем", id );
        }
    }
}
