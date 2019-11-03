package training.day2;

import java.util.Arrays;

public class StudentSortImpl {
	public static void main(String[] args) {

		Student[] students = { new Student(101, "Hari", 44), new Student(23, "Chris", 44),
				new Student(444, "Anjani", 44), new Student(33, "Mayur", 44), new Student(12, "Abhilash", 44) };

		for (Student temp : students) {
			System.out.println(temp);
		}

//		Arrays.sort(students);

		SortingTemplate.sortByIdAsc(students);
		System.out.println(SortingTemplate.isStudentFound(students, 3333));

		System.out.println("--------------------");
		for (Student temp : students) {
			System.out.println(temp);
		}

	}
}
