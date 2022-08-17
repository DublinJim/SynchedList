public class Counter {

    int count;

    public synchronized void countUp() {
        count++;
    }

}
