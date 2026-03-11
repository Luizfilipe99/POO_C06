package exercico10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("entre com o numero de ingressos inteiros:");
        var it = input.next();
        System.out.println("entre com o numero de ingressos meios:");
        var im = input.next();
        System.out.println("entre com o valor de ingressos inteiros:");
        var ct = input.next();
        System.out.println("entre com o valor de ingressos meios:");
        var cm = input.next();

        var inginteiro = Double.parseDouble(it.replace(',', '.'));
        var ingmeia = Double.parseDouble(im.replace(',', '.'));
        var cominteiro = Double.parseDouble(ct.replace(',', '.'));
        var commeia = Double.parseDouble(cm.replace(',', '.'));

        var totalinteiro = inginteiro * cominteiro;
        var totalmeia = ingmeia * commeia;
        var total = totalmeia + totalinteiro;
        var totalingr = cominteiro + commeia;
        var med = total / totalingr;


        System.out.println("Ingressos inteiros: " + totalinteiro);
        System.out.println(" Ingressos meias: " + totalmeia);
        System.out.println(" Total: " + total);
        System.out.println(" Media por Ingresso : " + med);
    }
}