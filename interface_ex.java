interface BiCycle{
    int a = 25;
    void applyBreak(int decrement);
    void speedUp(int increment);
}
class cycle implements BiCycle{
    public void applyBreak(int decrement){
        System.out.println("Applying Break.....");
    }
    public void speedUp(int increment){
        System.out.println("Speeding up....");
    }
}

public class interface_ex {
    public static void main(String[] args) {
        cycle c = new cycle();
        c.applyBreak(2);
        // Can create propertise in Interface
        System.out.println(c.a);
        // Cannot modify the propertise in Interface as they are final
        //c.a = 45; // give Error;
        //System.out.println(c.a);
    }
}
