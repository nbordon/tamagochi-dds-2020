package domain;

public class Hambriento extends Estado {
  public Hambriento(Mascota mascota) {
    super(mascota);
  }

  @Override
  public void juga(Mascota mascota) {

  }

  @Override
  public void come(Mascota mascota) {
    mascota.setEstado(new Contento(this.mascota));
  }

  @Override
  public Boolean puedeJugar(Mascota mascota) {
    return false;
  }
}
