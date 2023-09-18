package a6;

public class A6_main {

    public static void main (String [] args) {

        Springer test = new Springer();
        test.setPos(2);
        test.kick(-1);
        System.out.println(test.getPos());
        test.setPos(2);
        test.kick(3);
        System.out.println(test.getPos());

    }
}
