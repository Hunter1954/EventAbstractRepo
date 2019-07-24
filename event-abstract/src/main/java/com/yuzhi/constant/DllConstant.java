package com.yuzhi.constant;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.ClassUtils;

@Component
public class DllConstant {

//    private static String hownetPath;

//    @Value("${hownetPathName}")
//    public void setHownetPath(String hownetPathName){
//        DllConstant.hownetPath = hownetPathName;
//    }
//
//    public static String getHownetPath(){
//        return System.getProperty("user.dir").substring(0, System.getProperty("user.dir").lastIndexOf("\\") + 1) + hownetPath+"\\";
//    }

    //hownet路径
//    public static String INITIAL_PATH = System.getProperty("user.dir").substring(0, System.getProperty("user.dir").lastIndexOf("\\") + 1);
//    public static final String INITIAL_PATH = System.getProperty("user.dir")+"\\hownet\\";//howNet初始化路径(IDE下)
//      public static final String INITIAL_PATH = ClassUtils.getDefaultClassLoader().getResource("").getPath()+ "hownet/";//howNet初始化路径(运行环境下)
    /**
     * 解析结果中Key标签前缀
     */
    public static final String KEY_MENTION = "mention";//触发词
    public static final String KEY_SUB = "sub";//主体
    public static final String KEY_OBJ = "obj";//客体
    public static final String KEY_DATE = "date";//时间
    public static final String KEY_AMOUNT = "amount";//程度


}
