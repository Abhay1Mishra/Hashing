import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Union_of_Two_Arrays {
    public static void main(String[] args) {
        int[] a =new int[]{3,2,5,3,52,4,3,5};
        int[] b =new int[]{3,2,5,3,52,4,3,5,2,4,1};
        System.out.println(Union(a,b));
    }

    private static int Union(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();
        for (int element :a){
            set.add(element);
        }
        for (int element1 :b){
            set.add(element1);
        }
        return set.size();
    }
}
