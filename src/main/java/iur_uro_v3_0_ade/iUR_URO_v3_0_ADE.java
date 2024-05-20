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

package iur_uro_v3_0_ade;

import iur_uro_v3_0_ade.module.iUR_URO_v3_0_ADEModule;
import iur_uro_v3_0_ade.walker.iUR_URO_v3_0_ADEWalker;
import org.citygml4j.core.visitor.ADEWalker;
import org.citygml4j.xml.ade.CityGMLADE;
import org.citygml4j.xml.module.ade.ADEModule;

import java.util.Collections;
import java.util.List;

public class iUR_URO_v3_0_ADE implements CityGMLADE {

    @Override
    public String getName() {
        return "iUR_URO_v3_0_ADE";
    }

    @Override
    public String getVersion() {
        return "3.0";
    }

    @Override
    public List<ADEModule> getADEModules() {
        return Collections.singletonList(new iUR_URO_v3_0_ADEModule());
    }

    @Override
    public ADEWalker getADEWalker() {
        return new iUR_URO_v3_0_ADEWalker();
    }
}
