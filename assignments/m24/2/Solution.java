import java.util.*;
import java.util.ArrayList;

public class Solution {
	Solution() {

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		BinarySearchT<Double, ArrayList<Student>> bst = new BinarySearchT<>();
		for (int i = 0; i < n; i++) {
			String[] token = scan.nextLine().split(",");
			Student stud = new Student(Integer.parseInt(token[0]), token[1], Double.parseDouble(token[2]));
			if(!bst.contains(Double.parseDouble(token[2]))) 
			{
				bst.put(Double.parseDouble(token[2]), new ArrayList<Student>());
			}

			bst.get(Double.parseDouble(token[2])).add(stud);

			// details.put(token[], token[])

		}

	}


}


class Student {
	
	int roll;
	String name;
	Double marks;

	Student(int roll, String name, Double marks) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}


	public int getRoll() {
		return roll;
	}

	public String getName() {
		return name;
	}

	public Double getMarks() {
		return marks;
	}

public String toString() {
	String str = "";
	str = str + this.roll + this.name + this.marks;
	return str;
}

}
