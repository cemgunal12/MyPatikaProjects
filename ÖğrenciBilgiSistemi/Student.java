package ÖğrenciBilgiSistemi;

public class Student {
    String name,stuNo;
    int classes;
    Course tarih;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;
    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.tarih = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }
    public void addBulkExamNote(double tarih, double fizik, double kimya,double tarihSözlü,double fizikSözlü,double kimyaSözlü) {

        if (tarih >= 0 && tarih <= 100) {
            if(tarihSözlü>=0 && tarihSözlü<=100){
                this.tarih.note = (tarih*0.80)+(tarihSözlü*0.20);
            }
        }

        if (fizik >= 0 && fizik <= 100) {
            if(tarihSözlü>=0 && tarihSözlü<=100){
                this.fizik.note =(fizik*0.80)+(fizikSözlü*0.20);
            }
        }

        if (kimya >= 0 && kimya <= 100) {
            if(tarihSözlü>=0 && tarihSözlü<=100){
                this.kimya.note =(kimya*0.80)+(kimyaSözlü*0.20);
            }
        }
    }

    public void isPass() {
        if (this.tarih.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (this.fizik.note + this.kimya.note + this.tarih.note) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.tarih.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
    }
}
