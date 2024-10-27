package pe.edu.cibertec.ws_soap_basedatos.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.ws_soap_basedatos.model.bd.Domicilio;
import pe.edu.cibertec.ws_soap_basedatos.repository.DomicilioRepository;

import java.util.List;


@RequiredArgsConstructor
@Service
public class DomicilioService implements IDomicilioService{

    private final DomicilioRepository domicilioRepository;

    @Override
    public List<Domicilio> obtenerDomicilios() {
        return domicilioRepository.findAll();
    }

    @Override
    public Domicilio obtenerDomicilio(int id) {
        return domicilioRepository.findById(id).orElse(null);
    }

    @Override
    public Domicilio guardarDomicilio(Domicilio domicilio) {
        return domicilioRepository.save(domicilio);
    }
}
