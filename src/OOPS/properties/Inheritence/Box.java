package OOPS.properties.Inheritence;

public class Box {
    int l;
    int h;
    int w;

    Box(int l , int h, int w){
        this.l = l;
        this.h = h;
        this.w = w;
    }
    Box(){
        this(1,2,3);
    }

    Box(Box old){
        this.l = old.l;
        this.w = old.w;
        this.h  = old.h;
    }


}
