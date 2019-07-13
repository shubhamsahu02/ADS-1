import java.util.*;
import java.util.HashMap;

public class sol3 {


	sol3() {

	}


	public static void main(String[] args) {
		HashMap<Double, ArrayList<Studentt>> hm = new HashMap<>();
		Studentt stud;
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < n; i++) {
		String[] tokens = scan.nextLine().split(",");
		stud = new Studentt(Integer.parseInt(tokens[0]), tokens[1], Double.parseDouble(tokens[2]));
		if(!hm.containsKey(Double.parseDouble(tokens[2]))); {
		hm.put(Double.parseDouble(tokens[2]), new ArrayList<Studentt>());

		}
		hm.get(Double.parseDouble(tokens[2])).add(stud);

		
	}
	System.out.println(hm.keySet());
	for(Double key: hm.keySet()) {
		String str = "";
		str += hm.get(key);
		// System.out.println(str + "im tr");
		System.out.println(hm.get(key) + "  " +key);
	}

	}

}


class Studentt {

	int roll;
	String name;
	double marks;

	Studentt(int roll, String name, double marks) {
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


	public int compareTo(Studentt that) {

		if (this.marks > that.marks) {
			return 1;
		}

		if (this.marks < that.marks) {
			return -1;
		}

		if (this.name.compareTo(that.name) > 0) {
			return 1;
		}

		if (this.name.compareTo(that.name) < 0) {
			return -1;
		}

		if (this.roll > that.roll) {
			return 1;
		}

		if (this.roll < that.roll) {
			return -1;
		}

		return 0;

	}

	public String toString() {
		String str = "";
		str += this.roll + this.name + this.marks;
		return str;
	}
}

