package com.testcode.stringrebuild;

import com.testcode.stringrebuild.enums.ActionTypeEnum;
import com.testcode.stringrebuild.service.IStringService;
import com.testcode.stringrebuild.service.StringService;
import com.testcode.stringrebuild.service.impl.AudioStringServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest(classes = StringrebuildApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
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
        String input="####aaaabccc";
        System.out.println("STAGE1=============");
        audioStringService.stringUtil(input, ActionTypeEnum.REPLACE_EMPTY);

        System.out.println("STAGE2=============");
        audioStringService.stringUtil(input, ActionTypeEnum.REPLACE_WORD);

    }

}
