package Carte;
import Mechanique.Cases;
import Mechanique.Effet;

public abstract class Carte {


    private  Effet effet  ;
    private String name  ;
    private int id ;
    private String addressIllustration  ;
    private Cases casesDelaCarte ;

    public Carte(int id  , String name , String addressIllustration  ){
        this.id = id;
        this.addressIllustration = addressIllustration ;
        this.name = name ;

    }
    public Carte(int id  , String name , String addressIllustration , Effet effet ){
        this( id  ,  name , addressIllustration  );
        this.effet =effet ;
    }



    public Effet getEffet() {
        return effet;
    }
    public void setEffet(Effet effet) {
        this.effet = effet;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getAddressIllustration() {
        return addressIllustration;
    }
    public void setAddressIllustration(String addressIllustration) {
        this.addressIllustration = addressIllustration;
    }
    public Cases getCasesDelaCarte() {
        return casesDelaCarte;
    }
    public void setCasesDelaCarte(Cases casesDelaCarte) {
        this.casesDelaCarte = casesDelaCarte;
    }
}
