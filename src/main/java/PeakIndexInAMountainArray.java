public class PeakIndexInAMountainArray {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 0};
        PeakIndexInAMountainArray p = new PeakIndexInAMountainArray();
//        System.out.println(p.peakIndexInMountainArray(arr));
        arr = new int[]{0, 2, 1, 0};
//        System.out.println(p.peakIndexInMountainArray(arr));
        arr = new int[]{3, 5, 3, 2, 0};
        System.out.println(p.peakIndexInMountainArray(arr));
    }

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid] < arr[mid + 1] && arr[mid - 1] < arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if ((start == 0 && arr[start] > arr[start + 1]) || (start > 0 && arr[start] > arr[start - 1] && arr[start] > arr[start + 1])) {
            return start;
        } else {
            return end;
        }
    }
}