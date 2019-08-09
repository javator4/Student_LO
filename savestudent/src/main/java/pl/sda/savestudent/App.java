package pl.sda.savestudent;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.studentmodel.Student;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {

        Student student = new Student("Anna", "Kowalski", 1);
        Student student2 = new Student("Jan", "Kowalski", 2);
        Student student3 = new Student("Jan", "Kowalski", 3);

        List<Student> students = Arrays.asList(student, student2, student3);

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            objectMapper.writeValue(new File("student.json"), students);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
