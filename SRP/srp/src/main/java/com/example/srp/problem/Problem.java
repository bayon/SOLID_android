package com.example.srp.problem;

import com.example.srp.User;

/**
 * Created by BForte on 3/14/14.
 */
public class Problem {

    /*This problem class has 2 responsibilities
     changing emails
     and
     checking access
     If in the future you needed to separate these responsibilities,
     you'd be in a fix.
     */

    public void changeEmail( User user){
        boolean access ;
        if(this.checkAccess(user)){
            //grant permission
        }
    }

    public boolean  checkAccess (User user){
        boolean result = false;
         //verify if user is valid
        return result;
    }
}
