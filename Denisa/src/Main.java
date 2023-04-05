class Tara{
    private String nume;
    private String capitala;
    private Long populatie;
    private String presedinte;

    public Tara(String nume, String capitala, Long populatie){
        this.nume=nume;
        this.capitala=capitala;
        this.populatie=populatie;
    }

    public Tara(String nume, String capitala){
        this.nume=nume;
        this.capitala=capitala;
    }

    public Tara(){
    }

    public String toString(){
        String text = "";
        text = "Numele tarii este:" + this.nume + " \nCapitala:" + this.capitala + "\nPopulatie:" + this.populatie;

        return text;
    }

    public void setNume(String nume){
        this.nume = nume;
    }
    public void setCapitala(String capitala){
        this.capitala = capitala;
    }
    public void setPopulatie(Long populatie){
        this.populatie = populatie;
    }

    public String getNume(){
        return this.nume;
    }

    public String getCapitala(){
        return this.capitala;
    }

    public Long getPopulatie(){
        return this.populatie;
    }
}

public class Main {
    public static void main(String[] args){
        Tara Cosmin=new Tara("Denisa", "la mine acasa", 1L);
        Tara tara1=new Tara("Romania", "Bucuresti", 18903651L);
        Tara tara2=new Tara("Ungaria", "Budapesta", 9585817L);

        System.out.println(Cosmin.toString());
        System.out.println();
        System.out.println(tara1.toString());
        System.out.println();
        System.out.println(tara2.toString());


        System.out.println();

        System.out.println("Tara Cosmin are populatia: "+ Cosmin.getPopulatie());
        Cosmin.setPopulatie(2L);
        System.out.println("Noua populatie a tarii Cosmin este: "+ Cosmin.getPopulatie()); //uitasem de speedy :D
        Cosmin.setPopulatie(3L);
        System.out.println("Noua populatie a tarii Cosmin este: "+ Cosmin.getPopulatie()); //cand vii la america express si la mn
    }
}