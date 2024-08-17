package viajes;

public class Viajero {

    Empacar empacar;

    public Viajero(Empacar empacar) {
        this.empacar = empacar;
    }

    public void empacando(){
        this.empacar.empacarArticulos();
    }

}
