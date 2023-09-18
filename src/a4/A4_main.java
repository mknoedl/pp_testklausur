package a4;

public class A4_main {

    public static void main (String [] args) {

        Worker[] groupB = {};
        Worker[] groupE = {};
        Worker[] groupF = {};

        Worker E = new Worker(groupE);
        Worker F = new Worker(groupF);

        Worker[] groupC = {E,F};

        Worker B = new Worker(groupB);
        Worker C = new Worker(groupC);

        Worker[] groupA = {B,C};

        Worker A = new Worker(groupA);

        System.out.println("Bonus Worker A: "+computeRek(A));
        System.out.println("Bonus Worker B: "+computeRek(B));
        System.out.println("Bonus Worker C: "+computeRek(C));
        System.out.println("Bonus Worker E: "+computeRek(E));
        System.out.println("Bonus Worker F: "+computeRek(F));

    }
        public static int computeRek(Worker w) {
            if(w.getMyGroup().length == 0){
                w.setBonus(500);
                return 500;
            } else {
                int bonus = 500;
                for (int i = 0; i < w.getMyGroup().length; i++) {
                    bonus += computeRek(w.getMyGroup()[i]);
                }
                return bonus;
            }
        }
    }

