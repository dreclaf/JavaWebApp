package com.example.demo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "users", uniqueConstraints = {
    @UniqueConstraint(columnNames = "email")
})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Imię jest wymagane")
    @Size(min = 2, message = "Imię musi mieć co najmniej 2 znaki")
    private String imie;

    @NotBlank(message = "Nazwisko jest wymagane")
    private String nazwisko;

    @NotBlank(message = "Email jest wymagany")
    @Email(message = "Nieprawidłowy format adresu email")
    private String email;


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getImie() { return imie; }
    public void setImie(String imie) { this.imie = imie; }

    public String getNazwisko() { return nazwisko; }
    public void setNazwisko(String nazwisko) { this.nazwisko = nazwisko; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
