package kz.iitu.demo.model;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "students")
private String userName;

public class Todolist {
    /*public Todo(String user, String desc, Date targetDate, boolean isDone) {
        super();
        this.userName = user;
        this.description = desc;
        this.targetDate = targetDate;
    }*/
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "date")
    private Date date;

    public Todolist() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Todolist(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Todolist{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}