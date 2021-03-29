import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
       question1();
       question2();
    }

    public static char ceasarChar(char c, int rot){
        char a = (char) ((c - rot - 'A' + 26)  % 26 + 'A') ;
        return a;
    }

    public static double absolute(double number){
        if(number > 0){
            return number;
        }
        double number2 = 0;
        number2 = number * -1;
        return number2;
    }

    public static void question1() throws FileNotFoundException {
        File file = new File("cexercise1.txt");
        Scanner scanner = new Scanner(file);
        int number = frequencyCompareQuestion1();
        while(scanner.hasNext()){
            String content = scanner.nextLine();
                String emptyWord = "";
                for(int x = 0; x < content.length(); x++){
                    emptyWord += ceasarChar(content.charAt(x), number);
                }
                System.out.println(emptyWord);
        }
    }

    public static void question2() throws FileNotFoundException {
        File file = new File("cexercise2.txt");
        Scanner scanner = new Scanner(file);
        String content = scanner.next();
        String key = "TESSOFTHEDURBERVILLES";
        String word = "";
        char[] keyArray = new char[21];

        for(int x = 0; x < 21; x++){
            keyArray[x] = (char) (key.charAt(x) - 'A');
        }

        for(int i = 0; i < 21; i++){
            word+= ceasarChar(content.charAt(i), keyArray[i%keyArray.length]);
        }
        System.out.println(word);
    }

    public static int frequencyCompareQuestion1() throws FileNotFoundException {
            HashMap<Character, Double> hashmap = frequencyTess26();
            HashMap<Character, Double> hashmap2 = frequencyCExercise1();

            double answer = 0;
            double bestAnswer = 100;

            char answerChar = 'A';
            char bestChar = 'A';

            for(int i = 0; i < 26; i++){
                answer = absolute((double) hashmap.get('E') - (double) hashmap2.get((char)(i+65)));

                if(answer < bestAnswer) {
                    bestAnswer = answer;
                    bestChar = (char) (i + 'A');
                }
            }
            return bestChar - 'E';
    }
    
    public static HashMap frequencyTess26() throws FileNotFoundException {
        File file = new File("tess26.txt");
        Scanner scanner = new Scanner(file);
        HashMap<Character, Double> hashMap = new HashMap();
        for(int i = 0; i < 26; i++){
            hashMap.put((char) ( i +'A'), 0.0);
        }
        String content = scanner.nextLine();
        char letters;
        for(int i = 0; i < content.length(); i++){
            letters = content.charAt(i);
            if(hashMap.containsKey(letters)){
                hashMap.put(letters, hashMap.getOrDefault(letters, 0.0) +1);
            }
        }
        double sum = 0;
        for(double f : hashMap.values()){
            sum += f;
        }
        for(int i = 0; i < 26; i++){
            hashMap.put((char) (i + 'A'), hashMap.getOrDefault((char) (i + 'A'), 0.0) /sum * 100);
        }
        return hashMap;
    }

    public static HashMap frequencyCExercise1() throws FileNotFoundException {
        File file = new File("cexercise1.txt");
        Scanner scanner = new Scanner(file);
        HashMap<Character, Double> hashMap = new HashMap();
        for(int i = 0; i < 26; i++){
            hashMap.put((char) ( i +'A'), 0.0);
        }
        String content = scanner.nextLine();
        char letters;
        for(int i = 0; i < content.length(); i++){
            letters = content.charAt(i);
            if(hashMap.containsKey(letters)){
                hashMap.put(letters, hashMap.getOrDefault(letters, 0.0) +1);
            }
        }
        double sum = 0;
        for(double f : hashMap.values()){
            sum += f;
        }
        for(int i = 0; i < 26; i++){
            hashMap.put((char) (i + 'A'), hashMap.getOrDefault((char) (i + 'A'), 0.0) /sum * 100);
        }
        return hashMap;
    }
}
