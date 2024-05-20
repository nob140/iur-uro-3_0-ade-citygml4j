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

import org.citygml4j.core.model.building.ADEOfAbstractBuilding;
import iur_uro_v3_0_ade.model.BuildingIDAttributeProperty;
import iur_uro_v3_0_ade.model.BuildingDetailAttributeProperty;
import iur_uro_v3_0_ade.model.KeyValuePairAttributeProperty;
import org.xmlobjects.model.ChildList;
import java.util.List;

public class BuildingProperties extends ADEOfAbstractBuilding {
    private BuildingIDAttributeProperty buildingIDAttribute;
    private List<BuildingDetailAttributeProperty> buildingDetailAttribute;
/*
    private List<LargeCustomerFacilityAttribute> largeCustomerFacilityAttribute;
    private List<BuildingDisasterRiskAttribute> buildingDisasterRiskAttribute;
*/
    private List<KeyValuePairAttributeProperty> keyValuePairAttribute;
/*
    private List<BuildingDataQualityAttribute> buildingDataQualityAttribute;
    private List<RealEstateIDAttribute> realEstateIDAttribute;
*/

    public BuildingIDAttributeProperty getBuildingIDAttribute() {
        return buildingIDAttribute;
    }
    public void setBuildingIDAttribute(BuildingIDAttributeProperty buildingIDAttribute) {
        this.buildingIDAttribute = asChild(buildingIDAttribute);
    }

    public List<BuildingDetailAttributeProperty> getBuildingDetailAttribute() {
        if (buildingDetailAttribute == null) {
            buildingDetailAttribute = new ChildList<>(this);
        }
        return buildingDetailAttribute;
    }
    public boolean isSetBuildingDetailAttribute() {
        return buildingDetailAttribute != null && !buildingDetailAttribute.isEmpty();
    }
    public void setBuildingDetailAttribute(List<BuildingDetailAttributeProperty> buildingDetailAttribute) {
        this.buildingDetailAttribute = asChild(buildingDetailAttribute);
    }

/*
 * get*()
 * isSet*()
 * set*()
 */

    public List<KeyValuePairAttributeProperty> getKeyValuePairAttribute() {
        if (keyValuePairAttribute == null) {
            keyValuePairAttribute = new ChildList<>(this);
        }
        return keyValuePairAttribute;
    }
    public boolean isSetKeyValuePairAttribute() {
        return keyValuePairAttribute != null && !keyValuePairAttribute.isEmpty();
    }
    public void setKeyValuePairAttribute(List<KeyValuePairAttributeProperty> keyValuePairAttribute) {
        this.keyValuePairAttribute = asChild(keyValuePairAttribute);
    }
}
