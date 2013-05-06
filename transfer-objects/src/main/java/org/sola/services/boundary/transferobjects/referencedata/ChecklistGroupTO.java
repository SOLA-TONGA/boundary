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
public class ChecklistGroupTO extends AbstractCodeTO{
    
    private String agricultural;
    private String commercial;
    private String residential;
    private String government;
    
    public ChecklistGroupTO(){
        super();
    }
    
    public String getAgricultural(){
        return agricultural;
    }
    
    public void setAgricultural(String agricultural){
        this.agricultural = agricultural;
    }
    
    public String getCommercial(){
        return commercial;
    }
    
    public void setCommercial(String commercial){
        this.commercial = commercial;
    }
    
    public String getResidential(){
        return residential;
    }
    
    public void setResidential(String residential){
        this.residential = residential;
    }
    
    public String getGovernment(){
        return government;
    }
    
    public void setGovernment(String government){
        this.government = government;
    }
}
