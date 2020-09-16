public class HumanTest {
    public static void main (String[] arg)
    {
        System.out.println("Человек:" + "Михаил" + "\n");

        Head h1 = new Head();
        h1.setL("Овальное");
        h1.setHair("Брюнет");
        h1.setEye("Карие");

        Leg l1 = new Leg();
        l1.setFeetl(60.9);
        l1.setSize(42.0);
        Leg l2 = new Leg();
        l2.setSize(42.0);
        l2.setFeetl(60.9);

        Hand ha1 = new Hand();
        ha1.setHandl(51.1);
        Hand ha2 = new Hand();
        ha2.setHandl(51.1);

        Human Mikhail = new Human();
        System.out.println(h1);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(ha1);

    }
}