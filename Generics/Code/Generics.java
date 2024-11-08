//generic class;
class Box<T>{
    T value;
    public Box(T value) {
        this.value = value;
    }
    public void showVal(){
        System.out.println("The value is: "+value);
    }
}

//generic method

public class Generics{
    //generic method
    public static <T> void printArray(T[] arr){
        for(T ele:arr){
            System.out.println(ele);
        }
    }
    public static void main(String[] args){
        Box<Integer> myBox = new Box<>(123);
        myBox.showVal();

        Box<String> myBox1 = new Box<>("hello");
        myBox1.showVal();

        Integer[] arr = {1,2,3,4};
        printArray(arr);
    }
}
