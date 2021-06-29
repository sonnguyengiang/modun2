package smartbook;

import java.util.Arrays;
import java.util.*;

public class ManageBook extends Book{
    Book[] books = new Book[0];
    public void insert(){
        Book book = crate();
        Book[] books1 = new Book[books.length + 1];
        for (int i = 0; i < books.length; i++) {
            books1[i] = books[i];
        }
        books1[books.length] = book;
        books = books1;
    }
    public void remove(String name){
        Book[] books1 = new Book[books.length + 1];
        int index = -1;
        for (int i = 0; i < books.length; i++) {
            if (this.getName().equals(name)){
                index = i;
                break;
            }
        }
        if (index > 0) {
        for (int i = 0; i < books.length; i++) {
                if (i < index){
                    books1[i] = books1[i];
                } else {
                    books1[i] = books1[i + 1];
                }

            }
        }
        books = books1;
    }
    public void update(int index){
        Book book = crate();
        books[index] = book;
    }
    public void search(String name){
        int index = -1;
        for (int i = 0; i < books.length; i++){
            if (books[i].getName().equals(name)){
                index = i;
                break;
            }
        }
        if (index >= 0){
            books[index].Display();
        } else {
            System.out.println("không có quyển sách nào tên " + name);
        }
    }

    public void sort(){
        Arrays.sort(books);
    }
    public Book crate(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("enter a name: ");
        String name = scanner.nextLine();
        System.out.print("enter a PublishDate: ");
        String publishDate = scanner.nextLine();
        System.out.print("enter a author");
        String author = scanner.nextLine();
        System.out.print("enter a language: ");
        String language = scanner.nextLine();
        System.out.print("enter a AveragePrice: ");
        float averagePrice = Float.parseFloat(scanner.nextLine());
        Book book = new Book(id,name,publishDate,author,language,averagePrice);
        return book;
    }

}