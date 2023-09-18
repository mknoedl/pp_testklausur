package a5;

import java.util.ArrayList;

public class Lager {
    public ArrayList<Chem> getVorrat() {
        return vorrat;
    }

    public void setVorrat(ArrayList<Chem> vorrat) {
        this.vorrat = vorrat;
    }

    public ArrayList<Chem> vorrat;


    public ArrayList<Chem> pickToxin(int[] order) {
        ArrayList<Chem> ausgabe = new ArrayList<>();
        char start = 'a';
        for (int i = 0; i < 4; i++) {
            pickToxin(order[i],(char)(start+i), ausgabe);
        }
        return ausgabe;
    }

    public void pickToxin(int number, char c, ArrayList<Chem> ausgabe) {
        for (int i = 0; i < number; i++) {
            Chem chem = new Chem(c);
            if(chem.getName() == c) {
                boolean remove = vorrat.remove(chem);
                if (remove) {
                    ausgabe.add(chem);
                }
            }
        }
    }

}
