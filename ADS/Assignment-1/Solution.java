import java.util.Scanner;

 class AddLargeNumbers {

    private static  int NINE = 9;
 
    private AddLargeNumbers() {

    }

    public static LinkedList numberToDigits( String number) {
        LinkedList l = new LinkedList();
        String[] numbers = number.split("");
        for (int i = 0; i < numbers.length; i++) {
            l.push(Integer.parseInt(numbers[i]));
        }
        return l;
    }

    public static String digitsToNumber( LinkedList list) {
        return list.toString();
    }

    public static LinkedList addLargeNumbers( LinkedList list1,
         LinkedList list2) {
        LinkedList sum = new LinkedList();
        LinkedList carry = new LinkedList();
        LinkedList a, b;
        int c = 0;
        if (list1.getSize() >= list2.getSize()) {
            a = list1;
            b = list2;
        } else {
            a = list2;
            b = list1;
        }
        while (!(b.isEmpty())) {
            if (carry.isEmpty()) {
                c = a.pop() + b.pop();
            } else {
                c = a.pop() + b.pop() + carry.pop();
            }
            if (c > NINE) {
                String[] num = Integer.toString(c).split("");
                sum.pushHead(Integer.parseInt(num[1]));
                carry.pushHead(Integer.parseInt(num[0]));
                c = 0;
            } else {
                sum.pushHead(c);
                c = 0;
            }
        }
        if (!(carry.isEmpty())) {
            if (a.isEmpty()) {
                c = carry.pop();
            } else {
                c = a.pop() + carry.pop();
            }
            if (c > NINE) {
                String[] num = Integer.toString(c).split("");
                sum.pushHead(Integer.parseInt(num[1]));
                carry.pushHead(Integer.parseInt(num[1]));
                c = 0;
            } else {
                sum.pushHead(c);
                c = 0;
            }
        }
        while (!(a.isEmpty())) {
            sum.pushHead(a.pop());
        }
        return sum;
    }
}

public  class Solution {

    private Solution() {

    }

    public static void main( String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        switch (input) {
        case "numberToDigits":
            LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
            LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
            System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
            System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
            break;

        case "addLargeNumbers":
            pDigits = AddLargeNumbers.numberToDigits(p);
            qDigits = AddLargeNumbers.numberToDigits(q);
            LinkedList result = AddLargeNumbers.addLargeNumbers(
                pDigits, qDigits);
            System.out.println(AddLargeNumbers.digitsToNumber(result));
            break;
        default:
        break;
        }
    }

}