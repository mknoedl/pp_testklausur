package a4;

public class Worker {
    private int bonus;
    private boolean  hasRec;
    private Worker[] myGroup;

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public boolean isHasRec() {
        return hasRec;
    }

    public void setHasRec(boolean hasRec) {
        this.hasRec = hasRec;
    }

    public Worker[] getMyGroup() {
        return myGroup;
    }

    public void setMyGroup(Worker[] myGroup) {
        this.myGroup = myGroup;
    }

    public Worker(Worker[] myGroup){
        this.myGroup = myGroup;
        if(myGroup.length>0){
            this.hasRec=true;
        } else {
            this.hasRec=false;
        }

    }

}
