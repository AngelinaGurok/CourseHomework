package threads.philosophers;

import java.util.concurrent.Semaphore;

public class Solution {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(3);
        for(int i=1;i<6;i++)
            new Philosopher(sem,i).start();
    }
}
