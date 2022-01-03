package model;

public class Student {
    String name;
    String surname;
   String city;

    public Student(String name, String surname, String gender) {
        this.name = name;
        this.surname = surname;
        this.city = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + city + '\'' +
                '}';
    }
}