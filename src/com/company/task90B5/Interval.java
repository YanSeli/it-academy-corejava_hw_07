package com.company.task90B5;

public class Interval {
    private int start;
    private int end;
    private boolean isInclude;

    Interval(int start, int end, boolean isInclude) {
        this.start = start;
        this.end = end;
        this.isInclude = isInclude;
    }

    private int getStart() {
        return start;
    }

    private int getEnd() {
        return end;
    }

    @Override
    public String toString() {
        String s1, s2;
        if (isInclude) {
            s1 = "[";
            s2 = "]";
        } else {
            s1 = "(";
            s2 = ")";
        }
        return s1 + start + "; " + end + s2;
    }

    void combine(Interval inter) {
        System.out.println(this + "\t" + inter);
        if (start < inter.getEnd() && inter.getStart() < end) {
            int x = Math.min(start, inter.getStart());
            int y = Math.max(end, inter.getEnd());
            System.out.println("Interval spicling " + x + "..." + y);
        } else System.out.println("Intervals don't overlap");
    }

    void crossing(Interval inter) {
        System.out.println(this + "\t" + inter);
        int x = Math.max(start, inter.getStart());
        int y = Math.min(end, inter.getEnd());
        if (x < y) System.out.println("Intersection of intervals: " + x + "..." + y);
        else System.out.println("Intervals don't overlap");
    }
}

