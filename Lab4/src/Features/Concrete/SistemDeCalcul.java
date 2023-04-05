package Features.Concrete;

import Features.Abstract.Echipament;
import Features.Enums.SistemDeOperare;
import Features.Enums.StareEchipament;
import Features.Enums.Zona_mag;

public class SistemDeCalcul extends Echipament
{
    private String tip_mon;
    private String vit_proc;
    private String c_HDD;
    private SistemDeOperare sistemDeOperare;

    public SistemDeCalcul(){}
    public SistemDeCalcul(String denumire, int nr_inv, float pret, Zona_mag zona_mag, StareEchipament stareEchipament, String tip_mon, String vit_proc, String c_HDD, SistemDeOperare sistemDeOperare) {
        super(denumire, nr_inv, pret, zona_mag, stareEchipament);
        this.tip_mon = tip_mon;
        this.vit_proc = vit_proc;
        this.c_HDD = c_HDD;
        this.sistemDeOperare = sistemDeOperare;
    }

    public String getTip_mon() {
        return tip_mon;
    }

    public String getVit_proc() {
        return vit_proc;
    }

    public String getC_HDD() {
        return c_HDD;
    }

    public SistemDeOperare getSistemDeOperare() {
        return sistemDeOperare;
    }

    public void setTip_mon(String tip_mon) {
        this.tip_mon = tip_mon;
    }

    public void setVit_proc(String vit_proc) {
        this.vit_proc = vit_proc;
    }

    public void setC_HDD(String c_HDD) {
        this.c_HDD = c_HDD;
    }

    public void setSistemDeOperare(SistemDeOperare sistemDeOperare) {
        this.sistemDeOperare = sistemDeOperare;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nTip monitor: "+ tip_mon +
                "\nViteza Procesor: " + vit_proc +
                "\nCapacitate HDD: " + c_HDD +
                "\nSistem de operare: "+ sistemDeOperare;
    }
}
