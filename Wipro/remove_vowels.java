public class remove_vowels {
    public static void main(String args[]){
        char str[] = "Hello Worlda!!".toCharArray();
        for(int i =0; i < str.length; i++){
            if(str[i] == 'A' || str[i] == 'E' || str[i] == 'I' || str[i] == 'O' || str[i] == 'U' || str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u'){
                continue;
            }else {
                System.out.print(str[i]);
            }
        }
    }
}
