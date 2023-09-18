package a6;

public class Springer implements Playable{
    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    private int pos;
    @Override
    public void jump(int i) {
        if(i<= 0){
            this.pos =1;
        } else {
            pos = (int) Math.pow(pos, i);
        }
    }

    @Override
    public void kick(int k) {
        if(k*pos< 0){
            pos = k*pos;
        } else {
            jump(k);
        }
    }

}
