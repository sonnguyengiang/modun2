package smartbook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManageBook manageBook = new ManageBook();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("BOOK MANAGEMENT SYSTEM");
            System.out.println("1.Insert");
            System.out.println("2.Remove");
            System.out.println("3.Update");
            System.out.println("4.Search");
            System.out.println("5.Sort");
            System.out.println("6.Show");
            System.out.println("7.Exit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    manageBook.insert();
                    break;
                case 2:
                    System.out.println("enter name");
                    String find = scanner.nextLine();
                    manageBook.remove(find);
                    break;
                case 3:
                    System.out.print("enter a index that you want change: ");
                    int index = Integer.parseInt(scanner.nextLine());
                    manageBook.update(index);
                    break;
                case 4:
                    System.out.print("enter a name that you want find: ");
                    String name = scanner.nextLine();
                    manageBook.search(name);
                    break;
                case 5:
                    manageBook.sort();
                    break;
                case 6:
                    for(Book b: manageBook.books){
                        b.Display();
                    }
                    break;
                case 7:
                    System.exit(0);
                    break;
            }
        }
    }
}
