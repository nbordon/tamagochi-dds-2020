package domain;

public class Contento extends Estado {

  public Contento(Mascota mascota) {
    super(mascota);
  }

  @Override
  public void juga(Mascota mascota) {
    mascota.aumentarNivelFelicidad(2);
    if (mascota.getVecesJugando() > 5){
      mascota.setVecesJugando(0);
      mascota.setEstado(new Hambriento(this.mascota));
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
