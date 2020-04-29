package domain;

public class Aburrido extends Estado {

  public Aburrido(Mascota mascota) {
    super(mascota);
  }

  @Override
  public void juga() {
    this.mascota.setEstado(new Contento(this.mascota));
  }

  @Override
  public void come() {
    if (this.mascota.getTiempoAburrido() > 80){
      this.mascota.setEstado(new Contento(this.mascota));
    }
  }

  @Override
  public Boolean puedeJugar() {
    return true;
  }
}
