package com.hw1.run;

import com.hw1.model.dto.Employee;
import com.hw1.model.dto.Student;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];
        students[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
        students[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
        students[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신학과");

        for(Student student : students ){
            System.out.println(student.information());
        }

        Employee[] ep = new Employee[10];
        int count = 0;

        while (true){
            System.out.print("사원 정보를 입력하시겠습니까? : ");
            char yn = sc.next().charAt(0);
            sc.nextLine();
            if (yn == 'y' || yn == 'Y'){
                System.out.print("이름을 입력해주세요 :");
                String name = sc.nextLine();
                System.out.print("나이를 입력해주세요 : ");
                int age = sc.nextInt();
                System.out.print("신장을 입력해주세요 : ");
                double height = sc.nextDouble();
                System.out.print("몸무게를 입력해주세요 : ");
                double weight = sc.nextDouble();
                System.out.print("급여를 입력해주세요 : ");
                int salary = sc.nextInt();
                sc.nextLine();
                System.out.print("부서를 입력해주세요 : ");
                String dept = sc.nextLine();
                ep[count] = new Employee(name,age,height,weight,salary,dept);
                count++;

                System.out.print("계속 입력하시겠습니까? : ");
                char yn2 = sc.next().charAt(0);
                if (yn2 == 'y' || yn2 =='Y'){
                }else{
                    break;
                }
            }else {
                break;
            }
        }
        for (int i = 0 ; i <count ; i++){
            System.out.println(ep[i].information());
        }




    }
}
