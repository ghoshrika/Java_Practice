class Employee{
    int id;
    String name;
    int Salary;
    public void printDetails(){
        System.out.println("Id is: " + id);
        System.out.println("Name is: " + name);
    }
    public int getSalary(){
        System.out.println("Salary: " + Salary);
        return Salary;
    }
}

public class create_custom_class {
    public static void main(String[] args) {
        System.out.println("This is Custom Class");
        Employee emp1 = new Employee(); //Instantiating a new Employee object
        Employee emp2 = new Employee(); //Instantiating another new Employee object

        //Setting attributes for emp1
        emp1.id = 10;
        emp1.name = "Ram";
        emp1.Salary = 25000;

        //Setting attributes for emp2
        emp2.id = 12;
        emp2.name = "Shyam";
        emp2.Salary = 30000;

        emp1.printDetails();
        emp1.getSalary();
        emp2.printDetails();
        emp2.getSalary();
    }
}
