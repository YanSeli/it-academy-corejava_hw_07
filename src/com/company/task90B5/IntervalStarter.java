package com.company.task90B5;

public class IntervalStarter {
    public static void main(String[] args) {
        Interval[] intervals = new Interval[3];

        intervals[0] = new Interval(7, 4, true);
        intervals[1] = new Interval(1, 9, false);
        intervals[2] = new Interval(37, 62, true);

        for (int i = 0; i < intervals.length - 1; i++) {
            intervals[i].combine(intervals[i + 1]);
            intervals[i].crossing(intervals[i + 1]);
        }
    }
}
