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
    public static int[] nilaiRelasi = new int[4];
    public static double[] nilaiPF = new double[4];
    public static double[] bobot = new double[jmlPopulasi];

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

    // method untuk menghitung jumlah ketetanggaan dari kelas TampilanKondisiKetetanggaan
    public static void jmlChecklist() {
        jmlChecklist += 1;
    }

    // method untuk mengembalikan jumlah ketetanggaan
    public static int getKetetanggaan() {
        return jmlChecklist;
    }

    //method untuk mengambil data eksternal
    public static void inputDataEksternal(String key, String value) {
        if (data == null) {
            data = new HashMap<String, String>();
        }
        //buat masukin data (key n value)
        data.put(key, value);
    }

    public static void setDataEksternal(double[] kumpulanNilaiPF) {
        nilaiPF = kumpulanNilaiPF;
    }

    public static double[] getDataEksternal() {
        for (int i = 0; i < nilaiPF.length; i++) {
            System.out.println(nilaiPF[i]);
        }
        return nilaiPF;
    }

    // method untuk mendapatkan nilai dari satu data map
    public static String getValue(String key) {
        return data.get(key);
    }
    
    public static void setBobot(double[] bobotAtribut){
        bobot = bobotAtribut;
    }
    
    public static double[] getBobot(){
        for (int i = 0; i < bobot.length; i++) {
            System.out.println(bobot[i]);
        }
        return bobot;
    }

    public static void setRelation(int[] nilaiRelation) {
        //nilaiRelation = new int[4];
        nilaiRelasi = nilaiRelation;
    }

    //method untuk mengembalikan relasi dari masing2 tetangga

    public static int[] getRelation() {
        for (int i = 0; i < nilaiRelasi.length; i++) {
            System.out.println(nilaiRelasi[i]);
        }
        return nilaiRelasi;
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
