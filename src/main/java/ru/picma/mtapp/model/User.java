package ru.picma.mtapp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Class {@code User} is entity for realisation ORM logic.
 *
 * @author  pic
 * @since   0.0.1
 */
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
