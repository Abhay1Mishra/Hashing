import java.util.HashMap;

public class Find_SubArray_with_the_given_sum {
    public static void main(String[] args) {
        int[] a = new int[]{10, 15, -5, 15, -10, 5};
        int sum = 5;
        SubArraySum(a, sum);
    }

    private static void SubArraySum(int[] a, int sum) {
        int cur_sum = 0;
        int start = 0;
        int end = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            cur_sum += a[i];
            if (cur_sum == sum) {
                end = i;
                start = 0;
                break;
            }
            if (map.containsKey(cur_sum - sum)) {
                start = map.get(cur_sum - sum) + 1;
                end = i;
                break;
            }
            map.put(cur_sum, i);

        }
        if (end == -1) {
            System.out.println("Not present");
        } else
            System.out.println(start + " " + end);

    }
}
