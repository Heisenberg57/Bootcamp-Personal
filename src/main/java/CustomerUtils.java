public class CustomerUtils {
    public static boolean customerExists(int[] ids,int target){
        for(int id:ids){
            if(id==target){
                return true;
            }
        }
        return false;
    }

    // returns the index of a customer
    public static int getCustomerIndex(int[] ids, int target) {

        for(int i = 0; i < ids.length; i++) {
            if(ids[i] == target) {
                return i;
            }
        }
        return -1; // -1 means "not found"
    }

}
