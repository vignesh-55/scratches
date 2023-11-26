import java.util.ArrayList;
import java.util.List;

class Generic<T>{
    T value;
    public void setValue(T value){
        this.value = value;
    }

    public T getValue(){
        return this.value;
    }
}

class OverloadingKaleris{
    public static void main(String[] args) {
        ArrayList<Generic> al = new ArrayList<>();
        Generic<?> g1 = new Generic<Integer>();
        Generic<?> g2 = new Generic<>();
//        try{
//            int i = Integer.parseInt("s");
//            System.out.println(i);
//        } catch (Exception e){
//            e.printStackTrace();
//        } finally {
//            System.out.println("Finally");
//        }

//        int x = 5;
//        int y = x++;
//        int z = ++y;
//        System.out.println(z);
    }
//    public void foo(ArrayList<String> str){
//
//    }
//    public void foo(ArrayList<Integer> str){
//
//    }
//
//    public ArrayList<String> foo(ArrayList<String> str){
//        return new ArrayList<>();
//    }
//
//    private void foo(List<String> str){
//
//    }
//
//    public void foo(ArrayList<String> str, boolean isData){
//
//    }
}