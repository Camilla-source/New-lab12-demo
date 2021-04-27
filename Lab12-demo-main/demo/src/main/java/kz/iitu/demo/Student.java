package kz.iitu.demo;

import javax.persistence.*;

@Entity(name="Student")
@Table(name="student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", updatable = false)
    private long id;

    @Column(name="first_name", nullable = false, columnDefinition = "TEXT")
    private String firstName;

    @Column(name="second_name", nullable = false, columnDefinition = "TEXT")
    private String secondName;

    @Column(name="email", nullable = false, columnDefinition = "TEXT")
    private String email;

    @Column(name="age", nullable = false)
    private int age;

    public Student() {}

    public Student(String firstName, String secondName, String email, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.email = email;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
