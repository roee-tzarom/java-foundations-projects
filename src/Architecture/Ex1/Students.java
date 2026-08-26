// -----------------------------------------------------------------------------
// Student-domain model used by the architecture exercise. It groups the student
// data and the operations that operate on that data in one small abstraction.
// -----------------------------------------------------------------------------

package Architecture.Ex1;
import java.io.*;


public class Students {
    private int[] studentsArray;


    public int[] insertGrades(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;


        int count = 0;
        while ((line = br.readLine()) != null) {
            count++;
        }
        br.close();


        String[] grades = new String[count];
        br = new BufferedReader(new FileReader(fileName));
        int index = 0;


        while ((line = br.readLine()) != null) {
            grades[index++] = line;
        }
        br.close();


        studentsArray = new int[grades.length];


        for (int i = 0; i < grades.length; i++) {
            String studentGrades = grades[i];
            String[] parts = studentGrades.split(",");
            int grade1 = Integer.parseInt(parts[0]);
            int grade2 = Integer.parseInt(parts[1]);
            int grade3 = Integer.parseInt(parts[2]);
            int grade4 = Integer.parseInt(parts[3]);
            studentsArray[i] = (grade4 << 24) | (grade3 << 16) | (grade2 << 8) | grade1;
        }
