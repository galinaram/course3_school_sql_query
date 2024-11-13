package homework.sql.sql_query.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int age = 20;

    @ManyToOne
    @JoinColumn(name = "faculty_id")
    private Faculty faculty;

    @OneToOne(mappedBy = "student")
    private Avatar avatar;

    public Student() {
    }

    public Student(Long id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setId(long id){
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


