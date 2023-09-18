package a5;

import java.util.Objects;

public class Chem {
    private char name;

    public char getName() {
        return name;
    }

    public Chem(char name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chem chem = (Chem) o;
        return name == chem.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public void setName(char name) {
        this.name = name;
    }
    @Override
    public String toString(){
        return String.valueOf(getName());
    }

}
