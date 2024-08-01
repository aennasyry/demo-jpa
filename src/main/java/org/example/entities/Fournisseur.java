package org.example.entities;

import jakarta.persistence.*;

import java.io.Serializable;
@Entity
@Table(name = "fournisseur")
public class Fournisseur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NOM", length = 25, nullable = false)
    private String raisonsociale;
    @Transient
    private String siret;

    public Fournisseur() {

    }

    public Fournisseur(String raisonsociale, String siret) {
        this.raisonsociale = raisonsociale;
        this.siret = siret;
    }

    public Integer getId() {
        return id;
    }

    public String getRaisonsociale() {
        return raisonsociale;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setRaisonsociale(String raisonsociale) {
        this.raisonsociale = raisonsociale;
    }

    public void setSiret(String siret) {
        this.siret = siret;
    }

    public String getSiret() {
        return siret;
    }

    @Override
    public String toString() {
        return "Fournisseur{" +
                "id=" + id +
                ", raisonsociale='" + raisonsociale + '\'' +
                ", siret='" + siret + '\'' +
                '}';
    }
}
