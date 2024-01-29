/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManejoTxt;

import EDD.Lista;
import EDD.Nodo;
import EDD.NodoG;
import Grafo.Grafo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.io.FileNotFoundException;

/**
 *
 * @author luis
 */
public class AdministradorTxt {
    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Selecciona un archivo TXT");
        int userSelection = fileChooser.showOpenDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            System.out.println("Archivo seleccionado: " + selectedFile.getAbsolutePath());

            // Llamar al método para leer y procesar el archivo
            leerArchivo(selectedFile);
        } else {
            System.out.println("Selección de archivo cancelada.");
        }
    }

    private static void leerArchivo(File file) {
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                System.out.println(linea);

                // Aquí puedes procesar cada línea según tu lógica específica
                // Por ejemplo, puedes dividir la línea en partes utilizando "," para las aristas
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
//    public File lecturaTxt(Lista usuarios, Lista relaciones) throws IOException{
//
//            // Creamos el JFileChooser
//            JFileChooser jfc = new JFileChooser();
//
//            // Abrimos el cuadro de diálogo de selección de archivos
//            int seleccion = jfc.showOpenDialog(null);
//
//            // Si el usuario seleccionó un archivo
//            if (seleccion == JFileChooser.APPROVE_OPTION) {
//
//                // Obtenemos el archivo seleccionado
//                File archivo = jfc.getSelectedFile();
//
//                // Creamos un flujo de entrada para leer el archivo
//                FileReader fr = new FileReader(archivo);
//                
//                JOptionPane.showMessageDialog(null, "Este programa necesita guardar en el archivo los datos cargados en memoria");
//                
//                // Leemos los datos del archivo
//                BufferedReader br = new BufferedReader(fr);
//                String linea;
//                int contador =0;
//                while ((linea = br.readLine()) != null) {
//
//                    // Si la línea es un usuario
//                    if (linea.startsWith("ciudad")) {
//                        contador=1;
//                    }
//                    if (linea.startsWith("arista")) {
//                        contador=2;
//                    }
//                    if (linea.startsWith("@")) {
//                        if (contador==1){
//                            // Agregamos la línea a la lista de usuarios
//                            usuarios.insertFinal(linea); 
//                            
//                            }
//                        if (contador ==2){
//                            // Agregamos la línea a la lista de relaciones
//                            relaciones.insertFinal(linea);
//                        } 
//                        }
//                }
//
//                // Cerramos el flujo de entrada
//                br.close();
//                return archivo;
//            }
//            JOptionPane.showMessageDialog(null, "El archivo seleccionado no es compatible");
//            return null;
//    }
//    
//    /*
//    Este metodo sobrescribe el archivo seleccionado en el metodo de lectura, escribiendo los cambios realizados en el grafo respecto a los usarios y las relaciones
//    
//    */
//    public void escrituraTxt(Grafo grafo, File archivo){
//        String textoTxt=""; //string que va a sobreescribir el archivo
//        Lista ListaTexto=new List();
//        ListaTexto.insertFinal("usuarios");
//        NodoG pointer =grafo.getNodos().getHead();
//        while(pointer!=null){
//            ListaTexto.insertFinal(pointer.getUsuario().getId()); //se insertan todos los nombres de usuario en la lista
//            pointer=pointer.getNext();
//        }
//        ListaTexto.insertFinal("relaciones");
//        Arista pointer1 =grafo.getAristas().getHead();
//        while(pointer1!=null){
//            String texto1=pointer1.getInicio().getUsuario().getId();
//            String texto2=pointer1.getObjetivo().getUsuario().getId();
//            String textoArista=texto1+", "+texto2;
//            ListaTexto.insertFinal(textoArista); //se insertan todos las relaciones en la lista
//            pointer1=pointer1.getNext();
//        }
//        Nodo nodo=ListaTexto.getHead();
//        for(int i=0; i<ListaTexto.getLength();i++){
//            textoTxt+=nodo.getElement().toString()+"\n"; //se agrega cada elemento de la lista al string con saltos de linea entre elementos
//            nodo=nodo.getNext();       
//            }
//        
//        try{
//            PrintWriter pw = new PrintWriter(archivo); 
//            pw.print(textoTxt); //se sobreescribe el archivo
//            pw.close();
//            JOptionPane.showMessageDialog(null, "Repositorio Actualizado");
//        }
//        catch(Exception err){
//            JOptionPane.showMessageDialog(null, err);
//        }
//    }
}
