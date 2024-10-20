package pe.edu.cibertec.ws_soap_basedatos.repository;

import org.springframework.stereotype.Repository;
import pe.edu.cibertec.ws.objects.Moneda;
import pe.edu.cibertec.ws.objects.Pais;

import java.util.HashMap;
import java.util.Map;

@Repository
public class PaisRepository {

    private static final Map<String, Pais> paises = new HashMap<>();

    public void cargarPaises(){
        Pais objpais = new Pais();
        objpais.setNombre("Argentina");
        objpais.setCapital("Buenos Aires");
        objpais.setMoneda(Moneda.PESO);
        objpais.setPoblacion("36000000");
        paises.put(objpais.getNombre(), objpais);

        objpais = new Pais();
        objpais.setNombre("Peru");
        objpais.setCapital("Lima");
        objpais.setMoneda(Moneda.SOL);
        objpais.setPoblacion("33000000");
        paises.put(objpais.getNombre(), objpais);

        objpais = new Pais();
        objpais.setNombre("Brasil");
        objpais.setCapital("Rio de janeiro");
        objpais.setMoneda(Moneda.PESO);
        objpais.setPoblacion("46000000");
        paises.put(objpais.getNombre(), objpais);

        objpais = new Pais();
        objpais.setNombre("EE.UU");
        objpais.setCapital("New York");
        objpais.setMoneda(Moneda.DOLAR);
        objpais.setPoblacion("126000000");
        paises.put(objpais.getNombre(), objpais);
    }

    public Pais buscarPaisxnombre(String nombre){
        return paises.get(nombre);
    }

}
