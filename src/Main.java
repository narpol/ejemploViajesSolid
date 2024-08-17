import viajes.Cartera;
import viajes.Maleta;
import viajes.Mochila;
import viajes.Viajero;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Viajero viajero = new Viajero(new Maleta());
        Viajero viajero1 = new Viajero(new Mochila());
        Viajero viajero2 = new Viajero(new Cartera());

        viajero.empacando();
        viajero1.empacando();
        viajero2.empacando();


    }
}