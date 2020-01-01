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

    }


}
