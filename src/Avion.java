public class Avion extends GestionVehicules.Vehicule
{
    private TypeAvion type;
    int nbrHeureVol;

    Avion(){};

    Avion(String marque, int dateAchat, int prixAchat, TypeAvion type, int nbrHeureVol)
    {
        super(marque, dateAchat, prixAchat);
        this.type = type;
        this.nbrHeureVol = nbrHeureVol;
        if (type == TypeAvion.REACTION)
        {
            int tranche = nbrHeureVol / 1000;
            tranche *= 10;
            this.setPrixCourant(this.getPrixAchat() - (this.getPrixAchat() * tranche/100));
        }
        else if(type == TypeAvion.HELICES)
        {
            int tranche = nbrHeureVol / 100;
            tranche *= 10;
            this.setPrixCourant(this.getPrixAchat() - (this.getPrixAchat() * tranche/100));
        }
        if (this.getPrixCourant() <= 0)
            this.setPrixCourant(0);

    }

    @Override
    public String toString() {
        return "\nAvion : " + "\nType : " + type + "\nNombre heures de vol : " + nbrHeureVol + "\n" + super.toString();
    }
}

enum TypeAvion {
    HELICES,
    REACTION
}