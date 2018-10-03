
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harsha
 */
public class employee {
    
    public void parse() throws ParserConfigurationException, IOException, SAXException{
     
        String filePath = "C:\\Users\\harsha\\Documents\\NetBeansProjects\\ncp\\src\\java\\work_details.xml";
        File xmlFile = new File(filePath);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        
        
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();
            
            NodeList nodeList = doc.getElementsByTagName("employee");
            
            /*for (int i = 0 ; i < nodeList.getLength(); i++){
                Node n = nodeList.item(i);
                 Element element = (Element) n;
                 Node temp = element.getElementsByTagName("employeeid").item(0);
                 System.out.println(temp.getNodeValue());
                 System.out.println("ggwp");
                
               }*/
            }
            
    
    
    }

