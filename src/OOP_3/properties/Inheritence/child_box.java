package OOP_3.properties.Inheritence;

public class child_box extends Box { // extends keyword used for inheritence
    int littleBox;
    child_box(){
        super();
    }
    child_box(int l,int h, int w, int s){
        super(l,w,h);
        this.littleBox = s;
    }



}
