public class alternate_numbers {
    public static void main(String args[]){
        int num[] = {1,73,543,2,54,32,76};
        System.out.println("Original Array : ");
        for(int i =0; i<num.length; i++){
            System.out.print(num[i] + " ");
        }
        System.out.println("Array that printed alternate digits : ");
        for(int i = 0; i<num.length; i+=2){
            System.out.print(num[i] + " ");
        }
    }
}
