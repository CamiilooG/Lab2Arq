/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniandes.csw.mueblesdelosalpes.logica.ejb;

import co.edu.uniandes.csw.mueblesdelosalpes.dto.Oferta;
import co.edu.uniandes.csw.mueblesdelosalpes.excepciones.OperacionInvalidaException;
import co.edu.uniandes.csw.mueblesdelosalpes.logica.interfaces.IServicioPersistenciaMockLocal;
import co.edu.uniandes.csw.mueblesdelosalpes.persistencia.mock.ServicioPersistenciaMock;
import java.util.List;

/**
 *
 * @author Camilo Gomez
 */
public class ServicioOfertaMock {

    private IServicioPersistenciaMockLocal persistencia;

    public ServicioOfertaMock() {
        persistencia = new ServicioPersistenciaMock();
    }

    public void agregarOferta(Oferta oferta) throws OperacionInvalidaException {
        persistencia.create(oferta);
    }

    public void modificarOferta(Oferta oferta) {
        persistencia.update(oferta);
    }

    public void eliminarOferta(Oferta oferta) throws OperacionInvalidaException {
        persistencia.delete(oferta);
    }

    public List<Oferta> obtenerListaOfertas() {
        return persistencia.findAll(Oferta.class);
    }
    public Oferta buscarOfertaId(long id){
        return (Oferta) persistencia.findById(Oferta.class, id);
    }

}
