package Threadpool;
import java.util.concurrent.Callable;
public class NumberGenerator implements Callable<Integer>{
    int input;
    NumberGenerator(int input){
        this.input=input;
    }
    @Override
    public Integer call() throws Exception{
        System.out.println("Number :"+input*5+" in Thread :"+Thread.currentThread().getName());
        return input*5;
    }
}
