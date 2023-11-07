package Bibliothèque;

import metier.Lecteur;

import java.util.Scanner;

public class Bibliotheque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir votre identifiant : ");
        String id = sc.nextLine();
        System.out.println("Saisir votre mdp : ");
        String mdp = sc.nextLine();
        Lecteur lecteur = new Lecteur(id, mdp);
        System.out.println("Bonjour : " + lecteur.getNom());
    }
}