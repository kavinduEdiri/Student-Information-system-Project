package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    private long id;
    @Column(name="student_name",nullable = false)
    private String Name;
    @Column(name="student_address",nullable = false)
    private String address;

    public Student(long id) {
        this.id = id;
    }
    @Column(name="student_gender")
    private String gender;

    public Student(long id, String text, String text1, String s) {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
