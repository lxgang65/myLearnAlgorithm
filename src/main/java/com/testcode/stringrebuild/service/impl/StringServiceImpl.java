package com.testcode.stringrebuild.service.impl;

import com.testcode.stringrebuild.enums.ActionTypeEnum;
import com.testcode.stringrebuild.service.IStringService;
import com.testcode.stringrebuild.service.StringService;
import com.testcode.stringrebuild.util.CommonUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

public class StringServiceImpl implements StringService {

    IStringService iStringService;

    public StringServiceImpl(ActionTypeEnum actionType){
        if (ActionTypeEnum.REPLACE_EMPTY.equals(actionType)) {
            iStringService = new IStringServiceImpl();
        }else if(ActionTypeEnum.REPLACE_WORD.equals(actionType)){
            iStringService = new IStringWordServiceImpl();
        }
    }

    @Override
    public void stringUtil(String str, ActionTypeEnum actionType) {
        if (ActionTypeEnum.REPLACE_EMPTY.equals(actionType)) {
            iStringService.stringReplace(str);
        }else if (ActionTypeEnum.REPLACE_WORD.equals(actionType)){
            iStringService.StringReplaceWithPrevWord(str);
        }
    }
}
