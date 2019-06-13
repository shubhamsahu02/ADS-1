    
import java.util.*;
public class Solution {



	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		Student student;
		MaxPQ<Student> maxpq = new MaxPQ<>();
		while (scan.hasNext()) {
			String line = scan.nextLine();
			String[] tokens = line.split(" ");
			// System.out.println(tokens[0]);
			switch (tokens[0]) {
			case "Apply":
				String[] tokens1 = tokens[1].split(",");
				// System.out.println(tokens1[0]);
				student = new Student(Integer.parseInt(tokens1[0]), tokens1[1], tokens1[2], Double.parseDouble(tokens1[3]));
				maxpq.insert(student);
				break;
			case "Recruit_Top_Candidate":
				System.out.println(maxpq.delMax());
				break;
			case "Ranking":
				System.out.println();
				int size = maxpq.size();
				for (int i = 0; i < size ; i++) {
					System.out.println(i+1 + ": " + maxpq.delMax());
				}







			}
		}
	}
}