/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.ArrayList;
import javax.ejb.Singleton;
import modelo.Mensaje;
import modelo.Oferta;
import modelo.Postulante;

/**
 *
 * @author jimenaosorio
 */
@Singleton
public class Servicio implements ServicioLocal {
    
    private ArrayList<Oferta> ofertas=new ArrayList();
    private ArrayList<Postulante> postulantes=new ArrayList();
    
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    public Servicio() {
        ofertas.add(new Oferta(1,"Desarrollador Java Web","Desarrollador de tiempo completo",true,null));
        ofertas.add(new Oferta(2,"Diseñador grafico","Experiencia en Materialize CSS",true,null));
        postulantes.add(new Postulante("111","admin","admin","admin@localhost","admin",null,null,null));
    }

    @Override
    public Oferta buscarOferta(int codigoOferta) {
        return null;
    }

    @Override
    public Postulante buscarPostulante(String rut) {
        return null;
    }

    @Override
    public boolean cerrarOferta(int codigo) {
        return false;
    }

    @Override
    public boolean crearOferta(Oferta oferta) {
        return false;
    }

    @Override
    public String enviarMensaje(String rut, Mensaje msg) {
        return null;
    }

    @Override
    public ArrayList<Oferta> getOfertas() {
        return null;
    }

    @Override
    public ArrayList<Postulante> getPostulantes() {
        return null;
    }

    @Override
    public boolean iniciarSesion(String rut, String pass) {
        return false;
    }

    @Override
    public String postular(String rut, int codigoOferta) {
        return null;
    }
    
    
    
}
