package OOP_6;
//        ArrayList list = new ArrayList();
//        list.add(45 );
//        list.remove(0);
//        list.get(0);
//        list.set(1,62789);
//        list.size();
//        list.isEmpty();
import java.util.*;
public class WildCard<T extends  Number> {//this will only accept sub objects that are of type Number wont accpet string , booleans and so on

    private Object[] data;
    private static  int DEFAULT_SIZE=10 ;
    public void getLis(List<? extends  Number/*This accepts all the subclasses of Number class .This is known as WildCard Bound*/> list){

    }


    private  int size = 0;
    public WildCard(){
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }
    private  boolean isFull(){
        return size == data.length;
    }
    private void resize(){
        Object[] temp = new Object[data.length * 2];

        //copy the current items in the new array
        for(int i=0;i<data.length;i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    public T remove(){
        T removed = (T) data[--size];
        return removed;
    }
    public T get(int index){
        return (T) data[index];
    }

    public int size(){
        return size;
    }
    public void set(int index, T value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArrayList<Integer> list = new CustomArrayList();
        list.add(3);
        list.add(9);
        System.out.println(list);
    }

}
