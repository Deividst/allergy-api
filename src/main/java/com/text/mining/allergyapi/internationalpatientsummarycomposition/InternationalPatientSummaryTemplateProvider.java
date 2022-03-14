package com.text.mining.allergyapi.internationalpatientsummarycomposition;

import org.apache.xmlbeans.XmlException;
import org.ehrbase.webtemplate.templateprovider.TemplateProvider;
import org.openehr.schemas.v1.OPERATIONALTEMPLATE;
import org.openehr.schemas.v1.TemplateDocument;

import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;

public class InternationalPatientSummaryTemplateProvider implements TemplateProvider {


    @Override
    public Optional<OPERATIONALTEMPLATE> find(String s) {
        InputStream stream = getClass().getResourceAsStream("/InternationalPatientSummary.opt");

        try {
            TemplateDocument templateDocument = TemplateDocument.Factory.parse(stream);
            return Optional.ofNullable(templateDocument.getTemplate());

        } catch (XmlException | IOException e) {
            e.printStackTrace();
            return Optional.ofNullable(null);
        }
    }
}
