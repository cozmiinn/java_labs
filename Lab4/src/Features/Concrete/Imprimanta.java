package Features.Concrete;

import Features.Abstract.Echipament;
import Features.Enums.ModulDeTiparire;
import Features.Enums.StareEchipament;
import Features.Enums.Zona_mag;

public class Imprimanta extends Echipament
{
    private String rezolutie;
    private int p_car;
    private ModulDeTiparire modulDeTiparire;
    private int ppm;

    public Imprimanta(){}
    public Imprimanta(String denumire, int nr_inv, float pret, Zona_mag zona_mag, StareEchipament stareEchipament, String rezolutie, int p_car, ModulDeTiparire modulDeTiparire, int ppm)
    {
        super(denumire, nr_inv, pret, zona_mag, stareEchipament);
        this.rezolutie = rezolutie;
        this.p_car = p_car;
        this.modulDeTiparire = modulDeTiparire;
        this.ppm = ppm;
    }

    public int getPpm() {
        return ppm;
    }

    public String getRezolutie() {
        return rezolutie;
    }

    public int getP_car() {
        return p_car;
    }

    public ModulDeTiparire getModulDeTiparire() {
        return modulDeTiparire;
    }

    public void setPpm(int ppm) {
        this.ppm = ppm;
    }

    public void setRezolutie(String rezolutie) {
        this.rezolutie = rezolutie;
    }

    public void setP_car(int p_car) {
        this.p_car = p_car;
    }

    public void setModulDeTiparire(ModulDeTiparire modulDeTiparire) {
        this.modulDeTiparire = modulDeTiparire;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nNumărul de pagini scrise pe minut: "+ ppm +
                "\nRezoluţie: " + rezolutie +
                "\nModul de tipărire: " + modulDeTiparire;
    }
}
