package com.junyi.combination;

import org.junit.jupiter.api.Test;

/**
 *
 */

/**
 * @time: 2021/1/26 16:22
 * @version: 1.0
 * @author: junyi Xu
 *
 *  组合模式：用于表示整体和部分的结构，而整体是可以包括部分的，整体和部分具有相同的行为
 *  比如文件夹和文件的关系、树枝和分树枝的关系、总公司和分公司的关系
 *  这儿举的例子是，总经理管理着 PM、CTO、CFO，而 CTO 又管理者着项目负责人、程序员，项目负责人又直接管理各个程序员等，可以发现这就是一个树状的结构，总经理是 root 节点
 *  而我们定义这些角色的时候应该抽象出“叶子”，管理者和员工继承“叶子”
 */
public class Client {

    @Test
    public void test() {
        Manager boss = new Manager("老板", "融资");
        Manager pm = new Manager("PM", "需求确定");
        Manager cto = new Manager("CTO", "框架确定");
        Manager cfo = new Manager("CFO", "工资结算");
        Manager leader = new Manager("项目负责人", "管理程序员");

        Employee programmer = new Employee("程序员", "996");
        Employee programmer2 = new Employee("程序员2", "996");
        Employee programmer3 = new Employee("程序员3", "996");

        boss.addComponent(pm);
        boss.addComponent(cto);
        boss.addComponent(cfo);
        cto.addComponent(leader);
        cto.addComponent(programmer);
        leader.addComponent(programmer2);
        leader.addComponent(programmer3);

        boss.check();
    }
}
