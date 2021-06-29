import java.util.Scanner;

public class Manager {
    public static Student[] create(Student[] arr){
        Scanner sc = new Scanner(System.in);

        System.out.print("nhập id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập name: ");
        String name = sc.nextLine();
        System.out.print("Nhập gender: ");
        String gender = sc.nextLine();
        System.out.print("nhập tuổi: ");
        int age = Integer.parseInt(sc.nextLine());

        Student student = new Student(id,name,gender,age);
        Student[] arrNew = new Student[arr.length + 1];
        for (int i = 0;i<arr.length;i++) {
            arrNew[i] = arr[i];
        }
        arrNew[arrNew.length-1] = student;
        return arrNew;
    }
}
