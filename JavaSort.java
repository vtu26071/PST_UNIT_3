import java.util.*;
class Student {
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Student> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int id = in.nextInt();
            String name = in.next();
            double cgpa = in.nextDouble();
            list.add(new Student(id, name, cgpa));
        // Sorting using Comparator
        Collections.sort(list, new Comparator<Student>() {
            public int compare(Student a, Student b) {
                // 1. CGPA descending
                if (a.getCgpa() != b.getCgpa()) {
                    return Double.compare(b.getCgpa(), a.getCgpa());
                }
                // 2. Name ascending
                int nameCompare = a.getFname().compareTo(b.getFname());
                if (nameCompare != 0) {
                    return nameCompare;
                }
                // 3. ID ascending
                return a.getId() - b.getId();
            }
        });
        // Print result
        for (Student s : list) {
            System.out.println(s.getFname());
        }
    }
}
