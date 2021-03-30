import java.util.Scanner;

public class Ejercicio_02{

 public static void main(String[] args){


 System.out.println("***************************************");
 System.out.println("BIENVENIDO AL SISTEMA DE CONSULTAS");
 System.out.println("**********************************");
 System.out.println("***************************");
 System.out.println("*******************");
 System.out.println("***********");
 System.out.println("*****");
 System.out.println("**");
 

 System.out.println("BUSCA VEHICULO GRANDE O DE GRAN RODADO");
 
 System.out.println("");
 System.out.println("");
 System.out.println(""); 


 Scanner entrada = new Scanner(System.in);
 

 String consulta = entrada.nextLine();


         switch (consulta){
 
           case "si":
                    System.out.println("");
                    System.out.println("---------------------------------");
                    System.out.println("OFRECER CAMIONETA O RODADO GRANDE");
                    System.out.println("---------------------------------");
                    System.out.println("");
                    System.out.println("");
                                        System.out.println("PUEDE ACCEDER A ESE MODELO?");
                                        System.out.println("");
                                        String consulta1 = entrada.nextLine();
                                        switch(consulta1){
                                       
                                                case "si":
                                                        System.out.println("");
                                                        System.out.println("!!!!VENTA!!!!");
                                                        break;
                                                case "no":
                                                        System.out.println("");
                                                        System.out.println("OFRECER VEHICULO MAS ACCECIBLE ECONOMICAMENTE");
                                                        break;
                          }
            case "no":
            System.out.println("");
            System.out.println("---------------------------------");
            System.out.println("BUSCA RODADO PARA ZONAS RURALES?");
            System.out.println("---------------------------------");
            System.out.println("");
            System.out.println("");      
            String consulta2 = entrada.nextLine();
            switch(consulta2){
               
                    case "si":
                              System.out.println("");
                              System.out.println("---------------------------------");
                              System.out.println("OFRECER CUATRICICLO");
                              System.out.println("---------------------------------");
                              System.out.println("");
                              System.out.println("");
                                      System.out.println("PUEDE ACCEDER A ESE MODELO?");
                                        System.out.println("");
                                        String consulta3 = entrada.nextLine();
                                        switch(consulta3){
                                       
                                                case "si":
                                                        System.out.println("");
                                                        System.out.println("!!!!VENTA!!!!");
                                                        break;
                                                case "no":
                                                        System.out.println("");
                                                        System.out.println("OFRECER VEHICULO MAS ACCECIBLE ECONOMICAMENTE");
                                                        break;
                                                        };
                    case "no":
                                System.out.println("");
                                System.out.println("---------------------------------");
                                System.out.println("VIAJA SEGUIDO PARA CIUDAD?");
                                System.out.println("---------------------------------");
                                System.out.println("");
                                System.out.println("");
                                String consulta4 = entrada.nextLine();
                                 switch(consulta4){
               
                                                case "si":
                                                          System.out.println("");
                                                          System.out.println("---------------------------------");
                                                          System.out.println("OFRECER AUTO CHICO");
                                                          System.out.println("---------------------------------");
                                                          System.out.println("");
                                                          System.out.println("");
                                                          System.out.println("PUEDE ACCEDER A ESE MODELO?");
                                                          System.out.println("");
                                                          String consulta5 = entrada.nextLine();
                                                          switch(consulta5){
                                                                            
                                                                            case "si":
                                                                            System.out.println("");
                                                                            System.out.println("!!!!VENTA!!!!");
                                                                            break;
                                                                            case "no":
                                                                                     System.out.println("");
                                                                                     System.out.println("OFRECER VEHICULO MAS ACCECIBLE ECONOMICAMENTE");
                                                                                     break;
                                                        }
                            }
}
}
         }
        }