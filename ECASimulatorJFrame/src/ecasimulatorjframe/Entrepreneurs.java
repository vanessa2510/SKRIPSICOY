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
    int sex;
    int b_age;
    int b_category; // bidang usaha, misal makanan
    int b_area;// makanan ringan, makanan berat
    int education;
    int location;
    int income;
    double point;
    //penambahan
    
    Entrepreneurs(){
        sex=0;
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
    
    Entrepreneurs(int s, int a, int ba, int cat,int area, int edu, int loc, int inc, int l, double p){
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

    public void setLevel(int level) {
        this.level = level;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public void setB_age(int b_age) {
        this.b_age = b_age;
    }

    public void setB_category(int b_category) {
        this.b_category = b_category;
    }


    public void setB_area(int b_area) {
        this.b_area = b_area;
    }

    public void setEducation(int education) {
        this.education = education;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public void setPoint(double point) {
        this.point = point;
    }
    
    
    
    void genDummy(CA model){
    
    }
}

