# learn design pattern
- 创建型：对对象创建过程的各种问题和解决方案的总结
- 结构型：针对软件设计结构的总结，关注于类、对象继承、组合方式的实践经验
- 行为型：是从类或对象之间交互、职责划分等角度总结的模式


- Creation
	- Singleton
	- SimpleFactory
	- FactoryMethod
	- AbstractFactory
	- Builder
	- Prototype 
- Behavioral
	- Template
	- ObserverPattern 
- Structure
	- Proxy
	- Decorator
	- Adapter 





### tmp



访问者模式的核心思想：将 **数据的结构** 和 **对数据的操作** 分离。

访问者模式设计了一个“双重分派”的机制，而 Java 只支持单分派，用单分派语言强行模拟出双重分派才导致了访问者模式看起来比较复杂

因为 Java 调用重写方法时，会根据运行时的具体类型来确定调用哪个方法。

Java 在调用重载方法时，只会根据方法签名中声明的参数类型来判断调用哪个方法，不会去判断参数运行时的具体类型是什么

- 调用重写方法时，与对象的运行时类型有关；
- 调用重载方法时，只与方法签名中声明的参数类型有关，与对象运行时的具体类型无关。

单分派和双重分派的区别就是：程序在选择重载方法和重写方法时，如果两种情况都是动态分派的，则称之为双重分派；如果其中一种情况是动态分派，另一种是静态分派，则称之为单分派。

