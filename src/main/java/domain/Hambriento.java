package domain;

public class Hambriento extends Estado {
  public Hambriento(Mascota mascota) {
    super(mascota);
  }

  @Override
  public void juga() {

  }

  @Override
  public void come() {
    this.mascota.setEstado(new Contento(this.mascota));
  }

  @Override
  public Boolean puedeJugar() {
    return false;
  }
}
