package domain;

public class Aburrido extends Estado {

  public Aburrido(Mascota mascota) {
    super(mascota);
  }

  @Override
  public void juga(Mascota mascota) {
    mascota.setEstado(new Contento(this.mascota));
  }

  @Override
  public void come(Mascota mascota) {
    if (mascota.getTiempoAburrido() > 80){
      mascota.setEstado(new Contento(this.mascota));
    }
  }

  @Override
  public Boolean puedeJugar(Mascota mascota) {
    return true;
  }
}
