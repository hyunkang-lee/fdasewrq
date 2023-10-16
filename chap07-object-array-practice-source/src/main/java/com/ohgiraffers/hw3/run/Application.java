package src.main.java.com.ohgiraffers.hw3.run;

import src.main.java.com.ohgiraffers.hw3.controller.ProductController;

public class Application {

    public static void main(String[] args) {
        ProductController pc = new ProductController();
        pc.mainMenu();
    }
}
