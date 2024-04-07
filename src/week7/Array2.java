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

        int left=0;
        int right=array.length-1;

        return 0;
    }
}
