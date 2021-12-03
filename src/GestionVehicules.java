public class GestionVehicules
{
    static public class Vehicule
    {
        private String marque;
        private int dateAchat;
        private double prixAchat;
        private double prixCourant;

        public String getMarque() {
            return marque;
        }

        public int getDateAchat() {
            return dateAchat;
        }

        public double getPrixAchat() {
            return prixAchat;
        }

        public double getPrixCourant() {
            return prixCourant;
        }

        public void setMarque(String marque) {
            this.marque = marque;
        }

        public void setDateAchat(int dateAchat) {
            this.dateAchat = dateAchat;
        }

        public void setPrixAchat(double prixAchat) {
            this.prixAchat = prixAchat;
        }

        public void setPrixCourant(double prixCourant) {
            this.prixCourant = prixCourant;
        }

        Vehicule(){}

        Vehicule(String marque, int dateAchat, double prixAchat)
        {
            super();
            this.marque = marque;
            this.dateAchat = dateAchat;
            this.prixAchat = prixAchat;
        }

        @Override
        public String toString()
        {
            return "Marque : " + this.marque + "\nDate d'achat : " + this.dateAchat + "\nPrix d'achat : " + this.prixAchat + "\nPrix Courant : " + this.prixCourant;
        }

        public void calculePrix(int anneeActuelle)
        {
            int difference = anneeActuelle - dateAchat;
            this.setPrixCourant(this.prixAchat - (this.prixAchat * difference/100));
        }
    }
}
