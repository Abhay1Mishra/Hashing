import java.util.HashSet;

public class Hashing {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<Integer>();
        h.add(10);
        h.add(13);
        h.add(14);
        if(h.contains(10)){
            System.out.println("yes");
        }
        else
            System.out.println("No");
        h.remove(10);
        System.out.println(h.isEmpty());
        h.clear();
    }

}