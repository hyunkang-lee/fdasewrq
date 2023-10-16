package src.main.java.com.ohgiraffers.hw2.run;

import src.main.java.com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDTO[] sd1 = new StudentDTO[10];
        StudentDTO[] sd = new StudentDTO[10];


        int count = 0;
        while (true){
            System.out.print("학생의 정보를 입력하시겠습니까? : ");
            char yn = sc.next().charAt(0);

            if (yn == 'y' || yn == 'Y'){
                System.out.println("학년을 입력해주세요.");
                int grade = sc.nextInt();
                System.out.println("반을 입력해주세요.");
                int classroom = sc.nextInt();
                sc.nextLine();
                System.out.println("이름을 입력해주세요.");
                String name = sc.nextLine();
                System.out.println("국어점수를 입력해주세요.");
                int kor = sc.nextInt();
                System.out.println("영어점수를 입력해주세요.");
                int eng = sc.nextInt();
                System.out.println("수학점수를 입력해주세요.");
                int math = sc.nextInt();
                sc.nextLine();
                sd1[count] = new StudentDTO(grade, classroom, name, kor, eng, math);
                System.out.println(sd1[count].information());
                for (int i = count; i < sd1.length; i++){
                    sd[i] = sd1[count];
                }
                count++;
            }else {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
        for (int i = 0 ; i < count ; i++){
            System.out.println(sd[i].information());

        }
    }
}
