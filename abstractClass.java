// Understanding working of Abstract Class and Abstract Method. 

abstract class Base{
    public Base(){
        System.out.println("Constructor of Base Class");
    }
    public void sayHello(){
        System.out.println("Hello!");
    }
    abstract public void greet();
}

class Derived extends Base{
    public void greet(){
        System.out.println("Good Morning!");
    }
}
// After extends an Abstract Class we have to override the method of abstract class
// class d1 extends Base--- This will through an error
abstract class d1 extends Base{
    public void dd(){
        System.out.println("hiiii");
    }
}

public class abstractClass {
    public static void main(String[] args) {
        // Base b = new Base(); ---> Through Error. We cannot create an object of Abstract Class
        Derived d = new Derived();
        //d1 e = new d1();  ---> Through Error. also we cannot do this.
    }
}
