module org.citygml4j.iur_uro_v3_0_ade {
    requires transitive org.citygml4j.core;
    requires transitive org.citygml4j.xml;

    exports iur_uro_v3_0_ade;
    exports iur_uro_v3_0_ade.model;
    exports iur_uro_v3_0_ade.adapter to org.xmlobjects;
    exports iur_uro_v3_0_ade.walker to org.citygml4j.core;

    opens iur_uro_v3_0_ade.model to org.citygml4j.core, org.xmlobjects.gml, org.xmlobjects;
//    opens processing_citygml to org.citygml4j.core;
}