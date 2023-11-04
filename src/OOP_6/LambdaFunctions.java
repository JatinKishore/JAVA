package OOP_6;

import java.util.ArrayList;
import java.util.function.Consumer;

/*Lambda functions are one line functions*/

public class LambdaFunctions {
    public static void main(String[] args) {
        int[] arr = {3,4,52,1};
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<5;i++){
            al.add(i+1);
        }

        al.forEach((item)-> System.out.println(item*2));//lambda function
        Consumer<Integer> fun = (item) -> System.out.println( item*3); // forEach() function is a Consumer<T> type, that it takes only one datatype and returns nothing
        al.forEach(fun);
        Operation sum = (a,b)->a+b;
        Operation sub = (a,b)->a-b;
        Operation mul = (a,b)->a*b;
        Operation div = (a,b)->a/b;

        LambdaFunctions myCal = new LambdaFunctions();

        System.out.println(myCal.operate(11,5,sum));
        System.out.println(myCal.operate(10,5,mul));
        System.out.println(myCal.operate(1,5,sub));
        System.out.println(myCal.operate(0,5,div));


    }
    private int operate(int a, int b, Operation op){
        return op.operation(a,b);
    }
    interface Operation{
        int operation(int a,int b);
    }

}
