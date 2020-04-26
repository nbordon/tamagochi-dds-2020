package domain;

public class Contento extends Estado {

    @Override
    public void juga(Mascota mascota) {
        mascota.aumentarNivelFelicidad(2);
        if (mascota.getVecesJugando() > 5){
            mascota.setVecesJugando(0);
            mascota.setEstado(new Hambriento());
        }
    }

    @Override
    public void come(Mascota mascota) {
        mascota.aumentarNivelFelicidad(1);
    }

    @Override
    public Boolean puedeJugar(Mascota mascota) {
        return true;
    }
}
