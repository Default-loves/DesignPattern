package com.junyi.combination;

/**
 * @time: 2021/1/26 16:29
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
public abstract class Component {

    private String position;
    private String job;

    public Component(){}

    public Component(String position, String job) {
        this.position = position;
        this.job = job;
    }

    public void work() {
        System.out.println("I'm " + position + ", I'm doing " + job);
    }

    /** 管理者添加员工 */
    abstract void addComponent(Component c);

    /** 管理者删除员工 */
    abstract void removeComponent(Component c);

    /** 管理者检查员工 */
    abstract void check();


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
