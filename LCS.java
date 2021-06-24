public class LCS {

    //am implementat algoritmul pentru Longest Common Subsequence(LCS)
    //in mod recursiv ,asemanator ca la Levenshtein,doar ca se accepta
    //doar operatiile de insert si remove
    public static int lcsDist(String s1,String s2,int length1,int length2){
        if(length1 == 0)
            return length2;

        if(length2 == 0)
            return length1;

        if(s1.charAt(length1 - 1) == s2.charAt(length2 - 1))
            return lcsDist(s1,s2,length1 - 1, length2 - 1);

        return Math.min(
                lcsDist(s1,s2,length1,length2 - 1) + 1,// pentru insert
                lcsDist(s1,s2,length1 - 1, length2) + 1); //pentru remove
    }

}
