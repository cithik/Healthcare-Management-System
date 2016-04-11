/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Medicine;

/**
 *
 * @author Krithika
 */
public class Medicine {
    String drugName;
    String drugDescription;
    Feedback feedback;

    public Feedback getFeedback() {
        return feedback;
    }

    public void setFeedback(Feedback feedback) {
        this.feedback = feedback;
    }
    public Medicine(String drugNameVal, String drugDescriptionVal){
        this.drugName = drugNameVal;
        this.drugDescription = drugDescriptionVal;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getDrugDescription() {
        return drugDescription;
    }

    public void setDrugDescription(String drugDescription) {
        this.drugDescription = drugDescription;
    }    
    
    public String toString(){
        return this.getDrugName();
    }
}
