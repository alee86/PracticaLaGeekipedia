public class Promedio{
  public static void main(String args[]){
    
    int matematicas = 5;
    int biologia = 2;
    int quimica = 7;
    int promedio = 0;

    promedio = (matematicas + biologia + quimica)/3;

    if (promedio >= 6) {
      System.out.print("El alumno aprobó con: " + promedio);
      
    } else {
      System.out.print("El alumno rerobó con: " + promedio);
      }
    
  }
}