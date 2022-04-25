/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniandes.csw.mueblesdelosalpes.dto;

/**
 *
 * @author Camilo Gomez
 */
public class Oferta {
    private Long idOferta;
    private String loginUsario;
    private long referencia;
    private Double oferta;

    public Oferta(long idOferta, String loginUsario, long referencia, double oferta) {
        this.idOferta = idOferta;
        this.loginUsario = loginUsario;
        this.referencia = referencia;
        this.oferta = oferta;
    }

    public long getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(long idOferta) {
        this.idOferta = idOferta;
    }

    public String getLoginUsario() {
        return loginUsario;
    }

    public void setLoginUsario(String loginUsario) {
        this.loginUsario = loginUsario;
    }

    public long getReferencia() {
        return referencia;
    }

    public void setReferencia(long referencia) {
        this.referencia = referencia;
    }

    public double getOferta() {
        return oferta;
    }

    public void setOferta(double oferta) {
        this.oferta = oferta;
    }

   
}
