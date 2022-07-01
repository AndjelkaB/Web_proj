package veb.proj.veb.entityDto;

import veb.proj.veb.entity.Uloga;

public class KorisnikDto {
    private String username;
    private String lozinka;
    private String ime;
    private String prezime;
    private String pol;
    private String datumRodjenja;
    private Uloga uloga;

    public KorisnikDto() {}

    public KorisnikDto(String username, String lozinka, String ime, String prezime, String datumRodjenja, String pol, Uloga uloga) {
        this.username = username;
        this.lozinka = lozinka;
        this.ime = ime;
        this.prezime = prezime;
        this.datumRodjenja = datumRodjenja;
        this.pol = pol;
        this.uloga = uloga;
    }

    public String getUsername() {
        return username;
    }

    public void  setUsername(String username) {
        this.username = username;
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

    public String getIme() {
        return ime;
    }

    public void  setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(String datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    public String getPol() {
        return pol;
    }

    public void  setPol(String pol) {
        this.pol = pol;
    }

    public Uloga getUloga() {
        return uloga;
    }

    public void setUloga(Uloga uloga) {
        this.uloga = uloga;
    }

}
