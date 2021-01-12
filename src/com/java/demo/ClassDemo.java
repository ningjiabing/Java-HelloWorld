package com.java.demo;

public class ClassDemo{

    public final String name = "Ning";

    public static void main(String[] args) {
        // 在继承关系中，子类如果定义了一个与父类方法签名完全相同的方法，被称为覆写（Override）。
        // Override和Overload不同的是，如果方法签名如果不同，就是Overload，Overload方法是一个新方法；如果方法签名相同，并且返回值也相同，就是Override。
        // 加上@Override可以让编译器帮助检查是否进行了正确的覆写。希望进行覆写

        // 调用super
        // 在子类的覆写方法中，如果要调用父类的被覆写的方法，可以通过super来调用。

        // final
        // 继承可以允许子类覆写父类的方法。如果一个父类不允许子类对它的某个方法进行覆写，可以把该方法标记为final。用final修饰的方法不能被Override
        // 如果一个类不希望任何其他类继承自它，那么可以把这个类本身标记为final。用final修饰的类不能被继承
        // 对于一个类的实例字段，同样可以用final修饰。用final修饰的字段在初始化后不能被修改。
        // 对final字段重新赋值会报错,可以保证实例一旦创建，其final字段就不可修改

        // interface
        // 所谓interface，就是比抽象类还要抽象的纯抽象接口，因为它连字段都不能有。因为接口定义的所有方法默认都是public abstract的，所以这两个修饰符不需要写出来（写不写效果都一样）

        // implements
        // 当一个具体的class去实现一个interface时使用

    }
}