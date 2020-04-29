package domain;

public class Contento extends Estado {

  public Contento(Mascota mascota) {
    super(mascota);
  }

  @Override
  public void juga() {
    this.mascota.aumentarNivelFelicidad(2);
    if (this.mascota.getVecesJugando() > 5){
      this.mascota.setVecesJugando(0);
      this.mascota.setEstado(new Hambriento(this.mascota));
    }
  }

  @Override
  public void come() {
    this.mascota.aumentarNivelFelicidad(1);
  }

  @Override
  public Boolean puedeJugar() {
    return true;
  }
}
