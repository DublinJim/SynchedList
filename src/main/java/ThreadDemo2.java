import java.util.Iterator;

public class ThreadDemo2 extends Thread {

    public void run() {
        for (int i = 0; i <5 ; i++) {
            SyncLists.nameList.add("Temp "+i);

        }


    }
}
