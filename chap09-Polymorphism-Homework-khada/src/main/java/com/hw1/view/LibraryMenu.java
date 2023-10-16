package com.hw1.view;

import com.hw1.controller.LibraryManager;
import com.hw1.model.dto.Book;
import com.hw1.model.dto.Member;

import java.util.Scanner;

public class LibraryMenu {


    private LibraryManager lm = new LibraryManager();

        Scanner sc = new Scanner(System.in);



    public void mainMenu(){
        System.out.println("회원등록을 시작합니다.");
        System.out.print("이름을 입력해주세요 : ");
        String name = sc.nextLine();
        System.out.print("나이를 입력해주세요 : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("성별을 입력해주세요 : ");
        char gender = sc.next().charAt(0);
        lm.insertMember(new Member(name,age,gender));
        while (true){
            System.out.println("========== 메뉴 ==========");
            System.out.println("1. 마이페이지");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 대여하기");
            System.out.println("0. 프로그램 종료하기.");
            System.out.print("원하는 프로그램을 선택해주세요. : ");
            int num = sc.nextInt();
            if (num == 1){
                System.out.println(lm.myInfo());
                lm.myInfo();
            }else if (num == 2){
                selectAll();
            } else if (num == 3) {
                serchBook();
                String key = sc.nextLine();
                lm.serchBook(key);
                for (int i = 0; i < lm.serchBook(key).length; i++){
                    if (lm.serchBook(key)[i] != null){
                    System.out.println(lm.serchBook(key)[i]);
                }
                }
            } else if (num == 4) {
                rentBook();
            }else if (num == 0 ){
                System.out.println("프로그램을 종료합니다.");
            }else {
                System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
            }

        }
    }
    public void selectAll(){
        Book[] bList = lm.selectAll();
        for (int i = 0 ; i<bList.length;i++){
            System.out.println(i + "번도서 : " +bList[i]);
        }
    }
    public void serchBook(){
        System.out.print("검색할 제목을 입력해주세요 : ");
        sc.nextLine();
    }
    public void rentBook(){
        selectAll();
        System.out.print("대여할 도서의 번호를 선택해주세요 : ");

        int index = sc.nextInt();
        sc.nextLine();
        lm.rentBook(index);

        if (lm.rentBook(index) == 0){
            System.out.println("성공적으로 대여되었습니다.");
        } else if (lm.rentBook(index) == 1) {
            System.out.println("나이 제한으로 대여 불가능입니다.");
        } else if (lm.rentBook(index) == 2) {
            System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다.");
        }


    }
}
