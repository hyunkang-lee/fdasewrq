package src.main.java.com.ohgiraffers.hw3.model.vo;

public class ProductDTO {

    private int pld;
    private String pName;
    private int price;
    private double tax;

    public ProductDTO() {

    }

    public ProductDTO(int pld, String pName, int price, double tax) {
        this.pld = pld;
        this.pName = pName;
        this.price = price;
        this.tax = tax;
    }

    public String information(){
        return "등록하신 제품은 제품번호 : " + pld +
                " 제품이름 : " + pName + " 가격 : " + price + "원 제품의 세금 : " + tax + "입니다.";
    }


}
