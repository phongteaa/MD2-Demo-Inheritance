// driver class
public class Main {
    public static void main(String[] args)
    {

        MountainBike mb = new MountainBike(3, 100, 25);
        System.out.println("\nMountain bicycle ------>");
        System.out.println(mb.toString());

        KidBicycle kb = new KidBicycle(1, 50, 3);
        System.out.println("\nKid bicycle =====>");
        System.out.println(kb.toString());
    }
}
