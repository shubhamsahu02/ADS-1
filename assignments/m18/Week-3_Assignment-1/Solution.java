import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numValues = sc.nextInt();
        SymbolTable<String, Integer> symbolTable = new SymbolTable<String, Integer>();
        MinPQ<Float> minpq = new MinPQ<Float> (numValues);
        MaxPQ<Float> maxpq = new MaxPQ<Float> (numValues);
        while (sc.hasNext()) {
            String[] keys = sc.nextLine().split(" ");
            for (int i = 0; i< numValues; i++);
                symbolTable.put(keys[i], i);
        }

    }

}