package org.example.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "livre")
public class Livre implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "titre" , nullable = false)
    private String titre;

    @Column(name = "auteur" , nullable = false)
    private String auteur;

    @ManyToMany
    @JoinTable(name = "compo" ,
            joinColumns = @JoinColumn(name = "id_liv", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name= "id_emp", referencedColumnName = "id")
    )
    private Set<Emprunt> empruntSet;

    public Livre() {
    }
    public Livre(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public Set<Emprunt> getEmpruntSet() {
        return empruntSet;
    }

    public void setEmpruntSet(Set<Emprunt> empruntSet) {
        this.empruntSet = empruntSet;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                '}';
    }
}