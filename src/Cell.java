import java.util.ArrayList;

public class Cell {
    public int strength;
    public int x;
    public int y;
    public int id;

    public void setStrength(int strength){
        if (strength>=1){
            this.strength=strength;
        }else {
            this.strength=0;
        }
    }

    public void setx(int x){
        if (x>=0){
            this.x=x;
        }else {
            this.x=0;
        }
    }

    public void sety(int y){
        if (y>=0){
            this.y=y;
        }else {
            this.y=0;
        }
    }
    public void setid(int id){
        if (id>=0){
            this.id=id;
        }else {
            this.id=0;
        }
    }

    public int getStrength(){
        return this.strength;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public int getId(){
        return this.id;
    }

    public Cell() {
        strength = 0;
        id = 0;
        x = 0;
        y = 0;

    }

    public Cell (int strength, int x, int y,int id) {
        this.strength = strength;
        this.x = x;
        this.y=y;
        this.id = id;

    }

    public void interactNeighbors (ArrayList<Cell> neighbors) {

    }

}
