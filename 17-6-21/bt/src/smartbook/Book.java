package smartbook;
import ibook.*;
import java.util.*;
public class Book implements IBook,Comparable<Book>{
    private int id;
    private String name;
    private String publishdate;
    private String author;
    private String Lauguage;
    private float averaprice;
    public Book(){}

    public Book(int id, String name, String publishdate, String author, String lauguage, float averaprice) {
        this.id = id;
        this.name = name;
        this.publishdate = publishdate;
        this.author = author;
        Lauguage = lauguage;
        this.averaprice = averaprice;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublishdate() {
        return publishdate;
    }

    public void setPublishdate(String publishdate) {
        this.publishdate = publishdate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLauguage() {
        return Lauguage;
    }

    public void setLauguage(String lauguage) {
        Lauguage = lauguage;
    }

    public float getAveraprice() {
        return averaprice;
    }

    public void setAveraprice(float averaprice) {
        this.averaprice = averaprice;
    }

    @Override
    public int compareTo(Book o) {
        return this.getName().compareTo(o.getName());
    }

    @Override
    public void Display() {
        System.out.println("Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", publishdate='" + publishdate + '\'' +
                ", author='" + author + '\'' +
                ", Lauguage='" + Lauguage + '\'' +
                ", averaprice=" + averaprice +
                '}');
    }
}
