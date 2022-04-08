package ru.skypro;

public class Employee {
    int id;
    String firstName;
    String middleName;
    String lastName;
    int depNum;
    double sallary;
    static int counter;



    public  Employee   ( String lastName, String firstName, String middleName, double sallary, int depNum ) {
         this.id = getCounter();
         this.firstName = firstName;
         this.middleName = middleName;
         this.lastName = lastName;
         this.sallary = sallary;
         this.depNum = depNum;
     }

    public static int getCounter() {
        Employee.counter = counter;
        return counter++;

    }

    public int getId() {
        return id;

    }

    public String getFirstName() {
        return firstName;

    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSallary() {
        return sallary;
    }
    public int getDepNum(){
        return depNum;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setId(int id) {
        this.id = id;
    }
    /*
    }public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }*/

    public void setSallary(int sallary) {
        this.sallary = sallary;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sallary=" + sallary +
                ", depNum=" + depNum +
                '}';
    }




    public static void printEmployeelist(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                break;
            }
        }
    }



}


