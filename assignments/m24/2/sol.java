import java.util.*;

public class sol {
	sol() {

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BST<Double, ArrayList<Student>> bst = new BST<>();
		int n = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < n; i++) {
			String[] tokens = scan.nextLine().split(",");
			Student stud = new Student(Integer.parseInt(tokens[0]), tokens[1], Double.parseDouble(tokens[2]));
			if (!bst.contains(Double.parseDouble(tokens[2]))) {
			bst.put(Double.parseDouble(tokens[2]), new ArrayList<Student>());
			}
			bst.get(Double.parseDouble(tokens[2])).add(stud);
		}
		
		// System.out.println(bst.keys());

		int q = Integer.parseInt(scan.nextLine());
		for (int j = 0; j < q; j++) {
			String[] input = scan.nextLine().split(" ");
			if(input[0].equals("BE")) {
				for (Double each: bst.keys(Double.parseDouble(input[1]), Double.parseDouble(input[2]))) 
				{
					for(Student s : bst.get(each)) {
						System.out.println(s);
					}

				}

			}

			if(input[0].equals("LE")) {
				for(Double each : bst.keys(bst.min(), Double.parseDouble(input[1]))) {
					for (Student t : bst.get(each)) {
						System.out.println(t);
					}
				}
			}


			if(input[0].equals("GE")) {
				for(Double each : bst.keys(Double.parseDouble(input[1]), bst.max())) {
					for (Student u : bst.get(each)) {
						System.out.println(u);
					}
				}
			}


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

	public int compareTo(Student that) {
		if(this.marks > that.marks) {
			return 1;
		}

		if(this.marks < that.marks) {
			return -1;
		}

		return 0;
	}

	public int getRoll() {
		return this.roll;
	}

	public String getName() {
		return this.name;
	}

	public Double getMarks() {
		return this.marks;
	}

	public String toString() {
		return this.name;

	}
}