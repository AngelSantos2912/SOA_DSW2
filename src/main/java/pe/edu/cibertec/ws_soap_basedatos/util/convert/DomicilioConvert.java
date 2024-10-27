package pe.edu.cibertec.ws_soap_basedatos.util.convert;


import org.springframework.stereotype.Component;
import pe.edu.cibertec.ws.objects.Domiciliosoap;
import pe.edu.cibertec.ws_soap_basedatos.model.bd.Domicilio;

import java.util.ArrayList;
import java.util.List;

@Component
public class DomicilioConvert {

    public Domicilio converDomicilioBD(Domiciliosoap domiciliosoap) {

        Domicilio domicilio = new Domicilio();
        domicilio.setIddomicilio(domiciliosoap.getId());
        domicilio.setDescdomicilio(domiciliosoap.getDescripcion());
        return domicilio;

    }


    public Domiciliosoap converDomiciliosoap(Domicilio domicilio) {

        Domiciliosoap domiciliosoap = new Domiciliosoap();
        domiciliosoap.setId(domicilio.getIddomicilio());
        domiciliosoap.setDescripcion(domicilio.getDescdomicilio());
        return domiciliosoap;

    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public List<Domicilio> convertDomicilioBDList(List<Domiciliosoap> listDomiciliosoap) {
        List<Domicilio> domicilios = new ArrayList<Domicilio>();
        for(Domiciliosoap domicilio : listDomiciliosoap){
            domicilios.add(converDomicilioBD(domicilio));
        }
        return domicilios;
    }


    public List<Domiciliosoap> convertDomiciliosoapList(List<Domicilio> domicilios) {
        List<Domiciliosoap> domiciliosoap = new ArrayList<Domiciliosoap>();
        for(Domicilio domicilio : domicilios){
            domiciliosoap.add(converDomiciliosoap(domicilio));
        }
        return domiciliosoap;
    }


}
