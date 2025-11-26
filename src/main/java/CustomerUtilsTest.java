public class CustomerUtilsTest {
    public static void main(String[] args) {
        int[] customers = {101, 205, 309, 412, 578};

        boolean exists = CustomerUtils.customerExists(customers, 309);
        System.out.println("Exists? " + exists);

        int index = CustomerUtils.getCustomerIndex(customers, 412);
        System.out.println("Found at index: " + index);
    }
}
