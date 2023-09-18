package a2;

public class User {
    public static int getNumber() {
        return number;
    }

    public static void setNumber(int number) {
        User.number = number;
    }

    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }

    public void setChecked(int checked) {
        this.checked = checked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private static int number = 0;
    private String ident;

    public int getChecked() {
        return checked;
    }

    private int checked;
    private  String name;
    private int age;

    User(String ident, String name, int age){
        this.ident = ident;
        this.age = age;
        this.name = name;
        number++;
        this.ident = this.ident + number;
    }


    public void checkIdent(String a){
        int num6 = 0;
        int num7 = 0;
        int numElse = 0;

        for(int i=0; i<a.length(); i++){
            if(a.charAt(i) == '6'){
                num6++;
            } else if(a.charAt(i) == '7'){
                num7++;
            } else {
                numElse++;
            }
        }
        if(num6 == num7){
            this.checked = num6;
        } else {
            this.checked = numElse;
        }
    }

    @Override
    public String toString() {
        String reIdent = "";
        if(name == null){
            name = "";
        }
        if (String.valueOf(this.ident).length() == 0) {
            reIdent = "000";
        } else if (String.valueOf(this.ident).length() == 1) {
            reIdent = this.ident + "00";
        } else if (String.valueOf(this.ident).length() == 2) {
            reIdent = this.ident + "0";
        } else {
            reIdent = this.ident.substring(0,3);
        }
        return this.name + ":" + this.age + ":" + reIdent;
    }
}
