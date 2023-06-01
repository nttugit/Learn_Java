package student_management;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static Student inputAStudent() {
		Scanner scanner = new Scanner(System.in);
		String studentId, fullName;
		int yob;
		double GPA;

		System.out.print("Enter student ID: ");
		studentId = scanner.nextLine();
		System.out.print("Enter student fullname: ");
		fullName = scanner.nextLine();
		System.out.print("Enter student year of birth: ");
		yob = scanner.nextInt();
		System.out.print("Enter student GPA: ");
		GPA = scanner.nextDouble();
		return new Student(studentId, fullName, yob, GPA);
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StudentList studentList = new StudentList();
		int userOption = 0;

		do {
			System.out.println("\n----------------------- STUDENT MANAGEMENT --------------------------");
			System.out.println("Please choose the action according to the corresponding number below:");
			System.out.println("0. Quit\n1. Add a student" + "\n2. Print student list" + "\n3. Check empty list"
					+ "\n4. Get number of students" + "\n5. Clear student list"
					+ "\n6. Check existing student by student ID" + "\n7. Remove a student by student ID"
					+ "\n8. Search students by name" + "\n9. Print student list by GPA descending order"
					+ "\n10. Write students into file" + "\n11. Initialize test data"
					+ "\n12. Read students from file");
			userOption = scanner.nextInt();

			String finalNotification = "";
			if (userOption == 0) {
				System.out.println("Thank you for using!!");
				break;
			}
			if (userOption == 1) {
				studentList.addAStudent(inputAStudent());
			} else if (userOption == 2) {
				studentList.printStudents();
			} else if (userOption == 3) {
				finalNotification = studentList.checkIsEmpty() ? "The student list is empty"
						: "The student list is not empty";
				System.out.println(finalNotification);
			} else if (userOption == 4) {
				int numOfStudents = studentList.count();
				System.out.println("Number of students: " + numOfStudents);
			} else if (userOption == 5) {
				studentList.clearList();
				System.out.println("Clear successfully");
			} else if (userOption == 6) {
				System.out.println("Enter student ID: ");
				String studentID = scanner.next();
				System.out.println("studentID" + studentID);
				Student student = new Student(studentID);
				finalNotification = studentList.checkExistingStudent(student) ? "Exist!" : "Not found";
				System.out.println(finalNotification);
			} else if (userOption == 7) {
				System.out.println("Enter student ID: ");
				String studentID = scanner.next();
				finalNotification = studentList.removeAStudentByID(studentID) ? "Removed!"
						: "Failed to remove the student";
				System.out.println(finalNotification);
			} else if (userOption == 8) {
				System.out.println("Enter the name: ");
				String searchedName = scanner.next();
				System.out.println("Resut for the name " + searchedName + ":");
				ArrayList<Student> students = studentList.findStudentsByName(searchedName);
				if (students.size() > 0) {
					Student.printStudents(students);
				} else {
					System.out.println("Empty");
				}
			} else if (userOption == 9) {
				studentList.sortByGPAByDescencingOrder();
				System.out.println("Sorted!");
			} else if (userOption == 10) {
				System.out.println("Enter the file path: ");
				String filePath = scanner.next();
				File studentFile = new File(filePath);
				studentList.saveStudentListIntoFile(studentFile);
				System.out.println("Success");
			} else if (userOption == 11) {
				Student studentNamedTu = new Student("1", "Nguyen Tuan Tu", 2000, 9);
				Student studentNamedDuyen = new Student("2", "Phan Thi My Duyen", 2000, 10);
				Student studentNamedTuan = new Student("3", "La Thanh Tuan", 1999, 8);
				studentList.addAStudent(studentNamedTu);
				studentList.addAStudent(studentNamedDuyen);
				studentList.addAStudent(studentNamedTuan);
				System.out.println("Initilize test data successfully!!");
			} else if (userOption == 12) {
				System.out.println("Enter the file path: ");
				String filePath = scanner.next();
				File studentFile = new File(filePath);
				studentList.readDataFromFile(studentFile);
				System.out.println("Import successfully");
			} else {
				System.out.println("Oh no");
			}

		} while (userOption != 0);

	}

}
