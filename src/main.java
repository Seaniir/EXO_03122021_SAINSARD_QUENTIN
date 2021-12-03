public class main {
    public static void main(String[] args)
    {
        Voiture fred = new Voiture("Renault", 2006, 12000, 1450, 5, 80, 25000);
        System.out.println(fred.toString());
        fred.calculePrix(2021);
        System.out.println(fred.toString());
        Avion nico = new Avion("Bombardier", 1996, 120000, TypeAvion.HELICES, 300);
        System.out.println(nico.toString());
    }
}
