/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecasimulatorjframe;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Vanessa
 */
public class InputDataHandler {

    private static Map<String, String> data;

    public static void inputDataInternal(String key, String value) {
        if (data == null) {
            data = new HashMap<String, String>();
        }
        //buat masukin data (key n value)
        data.put(key, value);
    }

    // untuk memeriksa yang dicheck list apa aja yang di tampilan internal
    public static boolean checkKey(String key) {
        if (data.containsKey(key)) {
            if (data.get(key) == null) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
        //return data.containsKey(key);
    }

    public static void inputDataKetetanggaan(String key, String value) {
        if (data == null) {
            data = new HashMap<String, String>();
        }
        //buat masukin data (key n value)
        data.put(key, value);
    }

    public static void inputDataEksternal(String key, String value) {
        if (data == null) {
            data = new HashMap<String, String>();
        }
        //buat masukin data (key n value)
        data.put(key, value);
    }
    // untuk memeriksa yang di radio button yang diisi yang mana di tampilan ketetanggaan
//    public static boolean checkKeyNeg(String key){
//        if (data.containsKey(key)) {
//            if (data.get(key)==null) {
//                return false;
//            }
//            else{
//                if (data.) {
//                    
//                }
//            }
//        }
//    }
}