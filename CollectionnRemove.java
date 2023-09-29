/*ArrayList and LinkedList remove() methods in Java with Examples
Input
        [Coding, is, Fun], Element to be removed – “is”
Output
        [Coding, Fun]
        */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionnRemove {
    public static void main(String[] args) {

//using ArrayList
        List <String> o=new ArrayList<String>();
        o.add("coding");
        o.add("is");
        o.add("fun");
        System.out.println("the Original of ArrayList is statement :"+o);
        o.remove(2);
        System.out.println("the Modified of ArrayList is statement :"+o);

//using LinkedList
        List <String> l=new LinkedList<String>();
        l.add("coding");
        l.add("is");
        l.add("fun");
        System.out.println("the Original of LinkedList is statement :"+l);
        o.remove("is");
        System.out.println("the Modified of LinkedList is statement :"+l);
    }
}
