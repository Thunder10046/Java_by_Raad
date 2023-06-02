package CSE1204;

interface FI{ 
    public void myMethod(); // interface method 
    } 
   interface SI {
    public void myOtherMethod(); // interface method 
   } 
   class DemoClass implements FI, SI { 
   public void myMethod() {
   System.out.println("From FI"); 
   } 
   public void myOtherMethod() {
   System.out.println("From SI"); 
   } 
   } 
   public class Fourth {
   public static void main(String[] args) {
   DemoClass myObj = new DemoClass();
    myObj.myMethod();
    myObj.myOtherMethod();
   } 
}