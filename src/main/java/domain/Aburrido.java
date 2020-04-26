package domain;

public class Aburrido extends Estado {

    @Override
    public void juga(Mascota mascota) {
        mascota.setEstado(new Contento());
    }

    @Override
    public void come(Mascota mascota) {
        if (mascota.getTiempoAburrido() > 80){
            mascota.setEstado(new Contento());
        }
    }

    @Override
    public Boolean puedeJugar(Mascota mascota) {
        return true;
    }
}
