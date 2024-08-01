package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import org.example.entities.Fournisseur;
import org.example.entities.Livre;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo");
        EntityManager em = emf.createEntityManager();


/*
        em.getTransaction().begin();

        //c-> crud création d'un nouveau fournisseur
        Fournisseur fournisseurCree = new Fournisseur("alaeee","1246");
        em.persist(fournisseurCree);

        //r-> crud récuprerer un fournisseur à l'id = 3
        Fournisseur fournisseur = em.find(Fournisseur.class, 3);
        if(null != fournisseur) {
            System.out.println(fournisseur);
        }

        //r-> crud récuprerer un ensemble de fournisseurs
        TypedQuery<Fournisseur> query = em.createQuery("SELECT f FROM Fournisseur f", Fournisseur.class);
        List<Fournisseur> fournisseurs = query.getResultList();
        fournisseurs.forEach(System.out::println);

        //u-> crud modifier le nom du fournisseur 2
        Fournisseur fournisseurAModifier = em.find(Fournisseur.class, 2);
        if(fournisseurAModifier != null){
            fournisseurAModifier.setRaisonsociale("TOTO");
        }

        //d-> crud suppression du fournisseur 7
        Fournisseur fournisseurASupp = em.find(Fournisseur.class,4);
        if(null != fournisseurASupp){
            em.remove(fournisseurASupp);
        }
        em.getTransaction().commit();
 */
        //TP2

        Livre livre = em.find(Livre.class, 2);
        System.out.println(livre);




        em.close();
        emf.close();
    }
}