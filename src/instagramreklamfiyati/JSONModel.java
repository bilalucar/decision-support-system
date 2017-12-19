/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instagramreklamfiyati;

/**
 *
 * @author bilal
 */
public class JSONModel {
    private String takipciSayisi;
    private String begeniSayisi;
    private String profilZiyaretSayisi;
    private String reklamKategorisi;
    private String reklamYayinlamaSikligi;

    public JSONModel(String takipciSayisi, String begeniSayisi, String profilZiyaretSayisi, String reklamKategorisi, String reklamYayinlamaSikligi) {
        this.takipciSayisi = takipciSayisi;
        this.begeniSayisi = begeniSayisi;
        this.profilZiyaretSayisi = profilZiyaretSayisi;
        this.reklamKategorisi = reklamKategorisi;
        this.reklamYayinlamaSikligi = reklamYayinlamaSikligi;
    }

    public String getTakipciSayisi() {
        return takipciSayisi;
    }

    public void setTakipciSayisi(String takipciSayisi) {
        this.takipciSayisi = takipciSayisi;
    }

    public String getBegeniSayisi() {
        return begeniSayisi;
    }

    public void setBegeniSayisi(String begeniSayisi) {
        this.begeniSayisi = begeniSayisi;
    }

    public String getProfilZiyaretSayisi() {
        return profilZiyaretSayisi;
    }

    public void setProfilZiyaretSayisi(String profilZiyaretSayisi) {
        this.profilZiyaretSayisi = profilZiyaretSayisi;
    }

    public String getReklamKategorisi() {
        return reklamKategorisi;
    }

    public void setReklamKategorisi(String reklamKategorisi) {
        this.reklamKategorisi = reklamKategorisi;
    }

    public String getReklamYayinlamaSikligi() {
        return reklamYayinlamaSikligi;
    }

    public void setReklamYayinlamaSikligi(String reklamYayinlamaSikligi) {
        this.reklamYayinlamaSikligi = reklamYayinlamaSikligi;
    }
    
}
