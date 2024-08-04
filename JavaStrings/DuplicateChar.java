public class DuplicateChar {
    public static void main(String[] args) {
        String str = "kdfnaksssssnksk";
        str = str.replaceAll("\\s+","");
        int N = str.length();
        int arr[] = new int[126];
        for (int i = 0; i < N; i++) {
            arr[str.charAt(i)] = arr[str.charAt(i)]+1;
        }

        for (int i = 0; i < 126; i++) {
            if (arr[i]>1){
                System.out.println((char)i+" repeats "+ arr[i] + " times");
            }
        }
    }
}
