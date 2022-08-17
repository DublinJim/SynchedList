import java.util.Iterator;

public class ThreadDemo extends Thread {

    public void run() {
        Iterator<String> itr = SyncLists.nameList.iterator();
        synchronized (SyncLists.nameList) {
            while (itr.hasNext()) {
                System.out.println("Function " + itr.next());
            }
        }


    }
}
