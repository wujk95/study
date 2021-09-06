package com.example.demo.annotation;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

/**
 * @author her
 * @Description @ConditionalOnProperty使用说明
 * @create 2021-09-06T16:32
 * 参考地址   https://www.cnblogs.com/yaphetsfang/p/11817999.html
 */


@Component
@ConditionalOnProperty
public class ConditionalOnPropertyUse {
    /**
     * value
     *
     * String数组  该属性与下面的 name 属性不可同时使用，
     * 当value所对应配置文件中的值为false时，注入不生效，不为fasle注入生效
     * value有多个值时，只要有一个值对应为false,则注入不成功
     */

    /**
     * prefix
     *
     * 配置文件中key的前缀，可与value 或 name 组合使用
     */


    /**
     * name
     *
     * 与 value 作用一致
     */

    /**
     * havingValue
     *
     * 与value 或 name 组合使用，只有当value 或 name 对应的值与havingValue的值相同时，注入生效
     */

    /**
     * matchIfMissing
     *
     *该属性为true时，配置文件中缺少对应的value或name的对应的属性值，也会注入成功
     */


/*    // 对应的测试注入情况
    @Configuration
    @ConditionalOnProperty(value = "parentName.sonName")
    public class parentNameConfig {
    }
.yml配置如下：
    parentName:
    sonName: true     //正常
    parentName:
    sonName:          //正常，空字符时
    parentName:
    sonName: false       //失败
    parentName:
    sonName: null      //正常
    parentName:
    sonName: 123      //正常

    把第二行换成：
    @ConditionalOnProperty(value = "parentName.sonName",havingValue = "123")
.yml配置如下：
    parentName:
    sonName: 123      //正常
    parentName:
    sonName: 1234      //失败
    parentName:
    sonName: false      //失败

    把第二行换成：
    @ConditionalOnProperty(value = "parentName.sonName",havingValue = "false")
.yml配置如下：
    parentName:
    sonName: false      //正常

    把第二行换成：
    @ConditionalOnProperty(prefix = "parentName",name = "sonName",havingValue = "123")
.yml配置如下：
    parentName:
    sonName: 123      //正常
    parentName:
    sonName: 1234      //失败，与havingValue给定的值不一致

    把第二行换成：
    @ConditionalOnProperty(prefix = "parentName",name = "sonName",havingValue = "123",matchIfMissing = true)
.yml配置如下：
    不配置相关参数       //正常，当matchIfMissing = true时，即使没有该parentName.sonName属性也会加载正常


    把第二行换成：
    @ConditionalOnProperty(prefix = "parentName",name = "sonName",havingValue = "123",matchIfMissing = false) //这里matchIfMissing默认为false，写不写都行
.yml配置如下：
    不配置相关参数       //失败，当matchIfMissing = false时，必须要有对应的property
    parentName:
    sonName: 123     //正常

    把第二行换成：
    @ConditionalOnProperty(prefix = "parentName.", name = "sonName")//prefix带了.（点）
.yml配置如下：
    parentName:
    sonName: true    //正常
    parentName:
    sonName: 123     //正常

    把第二行换成：
    @ConditionalOnProperty(prefix = "parentName",value = {"sonName2"},name = {"sonName"})
.yml配置如下：
    parentName:
    sonName: true    //项目Debug启动失败，The name and value attributes of @ConditionalOnProperty are exclusive
    //@ConditionalOnProperty的name和value属性是互斥的，不能同时出现

    把第二行换成：
    @ConditionalOnProperty(prefix = "parentName",name = {"sonName"})
.yml配置如下：
    parentName:
    sonName: true    //正常

    把第二行换成：
    @ConditionalOnProperty(prefix = "parentName",name = {"sonName","flag"})  //name中的属性需要两个都存在且都不为false才会加载正常
.yml配置如下：
    parentName:
    sonName: true
    flag: true       //正常
    parentName:
    sonName: true
    flag: 123        //正常
    parentName:
    sonName: true
    flag: false      //失败
    parentName:
    sonName: false
    flag: false      //失败

    把第二行换成：
    @ConditionalOnProperty(prefix = "parentName", name = {"sonName", "flag"}, havingValue = "false")
    parentName:
    sonName: false
    flag: false      //正常

    把第二行换成：
    @ConditionalOnProperty(prefix = "parentName", name = {"sonName", "flag"}, havingValue = "123")//parentName.sonName和parentName.flag的值都要与havingValue的一致才行
    parentName:
    sonName: 123
    flag: 1234       //失败
    parentName:
    sonName: 123
    flag: 123         //正常
    parentName:
    sonName: 123     //失败，缺少parentName.flag

    把第二行换成：
    @ConditionalOnProperty(prefix = "parentName", name = {"sonName", "flag"}, havingValue = "123",matchIfMissing = true)//matchIfMissing = true允许缺少
    parentName:
    sonName: 123     //正常
            .yml配置如下：
    不配置相关参数      //正常

    把第二行换成：
    @ConditionalOnProperty(prefix = "parentName", name = {"sonName", "flag"}, havingValue = "123")
.yml配置如下：
    不配置相关参数      //失败   */

}
