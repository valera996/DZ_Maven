package DZ13;


import java.util.*;

public class TaskOne {

    //Проверить, являются ли две строки анаграммами друг друга.
    public static boolean isAnagram(String str1, String str2){
        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        return Arrays.equals(char1, char2);
    }

    //Подсчитать, сколько раз каждое слово встречается в строке.
    public static Map<String,Integer> countOfWord(String str){
        Map<String,Integer> map = new HashMap<>();
        String[] arrayStr = str.split("\\s+");
        for (String word : arrayStr){
            if(map.containsKey(word)){
                map.put(word, map.get(word) + 1);
            }else map.put(word, 1);
        }
        return map;
    }

    //Найти наибольшее число в массиве.
    public static int maxNumber(int[] array){
       return Arrays.stream(array).max().orElseThrow();
    }
    //Найти наибольшее число в массиве.
    public static int minNumber(int[] array){
        return Arrays.stream(array).min().orElseThrow();
    }

    //Удалить дубликаты из List<Integer>.
    public static List<Integer> removeDuplicates(List<Integer> list){
        return list.stream().distinct().toList();
    }

    //Поиск максимальной суммы подмассива
    // int[]{1,2,3,4,5,6},3 = 15
    public static int maxSubArray(int[] array, int k){
        int firstWindow = 0;
        for(int i = 0; i < k; i++){
            firstWindow += array[i];
        }
        int maxWindow = firstWindow;

        for(int i = k; i < array.length; i++){
            firstWindow += array[i] - array[i - k];
            if(firstWindow > maxWindow){
                maxWindow = firstWindow;
            }
        }

        return maxWindow;
    }

    //Проверить, является ли строка палиндромом (одинаково читается в обе стороны).
    public static boolean isPalindrome(String str){
        StringBuilder reverseStr = new StringBuilder(str).reverse();
        return Objects.equals(str,reverseStr.toString());
    }

    public static void main(String[] args) {

        //Проверить, являются ли две строки анаграммами друг друга.
        System.out.println(isAnagram("rerer","eerrr")); //true
        System.out.println(isAnagram("rerer","rrttt")); //false

        //Подсчитать, сколько раз каждое слово встречается в строке.
        System.out.println(countOfWord("RRR  rere ere r r RRR")); //r=2, RRR=2, rere=1, ere=1

        //Найти наибольшее число в массиве.
        System.out.println(maxNumber(new int[]{3,6,1,4,9,5})); //9
        //Найти наибольшее число в массиве.
        System.out.println(minNumber(new int[]{3,6,1,4,9,5})); //1

        //Удалить дубликаты из List<Integer>.
        System.out.println(removeDuplicates(new LinkedList<>(List.of(1,5,5,6,8,9,1,7,4)))); //1,5,6,8,9,7,4

        //Поиск максимальной суммы подмассива
        // int[]{1,2,3,4,5,6},3 = 15
        System.out.println(maxSubArray(new int[]{1,2,3,4,5,6}, 3));

        //Проверить, является ли строка палиндромом (одинаково читается в обе стороны).
        System.out.println(isPalindrome("RaR")); //true
        System.out.println(isPalindrome("RaF")); //false
    }
}
