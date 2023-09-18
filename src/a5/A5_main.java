package a5;

import java.util.ArrayList;

public class A5_main {

    public static void main (String [] args) {

        Chem a = new Chem('a');
        Chem b = new Chem('b');
        Chem c = new Chem('c');
        Chem d = new Chem('d');

        ArrayList<Chem> vorrat = new ArrayList<>();
        vorrat.add(a);
        vorrat.add(a);
        vorrat.add(c);
        vorrat.add(d);
        vorrat.add(c);
        vorrat.add(d);
        vorrat.add(d);
        vorrat.add(b);
        int [] order = {2,1,0,2};

        Lager lager = new Lager();
        lager.setVorrat(vorrat);
        System.out.println(lager.pickToxin(order));


    }
}
