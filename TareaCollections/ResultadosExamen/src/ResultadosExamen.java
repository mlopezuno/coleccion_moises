import java.util.*;

public class ResultadosExamen {

    public static Map getCalificacionesOriginales(){
        Map calificaciones = new HashMap();
        calificaciones.put("Ana", 24);
        calificaciones.put("Daniel", 50);
        calificaciones.put("Alejandro", 79);
        calificaciones.put("Laura", 32);
        calificaciones.put("Kelly", 80);
        calificaciones.put("Ivan", 40);
        calificaciones.put("Maria", 59);
        calificaciones.put("Melanie", 55);
        calificaciones.put("Diego", 95);
        calificaciones.put("Miguel", 63);
        return calificaciones;

    }

    public static Map getCalificacionesRegularizacion(){

        Map calificaciones = new HashMap();
        calificaciones.put("Ana", 97);
        calificaciones.put("Daniel", 89);
        calificaciones.put("Alejandro", 79);
        calificaciones.put("Laura", 82);
        calificaciones.put("Kelly", 76);
        calificaciones.put("Ivan", 98);
        calificaciones.put("Maria", 80);
        calificaciones.put("Melanie", 95);
        calificaciones.put("Diego", 90);
        calificaciones.put("Miguel", 62);
        return calificaciones;
    }

    public static void main(String[] args) {
        Map <String, Integer> calificacionoriginal = getCalificacionesOriginales();//guardo los map de la clase en un nuevo map
        Map <String, Integer> calificacionregularizada = getCalificacionesRegularizacion();

        calificacionoriginal.forEach((k, v) -> { //uso lambda, por cada uno de los valores me cumplira lo de abajo...
            Integer calificacionfinal = calificacionregularizada.get(k); //declaro la calificacionregularizada en un nuevo valor de tipo integer, ya que el ineteger es la califiacion por la posicion y la estructura del map
            if(calificacionfinal>v){
                calificacionoriginal.put(k, calificacionfinal);
            }
            System.out.println(k + ": " + calificacionoriginal.get(k));
                });
    }
}