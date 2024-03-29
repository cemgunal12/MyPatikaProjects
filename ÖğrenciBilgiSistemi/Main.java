package ÖğrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {
        Teacher t1=new Teacher("Mahmut Hoca", "TRH", "555");
        Teacher t2=new Teacher("Graham bell", "FZK", "0000");
        Teacher t3 = new Teacher("Ali Veli", "KMY", "999");
        
        Course tarih= new Course("Tarih", "101","TRH");
        Course fizik=new Course("Fizik", "101", "FZK");
        Course kimya=new Course("Kimya", "101", "KMY");
        
        tarih.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);
        
        Student s1 = new Student("İnek Şaban", 4, "140144015", tarih, fizik, kimya);
        s1.addBulkExamNote(50.0,20.0,40.0,70.0,60.0,40.0);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", tarih, fizik, kimya);
        s2.addBulkExamNote(100.0,50.0,40.0,60.0,80.0,50.0);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", tarih, fizik, kimya);
        s3.addBulkExamNote(50.0,20.0,40.0,70.0,90.0,100.0);
        s3.isPass();
    }
}