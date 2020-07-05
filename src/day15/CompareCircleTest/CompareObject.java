package day15.CompareCircleTest;

public interface CompareObject {

    /**
     * 若返回值是 0 , 代表相等; 若为正数，代表当前对象大；负数代表当前对象小
     * @param o
     * @return
     */
    public abstract int compareTo(Object o);
}
