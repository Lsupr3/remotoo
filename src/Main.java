import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean salir = false;


        try {


            while (!salir) {
                System.out.println("cuntos popochos tiene en la cama");
                var popo = sc.nextInt();

                if (popo == 0) {
                    System.out.println("conseguir uno");
                } else if (popo == 1) {
                    System.out.println("ese popocho esta mimado");
                } else if (popo == 2 || popo == 3) {
                    System.out.println("la familia de ese popocho esta equilibrado");
                } else if (popo == 3) {
                    System.out.println("son demaciados popochos no hay espacio en la cama");
                }
                for (int i = 0; i < popo; i++) {
                    System.out.println("Zzz" + i++);
                    System.out.println("todos lo popochitos estan durmiendo");
                }
            }
            System.out.println("proyecto modificado por otros programadores 04/12/2025");
            System.out.println("proyecto modificado desde github");

            System.out.println("modificando el proyecto desde el edictor de github");

        }catch (Exception e){
            System.out.println(e.getMessage());
        
        }
    }
}
