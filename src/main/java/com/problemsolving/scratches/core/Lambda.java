interface A {
    void show(int i);
//    void gettt();
}

//class Some implements A{
//    @Override
//    public void show(){
//        System.out.println("Show");
//    }
//}

class MainClass{
    public static void main(String[] args) {
        A obj;
//        obj = new A(){
//            @Override
//            public void show(int i) {
//                System.out.println("Hi" + i);
//            }
//        };
        obj = (i) -> System.out.println("Show");
        obj.show(1);
    }
}