package com.testcode.stringrebuild.util;

import com.testcode.stringrebuild.enums.ActionTypeEnum;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CommonUtil {
    public static String commanUtil(String str, ActionTypeEnum actionType){
        List<String> words = Stream.of("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t",
                "u","v","w","x","y","z").collect(Collectors.toList());

        if(StringUtils.isBlank(str)){
            return str;
        }
        String pattern="([a-z])(\\1){2,}";
        Pattern p= Pattern.compile(pattern);
        while(true){
            Matcher matcher=p.matcher(str);
            String a="";
            if(ActionTypeEnum.REPLACE_EMPTY.equals(actionType)){

                while(matcher.find()){
                    a = matcher.group();
                    str = str.replaceAll(a,"");
                    System.out.println(str);

                }
            } else if(ActionTypeEnum.REPLACE_WORD.equals(actionType)){
                String b="";
                while(matcher.find()){
                    a = matcher.group();
                    int index=words.indexOf(matcher.group(1));
                    if(index>0){
                        b=String.valueOf(words.get(index - 1));
                        str=str.replaceAll(a,b);
                        System.out.println(str + ",  " + a +" is replaces by "+b);
                    }else if(index>-1){
                        b=String.valueOf(matcher.group(1));
                        str=str.replaceAll(a,"");
                        System.out.println(str);
                    } else {
                        a = "";
                    }

                }
            }

            if(StringUtils.isBlank(a)){
                break;
            }
        }

        return str;
    }
}
