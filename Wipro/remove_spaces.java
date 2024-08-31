public class remove_spaces {
    public static void main(String args[]){
        char str[] = "g  eeks   for ge  eeks  ".toCharArray();
        int count = 0;
        for(int i =0; i < str.length; i++){
            if(str[i] != ' '){
                str[count] = str[i];
                count++;
            }
        }
        System.out.println(String.valueOf(str).subSequence(0, count));
    }
}
