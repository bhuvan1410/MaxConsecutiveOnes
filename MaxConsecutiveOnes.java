public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int amount = 0;
        int maxAmount = 0;

        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 1){
                amount++;
                if(amount > maxAmount){
                    maxAmount = amount;
                }
            }

            else{
                amount = 0;
            }


        }

        return maxAmount;
    }

    public static void main(String[] args){

        int firstArray[] = new int[6];

        firstArray[0] = 1;
        firstArray[1] = 1;
        firstArray[2] = 0;
        firstArray[3] = 1;
        firstArray[4] = 1;
        firstArray[5] = 1;

        int secondArray[] = new int[6];

        secondArray[0] = 1;
        secondArray[1] = 0;
        secondArray[2] = 1;
        secondArray[3] = 1;
        secondArray[4] = 0;
        secondArray[5] = 1;

        System.out.print("The number of consecutives ones in the array: ");
        for(int i = 0; i< firstArray.length;i++){
            System.out.print(firstArray[i]+",");
        }
        System.out.print(" is "+findMaxConsecutiveOnes(firstArray));

        System.out.println();

        System.out.print("The number of consecutives ones in the array: ");
        for(int i = 0; i< secondArray.length;i++){
            System.out.print(secondArray[i]+",");
        }
        System.out.print(" is "+findMaxConsecutiveOnes(secondArray));
    }

}
