package set;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentGradeProcessor {
    public static void main(String[] args) {
        List<Integer> grades = Arrays.asList(85, 92, 78, 96, 88, 76, 94, 82, 90, 74);

        System.out.println("Original Grades: " + grades);

        List<Integer> result = grades.stream()
                .filter(grade -> grade >= 80)
                .map(grade -> grade + 5)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Sorted: " + result);
    }
}

