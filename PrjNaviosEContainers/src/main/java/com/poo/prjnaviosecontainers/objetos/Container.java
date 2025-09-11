package com.poo.prjnaviosecontainers.objetos;

/**
 *
 * @author iftm
 */
public class Container {
    private String proprietario;
    private String numIso;
    private String tipo;
    private String conteudo;
    private double peso;
    private String dataEntregaPorto;
    private String dataSaidaPorto;
    private Navio_porta_container navio;
    private String destino;
    private String origem;

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getNumIso() {
        return numIso;
    }

    public void setNumIso(String numIso) {
        this.numIso = numIso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDataEntregaPorto() {
        return dataEntregaPorto;
    }

    public void setDataEntregaPorto(String dataEntregaPorto) {
        this.dataEntregaPorto = dataEntregaPorto;
    }

    public String getDataSaidaPorto() {
        return dataSaidaPorto;
    }

    public void setDataSaidaPorto(String dataSaidaPorto) {
        this.dataSaidaPorto = dataSaidaPorto;
    }

    public Navio_porta_container getNavio() {
        return navio;
    }

    public void setNavio(Navio_porta_container navio) {
        this.navio = navio;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }
}
