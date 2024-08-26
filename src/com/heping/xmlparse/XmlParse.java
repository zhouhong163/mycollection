package com.heping.xmlparse;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.sql.SQLOutput;
import java.util.List;

/*利用dom4j解析xml文件*/
public class XmlParse {
    public static void main(String[] args) throws DocumentException {
        SAXReader saxReader =new SAXReader();
        Document document = saxReader.read(new File("mycollection\\xml\\student.xml"));
        Element rootElement = document.getRootElement();
        //System.out.println(rootElement);
        //List list = rootElement.elements();
        List<Element> studentElements = rootElement.elements("student");
        for (Element studentElement : studentElements) {
            Attribute id = studentElement.attribute("id");
           System.out.println(id.getValue());
            Element elementName = studentElement.element("name");
            System.out.println(elementName.getText());
        }


    }
}
