package Introduction_To_Inheritence;

class Book {
    String title;
    int publicationYear;
}

class Author extends Book {
    String name;
    String bio;
    void displayInfo() {
        System.out.println(title + " " + publicationYear + " " + name + " " + bio);
    }
}

public class BookAndAuthor {
    public static void main(String[] args) {
        Author a = new Author();
        a.title = "Java Basics";
        a.publicationYear = 2024;
        a.name = "John";
        a.bio = "Java Developer";
        a.displayInfo();
    }
}
