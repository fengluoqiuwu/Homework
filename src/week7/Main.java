package week7;

public class Main {
    private static final int[] arr1={-1,2,3,-4};
    private static final int[] arr2={-1,2,-5,3,-4};
    private static final int[] arr3={-1,20,-5,30,-4};
    private static final int[] arr4={-2,-3,-5,-1,-9};


    public static void main(String[] args) {
        test1();
        test2();
    }
    private static void test1(){
        System.out.println("Array1:");
        MyArrayUtil[] arrayList={new Array1(arr1),new Array1(arr2),new Array1(arr3),new Array1(arr4)};
        for(MyArrayUtil a:arrayList){
            System.out.println(a.getMaxSubArraySum());
        }
    }
    private static void test2(){
        System.out.println("Array2:");
        MyArrayUtil[] arrayList={new Array2(arr1),new Array2(arr2),new Array2(arr3),new Array2(arr4)};
        for(MyArrayUtil a:arrayList){
            System.out.println(a.getMaxSubArraySum());
        }
    }
}
