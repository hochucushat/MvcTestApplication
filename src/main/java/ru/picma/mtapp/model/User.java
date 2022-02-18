package ru.picma.mtapp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "users")
public class User {

    @Id
    private Long id;
    private String login;
    private String pwd;

}
