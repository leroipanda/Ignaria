package jeu;

import Mechanique.Tour;

import java.util.ArrayList;
import java.util.List;

///classe qui contient tout l"etat du jeu
public class jeu {
    private Tour.etapeDuTour TourActuel ;
    private List<Joueur>  listeJoueurs = new ArrayList<Joueur>() ;

    public jeu() {
        TourActuel = Tour.etapeDuTour.DEBUT_DU_TOUR;
    }

}
