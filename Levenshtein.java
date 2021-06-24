public class Levenshtein {

    //o sa implementez un algoritm recursiv , folosindu-ma de formula levi
    public static int LevenshteinDist(String s1, String s2, int length1, int length2){

        //verific intai daca lungimea primului string este egala cu 0
        //in acest caz o sa returnez lungimea celui de-al doilea string.
        //in alte cuvinte o sa fac length2 insertii
        if(length1 == 0)
            return length2;

        //la fel o sa procedez si daca lungimea stringului 2 este egala cu 0
        //avand in vedere ca incercam sa facem al doilea string sa fie egal
        //cu primul, de data aceasta o sa facem lenght1 removals
        if(length2 == 0)
            return length1;

        //verific egalitatea dintre ultimele caractere, iar daca acestea
        //sunt egale , voi apela recursiv functia, de aceea ofer ca parametru
        //lungimile - 1. In plus , incep de la finalul stringurilor ca sa fiu sigur
        //ca atunci cand se termina stringurile ies din funcite, cu ajutorul if-urilor
        //scrise mai sus. Obs: charAt de ultimul caracter va fi null operator , de aceea
        //ofer length - 1.
        if(s1.charAt(length1 - 1) == s2.charAt(length2 - 1))
            return LevenshteinDist(s1,s2,length1 - 1, length2 - 1);

        //daca ultimele caractere nu sunt la fel, vom aplica formula matematica pe care
        //o sa o atasez in pdf. In acest sens, primul parametru al functiei min
        //va primi recursiv (length1 si length2 - 1) pentru insertion
        //in mod similar (length1 - 1 si length2) este pentru removal
        //iar (length1 - 1 si length2 - 1) este pentru replacement
        //formula presupune sa adaugam + 1 la fiecare din parametrii
        int minimum = min(
                LevenshteinDist(s1,s2,length1,length2 - 1) + 1,
                LevenshteinDist(s1,s2,length1 - 1, length2) + 1,
                LevenshteinDist(s1,s2,length1 - 1, length2 - 1) + 1);

        return minimum;

    }

    //o functie simpla cu care calculez minimul dintre 3 numere
    public static int min(int a, int b, int c){
        return Math.min(Math.min(a,b),c);
    }
}
