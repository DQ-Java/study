package com.pers.dq.annotation;

/**
 * @author DQ
 * @Description
 * @create 2019-10-20 14:30
 */
public class AnnotationDeclaration {

    //@符号与interface关键字无分隔符，常用风格
    @interface Test {

    }

    //@符号与interface关键字用空格做分隔
    @interface Test1 {

    }


    //注解类型不允许继承扩展
//    @interface TestExtends extends Test{
//
//    }

    //如果注解类型的声明的Identifier与其任何封闭类或接口的简单名称相同，则为编译时错误。
//    @interface AnnotationDeclaration {
//
//    }

    @interface TestSub {
        class Sub {

        }

        interface SubInterface {

        }

        int i = 0;

        String[] value();
    }

    @interface TestOther{
        //为兼容旧版本支持该语法，但强烈建议不要在新版本中使用该语法
        String value()[];
    }

}
