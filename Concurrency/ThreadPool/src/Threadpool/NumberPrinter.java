package Threadpool;

public class NumberPrinter implements Runnable{
    private int noToPrint;

    NumberPrinter(int noToPrint){
        this.noToPrint=noToPrint;
    }

    @Override
    public void run() {
        System.out.println("Number :"+noToPrint+" in Thread :"+Thread.currentThread().getName());
    }
}
