package pe.edu.cibertec.ws_soap_basedatos.service;
import pe.edu.cibertec.ws_soap_basedatos.model.bd.Domicilio;
import java.util.List;

public interface IDomicilioService {

    List<Domicilio> obtenerDomicilios();
    Domicilio obtenerDomicilio(int id);
    Domicilio guardarDomicilio(Domicilio domicilio);

}






























