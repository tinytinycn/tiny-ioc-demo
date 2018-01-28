课题内容: 手写spring IOC容器/DI依赖注入/AOP动态代理
----

目录
==
* 课题要求
* 课题思路
* 
* spring ioc 原理
* spring bean 创建和初始化
* spring bean 生命周期
* spring bean 延迟加载
* spring bean 依赖注入 DI
* ...
* spring aop 原理
* spring aop 基本实现 
* spring aop 
* 操作详细手册
----


课题要求
--
1. 写博客(每周一篇技术总结, 发链接到交流群. 两周不写视为放弃)
2. 写周报, 汇报进度和学习情况(两周不写视为放弃) 
3. 写简历.
4. 课题研究, 提出5个问题, 层层深入(模仿面试)
5. 提交资料(代码/文档/readme)
6. 结业感想
7. 个人照片

课题思路
--
1. 资料收集
2. 了解 Spring IOC/DI/AOP 基本原理
3. 简单实现一个 Spring IOC/DI/AOP maven java项目
4. 提出问题思路: 是什么/为什么/怎么工程实现/底层是如何实现/横向对比描述
5. 根据问题的主线, 逐步手动实现一个spring IOC/DI/AOP基本功能

分析Spring IOC 原理
--
关键字: 控制反转IOC/容器

参考文档: [spring](https://www.ibm.com/developerworks/cn/java/wa-spring1/ "spring")

框架图: 

![spring-framework](https://www.ibm.com/developerworks/cn/java/wa-spring1/spring_framework.gif "framework")

涉及模块: 
- 核心容器：核心容器提供 Spring 框架的基本功能。核心容器的主要组件是 BeanFactory，它是工厂模式的实现。BeanFactory 使用控制反转 （IOC） 模式将应用程序的配置和依赖性规范与实际的应用程序代码分开。
- Spring 上下文：Spring 上下文是一个配置文件，向 Spring 框架提供上下文信息。Spring 上下文包括企业服务，例如 JNDI、EJB、电子邮件、国际化、校验和调度功能。



