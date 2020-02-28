package com;
public class MaximumProblem {
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
