package com.zxf.list;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={5,8,9,1,2,7,3,6,4};
        int minPos=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]<arr[minPos]){
                minPos=j;
            }
        }

        System.out.println("最小值："+arr[minPos]);
        int temp=arr[0];
        arr[0]=arr[minPos];
        arr[minPos]=temp;
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
