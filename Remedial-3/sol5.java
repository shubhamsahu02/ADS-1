import java.util.*;
import java.util.HashMap;

public class sol5 {

	sol5() {

	}



	public static void main(String[] args) {
		HashMap <Double, ArrayList<Student>> hm = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		for(int i = 0; i < n; i++) {
		String[] tokens = scan.nextLine().split(",");
		Student stud = new Student(Integer.parseInt(tokens[0]), tokens[1], Double.parseDouble(tokens[2]));

		if(!hm.containsKey(tokens[2])) {
			hm.put(Double.parseDouble(tokens[2]), new ArrayList<Student>());

		}

	}

	int q = Integer.parseInt(scan.nextLine());
	for (int i = 0; i < q; i++) {

	}
	}
}


class Student {
	int roll;
	String name;
	double marks;

	Student(int roll, String name, double marks) {

		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	public int getRoll() {
		return this.roll;
	}


	public String getName() {
		return this.name;
	}

	public double getMarks() {
		return this.marks;
	}

	public int compareTo(Student that) {

		if (this.marks > that.marks) {
			return 1;
		}

		if(this.marks < that.marks) {
			return -1;
		}

		if(this.name.compareTo(that.name) > 0) {
			return 1;
		}

		if (this.name.compareTo(that.name) < 0) {
			return -1;
		}

		if(this.roll > that.roll) {
			return 1;
		}

		if (this.roll < that.roll) {
			return -1;
		}

		else {
			return 0;
		}
	}



}
