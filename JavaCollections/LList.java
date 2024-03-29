package JavaCollections;

import java.util.LinkedList;
import java.util.List;

public class LList {
    public static void main(String[] args) {
        List<String> nameList = new LinkedList<String>();
        nameList.add("Hale");
        nameList.add("Jale");
        nameList.add("Lale");
        nameList.add("Ahmet");
        nameList.add("Mehmet");
        nameList.add("Kemal");
 
        // get ile listeden eleman okuması yapılır. Okunan eleman listeden çıkartılmaz.
        System.out.println("Element of 2 index: " + nameList.get(2));

    }
}
