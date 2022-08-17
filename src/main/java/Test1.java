public class Test1 {

    public static void main(String[] args) throws Exception {

        Counter ctr = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 2000; i++) {
                ctr.countUp();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                ctr.countUp();
            }
        });

        t1.start();
        t2.start();
       t1.join();
        t2.join();

        System.out.println("Counter is at " + ctr.count);

    }
}
