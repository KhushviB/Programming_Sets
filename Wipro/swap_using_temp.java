public class swap_using_temp {
    public static void main(String args[]){
        int x = 5;
        int y = 10;
        System.out.println("Before swapping x = " + x + " & y = " + y);
        int temp = y;
        y = x;
        x = temp;
        System.out.println("After swapping x = "+ x + " & y = " + y);
    }
}
