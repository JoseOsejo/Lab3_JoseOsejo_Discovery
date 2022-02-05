/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discoveryproject;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author jcoq2
 */
public class mainDiscovery {

//constantes
        public static Scanner sc = new Scanner(System.in);
        public static ArrayList<Alumno> alumnos = new ArrayList();
        public static ArrayList<Transporte> transportes = new ArrayList();
        public static ArrayList<Transportista> transportistas = new ArrayList();
        public static ArrayList<Estacion> estaciones = new ArrayList();
        public static ArrayList<Clase> clases = new ArrayList();
        public static DateFormat date = new SimpleDateFormat("dd/MM/yyyy");
    public static void main(String[] args) throws ParseException {
        do {
            opciones(menu());
        } while (true);
    }
    
    
    public static int menu() {
        System.out.println("");
        System.out.println("****Bienvenidos a Discovery****");
        System.out.println("");
        System.out.println("0. Salir");
        System.out.println("1. Crear Clase\n"
                + "2. Crear Estaciones\n"
                + "3. Crear Alumno\n"
                + "4. Agregar Clase a Alumno\n"
                + "5. Crear Transportista\n"
                + "6. Crear Transporte\n"
                + "7. Listar Clases\n"
                + "8. Listar Estaciones\n"
                + "9. Listar Alumnos\n"
                + "10. Listar Transportistas\n"
                + "11. Listar Transportes");
        return sc.nextInt();
    }


   
    public static void opciones(int opcion) throws ParseException{
        if(opcion == 0)
            System.exit(0);
        else if(opcion == 1)
            crearClase();
            
        else if(opcion == 2)
                crearEstacion();
            
        else if(opcion == 3)
                crearAlumno();
           
        else if(opcion == 4)
                agregarClaseAlumno();
            
        else if(opcion == 5)
                crearTransportista();
            
        else if(opcion == 6)
                crearTransporte();
            
        else if(opcion == 7)
                listarClases();
            
        else if(opcion == 8)
                listarEstaciones();
        else if(opcion == 9)
            listarAlumnos();
        else if(opcion == 10)
            listarTransportistas();
        else if(opcion == 11)
            listarTransportes();
    }
    
    public static void crearClase(){
        
        System.out.println("Ingrese el Nombre de la Clase: ");
        String nombreClase = sc.next();
        System.out.println("Ingrese el codigo de la clase: ");
        int codigoClase = sc.nextInt();
        if(checkCodigoClase(codigoClase) == false)
        {
            clases.add(new Clase(nombreClase,codigoClase));
        }else{
            System.out.println("el codigo esta repetido");
        }
    }
    
    public static boolean checkCodigoClase(int codigo)
    {
        for(Clase clase: clases){
            if(clase.getCodigoClase() == codigo)
            {
                return true;
                //codigo repetido
            }
        }
        return false;
    }
    
    public static void crearEstacion(){
        System.out.println("Ingrese el nombre de la estacion: ");
        String nombreEstacion = sc.next();
        System.out.println("Ingrese coordenada x:");
        int coordX = sc.nextInt();
        System.out.println("Ingrese coordenanda y: ");
        int coordY = sc.nextInt();
        estaciones.add(new Estacion(nombreEstacion,coordX,coordY));
    }

    public static void crearAlumno() throws ParseException{
        System.out.println("Ingrese el id del Estudiante");
        int idEstudiante = sc.nextInt();
        System.out.println("Ingrese Nombre del estudiante");
        String nombre = sc.next();
        System.out.println("Ingrese cedula");
        int identidad = sc.nextInt();
        System.out.println("Ingrese fecha de Nacimiento dd/mm/yyyy");
        String fecha = sc.next();
        Date fechaNacimiento = date.parse(fecha);   
        if(validarId(identidad) == false && validarIdEstudiante(idEstudiante)== false ){
            alumnos.add(new Alumno(idEstudiante,clases,nombre,identidad,fechaNacimiento));
        }
    }
    
    public static boolean validarId(int id)
    {
        for(Alumno alumno:alumnos){
            if(alumno.getIdentidad()==id){
                return true;
            }
        }
        return false;
    }
    public static boolean validarIdEstudiante(int idEstudiante){
        for(Alumno alumno : alumnos){
            if(alumno.getIdEstudiante()== idEstudiante){
                return true;
            }
        }
        return false;
    }
    
    public static void agregarClaseAlumno() {
        System.out.println("Ingrese posicion del Alumno");
        int posAlumno = sc.nextInt();
        System.out.println("Ingrese posicion de la clase");
        int posClase = sc.nextInt();
        alumnos.get(posAlumno).getClases().add(clases.get(posClase));
        
    }
    public static void crearTransporte(){
        System.out.println("Ingrese Placa");
        String placa = sc.next();
        System.out.println("Ingrese el color");
        String color = sc.next();
        System.out.println("Ingrese el Nombre del Transportista");
        String nombre = sc.next();
        int posTrans = transportistas.indexOf(nombre);
        Transportista transportista = transportistas.get(posTrans);
        if (checkPlaca(placa) == false) {
            transportes.add(new Transporte(placa,color,transportista,estaciones));
        }
    }
    public static boolean checkPlaca(String placa){
        for(Transporte transporte: transportes){
            if(transporte.getPlaca().equalsIgnoreCase(placa)){
                return true;
            }
        }
        return false;
    }
    public static void crearTransportista() throws ParseException{
        System.out.println("Ingrese anios de experiencia");
        int anios = sc.nextInt();
        System.out.println("Ingrese Apodo del Barrio");
        String apodo = sc.next();
        System.out.println("Ingrese el nombre del transportista");
        String nombre = sc.next();
        System.out.println("Ingrese identidad: ");
        int identidad = sc.nextInt();
        System.out.println("Ingrese fecha de nacimiento");
        String fecha = sc.next();
        Date fechaNacimiento = date.parse(fecha);
        if(validarId(identidad) == false){
        transportistas.add(new Transportista(anios,apodo,nombre,identidad,fechaNacimiento));
        }
    }
    public static void listarClases(){
        for(Clase clase : clases){
            System.out.println(clase);
        }
    }
    public static void listarEstaciones(){
        for(Estacion estacion: estaciones)
        {
            System.out.println(estacion);    
        }
    }
    public static void listarAlumnos(){
        for(Alumno alumno: alumnos){
            System.out.println(alumno);
        }
    }
    public static void listarTransportistas(){
        for(Transportista trans: transportistas){
            System.out.println(trans);
        }
    }
    public static void listarTransportes(){
        for(Transporte transporte: transportes){
            System.out.println(transporte);
        }
    }
}
