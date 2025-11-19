public class CustomerStatusChecker {
    public static void main(String[] args) {
        int[] customerIds = {101, 205, 309, 412, 578,450};
        String[] statuses = {"Active", "Inactive", "KYC Pending", "Blocked", "Premium","poweruser"};

        int target = 412;
        boolean found = false;

        for(int i = 0; i<customerIds.length;i++){
            if(customerIds[i]==target){
                System.out.println("Customer id: " + customerIds[i]);
                System.out.println("Status: "+statuses[i]);
                found = true;
                break;
            }
        }
        if(!found) {
            System.out.println("Customer not found in the system.");
        }
    }
}
