package com.br.marcenaria.integrada.model;

public class MdfMinMax {
    private int widthMin=50;
    private int widthMax=2750;
    private int depthMin=50;
    private int depthMax=1830;

    public boolean testWidth(Mdf mdf){
        int width = mdf.getWidth();
        if(width > widthMin && width < widthMax){
            return true;
        }
        return false;
    }
    public boolean testeDepth(Mdf mdf){
        int depth = mdf.getDepth();
        if(depth > depthMin && depth < depthMax){
            return true;
        }
        return false;
    }
}
