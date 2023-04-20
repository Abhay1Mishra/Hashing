import java.util.HashMap;

public class Distinct_Elements_in_every_Window {
    public static void main(String[] args) {
        int[] a = new int[]{2, 3, 1, 2, 1, 3, 2, 4};
        int window = 4;
        Window(a, window);
    }

    private static void Window(int[] a, int window) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < window; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }
        System.out.println(map.size());
        for (int i = window; i < a.length; i++) {
            if (map.get(a[i - window]) == 1) {
                map.remove(a[i - window]);
            } else
                map.put(a[i - window], map.getOrDefault(a[i - window], 0) - 1);

            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
            System.out.println(map.size());
        }


    }
}
