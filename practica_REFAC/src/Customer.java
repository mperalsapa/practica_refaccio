public class Customer {
    // REFACTOR: convertides les variables a "final",
    // ja que una vegada s'assignen, no necessitem assignar-les un altre cop.
    private final String firstName;
    private final String lastName;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
//        REFACT: canviada la construccio de l'string per fer servir un metode en comptes de crear l'string a ma
//        return firstName + " " + lastName;
        return String.join(" ", firstName, lastName);
    }
}