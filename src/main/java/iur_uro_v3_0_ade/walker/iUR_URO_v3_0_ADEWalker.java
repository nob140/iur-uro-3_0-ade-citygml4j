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

package iur_uro_v3_0_ade.walker;

import iur_uro_v3_0_ade.model.*;
import org.citygml4j.core.model.building.Building;
/*
import org.citygml4j.core.model.building.BuildingPart;
import org.citygml4j.core.model.construction.OtherConstruction;
import org.citygml4j.core.model.construction.RoofSurface;
import org.citygml4j.core.model.core.AbstractOccupiedSpace;
import org.citygml4j.core.model.core.AddressProperty;
*/
import org.citygml4j.core.visitor.ADEWalker;
import org.citygml4j.core.model.building.ADEOfAbstractBuilding;
import org.citygml4j.core.model.ade.ADEProperty;
import org.xmlobjects.gml.model.base.AbstractGML;
import org.xmlobjects.gml.model.base.AbstractProperty;
import org.xmlobjects.gml.model.feature.FeatureProperty;
import java.util.ArrayList;

public class iUR_URO_v3_0_ADEWalker extends ADEWalker {

    public void visit(BuildingProperties buildingProperties) {
        visit((ADEOfAbstractBuilding) buildingProperties);

        if (buildingProperties.isSetBuildingIDAttribute()) {
/*
            for (BuildingIDAttributeProperty property : buildingProperties.getBuildingIDAttribute()) {
                walker.visit(property);
            }
*/
            walker.visit((AbstractProperty<?>) buildingProperties.getBuildingIDAttribute());
        }

        if (buildingProperties.isSetBuildingDetailAttribute()) {
            for (BuildingDetailAttributeProperty property : buildingProperties.getBuildingDetailAttribute()) {
                //walker.visit((FeatureProperty<?>) property);
                walker.visit((AbstractProperty<?>) property);
            }
        }

        /* LargeCustomerFacilityAttribute */

        /* BuildingDisasterRiskAttribute */
        /* BuildingFloodingRiskAttribute */
        /* BuildingRiverFloodingRiskAttribute */
        /* BuildingTsunamiRiskAttribute */
        /* BuildingHighTideRiskAttribute */
        /* BuildingInlandFloodingRiskAttribute */
        /* BuildingLandSlideRiskAttribute */

        if (buildingProperties.isSetKeyValuePairAttribute()) {
            for (KeyValuePairAttributeProperty property : buildingProperties.getKeyValuePairAttribute()) {
                walker.visit(property);
            }
        }

        /* BuildingDataQualityAttribute */

        /* RealEstateIDAttribute */
    }
}
