package domain;

public interface Estado {

  public abstract void juga(Mascota mascota);
  public abstract void come(Mascota mascota);
  public abstract Boolean puedeJugar(Mascota mascota);
}
