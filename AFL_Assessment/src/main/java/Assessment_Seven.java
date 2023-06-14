public class Assessment_Seven {
    /**Write a program that prints out odd number in an array
     * */
    public static void main(String []args){
        int[] numbers ={1,2,3,4,5,6};
        oddNumber(numbers);
    }

    public static void oddNumber(int[] array){
        //it iterates through the array and divides each integer by 2 and then checks for the remainder
        for (int num : array) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }
}
