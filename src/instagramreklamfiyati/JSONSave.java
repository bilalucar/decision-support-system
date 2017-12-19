/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instagramreklamfiyati;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class JSONSave {
    JSONSave(List<JSONModel> veriler, List<String> sonuclar) {
        try{
            JSONObject kok = new JSONObject();
            JSONArray list = new JSONArray();
            int i = 0;
            for(JSONModel veri : veriler){
                JSONObject obj = new JSONObject();
                obj.put("TakipciSayisi", veri.getTakipciSayisi());
                obj.put("BegeniSayisi", veri.getBegeniSayisi());
                obj.put("ProfilZiyaretSayisi", veri.getProfilZiyaretSayisi());
                obj.put("ReklamKategorisi", veri.getReklamKategorisi());
                obj.put("ReklamYayinlamaSikligi", veri.getReklamYayinlamaSikligi());
                obj.put("Sonuc", sonuclar.get(i));
                i++;
                System.out.println(obj);
                list.put(obj);
            }
            kok.put("Veriler", list);
            System.out.println(list);
            System.out.println(kok);
            try (FileWriter file = new FileWriter("/home/"+new com.sun.security.auth.module.UnixSystem().getUsername().toString()+"/Desktop/test.json")) {
                file.write(kok.toString());
                file.flush();

            } catch (IOException e) {
                e.printStackTrace();
            }
            
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}

