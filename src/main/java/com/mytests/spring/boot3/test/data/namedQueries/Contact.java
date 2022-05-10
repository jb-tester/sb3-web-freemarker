package com.mytests.spring.boot3.test.data.namedQueries;

import jakarta.persistence.*;

/**
 * *
 * <p>Created by irina on 5/3/2022.</p>
 * <p>Project: sb3-web-freemarker</p>
 * *
 */
@Entity
@NamedQueries({
        @NamedQuery(name = "Contact.qwe1", query = "select c.telephone from Contact c where c.lastname = ?1")})
@NamedNativeQueries({@NamedNativeQuery(name = "Contact.nativeQwe1", query = "select * from contact where firstname = :firstName")})
public class Contact {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "firstname")
    private String firstname;
    @Basic
    @Column(name = "lastname")
    private String lastname;
    @Basic
    @Column(name = "telephone")
    private String telephone;
    @Basic
    @Column(name = "email")
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


}
