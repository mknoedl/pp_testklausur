package a3;

import java.util.Arrays;

public class A3_main {

    public static void main(String[] args) {
        Heft heft1 = new Heft();
        Karo karo1 = new Karo();
        Stift stift1 = new Stift();
        Karo karo2 = new Karo();
        Heft heft2 = new Heft();
        Schreibware schreibware = new Schreibware();

        Schreibware [] a = {heft1, karo1, stift1, karo2, heft2, schreibware};

        System.out.println(Arrays.toString(count(a)));
    }

    public static int[] count(Schreibware[] a) {
        int[] c = new int[4];
        for (int i = 0; i < a.length; i++) {
            if(a[i] instanceof Schreibware){
                c[0]++;
                if(a[i] instanceof Heft){
                    c[2]++;
                    if(a[i] instanceof Karo){
                        c[3]++;
                    }
                } else if( a[i] instanceof Stift){
                    c[1]++;
                }
            }
        }
        return c;
    }
}
