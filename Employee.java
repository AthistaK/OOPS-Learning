class Employee {

    int empId;
    String empName;
    double salary;

    void setDetails(int id, String name, double sal) {
        empId = id;
        empName = name;
        salary = sal;
    }

    void displayDetails() {
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Salary        : " + salary);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.setDetails(101, "Rahul", 45000);
        e2.setDetails(102, "Priya", 52000);

        System.out.println("Employee 1 Details");
        e1.displayDetails();

        System.out.println();

        System.out.println("Employee 2 Details");
        e2.displayDetails();
    }
}