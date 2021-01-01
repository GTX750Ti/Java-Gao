import java.lang.reflect.Array;
import java.util.Arrays;

public class day07数组2 {
    /**
     * 数组拷贝共有 4 种方式
     * for
     * Arrays.copyOf(src)
     * System.arraycopy(src, srcPos, dst, dstPos, len);
     * arr.clone(src);克隆产副本，是Object的克隆方法
     * 1.System.arraycopy()速度最快，属于与natve方法[C,C++代码实现]
     * 2.以上4种全是浅拷贝：牵一发动全身
     *
     * @param arr
     * @return
     */
    public static int[] my_copyArray(int[] arr) {
        int[] arr_d = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr_d[i] = arr[i];
        }
        return arr_d;
    }

    public static int my_arrayMax(int[] arr) {
        int max = arr[0];
        for (int val : arr) {
            if (max < val) {
                max = val;
            }
        }
        return max;
    }

    /**
     * 二分查找
     *
     * @param arr 要查找的有序序列
     * @param key 在序列中想查找的数字
     * @return
     */
    public static int count = 0;

    public static int my_binarSearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        int mid;
        while (left <= right) {
            ++count;
            mid = (left + right) >>> 2;
            if (arr[mid] < key) {
                left = mid + 1;
            } else if (arr[mid] > key) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    /**
     * Arrays工具类中常见方法类介绍
     * fill
     * sort
     * toString
     * binarySearch
     *
     * @param
     */

    //判断某个数组是否升序
    public static boolean my_isUP1(int[] arr) {
        int[] ret = Arrays.copyOf(arr, arr.length);
        Arrays.sort(ret);
        if (Arrays.equals(ret, arr)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean my_isUP2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void my_bubbleSort(int[] arr) {
        int tmp, flag;
        for (int i = 0; i < arr.length; i++) {
            flag = 1;
            for (int j = 0; j < i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    flag = 0;
                }
                if (flag == 1) {
                    break;
                }
            }
        }
    }

    public static int[] my_reverse_1(int[] arr) {
        int[] tmp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[arr.length - 1 - i];
        }
        return tmp;
    }

    public static void my_reverse_2(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int tmp;
        while (left < right) {
            tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            ++left;
            --right;
        }
    }

    public static void my_move(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int tmp;
        while (left < right) {
            while ((left < right) && (arr[left] % 2 == 0)) {
                ++left;
            }
            while ((left < right) && (arr[right] % 2 == 1)) {
                --right;
            }
            if (left<right) {
                tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        /*int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        my_move(arr);
        System.out.println(Arrays.toString(arr));*/
        /*System.out.println(Arrays.toString(my_reverse_1(arr)));
        my_reverse_2(arr);
        System.out.println(Arrays.toString(arr));
        int[] arr2 = {2, 1, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr3 = new int[10];
        int[] arr4 = {21, 11, 13, 41, 15, 61, 17, 81, 19, 110};
        int[] arr5 = {21, 11, 13, 41, 15, 61, 17, 81, 19, 110};
        bubbleSort(arr5);
        System.out.println(arr5);
        System.out.println(isUP1(arr));
        System.out.println(isUP2(arr2));
        //[fromIndex, toIndex)
        System.out.println(Arrays.binarySearch(arr, 2, 6, 6));
        System.out.println(Arrays.equals(arr, arr2));

        Arrays.fill(arr3, 8);
        Arrays.fill(arr3, 0, 2, '好');
        System.out.println(Arrays.toString(arr3));

        Arrays.sort(arr4);//底层是什么排序
        System.out.println(Arrays.toString(arr4));*/

        /*int[] arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println("下标"+my_binarSearch(arr, 3)+"的查找次数："+count);
        System.out.println(Arrays.binarySearch(arr, 3));*/

        /*int[] arr={1,2,3};
        System.out.println(my_arrayMax(arr));*/

        /*int[] arr = {2,4,6,8};
        int[] copy_arr = my_copyArray(arr);
        System.out.println(Arrays.toString(copy_arr));

        Arrays.copyOf(arr, 3);

        int[] arr2 = new int[10];
        System.arraycopy(arr, 0, arr2, 0, 2);
        System.out.println(Arrays.toString(arr2));

        int[] ret = arr.clone();
        System.out.println(Arrays.toString(ret));*/

    }
}
