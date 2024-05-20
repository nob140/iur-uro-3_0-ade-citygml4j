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
//import org.xmlobjects.gml.model.feature.AbstractFeature;
import org.xmlobjects.gml.model.basictypes.Measure;
//import org.xmlobjects.gml.model.basictypes.Date;
import java.util.Date;
import java.math.BigInteger;
import java.net.URI;

public class KeyValuePairAttribute extends AbstractGML implements ADEObject {
//public class KeyValuePairAttribute extends AbstractFeature implements ADEObject {
    private CodeAttribute key;
    private CodeAttribute codeValue;
    private String stringValue;
    private BigInteger intValue;
    private Double doubleValue;
    private Measure measureValue;
    private Date dateValue;
    private URI uriValue;
    
    public CodeAttribute getKey() {
        return key;
    }
    public void setKey(CodeAttribute key) {
        this.key = key;
    }
    public boolean isSetKey() {
        return (this.key != null);
    }

    public CodeAttribute getCodeValue() {
        return codeValue;
    }
    public void setCodeValue(CodeAttribute codeValue) {
        this.codeValue = asChild(codeValue);
    }
    public boolean isSetCodeValue() {
        return (this.codeValue != null);
    }

    public String getStringValue() {
        return stringValue;
    }
    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }
    public boolean isSetStringValue() {
        return (this.stringValue != null);
    }

    public BigInteger getIntValue() {
            return intValue;
    }
    public void setIntValue(BigInteger intValue) {
        this.intValue = intValue;
    }
    public boolean isSetIntValue() {
        return (this.intValue != null);
    }

    public Double getDoubleValue() {
        return doubleValue;
    }
    public void setDoubleValue(Double doubleValue) {
        this.doubleValue = doubleValue;
    }
    public boolean isSetDoubleValue() {
        return (this.doubleValue != null);
    }

    public Measure getMeasureValue() {
        return measureValue;
    }
    public void setMeasureValue(Measure measureValue) {
        this.measureValue = measureValue;
    }
    public boolean isSetMeasureValue() {
        return (this.measureValue != null);
    }

    public Date getDateValue() {
        return dateValue;
    }
    public void setDateValue(Date dateValue) {
        this.dateValue = dateValue;
    }
    public boolean isSetDateValue() {
        return (this.dateValue != null);
    }

    public URI getUriValue() {
        return uriValue;
    }
    public void setUriValue(URI uriValue) {
        this.uriValue = uriValue;
    }
    public boolean isSetUriValue() {
        return (this.uriValue != null);
    }
}
