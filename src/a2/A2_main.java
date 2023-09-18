package a2;

public class A2_main {

    public static void main(String[] args) {

        String s1 = "66772556776";
        String s2 = "66723423";
        User testUser = new User("1","user1",20);
        User testUser1 = new User("02","Doris",62);
        testUser.checkIdent(s1);
        System.out.println("checked = "+testUser.getChecked());
        testUser.checkIdent(s2);
        System.out.println("checked = "+testUser.getChecked());
        testUser1.setIdent("02");
        System.out.println("toString = "+testUser1.toString());

    }
}
