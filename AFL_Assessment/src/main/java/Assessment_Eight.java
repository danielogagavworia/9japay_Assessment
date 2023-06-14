public class Assessment_Eight {
    /**Write a program that prints out even number in an array
     * */
    public static void main(String []args){
        int[] numbers ={1,2,3,4,5,6};
        evenNumber(numbers);
    }

    public static void evenNumber(int[] array){
        //it iterates through the array and divides each integer by 2 and then checks for the remainder
        for (int num : array) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
    }
}
