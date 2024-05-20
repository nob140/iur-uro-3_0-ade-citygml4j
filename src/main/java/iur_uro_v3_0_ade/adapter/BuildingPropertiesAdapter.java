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

package iur_uro_v3_0_ade.adapter;

import iur_uro_v3_0_ade.model.BuildingProperties;
import iur_uro_v3_0_ade.model.BuildingIDAttributeProperty;
import iur_uro_v3_0_ade.model.BuildingDetailAttributeProperty;
/*
import iur_uro_v3_0_ade.model.LargeCustomerFacilityAttributeProperty;
import iur_uro_v3_0_ade.model.BuildingDisasterRiskAttributeProperty;
import iur_uro_v3_0_ade.model.KeyValuePairAttribute;
import iur_uro_v3_0_ade.model.BuildingDataQualityAttributeProperty;
import iur_uro_v3_0_ade.model.RealEstateIDAttributeProperty;
*/
import iur_uro_v3_0_ade.module.iUR_URO_v3_0_ADEModule;
import iur_uro_v3_0_ade.adapter.*;

import org.xmlobjects.annotation.XMLElement;
import org.xmlobjects.builder.ObjectBuildException;
import org.xmlobjects.builder.ObjectBuilder;
//import org.xmlobjects.gml.adapter.measures.AreaAdapter;
import org.xmlobjects.serializer.ObjectSerializeException;
import org.xmlobjects.serializer.ObjectSerializer;
import org.xmlobjects.stream.XMLReadException;
import org.xmlobjects.stream.XMLReader;
import org.xmlobjects.stream.XMLWriteException;
import org.xmlobjects.stream.XMLWriter;
import org.xmlobjects.xml.Attributes;
import org.xmlobjects.xml.Element;
import org.xmlobjects.xml.Namespaces;

import java.util.List;

import javax.xml.namespace.QName;

@XMLElement(name = "BuildingProperties", namespaceURI = iUR_URO_v3_0_ADEModule.IUR_URO_v3_0_ADE_NAMESPACE)
public class BuildingPropertiesAdapter implements ObjectBuilder<BuildingProperties>, ObjectSerializer<BuildingProperties> {

    @Override
    public BuildingProperties createObject(QName name, Object parent) throws ObjectBuildException {
        return new BuildingProperties();
    }

    @Override
    public void buildChildObject(BuildingProperties object, QName name, Attributes attributes, XMLReader reader) throws ObjectBuildException, XMLReadException {
        if (iUR_URO_v3_0_ADEModule.IUR_URO_v3_0_ADE_NAMESPACE.equals(name.getNamespaceURI())) {
            switch (name.getLocalPart()) {
                case "buildingIDAttribute":
                    //reader.getTextContent().ifPresent(object::setOwnerName);
                    object.setBuildingIDAttribute(reader.getObjectUsingBuilder(BuildingIDAttributePropertyAdapter.class));
                    break;
                case "buildingDetailAttribute":
                    object.getBuildingDetailAttribute().add(reader.getObjectUsingBuilder(BuildingDetailAttributePropertyAdapter.class));
                    break;
/*
                case "largeCustomerFacilityAttribute":
                    object.getLargeCustomerFacilityAttribute().add(reader.getObjectUsingBuilder(LargeCustomerFacilityAttributePropertyAdapter.class));
                    break;
                case "buildingDisasterRiskAttribute":
                    object.getBuildingDisasterRiskAttribute().add(reader.getObjectUsingBuilder(BuildingDisasterRiskAttributePropertyAdapter.class));
                    break;
                case "keyValuePairAttribute":
                    object.getKeyValuePairAttribute().add(reader.getObjectUsingBuilder(KeyValuePairAttributeAdapter.class));
                    break;
                case "buildingDataQualityAttribute":
                    object.getBuildingDataQualityAttribute().add(reader.getObjectUsingBuilder(BuildingDataQualityAttributePropertyAdapter.class));
                    break;
                case "realEstateIDAttribute":
                    object.getRealEstateIDAttribute().add(reader.getObjectUsingBuilder(RealEstateIDAttributePropertyAdapter.class));
                    break;
*/
            }
        }
    }

    @Override
    public Element createElement(BuildingProperties object, Namespaces namespaces) throws ObjectSerializeException {
        return Element.of(iUR_URO_v3_0_ADEModule.IUR_URO_v3_0_ADE_NAMESPACE, "BuildingProperties");
    }
    
    @Override
    public void writeChildElements(BuildingProperties object, Namespaces namespaces, XMLWriter writer) throws ObjectSerializeException, XMLWriteException {
        if (object.getBuildingIDAttribute() != null) {
            writer.writeElementUsingSerializer(Element.of(iUR_URO_v3_0_ADEModule.IUR_URO_v3_0_ADE_NAMESPACE, "buildingIDAttribute"), object.getbuildingIDAttribute(), BuildingIDAttributeAdapter.class, namespaces);
        }

        if (object.isSetBuildingDetailAttribute()) {
            for (BuildingDetailAttributeProperty property : object.getBuildingDetailAttribute()) {
                writer.writeElementUsingSerializer(Element.of(iUR_URO_v3_0_ADEModule.IUR_URO_v3_0_ADE_NAMESPACE, "buildingDetailAttribute"), property, BuildingDetailAttributePropertyAdapter.class, namespaces);
            }
        }
/*
        if (object.isSetLargeCustomerFacilityAttribute()) {
            for (LargeCustomerFacilityAttributeProperty property : object.getLargeCustomerFacilityAttribute()) {
                writer.writeElementUsingSerializer(Element.of(iUR_URO_v3_0_ADEModule.IUR_URO_v3_0_ADE_NAMESPACE, "largeCustomerFacilityAttribute"), property, LargeCustomerFacilityAttributePropertyAdapter.class, namespaces);
            }
        }

        if (object.isSetBuildingDisasterRiskAttribute()) {
            for (BuildingDisasterRiskAttributeProperty property : object.getBuildingDisasterRiskAttribute()) {
                writer.writeElementUsingSerializer(Element.of(iUR_URO_v3_0_ADEModule.IUR_URO_v3_0_ADE_NAMESPACE, "buildingDisasterRiskAttribute"), property, BuildingDisasterRiskAttributePropertyAdapter.class, namespaces);
            }
        }

        if (object.isSetKeyValuePairAttribute()) {
            for (KeyValuePairAttributeProperty property : object.getKeyValuePairAttribute()) {
                writer.writeElementUsingSerializer(Element.of(iUR_URO_v3_0_ADEModule.IUR_URO_v3_0_ADE_NAMESPACE, "keyValuePairAttribute"), property, KeyValuePairAttributePropertyAdapter.class, namespaces);
            }
        }

        if (object.isSetBuildingDataQualityAttribute()) {
            for (BuildingDataQualityAttributeProperty property : object.getBuildingDataQualityAttribute()) {
                writer.writeElementUsingSerializer(Element.of(iUR_URO_v3_0_ADEModule.IUR_URO_v3_0_ADE_NAMESPACE, "buildingDataQualityAttribute"), property, BuildingDataQualityAttributePropertyAdapter.class, namespaces);
            }
        }

        if (object.isSetRealEstateIDAttribute()) {
            for (RealEstateIDAttributeProperty property : object.getRealEstateIDAttribute()) {
                writer.writeElementUsingSerializer(Element.of(iUR_URO_v3_0_ADEModule.IUR_URO_v3_0_ADE_NAMESPACE, "realEstateIDAttribute"), property, RealEstateIDAttributePropertyAdapter.class, namespaces);
            }
        }
 */
    }
}

