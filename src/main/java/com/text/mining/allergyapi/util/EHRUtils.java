package com.text.mining.allergyapi.util;

import com.nedap.archie.rm.RMObject;
import com.text.mining.allergyapi.internationalpatientsummarycomposition.InternationalPatientSummaryComposition;
import com.text.mining.allergyapi.internationalpatientsummarycomposition.InternationalPatientSummaryTemplateProvider;
import com.text.mining.allergyapi.internationalpatientsummarycomposition.definition.AllergyIntoleranceEvaluation;
import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.flattener.Unflattener;
import org.ehrbase.serialisation.flatencoding.FlatFormat;
import org.ehrbase.serialisation.flatencoding.FlatJasonProvider;
import org.ehrbase.serialisation.flatencoding.FlatJson;
import org.ehrbase.serialisation.jsonencoding.CanonicalJson;
import org.ehrbase.webtemplate.templateprovider.TemplateProvider;
import org.openehr.am.archetype.Archetype;
import se.acode.openehr.parser.ADLParser;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class EHRUtils {

    public static Map<String, Archetype> loadArchetype() throws Exception {
        Map<String, Archetype> archetypeMap = new HashMap<>();
        Path path = Paths.get("src/main/resources/openEHR-EHR-EVALUATION.adverse_reaction_risk.v1.adl");
        ADLParser adlParser = new ADLParser(path.toFile());
        Archetype archetype = adlParser.parse();
        archetypeMap.put(archetype.getArchetypeId().toString(), archetype);
        return archetypeMap;
    }

    public static String templateToCanonicalJson(InternationalPatientSummaryComposition composition){
        TemplateProvider templateProvider = new InternationalPatientSummaryTemplateProvider();
        Unflattener unflattener = new Unflattener(templateProvider);
        RMObject rmObject = unflattener.unflatten(composition);
        CanonicalJson json = new CanonicalJson();
        return json.marshal(rmObject);
    }

    public static String templateToFlatJson(InternationalPatientSummaryComposition composition){
        TemplateProvider templateProvider = new InternationalPatientSummaryTemplateProvider();
        Unflattener unflattener = new Unflattener(templateProvider);
        FlatJson flatJson = new FlatJasonProvider(templateProvider).buildFlatJson(FlatFormat.SIM_SDT, "summary");
        RMObject rmObject = unflattener.unflatten(composition);
        return flatJson.marshal(rmObject);
    }

}
