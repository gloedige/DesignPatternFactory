package de.iav;

public class ShapeFactory {

    public Shape createShape(String type){
        if(type.equalsIgnoreCase("Circle")){
            return new Circle();}
        else if(type.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
            }
        else if(type.equalsIgnoreCase("Square")){
            return new Square();
            }
        else{
            throw new IllegalArgumentException("Den Typen " + type + " gibt es nicht in Shape!");
            }
        }
    }

