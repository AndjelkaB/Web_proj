package veb.proj.veb.entityDto;

import veb.proj.veb.entity.Artikl;
import veb.proj.veb.entity.Komentar;
import veb.proj.veb.entity.Lokacija;
import veb.proj.veb.entity.TipRestorana;

import java.util.List;
import java.util.Set;

public class RestoranDto {
    private String naziv;
    private TipRestorana tipRestorana;
    private String status;
    private Lokacija lokacija;
    private List<Komentar> komentari;
    private Set<Artikl> artikli;
    private Long menadzerID;

    public RestoranDto() {}

    public RestoranDto(String naziv, TipRestorana tipRestorana, String status, Lokacija lokacija, List<Komentar> komentari, Set<Artikl> artikli, Long menadzerID) {
        super();
        this.naziv = naziv;
        this.tipRestorana = tipRestorana;
        this.status = status;
        this.lokacija = lokacija;
        this.komentari = komentari;
        this.artikli = artikli;
        this.menadzerID = menadzerID;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public TipRestorana getTipRestorana() {
        return tipRestorana;
    }

    public void setTipRestorana(TipRestorana tipRestorana) {
        this.tipRestorana = tipRestorana;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Lokacija getLokacija() {
        return lokacija;
    }

    public void setLokacija(String lokacija) {
        this.lokacija = lokacija;
    }

    public List<Komentar> getKomentari() {
        return komentari;
    }

    public void setKomentari(List<Komentar> komentari) {
        this.komentari = komentari;
    }

    public Set<Artikl> getArtikli() {
        return artikli;
    }

    public void setArtikli(Set<Artikl> artikli) {
        this.artikli = artikli;
    }

    public Long getMenadzerID() {
        return menadzerID;
    }

    public void setMenadzerID(Long menadzerID) {
        this.menadzerID = menadzerID;
    }
}
