package 差分;

/**
 * @author liuxiaogang
 * @date 2022/8/19 11:20
 * @Description:
 */
public class Hangban {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, -2, 0, 1};
        // 0 1 -1 -1 0

        //前缀和   sum(i) = sum(i-1) + num[i]
        int[] pre = new int[arr.length + 1];
        for (int i = 1; i <= arr.length - 1; i++) {
            pre[i+1] = pre[i] + arr[i];
            pre[i-1] = pre[i];
        }
        for(int p: pre){
            System.out.print(p + " ");
        }
    }
}
