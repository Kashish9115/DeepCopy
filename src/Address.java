public class Address {


    String city;

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                '}';
    }

    Address(String city) {
        this.city = city;
    }


    // deep copy constructor

    Address(Address other){
  this.city=other.city;
    }
}
