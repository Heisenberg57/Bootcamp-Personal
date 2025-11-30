public class Admin extends  User{

    Admin(){
        super();
        System.out.println("Admin constructor called");
    }

    @Override
    void display(){
        super.display();
        System.out.println("This is admin display method");
    }
}
