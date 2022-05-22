package com.testcode.stringrebuild.service.impl;

import com.testcode.stringrebuild.enums.ActionTypeEnum;
import com.testcode.stringrebuild.service.IStringService;
import com.testcode.stringrebuild.util.CommonUtil;
import org.apache.commons.lang3.StringUtils;

public class IStringWordServiceImpl implements IStringService {
    @Override
    public String stringReplace(String str) {
        return null;
    }

    @Override
    public String StringReplaceWithPrevWord(String str) {
        if(StringUtils.isBlank(str)){
            return str;
        }

        return CommonUtil.commanUtil(str, ActionTypeEnum.REPLACE_WORD);
    }
}
