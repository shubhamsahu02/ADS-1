import java.util.*;

public class sol2{

	sol2() {

	}


	public static void main(String[] args) {
		Scanner scan  = new Scanner (System.in);
		int range = Integer.parseInt(scan.nextLine());
		Sorting sort = new Sorting();
		for (int i = 0; i < range; i++) {
			String[] tokens = scan.nextLine().split(",");
			Student stud = new Student(Integer.parseInt(tokens[0]), tokens[1], Double.parseDouble(tokens[2]));
			sort.add(stud);
		}
		sort.SelectionSort();
		String temp = sort.display();
		// System.out.println(temp);

		String[] temp1 = temp.split(",");
		System.out.println(temp1[0]);

		int q = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < q; i++) {
			double num = Double.parseDouble(scan.nextLine());

			for (String each: temp1) {
				// System.out.println(each+" im each");
				String[] abc = each.split(" ");
				if(Double.parseDouble(abc[2]) == num) {
					System.out.println(each);
				}
			}
		}
	}

}
