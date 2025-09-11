package com.poo.prjnaviosecontainers.objetos;

import java.util.List;

/**
 *
 * @author Charles
 */
public class Navio_porta_container {
    private String tipoNavio;
    private int capacidadeCarga;
    private double largura;
    private double comprimento;
    private double velocidade;
    private double capacidadeContainer;
    private String combustivel;
    private List<Container> lstContainer;

    public List<Container> getLstContainer() {
        return lstContainer;
    }

    public void setLstContainer(List<Container> container) {
        this.lstContainer = container;
    }

    public String getTipoNavio() {
        return tipoNavio;
    }

    public void setTipoNavio(String tipoNavio) {
        this.tipoNavio = tipoNavio;
    }

    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(int capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getCapacidadeContainer() {
        return capacidadeContainer;
    }

    public void setCapacidadeContainer(double capacidadeContainer) {
        this.capacidadeContainer = capacidadeContainer;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
    
    
    
}
