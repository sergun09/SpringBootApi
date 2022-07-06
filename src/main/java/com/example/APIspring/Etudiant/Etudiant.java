package com.example.APIspring.Etudiant;

import java.time.LocalDate;

public class Etudiant {
    private long id;
    private String nom;
    private String email;
    private LocalDate dateNaissance;
    private Integer age;


    public Etudiant() {
    }

    public Etudiant(long id, String nom, String email, LocalDate dateNaissance, Integer age) {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.dateNaissance = dateNaissance;
        this.age = age;
    }

    public Etudiant(String nom, String email, LocalDate dateNaissance, Integer age) {
        this.nom = nom;
        this.email = email;
        this.dateNaissance = dateNaissance;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
