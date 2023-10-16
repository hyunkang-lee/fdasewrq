package src.main.java.com.ohgiraffers.hw3.controller;

import src.main.java.com.ohgiraffers.hw3.model.vo.ProductDTO;

import java.util.Scanner;

public class ProductController {

    Scanner sc = new Scanner(System.in);;
    ProductDTO[] pro1 = new ProductDTO[10];
    public static int count = 0;

    public void mainMenu(){
        int a;
        while(true){
            System.out.println("===== 제품 관리 메뉴 =====");
            System.out.println("1. 제품 정보 추가");
            System.out.println("2. 제품 전체 조회");
            System.out.println("9. 프로그램 종료");
            System.out.print("원하는 메뉴를 선택해주세요 : ");
            a = sc.nextInt();
            if (a==1){ productInput();
            }
            else if (a==2) { productPrint();

            } else if (a==9) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }else {
                System.out.println("잘못 선택하셨습니다 종료를 원하면 9를 눌러주세요");
            }
        }



    }
    public void productInput(){
        System.out.println("원하시는 제품을 입력해주세요.");
        System.out.println("제품번호를 입력해주세요.");
        int pld = sc.nextInt();
        System.out.println("제품 명을 입력해주세요.");
        String pName = sc.next();
        System.out.println("제품 가격을 입력해주세요.");
        int price = sc.nextInt();
        System.out.println("제품 세금을 입력해주세요.");
        double tax = sc.nextDouble();
        sc.nextLine();
        pro1[count] = new ProductDTO(pld,pName,price,tax);
            count++;

    }
    public void productPrint(){
        System.out.println(count);

        for (int i = 0; i < count; i++) {
            System.out.println(pro1[i].information());
        }
    }
}
