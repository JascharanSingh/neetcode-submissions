class Solution {
   public  int helper(int[] numbers, int i, int j, int numbersLength, int target){
        if(j>numbersLength){
            return -1;
        }
        if(numbers[i] + numbers[j] == target){
            return j;
        }

        return helper(numbers,  i, j+1,  numbersLength,  target);
    }
   public  int[] twoSum(int[] numbers, int target) {

        for(int i = 0; i<numbers.length; i++){
            int result = helper(numbers, i,i+1, numbers.length-1,target );
            if(result != -1){
                 return new int[] {i+1, result+1};

            }
        }
        return new int[] {-1,-1};
    }
}
