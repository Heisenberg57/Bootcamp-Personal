public class CustomerSearch {
    public static void main(String[] args) {
        int[] customerids = {102,202,303,404,505};

        int target =303;
        boolean found = false;

        for(int i =0; i<customerids.length;i++){
            if(customerids[i] == target) {
                System.out.println("Customer found at index: " + i);
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("Customer Not found");
        }

    }
}
