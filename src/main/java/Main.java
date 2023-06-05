public class Main {

    public static void main(String[] args) {

    Customer customer = new Customer("Koen", "Diepstraten", new VisaCard(100));

    Customer customer2 = new Customer("Carlos", "Garcia", 23, new MasterCard(500));

    customer.printName();
    customer2.printName();

    customer.getCreditCard().pay(200);
    customer2.getCreditCard().pay(200);
    System.out.println(customer.getCreditCard().getDebt());
    System.out.println(customer2.getCreditCard().getDebt());
        customer.getCreditCard().pay(200);
        customer2.getCreditCard().pay(200);
        System.out.println(customer.getCreditCard().getDebt());
        System.out.println(customer2.getCreditCard().getDebt());
        customer.getCreditCard().pay(100);
        System.out.println(customer.getCreditCard().getDebt());
        customer.set
    }

}
