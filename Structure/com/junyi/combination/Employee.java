package com.junyi.combination;

/**
 * @time: 2021/1/26 16:33
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
public class Employee extends Component{


    public Employee(String position, String job) {
        super(position, job);
    }

    @Override
    void addComponent(Component c) {
        System.out.println("职员没有管理权限");
    }

    @Override
    void removeComponent(Component c) {
        System.out.println("职员没有管理权限");
    }

    @Override
    void check() {
        work();
    }
}
