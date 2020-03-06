package Mechanique;

import jeu.jeu;

public abstract class Effet {
    private String nom;

    public String getNom() {
        return null;
    }

    public abstract boolean resolve(jeu j);

}
