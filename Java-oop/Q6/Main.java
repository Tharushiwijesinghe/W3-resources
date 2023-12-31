public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("H.W.Wijesinghe","HR Manager",50000);
        Employee employee2 = new Employee("G.D.R.Sandaru","Software Engineer",70000);
        System.out.println("\nEmployee Details: ");
        employee1.printEmployee();
        employee2.printEmployee();

        employee1.totalSalary(9);
        employee2.totalSalary(12);

        System.out.println("\nAfter raising salary:");
        System.out.println("\n9% for 'H.W.Wijesinghe':");
        employee1.printEmployee();
        System.out.println("\n12% for 'G.D.R.Sandaru' ");
        employee2.printEmployee();

    }
}
