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

    public static int jmlChecklist;
    public static int jmlPopulasi;
    public static String dataWirausaha;

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

    public static void jmlChecklist() {
        jmlChecklist += 1;
    }

    public static void inputDataEksternal(String key, String value) {
        if (data == null) {
            data = new HashMap<String, String>();
        }
        //buat masukin data (key n value)
        data.put(key, value);
//        Map.Entry<String,String> entry =(Map.Entry<String,String>) data.entrySet();
//        entry.getKey();
//        entry.getValue();
    }

    // method untuk mendapatkan nilai dari satu data map
    public static String getValue(String key) {
        return data.get(key);
    }

    public static int[] getRelation(int[] nilaiRelation) {
        //nilaiRelation = new int[4];
        for (int i = 0; i < nilaiRelation.length; i++) {
            System.out.println(nilaiRelation[i]);
        }
        return nilaiRelation;
    }

    public static void setDataWirausaha(String data) {
        dataWirausaha = data;
    }

    public static String getDataWirausaha() {
        return dataWirausaha;
    }

    public static void setPopulation(int jmlData) {
        jmlPopulasi = jmlData;
    }

    public static int getPopulation() {
        return jmlPopulasi;
    }

    public static void inputDataSimulasi(String key, String value) {
        if (data == null) {
            data = new HashMap<String, String>();
        }

        //buat masukin data (key n value)
        data.put(key, value);
    }
}
