/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sola.services.boundary.transferobjects.referencedata;

import org.sola.services.common.contracts.AbstractCodeTO;

/**
 *
 * @author Admin
 */
public class ChecklistItemTO extends AbstractCodeTO{
    private String contact;
    private String id;
    private String powerOfAttorney;
    private String visa;
    private String businessRegistration;
    private String businessLicense;
    private String foreignInvestment;
    private String businessPlan;
    private String fund;
    private String existingLease;
    private String permit;
    private String environmentImpact;
    private String termAndCondition;
    private boolean isSubmitted;
    
    public ChecklistItemTO(){
        super();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPowerOfAttorney() {
        return powerOfAttorney;
    }

    public void setPowerOfAttorney(String powerOfAttorney) {
        this.powerOfAttorney = powerOfAttorney;
    }
    
    public String getVisa(){
        return visa;
    }
    
    public void setVisa(String visa){
        this.visa = visa;
    }
    
    public String getBusinessRegistration(){
        return businessRegistration;
    }
    
    public void setBusinessRegistration(String businessRegistration){
        this.businessRegistration = businessRegistration;
    }
    
    public String getBusinessLicense(){
        return businessLicense;
    }
    
    public void setBusinessLicense(String businessLicense){
        this.businessLicense = businessLicense;
    }
    
    public String getForeignInvestment(){
        return foreignInvestment;
    }
    
    public void setForeignInvestment(String foreignInvestment){
        this.foreignInvestment = foreignInvestment;
    }
    
    public String getBusinessPlan(){
        return businessPlan;
    }
    
    public void setBusinessPlan(String businessPlan){
        this.businessPlan = businessPlan;
    }
    
    public String getFund(){
        return fund;
    }
    
    public void setFund(String fund){
        this.fund = fund;
    }
    
    public String getExistingLease(){
        return existingLease;
    }
    
    public void setExistingLease(String existingLease){
        this.existingLease = existingLease;
    }
    
    public String getPermit(){
        return permit;
    }
    
    public void setPermit(String permit){
        this.permit = permit;
    }
    
    public String getTermAndCondition(){
        return termAndCondition;
    }
    
    public void setTermAndCondition(String termAndCondition){
        this.termAndCondition = termAndCondition;
    }
    
    public String getEnvironmentImpact(){
        return environmentImpact;
    }
    
    public void setEnvironmentImpact(String environmentImpact){
        this.environmentImpact = environmentImpact;
    }
    
    public boolean isSubmitted(){
        return isSubmitted;
    }
    
    public void setSubmitted(boolean submitted){
        this.isSubmitted = submitted;
    }
}
