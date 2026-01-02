import java.util.*;

public class StudentMarks {

    public static void main(String[] args) {

        String input = "Arun=75;Ajith=78;Raj=81";
        String[] entries = input.split(";");

        List<String> students = new ArrayList<>();
        List<Integer> marks = new ArrayList<>();

        int total = 0;
        for (String entry : entries) {
            String[] parts = entry.split("=");
            String name = parts[0];
            int mark = Integer.parseInt(parts[1]);

            students.add(name);
            marks.add(mark);
            total += mark;
        }
        Collections.sort(marks);
        int average = total / marks.size();
        System.out.println("Students: " + students);
        System.out.println("Marks in ascending order: " + marks);
        System.out.println("Average mark: " + average);
    }
}
