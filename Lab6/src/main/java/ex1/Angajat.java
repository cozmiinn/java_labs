package ex1;

import java.time.LocalDate;

public class Angajat {
    private String numele;
    private String postul;
    private LocalDate data_angajatori;
    private float salariul;

    public Angajat() { }

    public Angajat(String numele, String postul, LocalDate data_angajatori, float salariul) {
        this.numele = numele;
        this.postul = postul;
        this.data_angajatori = data_angajatori;
        this.salariul = salariul;
    }

    public String getNumele() {
        return numele;
    }

    public void setNumele(String numele) {
        this.numele = numele;
    }

    public String getPostul() {
        return postul;
    }

    public void setPostul(String postul) {
        this.postul = postul;
    }

    public LocalDate getData_angajatori() {
        return data_angajatori;
    }

    public void setData_angajatori(LocalDate data_angajatori) {
        this.data_angajatori = data_angajatori;
    }

    public float getSalariul() {
        return salariul;
    }

    public void setSalariul(float salariul) {
        this.salariul = salariul;
    }

    @Override
    public String toString() {
        return "Angajat{" +
                "numele='" + numele + '\'' +
                ", postul='" + postul + '\'' +
                ", data_angajatori=" + data_angajatori +
                ", salariul=" + salariul +
                '}';
    }
}
