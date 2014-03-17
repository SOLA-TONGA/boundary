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

import java.math.BigDecimal;
import java.util.Date;
import org.sola.services.common.contracts.AbstractTO;

/**
 *
 * Customized for Tonga.
 */
public class PropertyVerifierTO extends AbstractTO {

    private String lotBaUnitId;
    private String typeCode;
    private String deedNumber;
    private String folio;
    private Date registrationDate;
    private String holderName;
    private String parcelName;
    // Common fields
    private String districtId;
    private String estateId;
    private String townId;
    private BigDecimal area;
    private String landUseTypeCode;
    // Lease specific fields
    private String leaseBaUnitId;
    private String leaseNumber;
    private BigDecimal leaseTerm;
    private BigDecimal leaseRental;
    private String lesseeName;
    // Sublease specific fields
    private String subleaseBaUnitId;
    private String subleaseNumber;
    private String sublesseeName;
    private String applicationsWhereFound;

    public PropertyVerifierTO() {
        super();
    }

    public String getLotBaUnitId() {
        return lotBaUnitId;
    }

    public void setLotBaUnitId(String lotBaUnitId) {
        this.lotBaUnitId = lotBaUnitId;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public String getDeedNumber() {
        return deedNumber;
    }

    public void setDeedNumber(String deedNumber) {
        this.deedNumber = deedNumber;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getParcelName() {
        return parcelName;
    }

    public void setParcelName(String parcelName) {
        this.parcelName = parcelName;
    }

    public String getDistrictId() {
        return districtId;
    }

    public void setDistrictId(String districtId) {
        this.districtId = districtId;
    }

    public String getEstateId() {
        return estateId;
    }

    public void setEstateId(String estateId) {
        this.estateId = estateId;
    }

    public String getTownId() {
        return townId;
    }

    public void setTownId(String townId) {
        this.townId = townId;
    }

    public BigDecimal getArea() {
        return area;
    }

    public void setArea(BigDecimal area) {
        this.area = area;
    }

    public String getLandUseTypeCode() {
        return landUseTypeCode;
    }

    public void setLandUseTypeCode(String landUseTypeCode) {
        this.landUseTypeCode = landUseTypeCode;
    }

    public String getLeaseBaUnitId() {
        return leaseBaUnitId;
    }

    public void setLeaseBaUnitId(String leaseBaUnitId) {
        this.leaseBaUnitId = leaseBaUnitId;
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

    public BigDecimal getLeaseRental() {
        return leaseRental;
    }

    public void setLeaseRental(BigDecimal leaseRental) {
        this.leaseRental = leaseRental;
    }

    public String getLesseeName() {
        return lesseeName;
    }

    public void setLesseeName(String lesseeName) {
        this.lesseeName = lesseeName;
    }

    public String getSubleaseBaUnitId() {
        return subleaseBaUnitId;
    }

    public void setSubleaseBaUnitId(String subleaseBaUnitId) {
        this.subleaseBaUnitId = subleaseBaUnitId;
    }

    public String getSubleaseNumber() {
        return subleaseNumber;
    }

    public void setSubleaseNumber(String subleaseNumber) {
        this.subleaseNumber = subleaseNumber;
    }

    public String getSublesseeName() {
        return sublesseeName;
    }

    public void setSublesseeName(String sublesseeName) {
        this.sublesseeName = sublesseeName;
    }

    public String getApplicationsWhereFound() {
        return applicationsWhereFound;
    }

    public void setApplicationsWhereFound(String applicationsWhereFound) {
        this.applicationsWhereFound = applicationsWhereFound;
    }
}
