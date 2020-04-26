package domain;

public abstract class Estado {
    protected Mascota mascota;

    public Estado(Mascota mascota){
        this.mascota = mascota;
    }

    public abstract void juga(Mascota mascota);
    public abstract void come(Mascota mascota);
    public abstract Boolean puedeJugar(Mascota mascota);
}
