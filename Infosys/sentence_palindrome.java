public class sentence_palindrome {
    public static void main(String args[]){
        char str[] = "Too hot to hootb".toCharArray();
        int count =0;
        int index =0;
        StringBuilder s = new StringBuilder();
        for(int i =0; i < str.length; i++){
            if(str[i] == ' '){
                continue;
            }
            else {
                s.append(str[i]);
            }
        }
        String str2 = s.toString().toLowerCase();
        char text1[] = str2.toCharArray();
        for(int i = text1.length-1; i>=0; i--){
            if(text1[index] != text1[i]){
                break;
            }else {
                index++;
                count++;
            }
        }
        if(count == text1.length){
            System.out.println("The Sentence is palindrome");
        }
        else{
            System.out.println("The sentence is not palindrome");
        }

    }
}
