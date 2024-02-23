class Car {
    String name;
    double price;
    int year;

    public Car(String name, double price, int year) {
        this.name = name;
        this.price = price;
        this.year = year;
    }

    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }
}