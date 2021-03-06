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
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sola.services.boundary.transferobjects.casemanagement;

import java.math.BigDecimal;
import java.util.Date;
import org.sola.services.common.contracts.AbstractIdTO;

/**
 *
 * @author soladev
 */
public class ApplicationPropertyTO extends AbstractIdTO {

    private String applicationId;
    private String nameFirstpart;
    private String nameLastpart;
    private String baUnitId;
    private BigDecimal area;
    private BigDecimal totalValue;
    private boolean verifiedExists;
    private boolean verifiedHasOwners;
    private boolean verifiedLocation;
    private String landUseCode;
    // SOLA Tonga extensions
    private String leaseNumber;
    private BigDecimal leaseTerm;
    private BigDecimal amount;
    private Date registrationDate;
    private String lessorName;
    private String islandId;
    private String nobleEstateId;
    private String description;
    private String townId;
    private String lesseeName;
    private String leaseBaUnitId;
    private String subleaseNumber;
    private String subleaseBaUnitId;
    private String sublesseeName;
    private String registeredName;
    private String typeCode;

    public ApplicationPropertyTO() {
        super();
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public BigDecimal getArea() {
        return area;
    }

    public void setArea(BigDecimal area) {
        this.area = area;
    }

    public String getBaUnitId() {
        return baUnitId;
    }

    public void setBaUnitId(String baUnitId) {
        this.baUnitId = baUnitId;
    }

    public String getNameFirstpart() {
        return nameFirstpart;
    }

    public void setNameFirstpart(String nameFirstpart) {
        this.nameFirstpart = nameFirstpart;
    }

    public String getNameLastpart() {
        return nameLastpart;
    }

    public void setNameLastpart(String nameLastpart) {
        this.nameLastpart = nameLastpart;
    }

    public BigDecimal getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(BigDecimal totalValue) {
        this.totalValue = totalValue;
    }

    public boolean isVerifiedExists() {
        return verifiedExists;
    }

    public void setVerifiedExists(boolean verifiedExists) {
        this.verifiedExists = verifiedExists;
    }

    public boolean isVerifiedHasOwners() {
        return verifiedHasOwners;
    }

    public void setVerifiedHasOwners(boolean verifiedHasOwners) {
        this.verifiedHasOwners = verifiedHasOwners;
    }

    public boolean isVerifiedLocation() {
        return verifiedLocation;
    }

    public void setVerifiedLocation(boolean verifiedLocation) {
        this.verifiedLocation = verifiedLocation;
    }

    public String getLeaseNumber() {
        return leaseNumber;
    }

    public void setLeaseNumber(String leaseNumber) {
        this.leaseNumber = leaseNumber;
    }

    public BigDecimal getLeaseTerm() {
        return leaseTerm;
    }

    public void setLeaseTerm(BigDecimal leaseTerm) {
        this.leaseTerm = leaseTerm;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getLessorName() {
        return lessorName;
    }

    public void setLessorName(String lessorName) {
        this.lessorName = lessorName;
    }

    public String getIslandId() {
        return islandId;
    }

    public void setIslandId(String islandId) {
        this.islandId = islandId;
    }

    public String getNobleEstateId() {
        return nobleEstateId;
    }

    public void setNobleEstateId(String nobleEstateId) {
        this.nobleEstateId = nobleEstateId;
    }

    public String getTownId() {
        return townId;
    }

    public void setTownId(String townId) {
        this.townId = townId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLandUseCode() {
        return landUseCode;
    }

    public void setLandUseCode(String landUseCode) {
        this.landUseCode = landUseCode;
    }

    public String getLesseeName() {
        return lesseeName;
    }

    public void setLesseeName(String lesseeName) {
        this.lesseeName = lesseeName;
    }

    public String getLeaseBaUnitId() {
        return leaseBaUnitId;
    }

    public void setLeaseBaUnitId(String leaseBaUnitId) {
        this.leaseBaUnitId = leaseBaUnitId;
    }

    public String getSubleaseNumber() {
        return subleaseNumber;
    }

    public void setSubleaseNumber(String subleaseNumber) {
        this.subleaseNumber = subleaseNumber;
    }

    public String getSubleaseBaUnitId() {
        return subleaseBaUnitId;
    }

    public void setSubleaseBaUnitId(String subleaseBaUnitId) {
        this.subleaseBaUnitId = subleaseBaUnitId;
    }

    public String getSublesseeName() {
        return sublesseeName;
    }

    public void setSublesseeName(String sublesseeName) {
        this.sublesseeName = sublesseeName;
    }

    public String getRegisteredName() {
        return registeredName;
    }

    public void setRegisteredName(String registeredName) {
        this.registeredName = registeredName;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }
}
