package domain;

public abstract class Estado {
  protected Mascota mascota;

  public Estado(Mascota mascota){
    this.mascota = mascota;
  }

  public abstract void juga();
  public abstract void come();
  public abstract Boolean puedeJugar();
}
