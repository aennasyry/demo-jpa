package org.example.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "emprunt")
public class Emprunt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "date_debut" , nullable = false)
    private String date_debut;

    @Column(name = "date_fin" , nullable = false)
    private String date_fin;

    @Column(name = "delai" , nullable = false)
    private int delai;

    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;


    public Emprunt() { }

    public Emprunt(int id, String date_debut, String date_fin, int delai, Client client) {
        this.id = id;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.delai = delai;
        this.client = client;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(String date_debut) {
        this.date_debut = date_debut;
    }

    public String getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(String date_fin) {
        this.date_fin = date_fin;
    }

    public int getDelai() {
        return delai;
    }

    public void setDelai(int delai) {
        this.delai = delai;
    }



    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }




    @Override
    public String toString() {
        return "Emprunt{" +
                "id=" + id +
                ", date_debut='" + date_debut + '\'' +
                ", date_fin='" + date_fin + '\'' +
                ", delai=" + delai +
                ", client=" + client +
                '}';
    }
}
