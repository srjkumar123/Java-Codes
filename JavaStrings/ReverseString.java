public class ReverseString {
    public static void main(String[] args) {
        // Using String Literal
        String name = "I am a Software Developer.";
        String reverse = "";

        for (int i=name.length()-1; i>=0; i--){
            reverse = reverse+name.charAt(i);
        }
        System.out.println(reverse);

        //Using StringBuilder
        StringBuilder str = new StringBuilder("Iam Learning Java Programming language.");
        System.out.println(str.reverse());



    }
}
