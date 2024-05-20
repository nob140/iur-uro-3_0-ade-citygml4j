/*
 * citygml4j - The Open Source Java API for CityGML
 * https://github.com/citygml4j
 *
 * Copyright 2013-2024 Claus Nagel <claus.nagel@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package iur_uro_v3_0_ade.model;

import org.citygml4j.core.model.ade.ADEObject;
import org.citygml4j.core.model.generics.CodeAttribute;

import org.xmlobjects.gml.model.base.AbstractGML;
import org.xmlobjects.gml.model.basictypes.Measure;
import org.xmlobjects.gml.model.basictypes.StringOrNilReason;
import org.xmlobjects.gml.model.basictypes.DoubleOrNilReason;
import org.xmlobjects.gml.model.measures.Length;
//import org.xmlobjects.gml.model.basictypes.Year;
import org.xmlobjects.model.ChildList;

import java.util.List;
import java.time.Year;

public class BuildingDetailAttribute extends AbstractGML implements ADEObject {
    private StringOrNilReason serialNumberOfBuildingCertification;
    private Measure siteArea;
    private Measure totalFloorArea;
    private Measure buildingFootprintArea;
    private Measure buildingRoofEdgeArea;
    private Measure developmentArea;
    private CodeAttribute buildingStructureType;
    private CodeAttribute buildingStructureOrgType;
    private CodeAttribute fireproofStructureType;
    private StringOrNilReason implementingBody;
    private CodeAttribute urbanPlanType;
    private CodeAttribute areaClassificationType;
    //private CodeAttribute districtsAndZonesType;
    private List<CodeAttribute> districtsAndZonesType;
    private CodeAttribute landUseType;
    private StringOrNilReason reference;
    private CodeAttribute majorUsage;
    private CodeAttribute majorUsage2;
    private CodeAttribute orgUsage;
    private CodeAttribute orgUsage2;
    private CodeAttribute detailedUsage;
    private CodeAttribute detailedUsage2;
    private CodeAttribute detailedUsage3;
    private CodeAttribute groundFloorUsage;
    private CodeAttribute secondFloorUsage;
    private CodeAttribute thirdFloorUsage;
    private CodeAttribute basementUsage;
    private CodeAttribute basementFirstUsage;
    private CodeAttribute basementSecondUsage;
    private CodeAttribute vacancy;
    private DoubleOrNilReason buildingCoverageRate;
    private DoubleOrNilReason floorAreaRate;
    private DoubleOrNilReason specifiedBuildingCoverageRate;
    private DoubleOrNilReason specifiedFloorAreaRate;
    private DoubleOrNilReason standardFloorAreaRate;
    private Length buildingHeight;
    private Length eaveHeight;
    private StringOrNilReason note;
    private Year surveyYear;

    //public String getSerialNumberOfBuildingCertification() { return serialNumberOfBuildingCertification; }
    //public void setSerialNumberOfBuildingCertification(String serialNumberOfBuildingCertification) { this.serialNumberOfBuildingCertification = serialNumberOfBuildingCertification; }
    public StringOrNilReason getSerialNumberOfBuildingCertification() { return serialNumberOfBuildingCertification; }
    public void setSerialNumberOfBuildingCertification(StringOrNilReason serialNumberOfBuildingCertification) { this.serialNumberOfBuildingCertification = serialNumberOfBuildingCertification; }

    public Measure getSiteArea() { return siteArea; }
    public void setSiteArea(Measure siteArea) { this.siteArea = asChild(siteArea); }

    public Measure getTotalFloorArea() { return totalFloorArea; }
    public void setTotalFloorArea(Measure totalFloorArea) { this.totalFloorArea = asChild(totalFloorArea); }

    public Measure getBuildingFootprintArea() { return buildingFootprintArea; }
    public void setBuildingFootprintArea(Measure buildingFootprintArea) { this.buildingFootprintArea = asChild(buildingFootprintArea); }

    public Measure getBuildingRoofEdgeArea() { return buildingRoofEdgeArea; }
    public void setBuildingRoofEdgeArea(Measure buildingRoofEdgeArea) { this.buildingRoofEdgeArea = asChild(buildingRoofEdgeArea); }

    public Measure getDevelopmentArea() { return developmentArea; }
    public void setDevelopmentArea(Measure developmentArea) { this.developmentArea = asChild(developmentArea); }

    public CodeAttribute getBuildingStructureType() { return buildingStructureType; }
    public void setBuildingStructureType(CodeAttribute buildingStructureType) { this.buildingStructureType = asChild(buildingStructureType); }

    public CodeAttribute getBuildingStructureOrgType() { return buildingStructureOrgType; }
    public void setBuildingStructureOrgType(CodeAttribute buildingStructureOrgType) { this.buildingStructureOrgType = asChild(buildingStructureOrgType); }

    public CodeAttribute getFireproofStructureType() { return fireproofStructureType; }
    public void setFireproofStructureType(CodeAttribute fireproofStructureType) { this.fireproofStructureType = asChild(fireproofStructureType); }

    public StringOrNilReason getImplementingBody() { return implementingBody; }
    public void setImplementingBody(StringOrNilReason implementingBody) { this.implementingBody = asChild(implementingBody); }

    public CodeAttribute getUrbanPlanType() { return urbanPlanType; }
    public void setUrbanPlanType(CodeAttribute urbanPlanType) { this.urbanPlanType = asChild(urbanPlanType); }

    public CodeAttribute getAreaClassificationType() { return areaClassificationType; }
    public void setAreaClassificationType(CodeAttribute areaClassificationType) { this.areaClassificationType = asChild(areaClassificationType); }

    ///public CodeAttribute getDistrictsAndZonesType() { return districtsAndZonesType; }
    //public void setDistrictsAndZonesType(CodeAttribute districtsAndZonesType) { this.districtsAndZonesType = asChild(districtsAndZonesType); }
    public List<CodeAttribute> getDistrictsAndZonesType() {
        if (districtsAndZonesType == null) {
            districtsAndZonesType = new ChildList<>(this);
        }
        return districtsAndZonesType;
    }
    public boolean isSetDistrictsAndZonesType() {
        return districtsAndZonesType != null && !districtsAndZonesType.isEmpty();
    }
    public void setDistrictsAndZonesType(List<CodeAttribute> districtsAndZonesType) { this.districtsAndZonesType = asChild(districtsAndZonesType); }

    public CodeAttribute getLandUseType() { return landUseType; }
    public void setLandUseType(CodeAttribute landUseType) { this.landUseType = asChild(landUseType); }

    public StringOrNilReason getReference() { return reference; }
    public void setReference(StringOrNilReason reference) { this.reference = asChild(reference); }

    public CodeAttribute getMajorUsage() { return majorUsage; }
    public void setMajorUsage(CodeAttribute majorUsage) { this.majorUsage = asChild(majorUsage); }

    public CodeAttribute getMajorUsage2() { return majorUsage2; }
    public void setMajorUsage2(CodeAttribute majorUsage2) { this.majorUsage2 = asChild(majorUsage2); }

    public CodeAttribute getOrgUsage() { return orgUsage; }
    public void setOrgUsage(CodeAttribute orgUsage) { this.orgUsage = asChild(orgUsage); }

    public CodeAttribute getOrgUsage2() { return orgUsage2; }
    public void setOrgUsage2(CodeAttribute orgUsage2) { this.orgUsage2 = asChild(orgUsage2); }

    public CodeAttribute getDetailedUsage() { return detailedUsage; }
    public void setDetailedUsage(CodeAttribute detailedUsage) { this.detailedUsage = asChild(detailedUsage); }

    public CodeAttribute getDetailedUsage2() { return detailedUsage2; }
    public void setDetailedUsage2(CodeAttribute detailedUsage2) { this.detailedUsage2 = asChild(detailedUsage2); }

    public CodeAttribute getDetailedUsage3() { return detailedUsage3; }
    public void setDetailedUsage3(CodeAttribute detailedUsage3) { this.detailedUsage3 = asChild(detailedUsage3); }

    public CodeAttribute getGroundFloorUsage() { return groundFloorUsage; }
    public void setGroundFloorUsage(CodeAttribute groundFloorUsage) { this.groundFloorUsage = asChild(groundFloorUsage); }

    public CodeAttribute getSecondFloorUsage() { return secondFloorUsage; }
    public void setSecondFloorUsage(CodeAttribute secondFloorUsage) { this.secondFloorUsage = asChild(secondFloorUsage); }

    public CodeAttribute getThirdFloorUsage() { return thirdFloorUsage; }
    public void setThirdFloorUsage(CodeAttribute thirdFloorUsage) { this.thirdFloorUsage = asChild(thirdFloorUsage); }

    public CodeAttribute getBasementUsage() { return basementUsage; }
    public void setBasementUsage(CodeAttribute basementUsage) { this.basementUsage = asChild(basementUsage); }

    public CodeAttribute getBasementFirstUsage() { return basementFirstUsage; }
    public void setBasementFirstUsage(CodeAttribute basementFirstUsage) { this.basementFirstUsage = asChild(basementFirstUsage); }

    public CodeAttribute getBasementSecondUsage() { return basementSecondUsage; }
    public void setBasementSecondUsage(CodeAttribute basementSecondUsage) { this.basementSecondUsage = asChild(basementSecondUsage); }

    public CodeAttribute getVacancy() { return vacancy; }
    public void setVacancy(CodeAttribute vacancy) { this.vacancy = asChild(vacancy); }

    public DoubleOrNilReason getBuildingCoverageRate() { return buildingCoverageRate; }
    public void setBuildingCoverageRate(DoubleOrNilReason buildingCoverageRate) { this.buildingCoverageRate = asChild(buildingCoverageRate); }

    public DoubleOrNilReason getFloorAreaRate() { return floorAreaRate; }
    public void setFloorAreaRate(DoubleOrNilReason floorAreaRate) { this.floorAreaRate = asChild(floorAreaRate); }

    public DoubleOrNilReason getSpecifiedBuildingCoverageRate() { return specifiedBuildingCoverageRate; }
    public void setSpecifiedBuildingCoverageRate(DoubleOrNilReason specifiedBuildingCoverageRate) { this.specifiedBuildingCoverageRate = asChild(specifiedBuildingCoverageRate); }

    public DoubleOrNilReason getSpecifiedFloorAreaRate() { return specifiedFloorAreaRate; }
    public void setSpecifiedFloorAreaRate(DoubleOrNilReason specifiedFloorAreaRate) { this.specifiedFloorAreaRate = asChild(specifiedFloorAreaRate); }

    public DoubleOrNilReason getStandardFloorAreaRate() { return standardFloorAreaRate; }
    public void setStandardFloorAreaRate(DoubleOrNilReason standardFloorAreaRate) { this.standardFloorAreaRate = asChild(standardFloorAreaRate); }

    public Length getBuildingHeight() { return buildingHeight; }
    public void setBuildingHeight(Length buildingHeight) { this.buildingHeight = asChild(buildingHeight); }

    public Length getEaveHeight() { return eaveHeight; }
    public void setEaveHeight(Length eaveHeight) { this.eaveHeight = asChild(eaveHeight); }

    public StringOrNilReason getNote() { return note; }
    public void setNote(StringOrNilReason note) { this.note = asChild(note); }

    public Year getSurveyYear() { return surveyYear; }
    public void setSurveyYear(Year surveyYear) { this.surveyYear = surveyYear; }
}
