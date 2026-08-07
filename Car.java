class Car {

    String brand;
    String model;
    int year;

    void displayDetails() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Year  : " + year);
    }

    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();

        car1.brand = "Toyota";
        car1.model = "Camry";
        car1.year = 2024;

        car2.brand = "Honda";
        car2.model = "City";
        car2.year = 2025;

        System.out.println("Car 1 Details");
        car1.displayDetails();

        System.out.println();

        System.out.println("Car 2 Details");
        car2.displayDetails();
    }
}