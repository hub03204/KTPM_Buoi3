package org.example.adapterPattern;

public class XMLtoJSONAdapter implements JSONService {
    private XMLService xmlService;

    public XMLtoJSONAdapter(XMLService xmlService) {
        this.xmlService = xmlService;
    }

    @Override
    public void processJSON(String jsonData) {
        String xml = convertJSONtoXML(jsonData);
        xmlService.processXML(xml);
    }

    private String convertJSONtoXML(String json) {
        return "<xml>" + json + "</xml>";
    }
}
