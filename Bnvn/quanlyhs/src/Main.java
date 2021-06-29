import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student[] arrStudent = new Student[1];
        arrStudent[0] = new Student(0, "name", "gender", 0);
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice !=0 ) {
            System.out.println("1. thêm");
            System.out.println("2. sửa");
            System.out.println("3. xóa");
            System.out.println("4. hiện thị");
            System.out.println("0. out");
            System.out.println("enter choice: ");
            choice = scanner.nextInt();
            String name;
            String gender;
            String age;
            int i = 0;
            switch (choice) {
                case 1:
                    arrStudent = Manager.create(arrStudent);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    for (Student s:arrStudent) {
                        System.out.println(s);
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("no choice!");
            }
        }

    }
}
