package ua.com.owu.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


@Entity
@Getter
@Setter
@NoArgsConstructor

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private  int age;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Product product;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User(String name, int age, Product product) {
        this.name = name;
        this.age = age;
        this.product = product;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
