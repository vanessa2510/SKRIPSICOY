/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecasimulatorjframe;

/**
 *
 * @author Vanessa
 */
public class Entrepreneurs {
    int level;
    int age;
    boolean sex;
    int b_age;
    int b_category; // bidang usaha, misal makanan
    int b_area;// makanan ringan, makanan berat
    int education;
    int location;
    int income;
    double point;
    //penambahan
    
    Entrepreneurs(){
        sex=false;
        age = 0;
        b_age = 0;
        b_category = 0;
        b_area = 0;
        education = 0;
        location = 0;
        income = 0;
        level = 0;
        point = 0.0;
    }
    
    Entrepreneurs(boolean s, int a, int ba, int cat,int area, int edu, int loc, int inc, int l, double p){
        this.sex = s;
        this.age = a;
        this.b_age = ba;
        this.b_category = cat;
        this.b_area = area;
        this.education = edu;
        this.location = loc;
        this.income = inc; //pendapatan
        this.level = l;
        this.point = p;
    }
    
    void copy(Entrepreneurs e){
        e.sex = this.sex;
        e.age = this.age;
        e.b_age = this.b_age;
        e.b_category = this.b_category;
        e.b_area = this.b_area;
        e.education = this.education;
        e.location = this.location;
        e.income = this.income;
        e.level = this.level;
    }
    /*
    * method untuk mengeluarkan hasil perubahan individu wirausahawan
    */
    public String toString2(){
        return sex +" , "+ age + " , "+b_age+" , "+b_category+" , "+b_area+" , "+education +" , "+ location+" , "+ income +" , "+ level;
    }  
    
    void genDummy(CA model){
    
    }
}

