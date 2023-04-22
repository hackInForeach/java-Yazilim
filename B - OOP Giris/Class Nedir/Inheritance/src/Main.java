public class Main {
    public static void main(String[] args) {
        //Inheritance : iki nesne arasında miras bırakmaktır.

        Customer customer = new Customer();
        customer.id = 1;
        customer.firstName = "Doğukan";
        customer.lastName = "Öztürk";
        customer.age = 30;
        customer.email = "asdasdadsa@gmail.com";


        Employe employe = new Employe();
        employe.id = 2;
        employe.firstName = "Doğukan1";
        employe.lastName = "Öztürk1";
        employe.age = 301;
        employe.salary = 900000;

        CustomerManager customerManager = new CustomerManager();
        customerManager.add();
        customerManager.list();

        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.bestEmployee();
        employeeManager.add();
        employeeManager.list();



    }
}