public class MinOccur {
    public static void main(String[] args) {
        String str = "kjjklhjksssssssssssssssssssssssshljlkhdlkvdj";
        int N = str.length();
        int arr[] = new int[126];
        for (int i = 0; i < N; i++) {
            char c = str.charAt(i);
            arr[c] = arr[c] + 1;

        }

        int min = N;
        char minChar = ' ';
        for (int i=0; i<N; i++){
            if (arr[str.charAt(i)]<min){
                min = arr[str.charAt(i)];
                minChar = str.charAt(i);
            }
        }
        System.out.println(minChar + " occurs least "+ min + " times");
    }
}
