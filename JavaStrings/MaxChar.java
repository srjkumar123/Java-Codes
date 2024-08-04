public class MaxChar {
    public static void main(String[] args) {
        String str = "sdsdksmcmjskdkl  kslkslksssssssssssssssssssssssssssssssssssjkld";
        str = str.replaceAll(" ", "");
        int arr[] = new int[126];
        int N = str.length();
        for (int i=0;i<N-1;i++){
            char c = str.charAt(i);
            arr[c] = arr[c] + 1;
        }

        int max = -1;
        char maxChar = ' ';
        for (int i = 0; i<126; i++){
            if (arr[i]>max){
                max = arr[i];
                maxChar = (char)i;
            }
        }
        System.out.println(maxChar+" comes "+max+" times");
    }
}
