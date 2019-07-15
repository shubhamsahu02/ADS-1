import java.util.*;

public class sol {


	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		MaxPQ <Student> max = new MaxPQ<>(); 
		Student stud;
		int n = scan.nextInt();
		scan.nextLine();
		while(scan.hasNext()) {
			String[] str = scan.nextLine().split(" ");

			if(str[0].equals("Apply")) {
				String[] str1 = str[1].split(",");
				stud = new Student(Integer.parseInt(str1[0]), str1[1], str1[2], Double.parseDouble(str1[3]));
				max.insert(stud);
			}

			else if (str[0].equals("Recruit_Top_Candidate")) {
				// System.out.println(max.max());
				// max.delMax();
				
				System.out.println(max.delMax());	
			}

			else {
				System.out.println();
				for (int i = 0; i <= max.size(); i++) {
				System.out.println(i+1 + ":" + max.delMax());
			}
				// int k = 0;
				// System.out.println();
				// while(max.size() > 0) {
				// 	k++;
				// 	System.out.println(k + ": " + max.delMax());
				// 	// size--
				}
			}
			// System.out.println(max.size());
		}

	}

// }


class Student  implements Comparable <Student> {
	int id;
	String name;
	String branch;
	double marks;

	public	Student(int id, String name, String branch,double marks) {
			this.id = id;
			this.name = name;
			this.branch = branch;
			this.marks = marks;
		}

		public int getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public String getBranch() {
			return branch;
		}

		public Double getMarks() {
			return marks;
		}


		public int compareTo(Student that) {

			if (this.marks > that.marks){
				return 1;
			}

			if (this.marks < that.marks) {
				return -1;
			}

			if(this.id > that.id) {
				return -1;
			}

			if (this.id < that.id) {
				return 1;
			}

			else {
				return 0;
			}

		}

		public String toString() {
			String string = "";
			string  = string + this.id + "," + this.name + "," + this.branch + "," + this.marks; 
			return string;
		}

}