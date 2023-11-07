package metier;

import java.util.List;

public class Lecteur {
    private String nom;
    private String identifiant;
    private String mdp;
    private List<Ouvrage> ouvrages;

    public String getNom() { return this.nom;}
    public void setNom(String nom) { this.nom = nom;}

    public String getIdentifiant() { return this.identifiant;}
    public void setIdentifiant(String identifiant) { this.identifiant = identifiant;}

    public String getMdp() { return this.mdp;}
    public void setMdp(String mdp) { this.mdp = mdp;}

    public List<Ouvrage> getOuvrages() {
        return this.ouvrages;
    }

    public void setOuvrages(List<Ouvrage> ouvrages) {
        this.ouvrages = ouvrages;
    }
}
