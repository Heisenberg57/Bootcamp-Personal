public class Student {
    String name;
    int age;

    //Constructor
    Student(String n, int a){
        this.name = n;
        this.age =a;
    }

    void display(){
        System.out.println(name + " is " + age + " years old ");
    }
}
