//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {




        Address address=new Address("Mumbai");
        Employee employee=new Employee("Rahul", address);
        Employee e2=new Employee(employee);
        System.out.println(employee.getAddress());

        System.out.println(e2.getAddress());
        e2.setAddress(new Address("pune"));
        System.out.println(e2.getAddress());
        System.out.println(employee.getAddress());


    }
}