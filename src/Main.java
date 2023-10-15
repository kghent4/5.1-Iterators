import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Main {
    public static void main(String [] args){
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(4);
        al.add(1);
        al.add(200);
        al.add(-3);

        Queue<Integer> q = new LinkedList<Integer>();
        q.add(9);
        q.add(-30);
        q.add(40);
        q.add(2);
        q.add(1);

        Set<Integer> hs = new HashSet<Integer>(); 
        hs.add(14); 
        hs.add(700); 
        hs.add(30); 
        
        printElements(al);
        printElements(q);
        printElements(hs);
    }

    public static void printElements(Collection<Integer> c){
        //Your code here
    }
}
