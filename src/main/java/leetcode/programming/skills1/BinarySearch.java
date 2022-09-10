package leetcode.programming.skills1;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        return recursive(nums, low, high, target);
    }

    public int recursive(int[] nums, int low, int high, int target) {
        if (low > high) return -1;
        int mid = (low + high) / 2;

        if (nums[mid] == target) return mid;

        if (target > nums[mid]) return recursive(nums, mid + 1, high, target);
        else return recursive(nums, low, mid - 1, target);
    }
    //alternative decision from leet code;
    /*int n = array.length;
        int low = 0;
        int high = n-1;
        while(low<=high) {
            int mid = low + high >> 1;
            if(array[mid] == v) return mid;
            if(array[mid] < v) low = mid + 1;
            else high = mid - 1;
        }
        return -1;*/
}
