import java.util.*;

public class ColectionDemo {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        Vector v = new Vector();
        Random rd = new Random();
        for (int i = 1; i <= 10; i++) {
            ar.add(rd.nextInt(30));
            v.add(rd.nextInt(30));
        }
        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));
        }
        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }
        Iterator iter = ar.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        Iterator iter2 = v.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        
//        System.out.println("ar= "+ar);
//        System.out.println("v= "+v);
        boolean dis = Collections.disjoint(ar, v);
        System.out.println("ar and v disjunct: "+dis);
        
        Collections.addAll(v, ar.toArray());
        System.out.println("After adding, v = "+v);
        
        int minVal = (int)Collections.min(v);
        int maxVal = (int)Collections.max(v);
        System.out.println("min= "+minVal+"," +"max= "+maxVal);
        
        int fre = Collections.frequency(v, 8);
        System.out.println("Occurences of 8: "+fre);
        
        Collections.sort(v);
        System.out.println("After sorting, v = "+v);
        
        int pos = Collections.binarySearch(v, 8);
        System.out.println("Position of 8: "+pos);
        
        Collections.shuffle(v);
        System.out.println("After shuffle, v = "+v);
        
        Collections.fill(v, 9);
        System.out.println("After replacing, v = "+v);
    }
}
