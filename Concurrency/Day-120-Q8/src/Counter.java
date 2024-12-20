public class Counter {
    private int count;

    public Counter(int n){
        this.count=n;
    }

    synchronized public void incValue(int offset)
    {
        count+=offset;
    }
    synchronized public int getValue()
    {
        return count;
    }

    synchronized public void decValue(int offset){
        count-=offset;
    }

}
