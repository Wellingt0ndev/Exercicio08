
package exercicio08;

import java.util.Scanner;

/**
 *
 * @author Wellington F
 */
public class Exercicio08 {

    public static void main(String[] args) {
        int n1;
        int n2;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        n1 = leitor.nextInt();
        System.out.print("Digite o segundo número: ");
        n2 = leitor.nextInt();
        if (n2 < n1){
            System.out.println("O primeiro número é maior" );
        }else{
            System.out.println("O segundo número é maior");
        }
        
    }
    
}
