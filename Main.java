import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String directory = System.getProperty("user.dir");
        System.out.println(directory);
        ArrayList<String> fileName = new ArrayList<>();

        String LevenshteinPathIn =File.separator
                + "in" + File.separator
                + "Levenshtein" + File.separator;
        String LevenshteinPathOutput =File.separator
                + "out" + File.separator
                + "Levenshtein" + File.separator;
        String LCSPathIn =File.separator
                + "in" + File.separator
                + "LCS" + File.separator;
        String LCSPathOutput =File.separator
                + "out" + File.separator
                + "LCS" + File.separator;

        String BoyerMoorePathIn =File.separator
                + "in" + File.separator
                + "BoyerMoore" + File.separator;
        String BoyerMooreOutput =File.separator
                + "out" + File.separator
                + "BoyerMoore" + File.separator;

        for(int i = 0; i < 10; i++){
             fileName.add("test" + i);
             String absolutePath = directory + LevenshteinPathIn + fileName.get(i) + ".in";
             File file = new File(absolutePath);
             Scanner scanner = new Scanner(file);
             String s1 = scanner.nextLine();
             String s2 = scanner.nextLine();
             int l1 = scanner.nextInt();
             int l2 = scanner.nextInt();
             int levenDist = Levenshtein.LevenshteinDist(s1,s2,l1,l2);
             String levenDistString = Integer.toString(levenDist);
             FileWriter writer = new FileWriter(directory + LevenshteinPathOutput + fileName.get(i) + ".out" );
             writer.write(levenDistString);
             writer.close();
        }

        for(int i = 0; i < 10; i++){
             fileName.add("test" + i);
             String absolutePath = directory + LCSPathIn + fileName.get(i) + ".in";
             File file = new File(absolutePath);
             Scanner scanner = new Scanner(file);
             String s1 = scanner.nextLine();
             String s2 = scanner.nextLine();
             int l1 = scanner.nextInt();
             int l2 = scanner.nextInt();
             int lcsDist = LCS.lcsDist(s1,s2,l1,l2);
             String lcsDistString = Integer.toString(lcsDist);
             FileWriter writer = new FileWriter(directory + LCSPathOutput + fileName.get(i) + ".out" );
             writer.write(lcsDistString);
             writer.close();
        }

        for(int i = 0; i < 10; i++){
             fileName.add("test" + i);
             String absolutePath = directory + BoyerMoorePathIn + fileName.get(i) + ".in";
             File file = new File(absolutePath);
             Scanner scanner = new Scanner(file);
             String s1 = scanner.nextLine();
             String s2 = scanner.nextLine();
             ArrayList<Integer> positions = BoyerMoore.searchingPostion(s1,s2);
             FileWriter writer = new FileWriter(directory + BoyerMooreOutput + fileName.get(i) + ".out" );
             for(int j = 0; j < positions.size();j++){
                 writer.write(String.valueOf(positions.get(j)));
                 writer.write('\n');
             }
             writer.close();
        }

    }
}
