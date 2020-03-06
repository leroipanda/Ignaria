package Mechanique;

import Carte.Carte;
import jeu.Joueur;

//Board est une classe qui permet de gerer tout parttie du jeu qui peux acceuillir une carte
public class Board {
    private int nombreDeLigne  ;
    private int nombreDeColone  ;
    private Cases[ ][ ] board = new Cases[nombreDeLigne][nombreDeColone]   ;
    private Joueur prorietaire ;

    public Board (Joueur prorietaire ,int nombreDeLigne,int nombreDeColone  ){
        //on initialise le board
        this.nombreDeColone =nombreDeColone ;
        this.nombreDeLigne = nombreDeLigne ;

        for(int i = 0 ; i < nombreDeLigne ; i++){
            for(int j=0 ; j < nombreDeColone ; j++){
                this.board[i][j] = new Cases() ;
            }
        }
        this.prorietaire = prorietaire ;

    }

}

