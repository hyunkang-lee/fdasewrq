package src.main.java.com.ohgiraffers.hw2.model.dto;

public class StudentDTO {
    private int grade;
    private int classroom;
    private String name;
    private int kor;
    private int eng;
    private int math;

    public StudentDTO() {
    }

    public StudentDTO(int grade, int classroom, String name, int kor, int eng, int math) {
        this.grade = grade;
        this.classroom = classroom;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    public String information(){

        return "grade : " + this.grade
                + ", classroom : " + this.classroom
                + ", name : " + this.name
                + ", kor : " + this.kor
                + ", eng : " + this.eng
                + ", math : " + this.math
                + " 평균 값 : " + ((this.kor + this.eng + this.math)/3);
    }

}
