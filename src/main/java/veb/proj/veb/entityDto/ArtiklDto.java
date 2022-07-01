package veb.proj.veb.entityDto;

public class ArtiklDto {
    private String naziv;
    private String tipHrane;
    private int kolicina;
    private String opis;
    private double cijena;
    private Long restoranID;

    public ArtiklDto() { }

    public ArtiklDto(String naziv, String tipHrane, int kolicina, String opis, double cijena, Long RestoranID) {
        this.naziv = naziv;
        this.tipHrane = tipHrane;
        this.kolicina = kolicina;
        this.opis = opis;
        this.cijena = cijena;
        this.restoranID = restoranID;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getTipHrane() {
        return tipHrane;
    }

    public void setTipHrane(String tipHrane) {
        this.tipHrane = tipHrane;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public double getCijena() {
        return cijena;
    }

    public void setCijena(double cijena) {
        this.cijena = cijena;
    }

    public Long getRestoranID() {
        return restoranID;
    }

    public void setRestoranID(Long restoranID) {
        this.restoranID = restoranID;
    }
}
