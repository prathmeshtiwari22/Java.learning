import java.util.Scanner;
// Bubble Sort
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        BubbleSort(arr);
        
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void BubbleSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

// Selection Sort 
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        SelectionSort(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void SelectionSort(int arr[]){
       int min=0,temp;
       for(int i=0;i<arr.length-1;i++){
           min=i;
           for(int j=i+1;j<arr.length;j++){
               if(arr[j]<arr[min]){
                   min=j;
               }
               temp=arr[min];
               arr[min]=arr[i];
               arr[i]=temp;
           }
       }
    }
}

//Insertion Sort
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        InsertionSort(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void InsertionSort(int arr[]){
      int min=0;
      for(int i=1;i<arr.length;i++){
          int key=arr[i];
          int j=i-1;
          while(j>=0 && arr[j]>key){
              arr[j+1]=arr[j];
              j--;
          }
          arr[j+1]=key;
      }
    }
}

// Merge Sort
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int left=0;
        int right=arr.length-1;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        MergeSort(left,right,arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void MergeSort(int left,int right,int arr[]){
      if(left<right){
          int mid= (left+right)/2;
          MergeSort(left,mid,arr);
          MergeSort(mid+1,right,arr);
          merge(left,mid,right,arr);
      }
    }

    private static void merge(int left, int mid,int right, int[] arr) {
        int n1=mid-left+1;
        int n2=right-mid;
        int[] L=new int[n1];
        int[] R=new int[n2];
        for(int i=0;i<n1;i++) L[i]=arr[left+i];
        for(int j=0;j<n2;j++) R[j]=arr[mid+1+j];
          int i=0,j=0,k=left;
        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
              arr[k++]=L[i++];
            }
            else{
                arr[k++]=R[j++];
            }
        }
        while(i<n1) arr[k++]=L[i++];
        while(j<n2) arr[k++]=R[j++];
    }
}

// Quick Sort 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int left=0;
        int right=arr.length-1;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        QuickSort(left,right,arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void QuickSort(int left,int right,int arr[]){
      if(left<right){
          int mid= Partition(left,right,arr);
          QuickSort(left,mid-1,arr);
          QuickSort(mid+1,right,arr);
      }
    }

    private static int Partition(int left,int right, int[] arr) {
        int pivot=arr[right];
        int i=left-1;
        for(int j=left;j<right;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp;

        return i + 1;
    }
}
