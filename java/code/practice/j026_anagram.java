package practice;

public class j026_anagram {

    public static boolean isAnagram(String str1, String str2){

        if(str1.length() != str2.length()){
            return false;
        }

        int[] store = new int[26];

        for(int i=0; i<str1.length(); i++){

            store[str1.charAt(i) - 'a']++;
            store[str2.charAt(i) - 'a']--;
        }

        for(int n : store){
            if(n!=0){
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        System.out.println(isAnagram("state", "taste"));
    }
}
