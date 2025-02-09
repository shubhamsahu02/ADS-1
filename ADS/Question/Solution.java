import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		Candidate candidate;
		MaxPQ<Candidate> pq = new MaxPQ<>();
		while (scan.hasNext()) {
			String line = scan.nextLine();
			String[] tokens = line.split(" ");

			switch (tokens[0]) {

				case "Apply":
				String[] tokens1 = tokens[1].split(",");
				 candidate = new Candidate(Integer.parseInt(tokens1[0]), tokens1[1], tokens1[2], Double.parseDouble(tokens1[3]));
				 pq.insert(candidate);
				break;

				case "Recruit_Top_Candidate":
				System.out.println(pq.delMax());
				break;

				case "Ranking" :
				System.out.println();
				int size = pq.size();
				for(int i = 0 ; i < size; i++) {
					System.out.println(i+1 + ": " + pq.delMax());
				}
				break;
			}

		}

	}
}