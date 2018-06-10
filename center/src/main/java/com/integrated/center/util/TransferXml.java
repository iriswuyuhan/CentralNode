package com.integrated.center.util;

import org.dom4j.*;
import org.dom4j.io.DocumentResult;
import org.dom4j.io.DocumentSource;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamSource;

public class TransferXml {
    private static TransferXml transferXml;
    private static TransformerFactory transformerFactory;

    private TransferXml(){
        transformerFactory=TransformerFactory.newInstance();
    }

    public static TransferXml getInstance(){
        if(transferXml==null){
            transferXml=new TransferXml();
        }
        return transferXml;
    }

    public Document transfer(Document original,String xslt){
        try {
            Transformer transformer = transformerFactory.newTransformer(new StreamSource(xslt));
            DocumentSource source=new DocumentSource(original);
            DocumentResult result=new DocumentResult();
            transformer.transform(source,result);
            return result.getDocument();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
