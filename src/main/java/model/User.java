package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "USER_TABLE")
public class User {

    @OneToMany(mappedBy = "user")
    List<Character> characters = new ArrayList<>();
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String email;
    private String login;

    public User() {
    }

    public User(String email, String login) {
        this.email = email;
        this.login = login;
    }

}
