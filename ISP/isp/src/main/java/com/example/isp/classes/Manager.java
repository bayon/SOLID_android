package com.example.isp.classes;

/**
 * Created by BForte on 3/14/14.
 */
public class Manager {

    private Worker worker;
    private Robot robot;

    public Manager(Worker worker){
        this.worker = worker;
    }
    public Manager(Robot robot){
        this.robot = robot;
    }

    public void manageWorker(){
        worker.work();
        worker.feed();
    }

    public void manageRobot(){
        robot.work();

    }
}
