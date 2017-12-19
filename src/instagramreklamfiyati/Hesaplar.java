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
public class Hesaplar {
    
    public int Hesaplar(HesapModel hesapModel){
        int pp = profilPuani(hesapModel.getTakipciSayisi(), hesapModel.getBegeniSayisi(), hesapModel.getProfilZiyaretSayisi());
        int rp = reklamPuani(hesapModel.getReklamKategorisi(),hesapModel.getReklamYayinlamaSikligi());
        float puanFonk = fonksiyon(pp,rp);
        int fiyat = fiyatHesapla(puanFonk);
        return fiyat;
    }
    
    
    int profilPuani(int takipciSayisi, int begeniVeYorumSayisi, int profilZiyaretSayisi){
        int puan = 0;
        if(takipciSayisi == 0){
            puan = puan + 5;
        }
        else if (takipciSayisi == 1){
            puan = puan + 10;
        }
        else {
            puan = puan + 15;
        }
        
        if(begeniVeYorumSayisi == 0){
            puan = puan + 5;
        }
        else if (begeniVeYorumSayisi == 1){
            puan = puan + 10;
        }
        else {
            puan = puan + 15;
        }
        
        if(profilZiyaretSayisi == 0){
            puan = puan + 10;
        }
        else if (profilZiyaretSayisi == 1){
            puan = puan + 15;
        }
        else {
            puan = puan + 20;
        }
        
        return puan;
    }
    int reklamPuani(int reklamKategorisi, int reklamYayinlamaSikligi){
        int puan = 0;
        if(reklamKategorisi == 0){
            puan = puan + 20;
        }
        else if(reklamKategorisi == 1){
            puan = puan + 15;
        }
        else{
            puan = puan + 10;
        }
        
        if(reklamYayinlamaSikligi == 0){
            puan = puan + 25;
        }
        else if(reklamYayinlamaSikligi == 1){
            puan = puan + 15;
        }
        else{
            puan = puan + 5;
        }
        return puan;
    }
    
    float fonksiyon(int pp, int rp){
        float sonuc;
        sonuc = (pp*75)/100 + (rp*25)/100;
        return sonuc;
    }

    int fiyatHesapla(float puanFonk) {
        int fiyat = 0;
        if(puanFonk>=18 && puanFonk <22){
            fiyat = 150;
        }
        else if(puanFonk>23 && puanFonk <28){
            fiyat = 200;
        }
        else if(puanFonk>29 && puanFonk <34){
            fiyat = 250;
        }
        else if(puanFonk>35 && puanFonk <43){
            fiyat = 300;
        }
        else{
            fiyat = 350;
        }
        return fiyat;
    }
    
}
