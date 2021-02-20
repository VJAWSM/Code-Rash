public class Solution {
    public int solve(int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }

        return mergeSort(A, 0, A.length - 1);
    }

    private int mergeSort(int[] nums, int left, int right) {
        if (left >= right) {
            return 0;
        }

        int mid = left + ((right - left) >> 1);
        return mergeSort(nums, left, mid) + mergeSort(nums, mid + 1, right)
                + merge(nums, left, mid, right);
    }

    private int merge(int[] nums, int left, int mid, int right) {
        int[] helper = new int[right - left + 1];

        int i = 0, rst = 0;
        int p1 = left, p2 = mid + 1, p = mid + 1;
        while (p1 <= mid) {
            while (p <= right && nums[p1] / 2.0 > nums[p]) {
                p++;
            }
            rst += p - (mid + 1);

            while (p2 <= right && nums[p1] > nums[p2]) {
                helper[i++] = nums[p2++];
            }
            helper[i++] = nums[p1++];
        }
        while (p2 <= right) {
            helper[i++] = nums[p2++];
        }

        for (i = 0; i < helper.length; i++) {
            nums[left + i] = helper[i];
        }
        return rst;
    }
}
