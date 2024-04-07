package week7;



public class Array2 implements MyArrayUtil{
    int[] array;
    Array2(){
        array = null;
    }
    Array2(int[] array){
        this.array = array;
    }
    @Override
    public int getMaxSubArraySum() {
        {
            if(array==null){
                throw new RuntimeException("/week7/Array2.java,getMaxSubArraySum,数组不能为null");
            }
            if(array.length==0){
                throw new RuntimeException("/week7/Array2.java,getMaxSubArraySum,数组长度不能为0");
            }
        }//Run Exception

        return getMaxSum(array,0,array.length-1);
    }
    private static int getMaxSum(int[] array,int left,int right){
        if(left==right){
            return array[left];
        }

        int Sum=array[left];
        int maxSum = array[left];
        int preSum = getMaxSum(array,left+1,right);

        for(int i=left+1;i<=right;i++){
            Sum=Sum+array[i];
            if(Sum>maxSum){
                maxSum=Sum;
            }
        }

        if(preSum>maxSum) {
            maxSum=preSum;
        }

        return maxSum;
    }
}
