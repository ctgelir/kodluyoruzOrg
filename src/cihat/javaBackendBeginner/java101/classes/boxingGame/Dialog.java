package cihat.javaBackendBeginner.java101.classes.boxingGame;

/**@author Cihat Gelir*/
public class Dialog {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Marc" , 15 , 100, 90, 0);
        Fighter alex = new Fighter("Alex" , 10 , 95, 100, 0);
        Ring r = new Ring(marc,alex , 90 , 100);
        r.run();
      }
}
