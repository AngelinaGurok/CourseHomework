package threads.philosophers;

import java.util.concurrent.Semaphore;

class IngestionCounter{
    int counter;
    int freePlace;
    IngestionCounter(){
        counter = 0;
        freePlace = 3;
    }

    public synchronized void sit(){
        while(freePlace < 1){
            try {
                wait();
            } catch (InterruptedException e){
            }
        }
        this.counter++;
        this.freePlace--;
        notifyAll();
    }

    public synchronized void free(){
        while (freePlace >= 1){
            try {
                wait();
            } catch (InterruptedException e){

            }

        }
        this.freePlace = this.freePlace + 1;
        notifyAll();
    }
}
public class Philosopher extends Thread {
    IngestionCounter ingestions;
    int num = 0;
    int id;

    Philosopher(IngestionCounter ingestions, int id){
        this.ingestions = ingestions;
        this.id = id;
    }

    public void run(){
        {
            try {
                while (num < 3) {
                    ingestions.sit();
                    System.out.println("Философ " + id + " садится за стол");
                    num++;
                    sleep(500);

                    System.out.println("Философ " + id + " выходит из-за стола");
                    ingestions.free();
                    sleep(500);
                }
            } catch (InterruptedException e) {
                System.out.printf("У философa %d проблемы со здоровьем", id);
            }
        }
    }
}
