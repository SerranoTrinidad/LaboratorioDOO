/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis Serrano
 */
public class MVCTest {
    
   public static void main(String[] args) {

      //fetch student record based on his roll no from the database
      Estudiante model  = retriveStudentFromDatabase();

      //Create a view : to write student details on console
     EstudianteVista view = new EstudianteVista();

      EstudianteControlador controller = new EstudianteControlador(model, view);

      controller.updateView();

      //update model data
      controller.setStudentName("Juan");

      controller.updateView();
   }

   private static Estudiante retriveStudentFromDatabase(){
      Estudiante student = new Estudiante();
      student.setName("Roberto");
      student.setRollNo("20");
      return student;
   }
    
}
