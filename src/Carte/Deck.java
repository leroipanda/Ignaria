package Carte;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Deck {
    List<Carte> deck = new ArrayList<Carte>();
    Carte poicher(){
        if(!deck.isEmpty()) {
            int randomNum = ThreadLocalRandom.current().nextInt(0, deck.size() + 1);
            Carte c = deck.get(randomNum);
            deck.remove(randomNum) ;
            return c ;
        }
        else{
            //TODO faire une exeption ici pour remonter l'info au lieu de surement tester le null
            return null ; }
    }

    void ajouterAuDeck( Carte e){
        deck.add(e) ;
    }

    void chercherDansDeck(){
       // TODO
    }
    
    //TODO definir le cmd
    //TODO definir prendre la carte svt du deck
}
