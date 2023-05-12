public class Human {
    // REFACTOR: convertides les variables a "final",
    // ja que una vegada s'assignen, no necessitem assignar-les un altre cop.
    private final String name;
    private final String age;
    private final String country;
    private final String city;
    private final String street;
    private final String house;
    private final String quarter;

//    REFACTOR: afegit constructor de classe
    public Human(String name, String age, String country, String city, String street, String house, String quarter) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
        this.quarter = quarter;
    }

    public String obtenirAdrecaCompleta() {
//        REFACT: simplificada la construccio de l'string que retorna la funcio
//        StringBuilder result = new StringBuilder();
//        return result.append(country)
//                .append(", ")
//                .append(city)
//                .append(", ")
//                .append(street)
//                .append(", ")
//                .append(house)
//                .append(" ")
//                .append(quarter).toString();
        return String.join(", ", country, city, street, house, quarter);
    }
//    REFACTOR: Generats els getters per nom i edat
    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }
}