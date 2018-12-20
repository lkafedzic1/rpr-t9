package ba.unsa.etf.rpr;

public class Grad {
    private Drzava drzava;
    private String naziv;
    private int brojStanovnika;

    public Grad() {
    }
    public Grad(Drzava drzava, String naziv, int brojStanovnika) {
        this.drzava=drzava;
        this.naziv=naziv;
        this.brojStanovnika=brojStanovnika;
    }

    public Drzava getDrzava() {
        return drzava;
    }

    public void setDrzava(Drzava drzava) {
        this.drzava = drzava;
    }

    public int getBrojStanovnika() {
        return brojStanovnika;
    }

    public void setBrojStanovnika(int brojStanovnika) {
        this.brojStanovnika = brojStanovnika;
    }
}
