package com.problemsolving.scratches.core;

class Class1 {
//    public Class1(){
//        System.out.println("From Class1");
//    }
void print(){
    System.out.println("From Class1");
}
}

interface intSome{
    void getSome();
    default void getAnother(){
        System.out.println("hi");
    }
}

class Some implements intSome{

    @Override
    public void getSome() {

    }
}

abstract class AbstractSome{
    public abstract String get();
    public boolean isEmpty(){
        return get() == null;
    }
}

class StringSome extends AbstractSome{
    public String get(){
        return null;
    }
}
class Class1a extends Class1{
//    public Class1a(){
//        System.out.println("From Class1a");
//    }
public void print(){
    System.out.println("From Class1a");
}
}

class Class2 extends Class1a{
    public void print(){
        System.out.println("From Class2");
    }
}

class Class3 extends Class2{
    public void print(){
        System.out.println("From Class3");
    }
}

class TestQn extends Class3{
    public static void main(String[] args) {
        Class1a class3 = new Class3();
        class3.print();
//        String s = "5";
//        System.out.println(1+10+s+1+10);
//        String s= "hi";
//        String s1 = new String("hi");
//        String s2 = "hi";
//        if(s1.equals(s)){
//            System.out.println("s1 and s are equal");
//        } else{
//            System.out.println("s1 and s are not equal");
//        }
//        if(s2 == s){
//            System.out.println("s2 and s are equal");
//        } else{
//            System.out.println("s2 and s are not equal");
//        }
    }
}