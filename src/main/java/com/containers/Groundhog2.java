package com.containers;

/**
 * @author lmm
 * @Title: Groundhog2
 * @ProjectName thinkInJava
 * @Description: TODO
 * @date 18-12-28下午1:37
 */
public class Groundhog2 extends Groundinghog {
    public Groundhog2(int n) {
        super(n);
    }

    @Override
    public int hashCode() {
        return number;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Groundhog2 && (number == ((Groundhog2) obj).number);
    }
}
