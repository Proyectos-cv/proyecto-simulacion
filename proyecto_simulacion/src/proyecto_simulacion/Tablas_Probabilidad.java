
package proyecto_simulacion;

/**
 *
 * @author Retzat
 */
public class Tablas_Probabilidad {
    public static int obras_al_iniciar(double a)
    {
        int semanas=0;
        //System.out.println(aleatorio);
     
        if (a>0 && a<=0.55)
        {
            semanas=0;
            
        }
        else if (a>0.55 && a<=0.85)
        {
            semanas=1;
            
        }
        else if (a>0.85 && a<=0.95)
        {
            semanas=2;
           
        }
        else if (a>0.95 && a<=1)
        {
            semanas=3;
            
        }
    return semanas;
    }
    //temporada alta
    public static int tiempo_de_espera_alta(double a)
    {
        int semanas=0;
        if (a > 0 && a <= 0.05)
        {
            semanas = 1;
                    }
        else if (a > 0.05 && a <= 0.2)
        {
            semanas = 2;
        }
        else if (a > 0.2 && a <= 0.65)
                {
            semanas = 3;
                    }
        else if (a > 0.65 && a <= 0.83)
                {
            semanas = 4;
                    }
        else if (a > 0.83 && a <= 0.93)
                {
            semanas = 5;
                    }
        else if (a > 0.93 && a <= 1)
                {
            semanas = 6;
                    }
       return semanas;
    }
    
    //temporada baja
    public static int tiempo_de_espera_baja(double a)
            {
                int semanas=0;
        
        if (a > 0 && a <= 0.2)
        {
            semanas = 4;
                    }
        else if (a > 0.2 && a <= 0.5)
        {
            semanas = 5;
        }
        else if (a > 0.5 && a <= 0.85)
        {
            semanas = 6;
        }
        else if (a > 0.85 && a <= 1)
        {
            semanas = 7;
        }
        return semanas;
                    }
    
    //magnitud de la obra
    public static int magnitud_de_obra(double a)
    {
        int m2=0;
        if (a > 0 && a <= 0.35)
        {
            m2 = 100;
        }
        else if (a > 0.35 && a <= 0.6)
        {
            m2 = 200;
        }
        else if (a > 0.6 && a <= 0.7)
        {
            m2 = 300;
        }
        else if (a > 0.7 && a <= 0.9)
        {
            m2 = 400;
        }
        else if (a > 0.9 && a <= 1)
        {
            m2 = 500;
        }
        return m2;
                    }
    
    //si m2=100
    public static int duracion_100(double a){
        int semanas=0;
        if (a > 0 && a <= 0.1)
        {
            semanas = 10;
        }
        else if (a > 0.1 && a <= 0.75)
        {
            semanas = 12;
        }
        else if (a > 0.75 && a <= 0.95)
        {
            semanas = 16;
        }
        else if (a > 0.95 && a <= 1)
        {
            semanas = 20;
        }
            return semanas;
                    }
    
    
       public static int personal_necesario_100(double a){
        int cuadrillas=0;
        if (a > 0 && a <= 0.8)
        {
            cuadrillas = 1;
        }
        else if (a > 0.8 && a <= 0.95)
        {
            cuadrillas = 2;
        }
        else if (a > 0.95 && a <= 0.99)
        {
            cuadrillas = 3;
        }
        else if (a > 0.99 && a <= 1)
        {
            cuadrillas = 4;
        }
            return cuadrillas;
                    }
       
       //Si M2=200m    
public static int duracion_200(double a)
{
    int semanas=0;
    //System.out.println(a);

    if (a>0 && a<=0.15)
    {
    semanas=18;

    }
    else if (a>0.15 && a<=0.6)
    {
    semanas=20;

    }
    else if (a>0.6 && a<=0.9)
    {
    semanas=24;

    }
    else if (a>0.9 && a<=1)
    {
    semanas=28;

    }
    return semanas;
}    
public static int personal_necesario_200(double a)
{
    int cuadrillas=0;
    //System.out.println(a);

    if (a>0 && a<=0.8)
    {
    cuadrillas=1;

    }
    else if (a>0.8 && a<=0.95)
    {
    cuadrillas=2;

    }
    else if (a>0.95 && a<=0.99)
    {
    cuadrillas=3;

    }
    else if (a>0.99 && a<=1)
    {
    cuadrillas=4;

    }
    return cuadrillas;
}
//Si M2=300m    
public static int duracion_300(double a)
{
    int semanas=0;
    //System.out.println(a);

    if (a>0 && a<=0.1)
    {
    semanas=24;

    }
    else if (a>0.1 && a<=0.75)
    {
    semanas=26;

    }
    else if (a>0.75 && a<=0.91)
    {
    semanas=36;

    }
    else if (a>0.91 && a<=1)
    {
    semanas=36;

    }
    return semanas;
} 
public static int personal_necesario_300(double a)
{
    int cuadrillas=0;
    //System.out.println(a);

    if (a>0 && a<=0.7)
    {
    cuadrillas=1;

    }
    else if (a>0.7 && a<=0.95)
    {
    cuadrillas=2;

    }
    else if (a>0.95 && a<=0.99)
    {
    cuadrillas=3;

    }
    else if (a>0.99 && a<=1)
    {
    cuadrillas=4;

    }
    return cuadrillas;
}
//Si M2=400m    
public static int duracion_400(double a)
{
    int semanas=0;
    //System.out.println(a);

    if (a>0 && a<=0.1)
    {
    semanas=20;

    }
    else if (a>0.1 && a<=0.75)
    {
    semanas=28;

    }
    else if (a>0.75 && a<=0.91)
    {
    semanas=36;

    }
    else if (a>0.91 && a<=1)
    {
    semanas=44;

    }
    return semanas;
}
public static int personal_necesario_400(double a)
{
    int cuadrillas=0;
    //System.out.println(a);

    if (a>0 && a<=0.55)
    {
    cuadrillas=1;

    }
    else if (a>0.55 && a<=0.9)
    {
    cuadrillas=2;

    }
    else if (a>0.9 && a<=0.94)
    {
    cuadrillas=3;

    }
    else if (a>0.94 && a<=1)
    {
    cuadrillas=4;

    }
    return cuadrillas;
}
//Si M2=500m    
public static int duracion_500(double a)
{
    int semanas=0;
    //System.out.println(a);

    if (a>0 && a<=0.1)
    {
    semanas=28;

    }
    else if (a>0.1 && a<=0.75)
    {
    semanas=36;

    }
    else if (a>0.75 && a<=0.91)
    {
    semanas=44;

    }
    else if (a>0.91 && a<=1)
    {
    semanas=52;

    }
    return semanas;
}
public static int personal_necesario_500(double a )
{
    int cuadrillas=0;
    //System.out.println(a);

    if (a>0 && a<=0.6)
    {
    cuadrillas=3;

    }
    else if (a>0.6 && a<=0.85)
    {
    cuadrillas=4;

    }
    else if (a>0.85 && a<=0.99)
    {
    cuadrillas=5;

    }
    else if (a>0.99 && a<=1)
    {
    cuadrillas=6;

    }
    return cuadrillas;
}
public static String tipo_de_acabado(double a){
    String tipo_acabado="";
    
    if(a>0 && a<=0.25){
        tipo_acabado="Interes_social";
        //System.out.println("Es un acabado de interes social");
    }
    else if (a>0.25 && a<=0.95){
        tipo_acabado="Popular";
         //System.out.println("Es un acabado Popular");
    }
    else if (a>0.95 && a<=1){
       tipo_acabado="Residencial";
        //System.out.println("Es un acabado Recidencial");
       
    }
    return tipo_acabado;
}
public static double volumen(double a){
    double factori = 0;
    
    if (a>0 && a<=0.1){
        factori=0.65;
    }
    else if (a>0.1 && a<=0.35){
        factori=0.8;
    }
    else if (a>0.35 && a<=0.7){
        factori=1;
    }
    else if (a>0.7 && a<=0.9){
        factori=1.2;
    }
    else if (a>0.9 && a<=1){
        factori=1.5;
    }
      return factori;
}       
       
       //cada mes
    public static int licitacion_obra(double a)
    {
        int semanas=0;
        if (a > 0 && a <= 0.15)
        {
            semanas = 1; //#si
        }
        else if (a > 0.15 && a <= 1)
                {
            semanas = 0; // #no
                }
            return semanas;
                    }
    
     public static int magnitud_obra_gobierno(double a)
     {
         int trabajo=0;
        if (a > 0 && a <= 0.15)
        {
            trabajo = 1 ; //# carretera
                    }
        else if (a > 0.15 && a <= 0.25)
                {
            trabajo = 1;  //# edificio
                }
        else if (a > 0.25 && a <= 0.75)
                {
            trabajo = 1;  //# servicio
                }
        else if (a > 0.75 && a <= 1)
                {
            trabajo = 1;  //# proyecto
                }
            return trabajo;
                    }
    
    
        public static int personal_necesario(double a)
        {
        int cuadrillas=0;
        if (a > 0 && a <= 0.2)
            cuadrillas = 5;
        else if (a > 0.2 && a <= 0.55)
                {
            cuadrillas = 6;
                }
        else if (a > 0.55 && a <= 0.95)
                {
            cuadrillas = 7;
                }
        else if (a > 0.95 && a <= 1)
                {
            cuadrillas = 8;
                }
            return cuadrillas;
                    }
    
    public static int precio_licitacion(double a)
    {
        int precio=0;
        if (a > 0 && a <= 0.1)
        {
            precio = 15000;
        }
        else if (a > 0.1 && a <= 0.75)
                {
            precio = 24000;
                }
        else if (a > 0.75 && a <= 0.91)
                {
            precio = 30000;
                }
        else if (a > 0.91 && a <= 1)
                {
            precio = 40000;
                }
            return precio;
                    }
    
    //clase trabajos 
     public static int tiempo_espera_ts(double a)
     {
        int dias=0;
        if (a > 0 && a <= 0.2)
        {
            dias = 7;
        }
        else if (a > 0.2 && a <= 0.9)
        {
            dias = 15;
        }
        else if (a > 0.9 && a <= 1)
        {
            dias = 20;
        }
            return dias;
                    }
     
        public static String actividad_ts(double a)
        {
        String actividad="";
        if (a > 0 && a <= 0.25)
        {
            actividad = "No"; //#nada
        }
        else if (a > 0.25 && a <= 0.5)
        {
            actividad = "capacitacion";  //# capacitacion
        }
        else if (a > 0.5 && a <= 0.75)
        {
            actividad = "remodelacion";  //# remodelacion
        }
        else if (a > 0.75 && a <= 1)
        {
            actividad = "presupuesto" ;// # presupuesto
        }
            return actividad;
                    }
    
        public static int remodelacion(double a)
        {
        int duracion=0;
        if (a > 0 && a <= 0.45)
        {
            duracion = 3;  //# dias
                    }
        else if (a > 0.45 && a <= 0.95)
        {
            duracion = 7;  //# dias
                    }
        else if (a > 0.95 && a <= 1)
        {
            duracion = 14;  //# dias
                    }
            return duracion;
                    }
    
     public static int actividades_capacitacion(double a)
     {
        int semana=0;
        if (a > 0 && a <= 0.2)
        {
            semana = 1;
        }
        else if (a > 0.2 && a <= 0.3)
        {
            semana = 3;
        }
        else if (a > 0.3 && a <= 1)
        {
            semana = 4;
        }
            return semana;
                    }
     
    public static int trabajos_simples(double a)
    {
        int dias=0;
        if (a > 0 && a <= 0.3)
        {
            dias = 3;
        }
        else if (a > 0.3 && a <= 0.5)
        {
            dias = 5;
        }
        else if (a > 0.5 && a <= 1)
        {
            dias = 7;
        }
            return dias;
                    }
    
        public static int presupuesto_dias(double a)
        {
        int dias=0;
        if (a > 0 && a <= 0.3)
        {
            dias = 2;
        }
        else if (a > 0.3 && a <= 0.5)
                {
            dias = 4;
                }
        else if (a > 0.5 && a <= 1)
                {
            dias = 6;
                }
        return dias;
                    }
        
        public static int presupuesto_dinero(double a)
        {
        int presupuesto=0;
        if (a > 0 && a <= 0.3)
        {
            presupuesto=500;
        }
        else if (a > 0.3 && a <= 0.5)
                {
            presupuesto = 800;
                }
        else if (a > 0.5 && a <= 1)
                {
            presupuesto = 1000;
                }
        return presupuesto;
                    }
    
    public static int capacidad_cuadrillas(double a)
    {
        int cuadrillas=0;
        if (a > 0 && a <= 0.2)
        {
            cuadrillas = 2;
        }
        else if (a > 0.2 && a <= 0.3)
                {
            cuadrillas = 3;
                }
        else if (a > 0.3 && a <= 1)
                {
            cuadrillas = 4;
                }
            return cuadrillas;
                    }
    
        public static int m2_presupuesto(double a)
        {
        int m2=0;
        if (a > 0 && a <= 0.35)
        {
            m2 = 100;
        }
        else if (a > 0.35 && a <= 0.6)
                {
            m2 = 200;
                }
        else if (a > 0.6 && a <= 0.7)
                {
            m2 = 300;
                }
        else if (a > 0.7 && a <= 0.9)
                {
            m2 = 400;
                }
        else if (a > 0.9 && a <= 1)
                {
            m2 = 500;
                }
            return m2;
                    }
    
    
    public static int m2_remodelacion(double a)
    {
        int tamano=0;
        if (a > 0 && a <= 0.4)
        {
            tamano= 10;
        }
        else if (a > 0.4 && a <= 0.8)
                {
            tamano = 25;
                }
        else if (a > 0.8 && a <= 0.9)
                {
            tamano = 35;
                }
        else if (a > 0.9 && a <= 1)
                {
            tamano = 50;
                }
            return tamano;
                    }


//PERSONAL
    public static String personal(double a)
    {
        String aumento="";
        if (a > 0 && a <= 0.5)
        {
            aumento = "no";// #no
        }
        else if (a > 0.5 && a <= 0.8)
        {
            aumento = "foranea";// #foranea
        }
        else if (a > 0.8 && a <= 0.95)
        {
            aumento = "certificado";// #certificado
        }
        else if (a > 0.95 && a <= 1)
        {
            aumento = "especialista";// #especialista
        }
            return aumento;
                    }


public static double volumen1(double a){
double factori = 0;

if (a>0 && a<=0.1){
factori=0.65;
}
else if (a>0.1 && a<=0.35){
factori=0.8;
}
else if (a>0.35 && a<=0.7){
factori=1;
}
else if (a>0.7 && a<=0.9){
factori=1.2;
}
else if (a>0.9 && a<=1){
factori=1.5;
}
return factori;
}


public static int especulaciones(double a)
    {
        int tamano=0;
        if (a > 0 && a <= 0.4)
        {
            tamano = 1; //#si
        }
        else if (a > 0.4 && a <= 1)
                {
            tamano = 0; //#no
                }
            return tamano;
                    }
    
    public static int cancelacion_temporal_cliente(double a)
    {
        int semanas=0;
        if (a > 0 && a <= 0.08)
        {
            semanas = 2;
        }
        else if (a > 0.08 && a <= 0.1)
                {
            semanas = 5;
                }
        else if (a > 0.1 && a <= 1)
                {
            semanas = 0;
                }
            return semanas;
                    }
    
    
    public static int porcentaje_aumento(double a)
    {
        int porcentaje=0;
        if (a > 0 && a <= 0.2)
        {
            porcentaje = 3;
                    }
        else if (a > 0.2 && a <= 0.5)
        {
            porcentaje = 4;
        }
        else if (a > 0.5 && a <= 0.8)
        {
            porcentaje = 3;
        }
        else if (a > 0.8 && a <= 1)
        {
            porcentaje = 1;
        }
            return porcentaje;
                    }
    //problemas
    public static int recision_contrato(double a)
    {
        int decision=0;
        if (a > 0 && a <= 0.95)
        {
            decision = 0; //#no
        }
        else if (a > 0.95 && a <= 1)
        {
            decision = 1; //#si
        }
            return decision;
                    }
    
    public static int actividades_atipicas(double a)
    {
        int decision=0;
        if (a > 0 && a <= 0.15)
        {
            decision = 1;  //# si
        }
        else if (a > 0.15 && a <= 1)
        {
            decision = 0;  //# no
        }
            return decision;
                    }
    
    public static int accidentes(double a)
    {
        int decision=0;
        if (a > 0 && a <= 0.8)
        {
            decision = 1;  //# si
        }
        else if (a > 0.8 && a <= 1)
        {
            decision = 0;  //# no
        }
            return decision;
                    }
    
    public static int clausuras(double a)
    {
        int decision=0;
        if (a > 0 && a <= 0.8)
        {
            decision = 0; // # no
        }
        else if (a > 0.8 && a <= 1)
        {
            decision = 1; // # si
        }
            return decision;
                    }
    
    public static int tramite_permisos(double a)
    {
        int dias=0;
        if (a > 0 && a <= 0.3)
        {
            dias = 1;}
        else if (a > 0.3 && a <= 0.5)
        {
            dias = 3;
        }
        else if (a > 0.5 && a <= 1)
        {
            dias = 7;
        }
            return dias;
                    }
    
    public static int actividades_atipicas_2_semanas(double a)
    {
        int semanas=0;
        if (a > 0 && a <= 0.3)
        {
            semanas = 4;
        }
        else if (a > 0.3 && a <= 0.5)
                {
            semanas = 6;
                }
        else if (a > 0.5 && a <= 1)
                {
            semanas = 8;
                }
            return semanas;
                    }
    
    public static int actividades_atipicas_2_tamano(double a)
    {
        int tamano=0;
        if (a > 0 && a <= 0.3)
        {
            tamano=15;
        }
        else if (a > 0.3 && a <= 0.5)
                {
            tamano = 10;
                }
        else if (a > 0.5 && a <= 1)
                {
            tamano = 5;
                }
            return tamano;
                    }
    
    
    public static int accidentes_2_tiempo(double a)
    {
        int tiempo=0;
        if (a > 0 && a <= 0.3)
        {
            tiempo = 2;
        }
        else if (a > 0.3 && a <= 0.5)
        {
            tiempo = 1;
        }
        else if (a > 0.5 && a <= 1)
        {
            tiempo = 2;
        }
            return tiempo;
                    }
    
    
    public static int accidentes_2_accidente(double a)
    {
        int accidente=0;
        if (a > 0 && a <= 0.3)
        {
            accidente = 0;
        }
        else if (a > 0.3 && a <= 0.5)
        {
            accidente = 1;
        }
        else if (a > 0.5 && a <= 1)
        {
            accidente = 2;
        }
            return accidente;
                    }
    
    public static int clausuras_tiempo(double a)
    {
        int tiempo=0;
        if (a > 0 && a <= 0.4)
        {
            tiempo = 4;
        }
        else if (a > 0.4 && a <= 0.5)
                {
            tiempo = 8;
                }
        else if (a > 0.5 && a <= 1)
                {
            tiempo = 12;
                }
            return tiempo;
                    }
    
    //RENDIMIENTOS

    public static int enfermedad(double a)
    {
        int decision=0;
        if (a > 0 && a <= 0.1)
        {
            decision = 1;  //# si
        }
        else if (a > 0.1 && a <= 1)
                {
            decision = 0; // # no
                }
            return decision;
                    }
    
    public static int enfermedad_1(double a)
    {
        int decision=0;
        if (a > 0 && a <= 0.05)
        {
            decision = 1;  //# si
        }
        else if (a > 0.05 && a <= 1)
                {
            decision = 0;  //# no
                }
            return decision;
                    }
    
    public static int necesidad_laboratorio(double a)
    {
        int decision=0;
        if (a > 0 && a <= 0.4)
        {
            decision = 1;//  # si
        }
        else if (a > 0.4 && a <= 1)
        {
            decision = 0;//  # no
        }
            return decision;
                    }
    
    public static int cuadrilla_eficiente(double a)
    {
        int aumento=0;
        if (a > 0 && a <= 0.75)
        {
            aumento = 0;
        }
        else if (a > 0.75 && a <= 0.9)
                {
            aumento = 5;
                }
        else if (a > 0.9 && a <= 0.95)
                {
            aumento = 1;
                }
        else if (a > 0.95 && a <= 1)
                {
            aumento = 10;
                }
            return aumento;
                    }
    
    public static int ocasiones_laboratorio(double a)
    {
        int aumento=0;
        if (a > 0 && a <= 0.5)
        {
            aumento = 0;
        }
        else if (a > 0.5 && a <= 0.8)
        {
            aumento = 1;
        }
        else if (a > 0.8 && a <= 0.95)
        {
            aumento = 2;
        }
        else if (a > 0.95 && a <= 1)
        {
            aumento = 3;
        }
            return aumento;
                    }
    
    
    //PERSONAL
    public static int personals(double a)
    {
        int aumento=0;
        if (a > 0 && a <= 0.5)
        {
            aumento = 0;// #no se necesita
        }
        else if (a > 0.5 && a <= 0.8)
        {
            aumento = 1;// #foranea
        }
        else if (a > 0.8 && a <= 0.95)
        {
            aumento = 2;// #certificado
        }
        else if (a > 0.95 && a <= 1)
        {
            aumento = 3;// #especialista
        }
            return aumento;
                    }
    
    public static int contratacion_maquinaria_cuadrilla(double a)
    {
        int cuadrilla=0;
        if (a > 0 && a <= 0.35)
        {
            cuadrilla = 5;// #no se necesita

        }
        else if (a > 0.35 && a <= 0.6)
        {
            cuadrilla= 10;// #foranea
        }
        else if (a > 0.6 && a <= 0.9)
        {
            cuadrilla = 15;// #certificado
        }
        else if (a > 0.9 && a <= 1)
        {
            cuadrilla = 17;// #especialista
        }
            return cuadrilla;
                    }
    
     public static int contratacion_maquinaria_reduccion(double a)
    {
        int reduccion=0;
        if (a > 0 && a <= 0.35)
        {
            reduccion=0;
        }
        else if (a > 0.35 && a <= 0.6)
        {
            reduccion = 2;
        }
        else if (a > 0.6 && a <= 0.9)
        {
            reduccion = 3;
        }
        else if (a > 0.9 && a <= 1)
        {
            reduccion = 4;
        }
            return reduccion;
                    }
    
    public static int tiempo_cuadrilla_foranea(double a)
    {
        int ocasiones=0;
        if (a > 0 && a <= 0.75)
        {
            ocasiones= 1;
        }
        else if (a > 0.75 && a <= 0.9)
                {
            ocasiones = 2;
                }
        else if (a > 0.9 && a <= 1)
                {
            ocasiones = 3;
                }
            return ocasiones;
                    }
    
    public static int tiempo_certificada(double a)
    {
        int ocasiones=0;
        if (a > 0 && a <= 0.75)
        {
            ocasiones= 1;
        }
        else if (a > 0.75 && a <= 0.9)
                {
            ocasiones = 2;
                }
        else if (a > 0.9 && a <= 1)
                {
            ocasiones = 3;
                }
            return ocasiones;
                    }
    
    public static int tiempo_especialista(double a)
    {
        int ocasiones=0;
        if (a > 0 && a <= 0.75)
        {
            ocasiones= 1;
        }
        else if (a > 0.75 && a <= 0.9)
                {
            ocasiones = 2;
                }
        else if (a > 0.9 && a <= 1)
                {
            ocasiones = 3;
                }
            return ocasiones;
                    }
    
    public static int concentracion_cuadrillas(double a)
    {
       int tamano=0;
        if (a > 0 && a <= 0.2)
        {
            tamano= 5;
        }
        else if (a > 0.2 && a <= 0.7)
                {
            tamano = 10;
                }
        else if (a > 0.7 && a <= 1)
                {
            tamano = 15;
                }
            return tamano;
                    }
    
    public static int concentraccion_personal_calificado(double a)
    {
         int tamano=0;
        if (a > 0 && a <= 0.3)
        {
            tamano = 5;
        }
        else if (a > 0.3 && a <= 0.7)
                {
            tamano = 10;
                }
        else if (a > 0.7 && a <= 1)
                {
            tamano = 15;
                }
            return tamano;
                    }
    
    public static int personal_calificado(double a)
    {
        int tipo=0;
        if (a > 0 && a <= 0.25)
        {
            tipo = 0;// #minoritario
        }
        else if (a > 0.25 && a <= 0.65)
                {
            tipo = 1;// #parcial
                }
        else if (a > 0.65 && a <= 1)
                {
            tipo = 2;// #total
                }
            return tipo;
                    }
    
    public static int maquinaria_requerida(double a)
    {
       int decision=0;
        if (a > 0 && a <= 0.6)
        {
            decision = 1;//  # si
        }
        else if (a > 0.6 && a <= 1)
        {
            decision = 0;// # no
        }
            return decision;
                    }
    
    public static int contratacion_especialista(double a)
    {
        int decision=0;
        if (a > 0 && a <= 0.55)
        {
            decision = 1;//  # si
        }
        else if (a > 0.55 && a <= 1)
                {
            decision = 0;//  # no
                }
            return decision;
                    }
    
    public static int personal_analista(double a)
    {
        int decision=0;
        if (a > 0 && a <= 0.6)
        {
            decision = 1;//  # si
        }
        else if (a > 0.6 && a <= 1)
                {
            decision = 0;//  # no
                }
            return decision;
                    }
    
    public static int tiempo_extra_costo(double a)
    {
        int costo=0;
        if (a > 0 && a <= 0.15)
        {
            costo = 100;
        }
        else if (a > 0.15 && a <= 0.4)
                {
            costo = 200;
                }
        else if (a > 0.4 && a <= 0.9)
                {
            costo = 400;
                }
        else if (a > 0.9 && a <= 1)
                {
            costo = 500;
                }
            return costo;
                    }
    
     public static int tiempo_extra_tiempo(double a)
    {
        int tiempo=0;
        if (a > 0 && a <= 0.15)
        {
            tiempo = 2;
        }
        else if (a > 0.15 && a <= 0.4)
                {
            tiempo = 3;
                }
        else if (a > 0.4 && a <= 0.9)
                {
            tiempo = 5;
                }
        else if (a > 0.9 && a <= 1)
                {
            tiempo = 6;
                }
            return tiempo;
                    }

public static String tipo_obra_gobierno(double a)
{
String tipo_obra_gobierno="";



if (a > 0 && a <= 0.15)
{
tipo_obra_gobierno = "Carretera" ; //# carretera
}
else if (a > 0.15 && a <= 0.25)
{
tipo_obra_gobierno = "Edificio"; //# edificio
}
else if (a > 0.25 && a <= 0.75)
{
tipo_obra_gobierno = "Mantenimiento"; //# servicio
}
else if (a > 0.75 && a <= 1)
{
tipo_obra_gobierno ="Proyecto"; //# proyecto
}
return tipo_obra_gobierno;
}
public static int carnes_asadas(double a)
{
int carnes=0;
if (a > 0 && a <= 0.15)
{
carnes = 0;
}
else if (a > 0.15 && a <= 0.4)
{
carnes = 2;
}
else if (a > 0.4 && a <= 0.9)
{
carnes = 1;
}
else if (a > 0.9 && a <= 1)
{
carnes = 3;
}
return carnes;
}
}
