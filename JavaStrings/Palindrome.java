public class Palindrome {
    public static void main(String[] args) {
//        String str = "mom";
//        String rev = "";
//
//        for (int i=str.length()-1;i>=0;i--){
//            rev = rev + str.charAt(i);
//        }
//        if (str.equals(rev) ){
//            System.out.println("String is Palindrome");
//        }
//        else {
//            System.out.println("String is not Palindrome");
//        }
//
//
//        //Using String Builder
//        StringBuilder str2 = new StringBuilder("racecar");
//        String reverse = (str2.reverse()).toString();
//        if ((str2.toString()).equals(reverse)){
//            System.out.println("String is Palindrome");
//        }
//        else {
//            System.out.println("String is not Palindrome");
//        }


        //different approach
        String str3 = "abcba";
        int N = str3.length();
        int i =0;
        int j = N-1;
        boolean isPalindrome = true;
        while(i<j){
            if (str3.charAt(i)!=str3.charAt(j)){
                isPalindrome = false;
                break;

            }
            i++;
            j--;
        }
        if (isPalindrome){
            System.out.println("String is Palindrome.");
        }
        else {
            System.out.println("String is not Palindrome.");
        }
    }
}
