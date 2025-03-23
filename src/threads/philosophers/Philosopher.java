package threads.philosophers;

import java.util.concurrent.Semaphore;

class IngestionCounter{
    int counter;
    IngestionCounter(){
        counter = 0;
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
        synchronized (ingestions) {
            try {
                while (num < 3) {
                    System.out.println("Философ " + id + " садится за стол");
                    sleep(500);
                    num++;

                    System.out.println("Философ " + id + " выходит из-за стола");
                    ingestions.counter++;
                    System.out.printf("\nПриемов пищи за столом совершено: %d\n", ingestions.counter);
                    sleep(500);
                }
            } catch (InterruptedException e) {
                System.out.printf("У философa %d проблемы со здоровьем", id);
            }
        }
    }
}
