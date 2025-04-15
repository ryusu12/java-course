package chapter03.ch3_2;

import java.util.Optional;

public class CampService {
    private static final Student[] students = {
            new Student("Spartan"),
            new Student("Steve"),
            new Student("John")
    };

    public Optional<Student> getStudent(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                // if문을 들어온 순간, 이미 null이 아님을 보장받음
                // return Optional.ofNullable(student);
                return Optional.of(student);
            }
        }
        // for문 밖으로 나온 순간, 이미 student == null
        // return Optional.ofNullable(null);
        return Optional.empty();
    }
}
