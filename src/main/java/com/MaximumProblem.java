package com;
public class MaximumProblem<E extends Comparable<E>> {


    E a;
    E b;
    E c;

    public MaximumProblem(E a, E b, E c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public <E extends Comparable> E getMaximumProblem(){

        return (E) MaximumProblem(a,b,c);
    }


    public <E extends Comparable<E>> E MaximumProblem(E a, E b, E c) {
        E max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }
}
