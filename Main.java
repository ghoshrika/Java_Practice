// Access Private Variable using getter and setter method......

class Test{
    // Take private variables
    private String name;
    private int age;

    //Initialize variables 
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    //Access name and age
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}

class Main{
    public static void main(String[] args) {
        // Create object of Test
        Test test = new Test();

        // Set values of age and name
        test.setName("Rika");
        test.setAge(24);

        // Get values of age and name
        System.out.println("Name:: "+ test.getName());
        System.out.println("Age:: "+ test.getAge());
    }
}