package Features.Abstract;

import Features.Enums.StareEchipament;
import Features.Enums.Zona_mag;

public abstract class Echipament implements IEchipament
{
    private String denumire;
    private int nr_inv;
    private float pret;
    private Zona_mag zona_mag;
    private StareEchipament stareEchipament;
    public Echipament() {}
    public Echipament(String denumire, int nr_inv, float pret, Zona_mag zona_mag, StareEchipament stareEchipament)
    {
        this.denumire = denumire;
        this.nr_inv = nr_inv;
        this.zona_mag = zona_mag;
        this.pret = pret;
        this.stareEchipament = stareEchipament;
    }

    @Override
    public String getDenumire() {
        return denumire;
    }
    @Override
    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }
    @Override
    public int getNr_inv() {
        return nr_inv;
    }
    @Override
    public void setNr_inv(int Nr_inv) {
        this.nr_inv = Nr_inv;
    }
    @Override
    public float getPret() {
        return pret;
    }
    @Override
    public void setPret(float pret) {
        this.pret = pret;
    }
    @Override
    public Zona_mag getZona_mag() {
        return zona_mag;
    }
    @Override
    public void setZona_mag(Zona_mag zona_mag) {
        this.zona_mag = zona_mag;
    }

    public StareEchipament getStareEchipament() {
        return stareEchipament;
    }

    public void setStareEchipament(StareEchipament stareEchipament) {
        this.stareEchipament = stareEchipament;
    }

    @Override
    public String toString() {
        return "\nEchipament: " + this.denumire +
                "\nNumăr de inventar: " + this.nr_inv +
                "\nPret: " + this.pret +
                "\nZonă din magazie: " + this.zona_mag;
    }
}
