package 双指针滑动;

import java.util.ArrayList;

/**
 * @author liuxiaogang
 * @date 2022/8/19 15:41
 * @Description:
 */
public class ShuangZhizhen {

    // 相向双指针(patition in quicksort)
    public void patition(int[] A, int start, int end) {
        if (start >= end) {
            return;
        }
        int left = start, right = end;
        // key point 1: pivot is the value, not the index
        int pivot = A[(start + end) / 2];
        // key point 2: every time you compare left & right, it should be
        // left <= right not left < right
        while (left <= right) {
            while (left <= right && A[left] < pivot) {
                left++;
            }
            while (left <= right && A[right] > pivot) {
                right--;
            }
            if (left <= right) {
                int temp = A[left];
                A[left] = A[right];
                A[right] = temp;
                left++;
                right--;
            }
        }
        // 背向双指针
        left = position;
        right = position + 1;
        while (left >= 0 && right < length) {
            if (可以停下来了) {
                break;
            }
            left--;
            right++;
        }


        // 同向双指针
        int j = 0;
        for (int i = 0; i < n; i++) {
            // 不满⾜则循环到满⾜搭配为⽌
            while (j < n && i 到 j之间不满⾜条件){
                j += 1;
            }
            if (i 到 j之间满⾜条件){
                处理i，j这次搭配
            }
        }

        // 合并双指针
        ArrayList<Integer> merge (ArrayList < Integer > list1, ArrayList < Integer > list2){
            // 需要 new ⼀个新的 list，⽽不是在 list1 或者 list2 上直接改动
            ArrayList<Integer> newList = new ArrayList<Integer>();
            int i = 0, j = 0;
            while (i < list1.size() && j < list2.size()) {
                if (list1.get(i) < list2.get(j)) {
                    newList.add(list1.get(i));
                    i++;
                } else {
                    newList.add(list2.get(j));
                    j++;
                }
            }

            // ⽆需⽤ if (i < list1.size())，直接 while 即可
            while (i < list1.size()) {
                newList.add(list1.get(i));
                i++;
            }
            while (j < list2.size()) {
                newList.add(list2.get(j);
                j++;
            }
            return newList;
        }
    }

}
