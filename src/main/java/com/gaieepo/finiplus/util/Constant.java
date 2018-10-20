package com.gaieepo.finiplus.util;

/**
 * Created by gaieepo on 30/5/2016.
 */
public class Constant {
    public static enum TaskType {
        FLOATING, EVENT, DEADLINE, EVENT_START
    }

    public static enum TimeScale {
        DAY, WEEK, MONTH, YEAR
    }

    public static enum Action {
        DUE, REMIND, COMPLETE, SHOW, GROUP, PUT
    }
}
