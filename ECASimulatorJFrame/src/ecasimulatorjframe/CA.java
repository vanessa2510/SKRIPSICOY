/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecasimulatorjframe;

import java.util.Random;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Vanessa
 */
public class CA {

    int popSize;
    int neighSize;
    double threshold; //ambang minimum untuk usaha berlanjut
    Entrepreneurs[] E;
    Neighborhoods N;
    PublicFactor pub;
    int[] S; // state ?
    float P; 
    float[] delta;
    float[] sigma;
    //penambahan
//    double a;
//    double b;
//    double c;
//    int periode;

//    double bobotUmur=0.0;
//    double bobotLevel=0.0;
//    double bobotPendidikan=0.0;
//    double bobotPendapatan=0.0;
    CA(int n, int m, int pf) {
        popSize = n;
        neighSize = m;
        E = new Entrepreneurs[n];
        N = new Neighborhoods(n, m);
        pub = new PublicFactor(pf);
    }

    Entrepreneurs[] stateTransition(CA model,double [] composition) {
        int size = model.popSize;
        Entrepreneurs[] nextEnt = new Entrepreneurs[size];

        for (int i = 0; i < size; i++) {
            nextEnt[i] = new Entrepreneurs();
            model.E[i].copy(nextEnt[i]);
            nextEnt[i].age++;
            nextEnt[i].b_age++;
            nextLevel(nextEnt[i], i, model,composition);
        }
        return nextEnt;
    }

    //menghitung index tetangga
    double getNeighborIndex(CA model, int idxEnt) {
        int size = model.neighSize;
        double sum = 0.0;
        for (int i = 0; i < size; i++) {
            double sum1 = 0.0;
            for (int j = 0; j < model.popSize; j++) {
                sum1 = sum1 + model.N.neighbors[i].neighborMatrix[idxEnt][j];
            }
            sum = sum + sum1 / (model.popSize - 1) * model.N.weight[i];
        }
        return sum;
    }
    //perubahan di threshold
    void nextLevel(Entrepreneurs ne, int i, CA model,double [] composition) {
        //kasus umur yang sudah lebih dari 64th
        if (ne.age > (64 * 12)) {
            ne.level = State.RETIRED;
            ne.b_age = 0;
        } else {
            double idx = getIndex(i, model,composition);
            threshold = Double.parseDouble(InputDataHandler.getValue("threshold"));
            if (idx < threshold ) {
                ne.level = State.POTENTIAL;
                ne.b_age = 0;
            } else {
                switch (ne.level) {
                    case 0: //potential
                        ne.level = State.NASCENT;
                        break;
                    case 1: //nascent
                        if (ne.b_age > 3) {
                            ne.level = State.NEW_BOM;
                            break;
                        }
                    case 2: //new_bm
                        if (ne.b_age > 42) {
                            ne.level = State.ESTABLISH_BOM;
                            break;
                        }
                }
            }
        }
    }
    double getIndex(int i, CA model,double [] composition) {
        return composition[0] * model.E[i].point + composition[1] * this.getNeighborIndex(model, i) + composition[2] * this.pub.getPublicIdx();
    }

    //pendefinisian ketetanggaan
    //perubahan -> ditambahin casenya
    void NeighborhoodDefinition() {
        int n = this.N.numNeighbor;
        int ng = this.popSize;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < ng; j++) {
                for (int k = 0; k < ng; k++) {
                    switch (i) {
                        case 0: // level
                            // kalau relasinya sama dengan
                            if ((this.N.relation[i] == 0) && (this.E[j].level == this.E[k].level)) {
                                this.N.neighbors[i].neighborMatrix[j][k] = 1.0;
                            }
                            // kalau relasinya kurang dari sama dengan
                            if ((this.N.relation[i] == 1) && (this.E[j].level <= this.E[k].level)) {
                                this.N.neighbors[i].neighborMatrix[j][k] = 1.0;
                            }
                            // kalau relasinya lebih dari sama dengan
                            if ((this.N.relation[i] == 2) && (this.E[j].level >= this.E[k].level)) {
                                this.N.neighbors[i].neighborMatrix[j][k] = 1.0;
                            }
                            break;
                        case 1: // b_area
                            // kalau relasinya sama dengan
                            if ((this.N.relation[i] == 0) && (this.E[j].b_category == this.E[k].b_category) && (this.E[j].b_area == this.E[k].b_area)) {
                                this.N.neighbors[i].neighborMatrix[j][k] = 1.0;
                            }
                            break;
                        case 2: //location
                            // kalau relasinya sama dengan
                            if ((this.N.relation[i] == 0) && (this.E[j].location == this.E[k].location)) {
                                this.N.neighbors[i].neighborMatrix[j][k] = 1.0;
                            }
                            break;
                        case 3: // jenis kelamin
                            if ((this.N.relation[i] == 0) && (this.E[j].sex == this.E[k].sex)) {
                                this.N.neighbors[i].neighborMatrix[j][k] = 1.0;
                            }
                            break;
                        case 4: // umur
                            if ((this.N.relation[i] == 0) && (this.E[j].age == this.E[k].age)) {
                                this.N.neighbors[i].neighborMatrix[j][k] = 1.0;
                            }
                            // kalau relasinya kurang dari sama dengan
                            if ((this.N.relation[i] == 1) && (this.E[j].age <= this.E[k].age)) {
                                this.N.neighbors[i].neighborMatrix[j][k] = 1.0;
                            }
                            // kalau relasinya lebih dari sama dengan
                            if ((this.N.relation[i] == 2) && (this.E[j].age >= this.E[k].age)) {
                                this.N.neighbors[i].neighborMatrix[j][k] = 1.0;
                            }
                            break;
                         
                        case 5: // pendidikan
                            if ((this.N.relation[i] == 0) && (this.E[j].education == this.E[k].education)) {
                                this.N.neighbors[i].neighborMatrix[j][k] = 1.0;
                            }
                            // kalau relasinya kurang dari sama dengan
                            if ((this.N.relation[i] == 1) && (this.E[j].education <= this.E[k].education)) {
                                this.N.neighbors[i].neighborMatrix[j][k] = 1.0;
                            }
                            // kalau relasinya lebih dari sama dengan
                            if ((this.N.relation[i] == 2) && (this.E[j].education >= this.E[k].education)) {
                                this.N.neighbors[i].neighborMatrix[j][k] = 1.0;
                            }
                            break;
                        case 6: // pendapatan
                            if ((this.N.relation[i] == 0) && (this.E[j].income == this.E[k].income)) {
                                this.N.neighbors[i].neighborMatrix[j][k] = 1.0;
                            }
                            // kalau relasinya kurang dari sama dengan
                            if ((this.N.relation[i] == 1) && (this.E[j].income <= this.E[k].income)) {
                                this.N.neighbors[i].neighborMatrix[j][k] = 1.0;
                            }
                            // kalau relasinya lebih dari sama dengan
                            if ((this.N.relation[i] == 2) && (this.E[j].income >= this.E[k].income)) {
                                this.N.neighbors[i].neighborMatrix[j][k] = 1.0;
                            }
                            break;
                    }
                }
            }
        }
    }

    void genDummyEntrepreneurs() {
        this.E[0] = new Entrepreneurs(false, 18 * 12, 0, 0, 3, 4, 3, 4, 0, 0.0);
        this.E[1] = new Entrepreneurs(true, 35 * 12, 0, 0, 2, 4, 0, 4, 1, 0.0);
        this.E[2] = new Entrepreneurs(false, 55 * 12, 0, 0, 1, 4, 0, 4, 2, 0.0);
        this.E[3] = new Entrepreneurs(true, 27 * 12, 0, 0, 3, 4, 1, 4, 1, 0.0);
        this.E[4] = new Entrepreneurs(true, 30 * 12, 0, 0, 1, 4, 1, 4, 0, 0.0);
        this.E[5] = new Entrepreneurs(false, 45 * 12, 0, 0, 1, 4, 2, 4, 4, 0.0);
        this.E[6] = new Entrepreneurs(false, 33 * 12, 0, 0, 2, 4, 3, 4, 2, 0.0);
        this.E[7] = new Entrepreneurs(true, 20 * 12, 0, 0, 3, 4, 2, 4, 0, 0.0);
        this.E[8] = new Entrepreneurs(false, 38 * 12, 0, 0, 5, 4, 3, 4, 1, 0.0);
        this.E[9] = new Entrepreneurs(false, 41 * 12, 0, 0, 5, 4, 0, 4, 0, 0.0);
    }

    void genSimulationData() {
        int nSim = this.popSize;
        Random r = new Random();
        int n;
        for (int i = 0; i < nSim; i++) {
            this.E[i] = new Entrepreneurs();
            n = r.nextInt(nSim);
            if (n < nSim * 0.6) {
                this.E[i].sex = State.FEMALE;
            } else {
                this.E[i].sex = State.MALE;
            }

            //location
            n = r.nextInt(16);
            this.E[i].location = n;
            //category business, ada 3 dan area bisnis
            n = r.nextInt();
            this.E[i].b_category = n;
            switch (this.E[i].b_category) {
                case 0:
                    this.E[i].b_area = r.nextInt(3);
                    break;
                case 1:
                    this.E[i].b_area = r.nextInt(12);
                    break;
                case 2:
                    this.E[i].b_area = r.nextInt(16);
                    break;
            }

            //income
            n = r.nextInt(6);
            this.E[i].income = n;

            //education
            n = r.nextInt(6);
            this.E[i].education = n;

            int m = r.nextInt(100);
            if (m > 80) { // 18-24
                this.E[i].age = (r.nextInt(7) + 18) * 12;
            } else if (m > 60) { // 25-34
                this.E[i].age = (r.nextInt(10) + 25) * 12;
            } else if (m > 40) { // 35-44
                this.E[i].age = (r.nextInt(10) + 35) * 12;
            } else if (m > 20) { // 45-54
                this.E[i].age = (r.nextInt(10) + 45) * 12;
            } else if (m > 5) { // 55-64
                this.E[i].age = (r.nextInt(10) + 55) * 12;
            } else {
                this.E[i].age = 65 * 12;
            }

            if (this.E[i].age > 64 * 12) {
                this.E[i].level = State.RETIRED;
            } else {
                if (this.E[i].age < 25 * 12) {
                    n = r.nextInt(100);
                    if (n < 70) {
                        this.E[i].level = State.POTENTIAL;
                    } else if (n < 90) {
                        this.E[i].level = State.NASCENT;
                    } else {
                        this.E[i].level = State.NEW_BOM;
                    }
                } else {
                    if (this.E[i].age < 35 * 12) {
                        n = r.nextInt(100);
                        if (n < 60) {
                            this.E[i].level = State.POTENTIAL;
                        } else if (n < 85) {
                            this.E[i].level = State.NASCENT;
                        } else if (n < 95) {
                            this.E[i].level = State.NEW_BOM;
                        } else {
                            this.E[i].level = State.ESTABLISH_BOM;
                        }
                    } else {
                        if (this.E[i].age < 45 * 12) {
                            n = r.nextInt(100);
                            if (n < 45) {
                                this.E[i].level = State.POTENTIAL;
                            } else if (n < 60) {
                                this.E[i].level = State.NASCENT;
                            } else if (n < 80) {
                                this.E[i].level = State.NEW_BOM;
                            } else {
                                this.E[i].level = State.ESTABLISH_BOM;
                            }
                        } else {
                            if (this.E[i].age < 55 * 12) {
                                n = r.nextInt(100);
                                if (n < 25) {
                                    this.E[i].level = State.POTENTIAL;
                                } else if (n < 55) {
                                    this.E[i].level = State.NASCENT;
                                } else if (n < 75) {
                                    this.E[i].level = State.NEW_BOM;
                                } else {
                                    this.E[i].level = State.ESTABLISH_BOM;
                                }
                            } else {
                                n = r.nextInt(100);
                                if (n < 10) {
                                    this.E[i].level = State.POTENTIAL;
                                } else if (n < 20) {
                                    this.E[i].level = State.NASCENT;
                                } else if (n < 50) {
                                    this.E[i].level = State.NEW_BOM;
                                } else {
                                    this.E[i].level = State.ESTABLISH_BOM;
                                }
                            }
                            //umur bisnis
                            switch (this.E[i].level) {
                                case 1:
                                    this.E[i].b_age = r.nextInt(3) + 1;
                                    break;
                                case 2:
                                    this.E[i].b_age = r.nextInt(39) + 4;
                                    break;
                                case 3:
                                    this.E[i].b_age = r.nextInt(this.E[i].age = 18 * 12) + 1;
                                    break;
                            }
                        }
                    }
                }
            }
        }
    }

    void writeSimulationData(String namaFile) {
        String teks = "";
        try {
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(namaFile, true)));
            System.out.println(this.popSize);
            for (int i = 0; i < this.popSize; i++) {
                teks = "";
                if (this.E[i].sex) {
                    teks = teks + "1, ";
                } else {
                    teks = teks + "0, ";
                }
                teks = teks + this.E[i].age + ", ";
                teks = teks + this.E[i].b_age + ", ";
                teks = teks + this.E[i].b_category + ", ";
                teks = teks + this.E[i].b_area + ", ";
                teks = teks + this.E[i].education + ", ";
                teks = teks + this.E[i].location + ", ";
                teks = teks + this.E[i].income + ", ";
                teks = teks + this.E[i].level;
                System.out.println(teks);
            }
            System.out.close();
        } catch (IOException e) {
            System.out.println("Gagal menulis ke file " + namaFile);
            e.printStackTrace();
        }
    }

    void readSimulationData(String fileName) {
        String line = "";
        String separator = ", ";
        BufferedReader br = null;
        String teks = "";
        String[] jm;

        try {
            br = new BufferedReader(new FileReader(fileName));
            System.out.println("proses baca file...");
            line = br.readLine();
            line = br.readLine();
            this.popSize = Integer.parseInt(line.trim());
            for (int i = 0; i < this.popSize; i++) {
                line = br.readLine();
                jm = line.split(separator);

                this.E[i] = new Entrepreneurs();
                // sex, false = 0, true = 1
                if (Integer.parseInt(jm[0].trim()) == 0) {
                    this.E[i].sex = false;
                } else {
                    this.E[i].sex = true;
                }
                this.E[i].age = Integer.parseInt(jm[1].trim());
                this.E[i].b_age = Integer.parseInt(jm[2].trim());
                this.E[i].b_category = Integer.parseInt(jm[3].trim());
                this.E[i].b_area = Integer.parseInt(jm[4].trim());
                this.E[i].education = Integer.parseInt(jm[5].trim());
                this.E[i].location = Integer.parseInt(jm[6].trim());
                this.E[i].income = Integer.parseInt(jm[7].trim());
                this.E[i].level = Integer.parseInt(jm[8].trim());
                this.E[i].point = 0.0;
            }
            br.close();

        } catch (IOException e) {
            System.out.println("Gagal membaca dari file " + fileName);
            e.printStackTrace();
        }

    }

//    // penambahan method baca file
//    void readData(Object[] isiDataFile) {
//        int i;
//        for (i = 0; i < isiDataFile.length; i++) {
//            String lines = isiDataFile[i].toString().trim();
//            String[] dataRow = lines.split(",");
////            model.addRow(dataRow);
//
//
//            // kendala : gimana caranya ngirim data ini ke kelas ECASimulatorJFrame ?
//        }
//
//    }

    void print(int iter) {
        int l0 = 0;
        int l1 = 0;
        int l2 = 0;
        int l3 = 0;
        int l4 = 0;
        for (int i = 0; i < this.popSize; i++) {
            switch (this.E[i].level) {
                case 0:
                    l0++;
                    break;
                case 1:
                    l1++;
                    break;
                case 2:
                    l2++;
                    break;
                case 3:
                    l3++;
                    break;
                case 4:
                    l4++;
                    break;
            }
        }
        System.out.println(iter + ", " + l0 + ", " + l1 + ", " + l2 + ", " + l3 + ", " + l4);
    }
    // perubahan : ditambahin faktor psikologisnya
    void calculatePoint(double[] POAm, double[] POAf, double[] POEm, double[] POEf, double[] POLm, double[] POLf, double[] POIm, double[] POIf, double[] PCAm, double[] PCAf, double[] PCEm, double[] PCEf, double[] PCLm, double[] PCLf, double[] PCIm, double[] PCIf, double[] RMAm, double[] RMAf, double[] RMIm, double[] RMIf, double[] FFAf, double[] FFAm, double[] FFEf, double[] FFEm, double[] FFLf, double[] FFLm, double[] MALf, double[] MALm, double[] MAIf, double[] MAIm, double[] HSSIf, double[] HSSIm, double[] HSSLf, double[] HSSLm, double[] HSSAf, double[] HSSAm, double[] HSSEf, double[] HSSEm ) {
        for (int i = 0; i < this.popSize; i++) {
            int a = getAgeRange(E[i].age);
            if (this.E[i].sex) {
                E[i].point = (POAm[a] + POEm[E[i].education] + POLm[E[i].location] + POIm[E[i].income]) * 0.47 + (PCAm[a] + PCEm[E[i].education] + PCLm[E[i].location] + PCIm[E[i].income]) * 0.62 + (RMAm[a] + RMIm[E[i].income]) * 0.67 + (FFAm[a] + FFEm[E[i].education] + FFLm[E[i].location]) * 0.35 + (MALm[E[i].location] + MAIm[E[i].income]) * 0.75 + (HSSAm[a] + HSSIm[E[i].income] + HSSLm[E[i].location] + HSSEm[E[i].education]) * 0.8;
            } else {
                E[i].point = (POAf[a] + POEf[E[i].education] + POLf[E[i].location] + POIf[E[i].income]) * 0.47 + (PCAf[a] + PCEf[E[i].education] + PCLf[E[i].location] + PCIf[E[i].income]) * 0.62 + (RMAf[a] + RMIf[E[i].income]) * 0.67 + (FFAf[a] + FFEf[E[i].education] + FFLf[E[i].location]) * 0.35 + (MALf[E[i].location] + MAIf[E[i].income]) * 0.75 + (HSSAf[a] + HSSIf[E[i].income] + HSSLf[E[i].location] + HSSEf[E[i].education]) * 0.8;
            }
            System.out.println("i = "+ i + " point = "+E[i].point);
        }
    }

    int getAgeRange(int a) {
        int ageC = -1;
        if (a >= 55 * 12 && a <= 64 * 12) {
            ageC = 0;
        } else if (a >= 45 * 12) {
            ageC = 1;
        } else if (a >= 34 * 12) {
            ageC = 2;
        } else if (a >= 24 * 12) {
            ageC = 3;
        } else {
            ageC = 4;
        }
        return ageC;
    }

    //penambahan
//    public void setA(double a) {
//        this.a = a;
//    }
//
//    public void setB(double b) {
//        this.b = b;
//    }
//
//    public void setC(double c) {
//        this.c = c;
//    }
//    public void setThreshold(double threshold) {
//        this.threshold = threshold;
//    }
//
//    public double getThreshold() {
//        return threshold;
//    }

//    public double getA() {
//        return a;
//    }
//
//    public double getB() {
//        return b;
//    }
//
//    public double getC() {
//        return c;
//    }
//    public double getBobotUmur() {
//        return bobotUmur;
//    }
//
//    public void setBobotUmur(double bobotUmur) {
//        this.bobotUmur = bobotUmur;
//    }
//
//    public double getBobotLevel() {
//        return bobotLevel;
//    }
//
//    public void setBobotLevel(double bobotLevel) {
//        this.bobotLevel = bobotLevel;
//    }
//
//    public double getBobotPendidikan() {
//        return bobotPendidikan;
//    }
//
//    public void setBobotPendidikan(double bobotPendidikan) {
//        this.bobotPendidikan = bobotPendidikan;
//    }
//
//    public double getBobotPendapatan() {
//        return bobotPendapatan;
//    }
//
//    public void setBobotPendapatan(double bobotPendapatan) {
//        this.bobotPendapatan = bobotPendapatan;
//    }
}
