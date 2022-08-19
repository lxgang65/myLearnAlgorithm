package com.testcode.stringrebuild;

import com.testcode.stringrebuild.enums.ActionTypeEnum;
import com.testcode.stringrebuild.service.IStringService;
import com.testcode.stringrebuild.service.StringService;
import com.testcode.stringrebuild.service.impl.AudioStringServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ExtendWith(MockitoExtension.class)
class StringrebuildApplicationTests {

//    @Autowired
//    private IStringService stringService;stringService


    @Test
    void contextLoads() {
        AudioStringServiceImpl audioStringService = new AudioStringServiceImpl();
//        String input="aabcccbbad";
//        String input="aaccc1111";
//        String input="aabcccb*****&&&&&d";
//        String input="aabcccbbaddd";
        String input = "####aaaabccc";
        System.out.println("STAGE1=============");
        audioStringService.stringUtil(input, ActionTypeEnum.REPLACE_EMPTY);

        System.out.println("STAGE2=============");
        audioStringService.stringUtil(input, ActionTypeEnum.REPLACE_WORD);

    }

    /**
     * 前缀和
     */
    @Test
    void t() {
        int[] arr = new int[]{0, 1, -2, 0, 1};
            // // 0 1 -1 -1 0
        //前缀和   sum(i) = sum(i-1) + num[i]
        int[] pre = new int[arr.length];
        pre[0] = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            pre[i] = pre[i-1] + arr[i];
        }
        System.out.println("前缀和");
        for(int p: pre){
            System.out.print(p + " ");
        }

        System.out.println("q");

    }

    @Test
    void t5(){
        public int[] corpFlightBookings(int[][] bookings, int n) {
            //给个首尾默 + 2认组
            int[] arr = new int[n+2];
            for(int[] booking: bookings){
                //开始位置要加的数
                int first = booking.get(0);
                //后面那位要加的数
                int last = booking.get(1);
                //加多少位置
                int seates = booking.get(2);
                //第n个位置加  last减
                arr[first] += seates;

                //后面那个位置要减
                arr[last + 1] -= seates;

            }

            return arr;


        }
    }

}
