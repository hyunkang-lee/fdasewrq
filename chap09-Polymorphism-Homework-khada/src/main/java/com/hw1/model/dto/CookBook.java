package com.hw1.model.dto;

public class CookBook extends Book {

    private boolean coupon;

    public boolean isCoupon() {
        return coupon;
    }

    public void setCoupon(boolean coupon) {
        this.coupon = coupon;
    }
    public CookBook() {
    }

    public CookBook(String title, String author, String publisher, boolean coupon) {
        super(title, author, publisher);
        this.coupon = coupon;
    }

    @Override
    public String toString() {
        return "제목 : " + this.getTitle() + " " +
                "저자 : " + this.getAuthor() + " " +
                "출판사 : " + this.getPublisher() + " " +
                "쿠폰유무 : " + this.coupon ;
    }
}

