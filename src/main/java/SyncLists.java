import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyncLists {


    static List<String> nameList = Collections.synchronizedList(new ArrayList<>());

    public static void main(String[] args) {

        ThreadDemo trd1 = new ThreadDemo();
        trd1.start();
        ThreadDemo2 trd2 = new ThreadDemo2();
        trd2.start();
        for (int i = 0; i < 10; i++) {
            nameList.add("Item-" + i);
            //  Thread.sleep(500);
        }

        System.out.println(nameList);
        System.out.println("----------------------------");
    }
}
