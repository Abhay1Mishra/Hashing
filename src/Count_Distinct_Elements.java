import java.util.HashSet;
import java.util.Set;

public class Count_Distinct_Elements {
    public static void main(String[] args) {
        int[] a =new int[]{3,2,5,3,52,4,3,5};
        System.out.println(Distinct(a));

    }


    private static int Distinct(int[] a) {
        Set<Integer> set =new HashSet<>();
        for (int j : a) {
            set.add(j);
        }
        return set.size();
    }
}
