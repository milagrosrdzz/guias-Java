package Principal;
import Servicios.ClaseServicios;
public class ClaseMain {

    public static void main(String[] args) {
   
        ClaseServicios nuevaRaza = new ClaseServicios(); // llamo a mi clase servicio
        nuevaRaza.cargaRazas();
        nuevaRaza.buscaRaza();
       
    }

   
  }



   
