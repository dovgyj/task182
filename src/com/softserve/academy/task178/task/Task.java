package com.softserve.academy.task178.task;

import java.util.Arrays;

public class Task {

    public Resault handle(int ... numbers) throws IllegalArgumentException {
        for(int n:numbers){
            if(n <= 0) throw new IllegalArgumentException("Number `" + n + "` is not natural");
        }

        int[] rezArr = Arrays.stream(numbers).filter( (n) -> n % 5 == 0 && n % 7 != 9).toArray();

        int count = rezArr.length;

        int sum = Arrays.stream(rezArr).reduce(0,(rez,next) -> rez + next );

        return new Resault(count,sum);
    }

}
