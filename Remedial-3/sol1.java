import java.util.Scanner;
import java.util.Arrays;
public class sol1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Sorting sort = new Sorting();
		// BinarySearchTree b = new BinarySearchTree();
		int range = scan.nextInt();
		scan.nextLine();
		for(int i =0;i<range;i++) {
			String[] temp = scan.nextLine().split(",");
			// b.put(temp[0], new Student(Integer.parseInt(temp[0]),temp[1], Double.parseDouble(temp[2])));
			Student student = new Student(Integer.parseInt(temp[0]),temp[1],Double.parseDouble(temp[2]));
			sort.add(student);
		}
		sort.SelectionSort();
		int num = Integer.parseInt(scan.nextLine());
		String tempsort = sort.display();	
		// System.out.println(tempsort);
		String[] tempstored = tempsort.split(",");
		// for(int l = 0;l<num;l++ ) {
		// System.out.println(Arrays.toString(tempstored));
		// System.out.println(tempstored[0]);
		int f = 0;
		for(int j =0;j<num;j++) {
			double tempnum = Double.parseDouble(scan.nextLine());
			// System.out.println(tempnum + "tempnum");
			for(String each:tempstored) {
				// System.out.println(each+"each");
				String[] tempeach = each.split(" ");
				double temppp = Double.parseDouble(tempeach[2]);
				// System.out.println(temppp + "p");
				if(tempnum == temppp) {
					// System.out.println("hi");
					f = 1;
					System.out.println(tempeach[0] + "," + tempeach[1] + "," +tempeach[2]);
				}
			}
			if(f==0) {
				System.out.println("This marks are not awarded to any student");
			}
			// System.out.println(tempstored[j]);
     	}   
	}
}



