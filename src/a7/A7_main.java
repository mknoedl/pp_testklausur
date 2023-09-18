package a7;
import java.util.Random;

public class A7_main {

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static int[] go(int a, int[] b) {
        if (a == 1) {
            int[] c = new int[20];
            Random random = new Random();
            for (int i = 0; i < c.length; i++) {
                c[i] = b[random.nextInt(b.length)];
            }
            return c;
        } else if (a == 2) {
            int[] c = new int[b.length];

            Random random = new Random();
            for (int i = 0; i < c.length; i++) {
                c[i] = b[i];
            }
            for (int i = c.length; i > 1; i--) {
                swap(c, i - 1, random.nextInt(i));
            }
            return c;
        } else if (a == 3) {
            Random random = new Random();

            int sum = 0;
            for (int i = 0; i < b.length; i++) {
                sum += b[i];
            }
            int[] c = new int[2];
            c[0] = random.nextInt(sum + 1);
            c[1] = random.nextInt(300 - sum + 1) + sum;
            return c;
        }
        return null;
    }
}
