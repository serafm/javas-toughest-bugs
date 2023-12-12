public class Main {
  public static void main(String[] args) {
    Address address = new Address("New York City");
    User user = new User("Kathryn", address);
    user.setAddress(address);

    // Potential Null Pointer Exception!
    if (user.getAddress() != null) {
      String city = user.getAddress().getCity();
      System.out.println("City: " + city);
    }
  }
}

class User {
  private String name;
  private Address address;

  public User(String name, Address address) {
    this.name = name;
    this.address = address;
  }

  public Address getAddress() {
    return this.address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }
}

class Address {
  private String city;

  public Address(String city) {
    this.city = city;
  }

  public String getCity() {
    return city;
  }
}
