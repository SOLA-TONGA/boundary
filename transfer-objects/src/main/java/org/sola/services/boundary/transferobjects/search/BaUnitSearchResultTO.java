/**
 * ******************************************************************************************
 * Copyright (C) 2013 - Food and Agriculture Organization of the United Nations (FAO).
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

public class BaUnitSearchResultTO extends AbstractTO {

    private String id;
    private String name;
    private String nameFirstPart;
    private String nameLastPart;
    private String statusCode;
    private String rightholders;
    private String islandName;
    private String townName;
    private Date registeredDate;
    private String otherRightholders;
    private String parcelName;
    private String registryBookRef;
    private String baUnitTypeCode;
    private String rrrTypeCode;
    private String rrrReference;

    public BaUnitSearchResultTO() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameFirstPart() {
        return nameFirstPart;
    }

    public void setNameFirstPart(String nameFirstPart) {
        this.nameFirstPart = nameFirstPart;
    }

    public String getNameLastPart() {
        return nameLastPart;
    }

    public void setNameLastPart(String nameLastPart) {
        this.nameLastPart = nameLastPart;
    }

    public String getRightholders() {
        return rightholders;
    }

    public void setRightholders(String rightholders) {
        this.rightholders = rightholders;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getIslandName() {
        return islandName;
    }

    public void setIslandName(String islandName) {
        this.islandName = islandName;
    }

    public String getTownName() {
        return townName;
    }

    public void setTownName(String townName) {
        this.townName = townName;
    }

    public Date getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(Date registeredDate) {
        this.registeredDate = registeredDate;
    }

    public String getOtherRightholders() {
        return otherRightholders;
    }

    public void setOtherRightholders(String otherRightholders) {
        this.otherRightholders = otherRightholders;
    }

    public String getParcelName() {
        return parcelName;
    }

    public void setParcelName(String parcelName) {
        this.parcelName = parcelName;
    }

    public String getRegistryBookRef() {
        return registryBookRef;
    }

    public void setRegistryBookRef(String registryBookRef) {
        this.registryBookRef = registryBookRef;
    }

    public String getBaUnitTypeCode() {
        return baUnitTypeCode;
    }

    public void setBaUnitTypeCode(String baUnitTypeCode) {
        this.baUnitTypeCode = baUnitTypeCode;
    } 

    public String getRrrTypeCode() {
        return rrrTypeCode;
    }

    public void setRrrTypeCode(String rrrTypeCode) {
        this.rrrTypeCode = rrrTypeCode;
    }
    
    public String getRrrReference() {
        return rrrReference;
    }
    
    public void setRrrReference(String rrrReference) {
        this.rrrReference = rrrReference;
    }
}
