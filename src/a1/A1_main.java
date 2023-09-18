package a1;

public class A1_main {

    public static void main(String[] args) {

        int [] a1 = new int[]{8, 5, 8, 7, 3};
        int [] b1 = new int[]{4,3,3,5,8};
        int [] b2 = new int[]{6,3,4,7,8,7,1};
        int [] b3 = new int[]{2,3,4,0,8,-7,1};

        System.out.println(java.util.Arrays.toString(findDiff(2,a1,b1)));
        System.out.println(java.util.Arrays.toString(pick(7,b2)));
        System.out.println(java.util.Arrays.toString(pick(7,b3)));
    }

    public static int[] findDiff(int z, int[] a, int[] b) {
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= z * b[i]) {
                c[i] = 1;
            } else {
                c[i] = 0;
            }
        }
        return c;
    }

    public static int[] pick(int a, int[] b) {
        for (int i = 0; i < b.length; i++) {
            if (b[i] == a) {
                b[i] = 0;
                for (int j = 0; j < i; j++) {
                    b[i] += b[j];
                }
                return b;
            }
        }
        for (int i = 0; i < b.length; i++) {
            b[i]--;
        }

        return b;
    }
}
