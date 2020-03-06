package Mechanique;

import Carte.Carte;

//Cases est une casse qui gerer une case du board qui recoit la carte
public class Cases {

    //la carte attaché à la case
    public Carte getCarteAttachee() {
        return carteAttachee;
    }
    public void setCarteAttachee(Carte carteAttachee) {
        this.carteAttachee = carteAttachee;
    }
    private Carte carteAttachee ;




}
