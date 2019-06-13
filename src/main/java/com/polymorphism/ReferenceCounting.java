package com.polymorphism;

import static com.util.Print.print;

/**
 * @Auther: linklmm
 * @Date: 2019/6/13 16:21
 * @Description:
 */
class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared() {
        print("Creating " + this);
    }

    public void addRef() {
        refcount++;
    }

    protected void dispose() {
        if (--refcount == 0) {
            print("Disposing " + this);
        }
    }

    @Override
    public String toString() {
        return "Shared{" +
                "id=" + id +
                '}';
    }
}

class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;

    public Composing(Shared shared) {
        print("Creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }

    protected void dispose() {
        print("Disposing " + this);
        shared.dispose();
    }

    @Override
    public String toString() {
        return "Composing{" +
                "id=" + id +
                '}';
    }
}

public class ReferenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composings = {new Composing(shared),
                new Composing(shared), new Composing(shared),
                new Composing(shared), new Composing(shared)
        };
        for (Composing c : composings) {
            c.dispose();
        }
    }
}
