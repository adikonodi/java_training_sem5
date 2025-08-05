package Polymorphism;

 class India {
    void Capital(){
        System.out .println("India capital is : New Delhi");
    }
}
class USA{
     void Capital(){
        System.out.println("USA capital is : Washington D.C");
     }
}
class DriverCode{
     public static void main(String[] args) {
         India ind = new India();
        USA usa= new USA();

ind.Capital();
usa.Capital();
     }
}