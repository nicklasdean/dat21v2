package genopfriskning.Genopfriskning_2;

public class Book {
    private int isbn;
    private String title;
    private int publishYear;

    public Book(int isbn, String title, int publishYear) {
        this.isbn = isbn;
        this.title = title;
        this.publishYear = publishYear;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    @Override
    public boolean equals(Object b){
        return true;
    }
}
