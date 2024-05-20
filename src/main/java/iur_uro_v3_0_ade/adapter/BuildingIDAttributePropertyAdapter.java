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

import iur_uro_v3_0_ade.model.BuildingIDAttributeProperty;
import org.xmlobjects.builder.ObjectBuildException;
//import org.xmlobjects.gml.adapter.feature.AbstractFeaturePropertyAdapter;
import org.xmlobjects.gml.adapter.base.AbstractPropertyAdapter;

import javax.xml.namespace.QName;

//public class BuildingIDAttributePropertyAdapter extends AbstractFeaturePropertyAdapter<BuildingIDAttributeProperty> {
public class BuildingIDAttributePropertyAdapter extends AbstractPropertyAdapter<BuildingIDAttributeProperty> {

    @Override
    public BuildingIDAttributeProperty createObject(QName name, Object parent) throws ObjectBuildException {
        return new BuildingIDAttributeProperty();
    }
}
