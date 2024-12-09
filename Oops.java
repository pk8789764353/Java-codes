
public class Oops {
    public static void main(String args[])
    {
        Student ram=new Student("ram",9,55);
        ram.display();
        
    }

}

class Student {

    String name;
    int roll;
    int tmarks;

    Student(String name, int roll, int tmarks) {
        this.name = name;
        this.roll = roll;
        this.tmarks = tmarks;
    }

    void display() {
        System.out.println(name + " " + roll + " " + tmarks);
    }

};
