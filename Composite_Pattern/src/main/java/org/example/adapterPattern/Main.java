package org.example.adapterPattern;

public class Main {
    public static void main(String[] args) {
        JSONService service = new XMLtoJSONAdapter(new XMLService());
        service.processJSON("{amount:100}");
    }
}
