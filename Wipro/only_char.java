public class only_char {
    public static void main(String args[]){
        char str[] = "$Gee*k;s..fo, r’Ge^eks?".toCharArray();
        for(int i =0; i < str.length; i++){
            if(str[i] < 'A' || str[i] > 'Z' && str[i] < 'a' || str[i] > 'z'){
                continue;
            }else {
                System.out.print(str[i]);
            }
        }
    }
}
