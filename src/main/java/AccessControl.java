public class AccessControl {
    public static void main(String[] args) {
        String role = "manager";

        if (role.equals("admin")){
            System.out.println("Full Access Granted");
        }
        else if (role.equals("manager")){
            System.out.println("Limited Access Granted");
        }

        else if(role.equals("guest")){
            System.out.println("View Only Access");
        }

        else {
            System.out.println("Invalid Role");
        }
    }
}
