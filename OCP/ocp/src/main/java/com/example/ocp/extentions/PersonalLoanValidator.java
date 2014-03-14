package com.example.ocp.extentions;

import android.util.Log;

import com.example.ocp.absractProtocol.Validator;

/**
 * Created by BForte on 3/14/14.
 */
public class PersonalLoanValidator implements Validator {

    private Validator validatorWithProtocol;
    boolean result;

    @Override
    public boolean isValid(String credentials) {
        boolean results = false;
        Log.d("DEBUG", "Here is the CUSTOM validation...machinations for a PERSONAL LOAN for " + credentials);
        if(credentials.equals("personal-loan-specific-requirements")){
            results = true;
        }
        return results;
    }
}
