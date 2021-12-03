public class Voiture extends GestionVehicules.Vehicule
{
    private int cylindree;
    private int nbrPortes;
    private int puissance;
    private int kilometrage;

    Voiture(){};

    Voiture(String marque, int dateAchat, int prixAchat, int cylindree, int nbrPortes, int puissance, int kilometrage)
    {
        super(marque, dateAchat, prixAchat);
        this.cylindree = cylindree;
        this.nbrPortes = nbrPortes;
        this.puissance = puissance;
        this.kilometrage = kilometrage;
    }

    public int getCylindree() {
        return cylindree;
    }

    public int getNbrPortes() {
        return nbrPortes;
    }

    public int getPuissance() {
        return puissance;
    }

    public int getKilometrage() {
        return kilometrage;
    }

    public void setCylindree(int cylindree) {
        this.cylindree = cylindree;
    }

    public void setNbrPortes(int nbrPortes) {
        this.nbrPortes = nbrPortes;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    public void setKilometrage(int kilometrage) {
        this.kilometrage = kilometrage;
    }

    @Override
    public String toString() {
        return "\nVoiture : " + "\nCylindrée : " + cylindree + "\nNombre de portes : " + nbrPortes + "\nPuissance : " + puissance + "\nKilometrage : " + kilometrage + "\n" + super.toString();
    }

    @Override
    public void calculePrix(int anneeActuelle)
    {
        int difference = anneeActuelle - this.getDateAchat();
        difference *= 2;
        System.out.println(difference);
        difference += 5 * (this.getKilometrage() / 10000);
        System.out.println(this.getKilometrage() / 10000);
        if(getMarque().equals("Renault") || getMarque().equals("Fiat"))
            difference += 10;
        else if(getMarque().equals("Ferrari") || getMarque().equals("Porsche"))
            difference += 20;
        this.setPrixCourant(this.getPrixAchat() - (this.getPrixAchat() * difference/100));
        if (this.getPrixCourant() <= 0 )
        {
            this.setPrixCourant(0);
        }
    }
}
