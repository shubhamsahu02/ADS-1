import java.util.*;

public class sol2 {

	sol2() {

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int range = Integer.parseInt(scan.nextLine());
		Sorting sort = new Sorting();
		for(int i = 0; i < range; i++) {
			String[] line = scan.nextLine().split(",");
			Student stud = new Student(Integer.parseInt(line[0]), line[1], Double.parseDouble(line[2]));
			sort.add(stud);
		}

		sort.SelectionSort();

		int q = Integer.parseInt(scan.nextLine());
		String temp = sort.display();

		String[] temp1 = temp.split(",");

			int c = 0;
		for (int i = 0; i < q; i++) {
			Double query = Double.parseDouble(scan.nextLine());
			for(String each : temp1) {
				String[] t = each.split(" ");
			if(Double.parseDouble(t[2]) == query) {
				System.out.println(t[0] +"," + t[1] + "," + t[2]);
				c = 1;
			}



		}	
			if (c == 0) {
				System.out.println("This marks are not awarded to any student");
			}
		}



	}



}