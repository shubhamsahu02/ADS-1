import java.util.*;
import java.util.TreeMap;
import java.text.DecimalFormat;


class Solution {

    public static void main(String[] args) {
        int roll,marks;
        DecimalFormat numberFormat = new DecimalFormat("#.0");
        Scanner s = new Scanner(System.in);
        int number = Integer.parseInt(s.nextLine());
        String[] tokens = new String[100];
        TreeMap<Integer, Double> map = new TreeMap<Integer, Double>();
        TreeMap<Integer, Double> tmap = new TreeMap<Integer, Double>();
        Double[] array = new Double[number];
        for (int i = 0; i< number; i++) {
            tokens = s.nextLine().split(",");
            map.put(Integer.parseInt(tokens[0]), Double.parseDouble(tokens[1]));
            array[i] = Double.parseDouble(tokens[1]);
        } 
        int m = Integer.parseInt(s.nextLine());
        int[] rolls = new int[m];
        Double percent = 0.0;
        Double records = 0.0;
        for (int i = 0; i < m; i ++) {
            rolls[i] = Integer.parseInt(s.nextLine());
        }
        
        for (Integer keys: map.keySet()) {
            int count=0;
            
            for (int i=0; i<array.length; i++) {
                if(array[i]<=map.get(keys)){
                    count++;
                }
            }
            percent = (100*count)/(Double.valueOf(number));
            tmap.put(keys,percent);
        }

        for(int i = 0; i < m; i++) {
            records = tmap.get(rolls[i]);
            System.out.println((double) Math.round (records *100 )/100);
        }
    }
}