package com.br.marcenaria.integrada.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Mdf {
    private double thickness;
    private int width;
    private int depth;
    private int acabamento;
    private double price_acabamento;


    public int getAcabamento() {
        return acabamento;
    }

    public void setAcabamento(int acabamento) {
        this.acabamento = acabamento;
    }

    public double getPrice_acabamento() {
        return price_acabamento;
    }

    public void setPrice_acabamento(double price_acabamento) {
        this.price_acabamento = price_acabamento;
    }

    public double getThickness() {
        return thickness;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }
}
