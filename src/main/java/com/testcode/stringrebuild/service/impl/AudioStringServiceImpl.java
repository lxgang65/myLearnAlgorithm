package com.testcode.stringrebuild.service.impl;

import com.testcode.stringrebuild.enums.ActionTypeEnum;
import com.testcode.stringrebuild.service.IStringService;
import com.testcode.stringrebuild.service.StringService;

public class AudioStringServiceImpl implements StringService {

    StringService stringService;


    @Override
    public void stringUtil(String str, ActionTypeEnum actionType) {
        if (ActionTypeEnum.REPLACE_EMPTY.equals(actionType) || ActionTypeEnum.REPLACE_WORD.equals(actionType)) {
            stringService = new StringServiceImpl(actionType);
            stringService.stringUtil(str,actionType);
        }

    }
}
