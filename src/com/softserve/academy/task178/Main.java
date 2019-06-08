package com.softserve.academy.task178;

import com.softserve.academy.task178.task.Resault;
import com.softserve.academy.task178.task.Task;

public class Main {

    public static void main(String[] args) {
        Task task = new Task();
        try {
            Resault resault = task.handle(1,2,3,4,5,15,0);
            System.out.println(resault);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
