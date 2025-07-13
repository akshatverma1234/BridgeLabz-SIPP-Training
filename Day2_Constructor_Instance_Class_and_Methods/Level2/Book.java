package Day2_Constructor_Instance_Class_and_Methods.Level2;

import java.util.*;

class Book {
    public String ISBN;
    protected String title;
    private String author;

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends Book {
    public void display() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EBook eb = new EBook();
        eb.ISBN = sc.nextLine();
        eb.title = sc.nextLine();
        eb.setAuthor(sc.nextLine());

        eb.display();
        System.out.println("Author: " + eb.getAuthor());
    }
}
