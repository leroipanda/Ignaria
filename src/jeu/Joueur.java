package jeu;

import Mechanique.Board;

public class Joueur {
    private String name  ;
    private int pointDeVie ;
    private int pointDeVieMax ;
    private Board main = new Board( this , 1 , 10) ;
    private Board terrain = new Board( this , 2 ,5 );
}
