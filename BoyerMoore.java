import java.util.ArrayList;

class BoyerMoore {

    static void badCharHeuristic(String pattern, int patternSize, int[] mismatchChar) {
        int i = 0;

        while (i < patternSize) { // umplu vectorul cu valori de la 0 la lungimea patternului
            mismatchChar[pattern.charAt(i)] = i;
            i++;
        }
    }

    static ArrayList<Integer> searchingPostion(String str, String pattern) {
        int patternLength = pattern.length();
        int stringLength = str.length();

        int[] mismatchChar = new int[256];
        ArrayList<Integer> positions = new ArrayList<>();

        badCharHeuristic(pattern, patternLength, mismatchChar);

        int shift = 0;

        //implementez algoritmul prezentat in prima etapa
        while (shift <= (stringLength - patternLength)) {
            int i = patternLength - 1;

            //scad i-ul cat timp valorile patternului si ale stringului sunt egale
            while (i >= 0 && (pattern.charAt(i) == str.charAt(shift + i)))
                i--;

            //verific daca i a ajuns mai mic ca 0, ca sa aflu daca patternul
            //se afla in string de mai multe ori
            if (i < 0) {
                positions.add(shift);//adaug primul index intr-un array list


              /* Shiftez patternul la dreapta astfel incat
                 sa aliniez ultima aparitie din pattern a
                 literei cu mismatchChar
                 Este necesara conditia ca valoarea shiftata
                  plus lungimea patternului sa fie mai mica decat
                  lungimea textului in caz ca patternul se gaseste la
                  sfastiul stringului*/
                if (shift + patternLength < stringLength) {
                    shift += patternLength - mismatchChar[str.charAt(shift + patternLength)];
                } else {
                    shift += 1;
                }

            } else
                //folosesc functia max ca sa ma asigur ca obtin o valoare pozitiva
                //cand ajung la sfarsitul patternului si am ultimul mismatchChar
                shift += Math.max(1, i - mismatchChar[str.charAt(shift + i)]);
        }
        return positions;
    }
}