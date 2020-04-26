package domain;

public class Hambriento extends Estado {
    @Override
    public void juga(Mascota mascota) {

    }

    @Override
    public void come(Mascota mascota) {
        mascota.setEstado(new Contento());
    }

    @Override
    public Boolean puedeJugar(Mascota mascota) {
        return false;
    }
}
