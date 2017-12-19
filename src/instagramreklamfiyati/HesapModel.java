/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instagramreklamfiyati;

import javax.swing.JComboBox;

/**
 *
 * @author bilal
 */
public class HesapModel {
    private int takipciSayisi;
    private int begeniSayisi;
    private int profilZiyaretSayisi;
    private int reklamKategorisi;
    private int reklamYayinlamaSikligi;

    public HesapModel(int takipciSayisi, int begeniSayisi, int profilZiyaretSayisi, int reklamKategorisi, int reklamYayinlamaSikligi) {
        this.takipciSayisi = takipciSayisi;
        this.begeniSayisi = begeniSayisi;
        this.profilZiyaretSayisi = profilZiyaretSayisi;
        this.reklamKategorisi = reklamKategorisi;
        this.reklamYayinlamaSikligi = reklamYayinlamaSikligi;
    }


    public int getTakipciSayisi() {
        return takipciSayisi;
    }

    public void setTakipciSayisi(int takipciSayisi) {
        this.takipciSayisi = takipciSayisi;
    }

    public int getBegeniSayisi() {
        return begeniSayisi;
    }

    public void setBegeniSayisi(int begeniSayisi) {
        this.begeniSayisi = begeniSayisi;
    }

    public int getProfilZiyaretSayisi() {
        return profilZiyaretSayisi;
    }

    public void setProfilZiyaretSayisi(int profilZiyaretSayisi) {
        this.profilZiyaretSayisi = profilZiyaretSayisi;
    }

    public int getReklamKategorisi() {
        return reklamKategorisi;
    }

    public void setReklamKategorisi(int reklamKategorisi) {
        this.reklamKategorisi = reklamKategorisi;
    }

    public int getReklamYayinlamaSikligi() {
        return reklamYayinlamaSikligi;
    }

    public void setReklamYayinlamaSikligi(int reklamYayinlamaSikligi) {
        this.reklamYayinlamaSikligi = reklamYayinlamaSikligi;
    }
    
    
}
