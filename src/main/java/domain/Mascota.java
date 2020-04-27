package domain;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Mascota {
  private Estado estado;
  private Integer nivelFelicidad;
  private Integer tiempoAburrido;
  private Integer vecesJugando;

  public Mascota(){
    this.estado         = new Contento();
    this.nivelFelicidad = 10;
    this.tiempoAburrido = 0;
    this.vecesJugando   = 0;
  }

  public void juga(){
    this.incrementarVecesJugand();
    this.estado.juga(this);
  }

  public void come(){
    this.estado.come(this);
  }

  public Boolean puedeJugar(){
    return this.estado.puedeJugar(this);
  }

  public void setEstado(Estado estado) {
    this.estado = estado;
  }

  public void aumentarNivelFelicidad(Integer cantidad){
    this.nivelFelicidad += cantidad;
  }

  public Integer getTiempoAburrido(){
    return this.tiempoAburrido;
  }

  public void setVecesJugando(Integer vecesJugando) {
    this.vecesJugando = vecesJugando;
  }

  public Integer getVecesJugando() { return vecesJugando; }

  public void incrementarVecesJugand(){
    this.vecesJugando ++;
  }
}
