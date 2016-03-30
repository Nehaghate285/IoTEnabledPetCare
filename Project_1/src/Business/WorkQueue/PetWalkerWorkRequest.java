/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.Date;

/**
 *
 * @author Neha Ghate
 */
public class PetWalkerWorkRequest extends WorkRequest {
 private String testResult;
 private Date dateOfWalkRequest ;
  private int numberOfHours ;

    public Date getDateOfWalkRequest() {
        return dateOfWalkRequest;
    }

    public void setDateOfWalkRequest(Date dateOfWalkRequest) {
        this.dateOfWalkRequest = dateOfWalkRequest;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }


    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
   
   
    
}
