package Features.Abstract;

import Features.Enums.StareEchipament;
import Features.Enums.Zona_mag;

public interface IEchipament {
    public String getDenumire();
    public void setDenumire(String denumire);

    public int getNr_inv();
    public void setNr_inv(int Nr_inv);

    public float getPret();
    public void setPret(float pret);

    public Zona_mag getZona_mag();
    public void setZona_mag(Zona_mag zona_mag);

    public StareEchipament getStareEchipament();

    public void setStareEchipament(StareEchipament stareEchipament);

}
