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

import org.xmlobjects.gml.model.base.AbstractGML;
import org.citygml4j.core.model.ade.ADEObject;
import org.citygml4j.core.model.generics.CodeAttribute;
import java.math.BigInteger;

public class BuildingIDAttribute extends AbstractGML implements ADEObject {
    private String buildingID;
    private BigInteger branchID;
    private BigInteger partID;
    private CodeAttribute prefecture;
    private CodeAttribute city;

    public String getBuildingID() {
        return buildingID;
    }
    public void setBuildingID(String buildingID) {
        this.buildingID = buildingID;
    }

    public BigInteger getBranchID() {
        return branchID;
    }
    public void setBranchID(BigInteger branchID) {
        this.branchID = branchID;
    }

    public BigInteger getPartID() {
        return partID;
    }
    public void setPartID(BigInteger partID) {
        this.partID = partID;
    }

    public CodeAttribute getPrefecture() {
        return prefecture;
    }
    public void setPrefecture(CodeAttribute prefecture) {
        this.prefecture = asChild(prefecture);
    }

    public CodeAttribute getCity() {
        return city;
    }
    public void setCity(CodeAttribute city) {
        this.city = asChild(city);
    }
}
