package pe.edu.cibertec.ws_soap_basedatos.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.ws.objects.GetPaisRequest;
import pe.edu.cibertec.ws.objects.GetPaisResponse;
import pe.edu.cibertec.ws.objects.Pais;
import pe.edu.cibertec.ws_soap_basedatos.repository.PaisRepository;

@Endpoint
public class PaisEndpoint {

    private static final String NAMESPACE_URI = "http://www.cibertec.edu.pe/ws/objects";

    private PaisRepository paisRepository;

    @Autowired
    public PaisEndpoint(PaisRepository paisRepository){
        this.paisRepository = paisRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI,
    localPart = "getPaisRequest")
    @ResponsePayload
    public GetPaisResponse obtenerPaisxNombre(
            @RequestPayload GetPaisRequest request){
        GetPaisResponse response = new GetPaisResponse();
        response.setPais(
                paisRepository.buscarPaisxnombre(request.getNombre()));
        return response;
    }
}
