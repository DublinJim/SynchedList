import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

    public static void main(String[] args) {

        List<String> namesList;
        namesList = Collections.synchronizedList(new ArrayList<>());

        namesList.add("Bob");
        namesList.add("Bill");
        namesList.add("May");
        namesList.add("John");
        namesList.add("Paddy");

        Iterator<String> iteratorObj = namesList.iterator();

        while (iteratorObj.hasNext()) {
            System.out.println(iteratorObj.next());
        }
        CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<>();
        empList.add("June");
        empList.add("May");
        empList.add("April");
        empList.add("Sept");

        Iterator<String> iteratorObj2 = empList.iterator();
        System.out.println(" copyOnWriteArrayList");
        while (iteratorObj2.hasNext()) {
            System.out.println(iteratorObj2.next());
        }
    }
}
