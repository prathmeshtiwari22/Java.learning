// Linear Search 
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     //Abstract Data Type
        Scanner sc= new Scanner(System.in);
        int search=sc.nextInt();
        int nums[] = {3,2,1,3,24,1421,3113,313,314,221,35,2441,4};
        boolean found=searchlinear(nums,search);
        if(!found){
            System.out.println("WE DIDNT GOT THIS ELEMENT  "+search);
        }
    }
    public static boolean searchlinear(int arr[],int search){
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==search){
                System.out.println("WE GO ELEMENT "+arr[i]+"  Hence done");
                found=true;
            }
        }
        return found;
    }
}
//Binary Search 
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     //Abstract Data Type
        Scanner sc= new Scanner(System.in);
        int search=sc.nextInt();
        int nums[] = {3,2,1,3,24,1421,3113,313,314,221,35,2441,4};
        int left=0;
        int right= nums.length-1;
        int temp=0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        int found=searchBinary(left,right,nums,search);
        if (found == -1) {
            System.out.println("Element not found: " + search);
        } else {
            System.out.println("Element found at index: " + found);
        }
    }
    public static int searchBinary(int left, int right, int arr[], int search) {
        if (left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2;

        if (arr[mid] == search) {
            return mid;
        }
        else if (search > arr[mid]) {
            return searchBinary(mid + 1, right, arr, search);
        }
        else {
            return searchBinary(left, mid - 1, arr, search);
        }
    }

}
