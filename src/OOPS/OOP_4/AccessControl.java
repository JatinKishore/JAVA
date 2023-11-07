package OOPS.OOP_4;

import java.util.Objects;

/*no modifier is only used within the class and the package
private is used only within the class
public can be accessed in anywhere i.e (Same class, subclass, same package , different package, also different package but not its subclass)
protected can be used anywhere expect different package but not its subclass*/
public class AccessControl {




    @Override
    public int hashCode() {
        return Objects.hash(num, n);
    }

    private int num = 10;
    int n ;

    AccessControl(int N){
        n = N;
    }
    AccessControl(){

    }


    /* private values can be accessed and modified by the subclass and others via using a public method to get it and set its value */

    public int getNum(){
        return num;
    }

    public void setNum(int n){
        this.num = n;
    }

}
