public class P_1662 {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
      String newArr1 = " ";
      String newArr2 = " ";
      for(int i = 0 ; i < word1.length ; i++){
        newArr1 += word1[i];
      }
      for(int i = 0 ; i < word2.length ; i++){
        newArr2 += word2[i];
      }
          if(newArr1.equals(newArr2)){
            return true;
          }else{
            return false;
          }
 
    }

    public static void main(String[] args) {
        String[] word1 = {"ab" , "cde "};
        String[] word2 = {"abcde" , " "};

        System.out.println(arrayStringsAreEqual(word1, word2));
        
    }
}
