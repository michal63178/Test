import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(function(n));
        System.out.print(modify("middle"));

    }

//    public static int[] showPrimes(){
//
//
//    }

    public static String function(int x){
        int[] elements = new int[x];
        int[] values = new int[x];
        int value = 0;
        int min = -50;
        int max = 50;
        int frequent = 0;
        int frequent_element = 0;
        int max_frequent = 0;
        int i = 0;
        int j = 0;

        for(; i<x; i++)
            elements[i] = (int) Math.floor(Math.random() * (max - min + 1) + min);

        value = elements[0];
        j++;

        for(i=1; i<x; i++){
            if(elements[i] != value){
                values[j] = elements[i];
                j++;

            }

        }

        frequent_element = values[0];

        for(i=0; i<j; i++){
            for(int y=0; y<x; y++){
                if(values[i] == elements[y])
                    frequent++;

            }

            if(frequent > max_frequent){
                max_frequent = frequent;
                frequent_element = values[i];

                }

            frequent = 0;

        }
        return "najczęstsza wartość: " + frequent_element + "\nliczba jej wystąpień: "
                + max_frequent;

    }

    public static String modify(String str){
        StringBuilder modyfied = new StringBuilder(str);
        int length = str.length();

//        char x = modyfied.charAt(length / 2 - 1);
//        String y = String.valueOf(x).toUpperCase();

        if(length % 2 == 0){
            modyfied.setCharAt(length / 2 - 1, Character.toUpperCase(modyfied.charAt(length / 2 - 1)));
            modyfied.setCharAt(length / 2, Character.toUpperCase(modyfied.charAt(length / 2)));

            return modyfied.toString();

        }

        return str;

    }

}