package com.integrated.center.util;

import org.dom4j.Document;
import org.dom4j.io.DocumentResult;
import org.dom4j.io.DocumentSource;

import javax.xml.XMLConstants;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;

public class ValidateXml {
    private static ValidateXml validateXml;
    private static SchemaFactory validateFactory;

    private ValidateXml(){
        validateFactory=SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_INSTANCE_NS_URI);
    }

    public static ValidateXml getInstance(){
        if(validateXml==null){
            validateXml=new ValidateXml();
        }
        return validateXml;
    }

    public boolean validate(Document original, String xsd){
        try {
            Schema schema=validateFactory.newSchema(new File(xsd));
            Validator validator=schema.newValidator();
            DocumentSource source=new DocumentSource(original);
            validator.validate(source);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
