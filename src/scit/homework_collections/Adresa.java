package scit.homework_collections;

public class Adresa {
    private String numeOras;
    private String numeStrada;
    private int nrStrada;

    public Adresa(String numeOras, String numeStrada, int nrStrada){
        this.numeOras = numeOras;
        this.numeStrada = numeStrada;
        this.nrStrada = nrStrada;
    }

    public String getNumeOras() {
        return numeOras;
    }

    public void setNumeOras(String numeOras) {
        this.numeOras = numeOras;
    }

    public String getNumeStrada() {
        return numeStrada;
    }

    public void setNumeStrada(String numeStrada) {
        this.numeStrada = numeStrada;
    }

    public int getNrStrada() {
        return nrStrada;
    }

    public void setNrStrada(int nrStrada) {
        this.nrStrada = nrStrada;
    }

    @Override
    public String toString() {
        return "Nume Oras: " + numeOras + ", Strada: " + numeStrada + ",Nr.: " + nrStrada;
    }
}
