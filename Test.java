class Parent{
    void m1(){
        System.out.println("Parent Class- m1 method");
    }
    void m2(){
        System.out.println("Parent Class- m2 method");
    }
}
class Child extends Parent{
    void m3(){
        System.out.println("Child Class- m3 method");
    }
}
class Name{
    public static void main(String[] args) {
       Parent p1=new Parent();
       p1.m1();
       p1.m2();
       //p1.m3();
       Child c1=new Child();
       c1.m1();
       c1.m2();
       c1.m3();
       Parent c2=new Child();
       c2.m1();
       c2.m2();
       //c2.m3();
       //Child p2=new Parent();
    }
}