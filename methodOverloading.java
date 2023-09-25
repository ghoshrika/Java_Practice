// Example of Polymorphism(Compile Time Polymorphism)

class operation{
    //method 1
    static int multiply(int a, int b){
        return a*b;
    }
    /*
    //method 2 same method with 3 parameters
    static int multiply(int a, int b, int c){
        return a*b*c;
    }
     */
    
    // Use same method with Double parameters
    static double multiply(double m, double n){
        return m*n;
    }
}

public class methodOverloading {
    public static void main(String[] args) {
        // calling method by passing arguments
        System.out.println("Method 1:: " + operation.multiply(5,2));
        //System.out.println("Method 2:: " + operation.multiply(5,2,4));
        System.out.println("Method 2:: " + operation.multiply(2.4,3.5));
    }
}
