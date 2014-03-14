package com.example.srp.solution;

import com.example.srp.User;

/**
 * Created by BForte on 3/14/14.
 */
public class SolutionPart1 {
    /*
 By separating the responsibilites into different classes,
 you isolate them and make future flexibility and maintenance easier.

 */
    public void changeEmail(User user){
        SolutionPart2 sp2 = new SolutionPart2();
        if(sp2.checkAccess(user)){
            //grant permission
        }
    }
}
