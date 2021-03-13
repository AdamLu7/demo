package Model;

import java.io.Serializable;

public class BookBean implements Serializable {
    private String isbn;
    private String b_name;
    private String author;
    private String pub_name;
    private int sum;

    public BookBean(){}
    public BookBean(String isbn, String title, String author, String publisher, int price) {
        this.isbn = isbn;
        this.b_name = title;
        this.author = author;
        this.pub_name = publisher;
        this.sum = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getB_name() {
        return b_name;
    }

    public void setB_name(String b_name) {
        this.b_name = b_name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPub_name() {
        return pub_name;
    }

    public void setPub_name(String pub_name) {
        this.pub_name = pub_name;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "BookBean{" +
                "isbn='" + isbn + '\'' +
                ",b_name='" + b_name + '\'' +
                ",author='" + author + '\'' +
                ",pub_name='" + pub_name + '\'' +
                ",sum=" + sum +
                '}';
    }
}

