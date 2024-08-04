public class NoOfWords {
    public static void main(String[] args) {
        String str = "Iam learning Java Programming  Language.";
        //str = str.replaceAll("\\s+", " ");
        String arr[] = str.split(" ");
        System.out.println(arr.length);


        int N = str.length();
        boolean b = true;
        int count = 0;

        for(int i = 0; i<N; i++){
            if (str.charAt(i)== ' ' || str.charAt(i) == '\t' || str.charAt(i)=='\n' ){
               b = true;
            }
            else if (b){
                count++;
                b = false;
            }
        }
        System.out.println(count);
    }
}
