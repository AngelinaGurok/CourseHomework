package threads.philosophers;

import java.util.concurrent.Semaphore;

public class Solution {
    public static void main(String[] args) {
        IngestionCounter ingestionCounter = new IngestionCounter();
        for(int i=1;i<10;i++)
            new Philosopher(ingestionCounter,i).start();
    }
}
