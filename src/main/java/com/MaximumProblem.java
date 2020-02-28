package com;

public class MaximumProblem {

    public static void main(String []args) {
        System.out.println("Welcome to Test Maximum Problem");
    }

    public Integer MaximumProblem(Integer a, Integer b, Integer c) {
        Integer max=a;
        if (b.compareTo(max)>0){
            max=b;
        }
        if (c.compareTo(max)> 0){
            max=c;
        }
        return max;
    }
}
