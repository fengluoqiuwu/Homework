package week7;

public class Array1 implements MyArrayUtil{
    int[] array;
    Array1(){
        array = null;
    }
    Array1(int[] array){
        this.array = array;
    }
    @Override
    public int getMaxSubArraySum() {
        {
            if(array==null){
                throw new RuntimeException("/week7/Array1.java,getMaxSubArraySum,数组不能为null");
            }
            if(array.length==0){
                throw new RuntimeException("/week7/Array1.java,getMaxSubArraySum,数组长度不能为0");
            }
        }//Run Exception

        int maxSum=array[0];
        int length=array.length;

        for(int leftIndex=0;leftIndex<length;leftIndex++){
            for(int rightIndex=leftIndex;rightIndex<length;rightIndex++){
                int sum=0;
                for(int i=leftIndex; i<=rightIndex; i++){
                    sum+=array[i];
                }
                if(sum>maxSum){
                    maxSum=sum;
                }
            }
        }

        return maxSum;
    }
}
