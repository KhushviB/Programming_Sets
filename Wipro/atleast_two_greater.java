public class atleast_two_greater {
    public static void main(String args[]){
        int num[] = {2,8,7,1,5};
        int ans[] = new int[num.length-2];
        int j = 0;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int i =0; i< num.length; i++){
            if(max1 < num[i]){
                max1 = num[i];
            }
            if(max2 < num[i] && num[i] < max1){
                max2 = num[i];
            }
        }
        for(int i = 0; i<num.length; i++){
            if(num[i] != max1 && num[i] != max2){
                ans[j] = num[i];
                if(j == ans.length-1){
                    break;
                }else {
                    j++;
                }
            }
        }
        for(int i =0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
