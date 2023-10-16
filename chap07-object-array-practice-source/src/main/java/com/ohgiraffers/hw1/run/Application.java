package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        EmployeeDTO[] edarray = new EmployeeDTO[3];
        edarray[0] = new EmployeeDTO();
        edarray[1] = new EmployeeDTO(1,"홍길동",19,'M',"010-2222-3333", "서울 잠실");
        edarray[2] = new EmployeeDTO(2,"강말순","교육부","강사",20,'F',1000000, 0.01,
                                "01011112222","서울 마곡");
        for (int i = 0; i < edarray.length ; i++){
            System.out.println(edarray[i].information());
        }
        edarray[0].setEmpNo(0);
        edarray[0].setEmpName("김말똥");
        edarray[0].setDept("영업부");
        edarray[0].setJob("팀장");
        edarray[0].setAge(30);
        edarray[0].setGender('M');
        edarray[0].setSalary(3000000);
        edarray[0].setBonusPoint(0.2);
        edarray[0].setPhone("01055559999");
        edarray[0].setAddress("전라도 광주");
        edarray[1].setDept("기획부");
        edarray[1].setJob("부장");
        edarray[1].setSalary(4000000);
        edarray[1].setBonusPoint(0.3);
        System.out.println("=============================================");
        for (int i = 0 ; i < edarray.length -1 ; i++){
            System.out.println(edarray[i].information());
        }
        System.out.println((int)(edarray[0].getSalary() + ((edarray[0].getSalary()*edarray[0].getBonusPoint())))*12);

        System.out.println("=================================================");
        int result = 0;
        for (int i = 0; i <edarray.length; i++){
            System.out.println(edarray[i].getEmpName() + "의 연봉 : " +(int)(edarray[i].getSalary() + ((edarray[i].getSalary()*edarray[i].getBonusPoint())))*12);
            result += (int)(edarray[i].getSalary() + ((edarray[i].getSalary()*edarray[i].getBonusPoint())))*12;
        }
        System.out.println("======================================================");

        System.out.println("직원들의 연봉의 평균 : " + (double)result/3);





    }
}
