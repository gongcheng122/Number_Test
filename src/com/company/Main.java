package com.company;
/*
然 Java 语言是典型的面向对象编程语言，但其中的八种基本数据类型并不支持面向对象编程，
基本类型的数据不具备“对象”的特性——不携带属性、没有方法可调用。 沿用它们只是为了
迎合人类根深蒂固的习惯，并的确能简单、有效地进行常规数据处理。

这种借助于非面向对象技术的做法有时也会带来不便，比如引用类型数据均继承了 Object 类
的特性，要转换为 String 类型（经常有这种需要）时只要简单调用 Object 类中定义的toString()
即可，而基本数据类型转换为 String 类型则要麻烦得多。为解决此类问题 ，Java为每种基本数据
类型分别设计了对应的类，称之为包装类(Wrapper Classes)，也有教材称为外覆类或数据类型类。
 */

/*
基本数据类型及对应的包装类
byte 	Byte
short 	Short
int 	Integer
long 	Long
char 	Character
float 	Float
double 	Double
boolean 	Boolean
 */

/*
1 	xxxValue()
将 Number 对象转换为xxx数据类型的值并返回。
2 	compareTo()
将number对象与参数比较。
3 	equals()
判断number对象是否与参数相等。
4 	valueOf()
返回一个 Number 对象指定的内置数据类型
5 	toString()
以字符串形式返回值。
6 	parseInt()
将字符串解析为int类型。
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        int x = 5;
        Integer X = new Integer(x);//装箱
        System.out.println(X);//print a object

        int y = X.intValue();//拆箱
        System.out.println(y);

        int m = X;//自动装箱
        Integer n = y;//自动拆箱

        System.out.println("m = "+m+"; n = "+n+" .");

        String str1 = new Integer(5678).toString();//int 5678 to object, than to string
        System.out.println(str1);

        String str[] = {"123", "123abc", "abc123", "abcxyz"};
        for(String str2 : str){
            try{
                int z = Integer.parseInt(str2, 10);// String to int
                System.out.println(str2 + " 可以转换为整数 " + z);
            }catch(Exception e){
                System.out.println(str2 + " 无法转换为整数");
            }
        }

    }
}
