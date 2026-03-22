import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    private static void buildHeap(int[] arr){
        int n = arr.length;
        for (int i = (n/2) - 1; i >= 0; i--){
            heapifyDown(arr, i,arr.length);
        }
    }
    public static void heapSortDesc(int[] arr){
        buildHeap(arr);
        for (int i=arr.length-1;i>=0;i--){
            swap(arr,0,i);
            heapifyDown(arr,0,i);
        }
    }
    public static void heapifyDown(int[] arr, int index,int heapSize){
        int n =heapSize;
        int leftIndex = getLeftIndex(index, n);
        int rightIndex = getRightIndex(index, n);
        if (leftIndex == -1 && rightIndex == -1) return;
        int smallest = index;
        if (leftIndex != -1 && arr[leftIndex] < arr[smallest]){
            smallest = leftIndex;
        }
        if (rightIndex != -1 && arr[rightIndex] < arr[smallest]){
            smallest = rightIndex;
        }
        if (smallest == index) return;
        swap(arr, index, smallest);
        heapifyDown(arr, smallest,heapSize);
    }
    private static int getLeftIndex(int index, int n){
        int ans = 2*index + 1;
        if (ans > n-1) return -1;
        return ans;
    }
    private static int getRightIndex(int index, int n){
        int ans = 2*index + 2;
        if (ans > n-1) return -1;
        return ans;
    }
    private static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        heapSortDesc(arr);

        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}
