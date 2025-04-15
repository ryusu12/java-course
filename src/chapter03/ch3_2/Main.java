package chapter03.ch3_2;

import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CampService campService = new CampService();

        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        Optional<Student> studentOptional = campService.getStudent(name);

        boolean exist = studentOptional.isPresent();
        if (exist) {
            Student student = studentOptional.get();
            System.out.println(student.getName());
        } else {
            System.out.println("없음");
        }
    }
}
