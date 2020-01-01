public class ExploringMemoryApplication {

    public static void calculate(int calcValue) {
        calcValue = calcValue * 100;
    }

    public static void renameCustomer(Customer customer2) {
        customer2.setName("Ron");
    }

    public static void main(String[] a) {
        int localValue = 5;
        calculate(localValue);
        // passes a copy of the value, therefore, pass by value
        // pass by reference not possible
        System.out.println("local value: " + localValue); // prints 5

        Customer customer1 = new Customer();
        customer1.setName("John");
        renameCustomer(customer1);
        System.out.println("customer name: " + customer1.getName());

        final Customer finalCustomer = new Customer();
        finalCustomer.setName("Final Customer");
        renameCustomer(finalCustomer);
        System.out.println("Final customer name: " + finalCustomer.getName());
    }


}
