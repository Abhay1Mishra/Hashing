import java.util.HashSet;
import java.util.Set;

public class Intersection_of_Two_Unsorted_Arrays {
    public static void main(String[] args) {
        int[] a = new int[]{3, 2, 4};
        int[] b = new int[]{2, 9, 1};
        System.out.println(Intersection(a, b));
    }

    private static int Intersection(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for (int x : a) {
            set.add(x);
        }
        for (int x : b) {
            if (set.contains(x))
                count++;
            set.remove(x);
        }
        return count;
    }
}
