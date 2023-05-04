/* */
package emisora_ejercicio;

import java.util.Scanner;

public class Emisora_ejercicio {

    public static void main(String[] args) {
        Scanner objread=new Scanner(System.in);
        int[] boletas=new int[100]; 
        int pos=-1,ced_bus,sw,j;
        String resp;
        System.out.print("¿Desea ingresar un oyente? ");
        resp=objread.next();
        while (!resp.equals("No")){
        System.out.print("Cedula del oyente ");
        ced_bus=objread.nextInt();
        sw=0;
        j=0;
        while (j <= pos && sw == 0)
            if (boletas[j] == ced_bus)
                sw=1;
            else
                j++;
        if (sw == 0){
            pos++;
            boletas[pos]=ced_bus;  
            System.out.println("Boleta asignada a " + ced_bus);
        }else
            System.out.println("Cedula ya registrada ");
            System.out.println("¿Desea ingresar otro oyente? ");
            resp=objread.next();
        } 
        System.out.println("\n\n\t Boletas asignadas \n");
        for (int i = 0; i <= pos; i++) {
            System.out.print(boletas[i] + "  ");
        }
    }
}