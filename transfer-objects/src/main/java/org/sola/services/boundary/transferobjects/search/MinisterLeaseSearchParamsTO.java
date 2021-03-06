/**
 * ******************************************************************************************
 * Copyright (C) 2014 - Food and Agriculture Organization of the United Nations (FAO).
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:
 *
 *    1. Redistributions of source code must retain the above copyright notice,this list
 *       of conditions and the following disclaimer.
 *    2. Redistributions in binary form must reproduce the above copyright notice,this list
 *       of conditions and the following disclaimer in the documentation and/or other
 *       materials provided with the distribution.
 *    3. Neither the name of FAO nor the names of its contributors may be used to endorse or
 *       promote products derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT
 * SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,PROCUREMENT
 * OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,STRICT LIABILITY,OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 * *********************************************************************************************
 */
package org.sola.services.boundary.transferobjects.search;

import java.util.Date;
import org.sola.services.common.contracts.AbstractTO;

/**
 *
 * @author Admin
 */
public class MinisterLeaseSearchParamsTO extends AbstractTO{
    private Date dateReceivedFrom;
    private Date dateReceivedTo;
    private String name;
    private String location;
    private String receiptNumber;
    private Date payDateFrom;
    private Date payDateTo;
    
    public MinisterLeaseSearchParamsTO() {
        super();
    }

    public Date getDateReceivedFrom() {
        return dateReceivedFrom;
    }

    public void setDateReceivedFrom(Date dateReceivedFrom) {
        this.dateReceivedFrom = dateReceivedFrom;
    }

    public Date getDateReceivedTo() {
        return dateReceivedTo;
    }

    public void setDateReceivedTo(Date dateReceivedTo) {
        this.dateReceivedTo = dateReceivedTo;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getReceiptNumber() {
        return receiptNumber;
    }

    public void setReceiptNumber(String receiptNumber) {
        this.receiptNumber = receiptNumber;
    }

    public Date getPayDateFrom() {
        return payDateFrom;
    }

    public void setPayDateFrom(Date payDateFrom) {
        this.payDateFrom = payDateFrom;
    }

    public Date getPayDateTo() {
        return payDateTo;
    }

    public void setPayDateTo(Date payDateTo) {
        this.payDateTo = payDateTo;
    }

}
