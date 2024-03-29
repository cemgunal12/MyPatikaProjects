package ÖğrenciBilgiSistemi;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    double note;

    Course(String name,String code,String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.note=0;
    }
    public void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher=teacher;
            printTeacherInfo();
        }else{
            System.out.println("Öğretmen ve Ders Bölümleri uyuşmuyor!");
        }
    }
    public void printTeacherInfo(){
        this.teacher.print();
    }
}
