import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Main3 {

    public static char ceasarChar(char c, int rot) {
        char a = (char) ((c - rot - 'A' + 26) % 26 + 'A');
        return a;
    }

    public static double absolute(double number) {
        if (number > 0) {
            return number;
        }
        double number2 = 0;
        number2 = number * -1;
        return number2;
    }

    public static void question1() throws FileNotFoundException {
        File file = new File("cexercise1.txt");
        Scanner scanner = new Scanner(file);
        int number = frequencyCompare(frequencyTess26(), frequencyExercise1());
        while (scanner.hasNext()) {
            String content = scanner.nextLine();
            String word = "";
            for (int x = 0; x < 30; x++) {
                word += ceasarChar(content.charAt(x), number);
            }
            System.out.println(word);
        }
    }

    public static void question2() throws FileNotFoundException {
        File file = new File("cexercise2.txt");
        Scanner scanner = new Scanner(file);
        String content = scanner.next();
        String key = "TESSOFTHEDURBERVILLES";
        String word = "";
        char[] keyArray = new char[21];

        for (int x = 0; x < 21; x++) {
            keyArray[x] = (char) (key.charAt(x) - 'A');
        }

        for (int i = 0; i < 30; i++) {
            word += ceasarChar(content.charAt(i), keyArray[i % keyArray.length]);
        }
        System.out.println(word);
    }

    public static void question3() throws FileNotFoundException {
        File file = new File("cexercise3.txt");
        Scanner scanner = new Scanner(file);
        String content = scanner.next();
        String key = keyExercise3();
        String word = "";
        char[] keyArray = new char[6];

        for (int x = 0; x < 6; x++) {
            keyArray[x] = (char) (key.charAt(x) - 'A');
        }

        for (int i = 0; i < 30; i++) {
            word += ceasarChar(content.charAt(i), keyArray[i % keyArray.length]);
        }
        System.out.println(word);
    }

    public static void question4() throws FileNotFoundException {
        File file = new File("cexercise4.txt");
        Scanner scanner = new Scanner(file);
        String content = scanner.next();
        String key = keyExercise4();
        String word = "";
        char[] keyArray = new char[6];

        for (int x = 0; x < 6; x++) {
            keyArray[x] = (char) (key.charAt(x) - 'A');
        }

        for (int i = 0; i < 30; i++) {
            word += ceasarChar(content.charAt(i), keyArray[i % keyArray.length]);
        }
        System.out.println(word);
    }

    public static String keyExercise3() throws FileNotFoundException {
        String key0 = Character.toString((char) (frequencyCompare(frequencyTess26(), frequencyExercise3(0))+65));
        String key1 = Character.toString((char) (frequencyCompare(frequencyTess26(), frequencyExercise3(1))+65));
        String key2 = Character.toString((char) (frequencyCompare(frequencyTess26(), frequencyExercise3(2))+65));
        String key3 = Character.toString((char) (frequencyCompare(frequencyTess26(), frequencyExercise3(3))+65));
        String key4 = Character.toString((char) (frequencyCompare(frequencyTess26(), frequencyExercise3(4))+65));
        String key5 = Character.toString((char) (frequencyCompare(frequencyTess26(), frequencyExercise3(5))+65));

        return key0 + key1 + key2 + key3 + key4 + key5;
    }

    public static String keyExercise4() throws FileNotFoundException {
        String key0 = Character.toString((char) (frequencyCompare(frequencyTess26(), frequencyExercise4(0))+65));
        String key1 = Character.toString((char) (frequencyCompare(frequencyTess26(), frequencyExercise4(1))+65));
        String key2 = Character.toString((char) (frequencyCompare(frequencyTess26(), frequencyExercise4(2))+65));
        String key3 = Character.toString((char) (frequencyCompare(frequencyTess26(), frequencyExercise4(3))+65));
        String key4 = Character.toString((char) (frequencyCompare(frequencyTess26(), frequencyExercise4(4))+65));
        String key5 = Character.toString((char) (frequencyCompare(frequencyTess26(), frequencyExercise4(5))+65));

        return key0 + key1 + key2 + key3 + key4 + key5;
    }

    public static void columnExercise5() throws FileNotFoundException {
        File file = new File("cexercise5.txt");
        Scanner scanner = new Scanner(file);
        String content = scanner.next();

        String[] column = new String[5];

        column[0] = content.substring(0, 168);
        column[1] = content.substring(168, 336);
        column[2] = content.substring(336, 504);
        column[3] = content.substring(504, 672);
        column[4] = content.substring(672, 840);

        System.out.println(column[0]);
        System.out.println(column[1]);
        System.out.println(column[2]);
        System.out.println(column[3]);
        System.out.println(column[4]);
    }

    public static void columnExercise6() throws FileNotFoundException {
        File file = new File("cexercise6.txt");
        Scanner scanner = new Scanner(file);
        String content = scanner.next();

        String[] column = new String[6];

        column[0] = content.substring(0, 140);
        column[1] = content.substring(140, 280);
        column[2] = content.substring(280, 420);
        column[3] = content.substring(420, 560);
        column[4] = content.substring(560, 700);
        column[5] = content.substring(700, 840);

        System.out.println(column[5]);
        System.out.println(column[4]);
        System.out.println(column[0]);
        System.out.println(column[3]);
        System.out.println(column[2]);
        System.out.println(column[1]);
    }

    public static void question7() throws FileNotFoundException {
        File file = new File("cexercise7.txt");
        Scanner scanner = new Scanner(file);
        String content = scanner.nextLine();
        content = swap(content, 'A','i');
        content = swap(content, 'B','k');
        content = swap(content, 'C','a');
        content = swap(content, 'D','j');
        content = swap(content, 'E','d');
        content = swap(content, 'F','b');
        content = swap(content, 'G','n');
        content = swap(content, 'H','p');
        content = swap(content, 'I','t');
        content = swap(content, 'J','g');
        content = swap(content, 'K','s');
        content = swap(content, 'L','r');
        content = swap(content, 'M','m');
        content = swap(content, 'N','y');
        content = swap(content, 'O','v');
        content = swap(content, 'P','l');
        content = swap(content, 'Q','u');
        content = swap(content, 'R','q');
        content = swap(content, 'S','|');
        content = swap(content, 'S','h');
        content = swap(content, 'T','e');
        content = swap(content, 'V','o');
        content = swap(content, 'W','f');
        content = swap(content, 'X','z');
        content = swap(content, 'Y','w');
        content = swap(content, 'Z','c');

        System.out.println(content);
    }

    public static String swap(String cipher, char a, char b){
        String newString = "";

        for(int i = 0; i < cipher.length(); i++){
            if(cipher.charAt(i) == a){
                newString += b;
            }
            else if(cipher.charAt(i) == b){
                newString += a;
            }
            else{
                newString += cipher.charAt(i);
            }
        }
        return newString;
    }

    public static int frequencyCompare(HashMap hashmap, HashMap hashmap2){
        double error = 0;
        double errorSum = 0;
        double lowestError = 10000;
        int lowestIndex = 0;

        for(int i = 0; i < 26; i++){
            errorSum = 0;
            for(int x = 0; x < 26; x++){
                error = (double) hashmap.get((char) ('A' + x)) - (double) hashmap2.get((char) ('A' + ((i + x) % 26)));
                errorSum += absolute(error);
            }
            if(errorSum < lowestError){
                lowestIndex = i;
                lowestError = errorSum;
            }
        }
        return lowestIndex;
    }

    public static HashMap frequencyExercise1() throws FileNotFoundException {
        File file = new File("cexercise1.txt");
        Scanner scanner = new Scanner(file);
        HashMap<Character, Double> hashMap = new HashMap();
        for (int i = 0; i < 26; i++) {
            hashMap.put((char) (i + 'A'), 0.0);
        }
        String content = scanner.nextLine();
        char letters;
        for (int i = 0; i < content.length(); i++) {
            letters = content.charAt(i);
            if (hashMap.containsKey(letters)) {
                hashMap.put(letters, hashMap.getOrDefault(letters, 0.0) + 1);
            }
        }
        double sum = 0;
        for (double f : hashMap.values()) {
            sum += f;
        }
        for (int i = 0; i < 26; i++) {
            hashMap.put((char) (i + 'A'), hashMap.getOrDefault((char) (i + 'A'), 0.0) / sum * 100);
        }
//        System.out.println(hashMap);
        return hashMap;
    }

    public static HashMap frequencyExercise3(int characterPosition) throws FileNotFoundException {
        File file = new File("cexercise3.txt");
        Scanner scanner = new Scanner(file);
        HashMap<Character, Double> hashMap = new HashMap();
        for (int i = 0; i < 26; i++) {
            hashMap.put((char) (i + 'A'), 0.0);
        }
        String content = scanner.nextLine();
        String letter1 = "";
        for (int i = 0; i < content.length(); i++) {
            if (i % 6 == characterPosition) {
                letter1 += (content.charAt((char) i));
            }
        }
        char letters;
        for (int i = 0; i < letter1.length(); i++) {
            letters = letter1.charAt(i);
            if (hashMap.containsKey(letters)) {
                hashMap.put(letters, hashMap.getOrDefault(letters, 0.0) + 1);
            }
        }
        double sum = 0;
        for (double f : hashMap.values()) {
            sum += f;
        }
        for (int i = 0; i < 26; i++) {
            hashMap.put((char) (i + 'A'), hashMap.getOrDefault((char) (i + 'A'), 0.0) / sum * 100);
        }
        return hashMap;
    }

    public static HashMap frequencyExercise4(int characterPosition) throws FileNotFoundException {
        File file = new File("cexercise4.txt");
        Scanner scanner = new Scanner(file);
        HashMap<Character, Double> hashMap = new HashMap();
        for (int i = 0; i < 26; i++) {
            hashMap.put((char) (i + 'A'), 0.0);
        }
        String content = scanner.nextLine();
        String letter1 = "";
        for (int i = 0; i < content.length(); i++) {
            if (i % 6 == characterPosition) {
                letter1 += (content.charAt((char) i));
            }
        }
        char letters;
        for (int i = 0; i < letter1.length(); i++) {
            letters = letter1.charAt(i);
            if (hashMap.containsKey(letters)) {
                hashMap.put(letters, hashMap.getOrDefault(letters, 0.0) + 1);
            }
        }
        double sum = 0;
        for (double f : hashMap.values()) {
            sum += f;
        }
        for (int i = 0; i < 26; i++) {
            hashMap.put((char) (i + 'A'), hashMap.getOrDefault((char) (i + 'A'), 0.0) / sum * 100);
        }
        return hashMap;
    }

    public static HashMap frequencyTess26() throws FileNotFoundException {
        File file = new File("tess26.txt");
        Scanner scanner = new Scanner(file);
        HashMap<Character, Double> hashMap = new HashMap();
        for (int i = 0; i < 26; i++) {
            hashMap.put((char) (i + 'A'), 0.0);
        }
        String content = scanner.nextLine();
        char letters;
        for (int i = 0; i < content.length(); i++) {
            letters = content.charAt(i);
            if (hashMap.containsKey(letters)) {
                hashMap.put(letters, hashMap.getOrDefault(letters, 0.0) + 1);
            }
        }
        double sum = 0;
        for (double f : hashMap.values()) {
            sum += f;
        }
        for (int i = 0; i < 26; i++) {
            hashMap.put((char) (i + 'A'), hashMap.getOrDefault((char) (i + 'A'), 0.0) / sum * 100);
        }
        return hashMap;
    }

    public static void main(String[] args) throws FileNotFoundException {
        question1();
        question2();
        question3();
        question4();
//        columnExercise5();
//        columnExercise6();
        question7();

    }
}
