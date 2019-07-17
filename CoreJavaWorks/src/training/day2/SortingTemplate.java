package training.day2;

import java.util.Arrays;
import java.util.Comparator;

public class SortingTemplate {

	public static Student[] sortByNameAsc(Student[] students) {

		Arrays.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getsName().compareTo(o2.getsName());
			}
		});
		return students;
	}

	public static Student[] sortByNameDesc(Student[] students) {

		Arrays.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o2.getsName().compareTo(o1.getsName());
			}
		});
		return students;
	}

	public static Student[] sortByIdAsc(Student[] students) {
		Arrays.sort(students, (s1, s2) -> {
			return s1.getsId() - s2.getsId();
		});
		return students;
	}

	public static boolean  isStudentFound(Student[] students, int id) {

		int arr[] = new int[students.length]; 
		
		for(int i=0; i<students.length; i++) {
			arr[i] = students[i].getsId(); 
		}
		return Arrays.binarySearch(arr, id)>-1; 
	}

}


















