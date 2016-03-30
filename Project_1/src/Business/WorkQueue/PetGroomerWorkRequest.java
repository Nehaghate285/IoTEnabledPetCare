/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Neha Ghate
 */
public class PetGroomerWorkRequest extends WorkRequest {

    private String testResult;
    private Date dateOfGroomRequest;
    private ArrayList<String> checklist;

    public ArrayList<String> getChecklist() {
        return checklist;
    }

    public void setChecklist(ArrayList<String> checklist) {
        this.checklist = checklist;
    }

    public Date getDateOfGroomRequest() {
        return dateOfGroomRequest;
    }

    public void setDateOfGroomRequest(Date dateOfGroomRequest) {
        this.dateOfGroomRequest = dateOfGroomRequest;
    }

    
    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
   
}
