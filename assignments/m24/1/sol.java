import java.util.*;
import java.util.HashMap;

class sol {

	sol() {

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<Integer, String> name = new HashMap<>();
		HashMap<Integer, Double> marks = new HashMap<>();
		int n = Integer.parseInt(scan.nextLine());
		// scan.nextLine();
		for (int i = 0; i < n; i++) {
			String[] token = scan.nextLine().split(",");
			// System.out.println(token[0]);
			name.put(Integer.parseInt(token[0]), token[1]);
			marks.put(Integer.parseInt(token[0]), Double.parseDouble(token[2]));
		}
		int query = scan.nextInt();
		// System.out.println(name.keySet() + " This are the keys" + marks.keySet());
		for (int j = 0; j < query+1; j++) {
			String[] tokens = scan.nextLine(). split(" ");
			if (tokens[0].equals("get")) {
				if(Integer.parseInt(tokens[2]) == 1) {
					 System.out.println(name.get(Integer.parseInt(tokens[1])));
				}
				// else if (name.get(Integer.parseInt(tokens[2])) == null) {
				// 	 System.out.println("Student doesn't exists...");
				// }

				else if(Integer.parseInt(tokens[2]) == 2) {
					 System.out.println(marks.get(Integer.parseInt(tokens[1])));
				}

				else if(name.get(Integer.parseInt(tokens[2])) == null || marks.get(Integer.parseInt(tokens[2])) == null) {
					System.out.println("Student doesn't exists...");
			}

			}
		}
	}
}
