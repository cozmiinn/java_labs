package Features.Concrete;

import Features.Abstract.Echipament;
import Features.Enums.FormatDeCopiere;
import Features.Enums.StareEchipament;
import Features.Enums.Zona_mag;

public class Copiator extends Echipament
{
    private int p_ton;
    private FormatDeCopiere formatDeCopiere;

    public Copiator() {}
    public Copiator(String denumire, int nr_inv, float pret, Zona_mag zona_mag,StareEchipament stareEchipament, int p_ton, FormatDeCopiere formatDeCopiere) {
        super(denumire, nr_inv, pret, zona_mag, stareEchipament);
        this.p_ton = p_ton;
        this.formatDeCopiere = formatDeCopiere;
    }


    public void setP_ton(int p_ton) {
        this.p_ton = p_ton;
    }
    public void setFormatDeCopiere(FormatDeCopiere formatDeCopiere) {
        this.formatDeCopiere = formatDeCopiere;
    }
    public int getP_ton() {
        return p_ton;
    }
    public FormatDeCopiere getFormatDeCopiere() {
        return formatDeCopiere;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nNumărul de pagini/toner: " + p_ton +
                "\nFormatul de copiere: " + formatDeCopiere;
    }
}
