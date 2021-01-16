package com.java.demo;

public class MavenDemo {

    public static void main(String[] args) {
        // Maven
        // Maven是一个Java项目管理和构建工具，它可以定义项目结构、项目依赖，并使用统一的方式进行自动化构建，是Java项目不可缺少的工具。

        // 目录结构
        // src  目录存放Java源
        // resources    目录存放配置文件
        // bin  目录存放编译生成的.class文件
        /*
            a-maven-project
            ├── pom.xml
            ├── src
            │   ├── main
            │   │   ├── java
            │   │   └── resources
            │   └── test
            │       ├── java
            │       └── resources
            └── target
            它有一个项目描述文件pom.xml，
            存放Java源码的目录是src/main/java，
            存放资源文件的目录是src/main/resources，
            存放测试源码的目录是src/test/java，
            存放测试资源的目录是src/test/resources，
            最后，所有编译、打包生成的文件都放在target目录里。
            这些就是一个Maven项目的标准目录结构
            所有的目录结构都是约定好的标准结构，我们千万不要随意修改目录结构。使用标准结构不需要做任何配置，Maven就可以正常使用。
         */

        // mvn clean：清理所有生成的class和jar；

        // mvn clean compile：先清理，再执行到compile；

        // mvn clean test：先清理，再执行到test，因为执行test前必须执行compile，所以这里不必指定compile；

        // mvn clean package：先清理，再执行到package。


        // 常用的插件：
        // maven-shade-plugin：打包所有依赖包并生成可执行jar；
        // cobertura-maven-plugin：生成单元测试覆盖率报告；
        // findbugs-maven-plugin：对Java源码进行静态分析以找出潜在问题。

    }

}
