package com.example.ocp.inteface;

import com.example.ocp.extentions.CarLoanValidator;
import com.example.ocp.extentions.PersonalLoanValidator;

/**
 * Created by BForte on 3/14/14.
 */
public class LoanApprovalHandler {

    private PersonalLoanValidator plv;
    private CarLoanValidator clv;

    public boolean getValidation(String loanType, String credentials){
        boolean result = false;
        if(loanType.equals("car")){
            clv = new CarLoanValidator();
            result = clv.isValid(credentials);
        }
        if(loanType.equals("personal")){
            plv = new PersonalLoanValidator();
            result = plv.isValid(credentials);
        }
        return result;
    }
}
