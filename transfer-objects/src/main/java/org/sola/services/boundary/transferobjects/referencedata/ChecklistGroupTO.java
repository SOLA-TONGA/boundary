/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sola.services.boundary.transferobjects.referencedata;

import java.util.ArrayList;
import java.util.List;
import org.sola.services.common.contracts.AbstractCodeTO;

/**
 *
 * @author Admin
 */
public class ChecklistGroupTO extends AbstractCodeTO{
        private List<ChecklistGroupTO> checklistItemList;
    public ChecklistGroupTO(){
        super();
    }
    
    public List<ChecklistGroupTO> getChecklistGroupList() {
        checklistItemList = checklistItemList == null ? new ArrayList<ChecklistGroupTO>() : checklistItemList;
        return checklistItemList;
    }

    public void setSourceList(List<ChecklistGroupTO> checklistItemList) {
        this.checklistItemList = checklistItemList;
    }
}
