public class fixed_point {
    public static void main(String args[]){
        System.out.println("Array - 1 -->");
        int num1[] = {10, -2, 2, -4, 5};
        for(int i =0; i < num1.length; i++){
            System.out.print(num1[i] + " ");
        }
        System.out.println("\nArray - 2 -->");
        int num2[] = {8, -3, 6, -4, 5};
        for(int i =0; i < num2.length; i++){
            System.out.print(num2[i] + " ");
        }
        int ans1 = point(num1);
        int ans2 = point(num2);
        if(ans1 == -1){
            System.out.println("\nThere is no fixed point in Array 1");
        }else {
            System.out.println("\nThere is a fixed point = " + ans1);
        }

        if(ans2 == -1){
            System.out.println("\nThere is no fixed point in Array 2");
        }else {
            System.out.println("\nThere is a fixed point = " + ans2);
        }
    }

    public static int point(int[] arr){
        for(int i =0; i<arr.length; i++){
            if(arr[i] == i){
                return arr[i];
            }
        }
        return -1;
    }
}
