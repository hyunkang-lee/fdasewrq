package com.hw1.model.dto;

public class AniBook extends Book {
    private int accessAge;

    public int getAccessAge() {
        return accessAge;
    }

    public void setAccessAge(int accessAge) {
        this.accessAge = accessAge;
    }

    public AniBook(String title, String author, String publisher, int accessAge) {
        super(title, author, publisher);
        this.accessAge = accessAge;
    }

    @Override
    public String toString() {
        return  "제목 : " + this.getTitle() + " " +
                "저자 : " + this.getAuthor() + " " +
                "출판사 : " + this.getPublisher() + " " +
                "연령 제한 : " + this.getAccessAge();
    }
}
