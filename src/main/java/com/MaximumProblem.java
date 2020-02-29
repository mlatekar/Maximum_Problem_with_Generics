package com;

import java.util.Arrays;
import java.util.Collections;

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

        return (E) getMaximumProblem(a,b,c);
    }

    public static  <E extends Comparable<E>> E getMaximumProblem(E a, E b, E c, E... otherArgument) {
        E max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        if(otherArgument.length!= 0) {
            Arrays.sort(otherArgument, Collections.reverseOrder());
            if ((otherArgument[0]).compareTo(max)>0) {
                max = otherArgument[0];
            }
        }
        return max;
    }
}
