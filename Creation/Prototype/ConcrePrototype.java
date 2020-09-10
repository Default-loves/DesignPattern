package Prototype;

/**
 * @time: 2020/9/10 12:06
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
class ConcrePrototype extends Prototype {
    private String s;

    public ConcrePrototype(String s) {
        this.s = s;
    }

    @Override
    public Prototype clone() {
        return new ConcrePrototype(s);
    }

    @Override
    public String toString() {
        return s.toString();
    }
}
