package practice.binSearch;

interface MountainArray {
        int get(int index);
        int length();
    }

class HiddenMountainArray implements MountainArray {

    private int[] arr;
    public HiddenMountainArray(int[] arr) {
        this.arr = arr;
    }

    @Override
    public int get(int index) {
        return arr[index];
    }

    @Override
    public int length() {
        return arr.length;
    }
}


public class findInMountainArrayLeetcode {

    //Will work fine but too many api call so not optimized for leetcode
        public int findInMountainArray(int target, MountainArray mountainArr) {
            int peak = peakInMountainArray(mountainArr);

            //Ascending Try
            int res = OrderAgnosBS(mountainArr,  0, peak, target);

            if (res != -1)  return res;

            return OrderAgnosBS(mountainArr, peak, mountainArr.length()-1, target);
        }

        //better with using isAsc flag
        static int findInMountainArray2(int target, MountainArray mountainArr) {
            int peak = peakInMountainArray(mountainArr);

            //Ascending Try
            int res = OrderAgnosBS2(mountainArr,  0, peak, target, true);
            if (res != -1)  return res;

            return OrderAgnosBS2(mountainArr, peak, mountainArr.length()-1, target, false);
        }

    static void main() {

        MountainArray mountainArr =
                new HiddenMountainArray(new int[]{1,2,3,4,5,3,1});

        int res = findInMountainArray2(3,mountainArr);
        System.out.println(res);
    }


    private static int OrderAgnosBS2(MountainArray mountainArr, int start, int end, int target, boolean isAsc) {

        while (start<=end) {
            int mid = start + (end-start)/2;
            int value = mountainArr.get(mid);  //nums[mid]

            if (value == target)     return mid;
            if (isAsc) { //asc
                if (value > target) {
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            } else { //desc
                if (value > target) {
                    start = mid+1;
                } else {
                    end = mid-1;
                }
            }
        }
        return -1;
    }


    private int OrderAgnosBS(MountainArray mountainArr, int start, int end, int target) {

            while (start<=end) {
                int mid = start + (end-start)/2;

                if (mountainArr.get(mid) == target)     return mid;
                if (mountainArr.get(start) < mountainArr.get(end)) { //asc
                    if (mountainArr.get(mid) > target) {
                        end = mid-1;
                    } else {
                        start = mid+1;
                    }
                } else { //desc
                    if (mountainArr.get(mid) > target) {
                        start = mid+1;
                    } else {
                        end = mid-1;
                    }
                }
            }
            return -1;
        }

        private static int peakInMountainArray(MountainArray mountainArr) {
            int s = 0, e=mountainArr.length() -1;
            while (s<e) {
                int mid = s + (e-s)/2;
                if (mountainArr.get(mid) > mountainArr.get(mid+1)) {
                    //desc
                    e = mid;
                } else {
                    s = mid + 1;
                }
            }
            return s;
        }


}
