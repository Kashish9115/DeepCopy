

public class Employee {

    String name;
    Address address;
    Employee(String name, Address adress){
        this.name=name;
        this.address=adress;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    //   deep copy constructor
    Employee(Employee other){
        this.name=other.name;
        this.address=new Address(other.address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
