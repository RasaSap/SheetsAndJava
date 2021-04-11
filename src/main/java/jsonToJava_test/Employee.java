package jsonToJava_test;

import java.util.List;

public class Employee {

     int id;
     List<String> firstName;
     String lastName;
     String email;
     EmployeeAddress address;

     public Employee(int id, List<String> firstName, String lastName, String email, EmployeeAddress address) {
          this.id = id;
          this.firstName = firstName;
          this.lastName = lastName;
          this.email = email;
          this.address = address;
     }

     public int getId() {
          return id;
     }

     public void setId(int id) {
          this.id = id;
     }

     public List<String> getFirstName() {
          return firstName;
     }

     public void setFirstName(List<String> firstName) {
          this.firstName = firstName;
     }

     public String getLastName() {
          return lastName;
     }

     public void setLastName(String lastName) {
          this.lastName = lastName;
     }

     public String getEmail() {
          return email;
     }

     public void setEmail(String email) {
          this.email = email;
     }

     public EmployeeAddress getAddress() {
          return address;
     }

     public void setAddress(EmployeeAddress address) {
          this.address = address;
     }

     @Override
     public String toString() {
          return "Employee{" +
                  "id=" + id +
                  ", firstName=" + firstName +
                  ", lastName='" + lastName + '\'' +
                  ", email='" + email + '\'' +
                  ", address=" + address +
                  '}';
     }
}
