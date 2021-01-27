package com.junyi.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * @time: 2021/1/26 16:33
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
public class Manager extends Component{

    private List<Component> employees;

    public Manager(String position, String job) {
        super(position, job);
        employees = new ArrayList<>();
    }

    @Override
    void addComponent(Component c) {
        employees.add(c);
    }

    @Override
    void removeComponent(Component c) {
        employees.remove(c);
    }

    @Override
    void check() {
        work();
        for (Component item : employees) {
            item.check();
        }
    }
}
