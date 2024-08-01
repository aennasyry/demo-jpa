package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import org.example.entities.Client;
import org.example.entities.Emprunt;
import org.example.entities.Fournisseur;
import org.example.entities.Livre;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo");
        EntityManager em = emf.createEntityManager();


        //TP2
        /*
        Livre livre = em.find(Livre.class, 2);
        System.out.println(livre);

        Client client = em.find(Client.class, 2);
        System.out.println(client);
        */

        Livre livre = em.find(Livre.class, 1);
        System.out.println(livre.getEmpruntSet());

        /*
        Client client = em.find(Client.class, 1);
        System.out.println(client.getEmprunts());
        */
        em.close();
        emf.close();
    }
}