
import java.text.DecimalFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Firman
 */
public class Main {
    public static void main(String[] args) {
        //menghilangkan angka dibelakang koma
        DecimalFormat twoDForm = new DecimalFormat("#.#");
        DecimalFormat twoDForm1 = new DecimalFormat("#");
        DecimalFormat twoDForm2 = new DecimalFormat("#");

        Bola bol = new Bola();
        bol.setJariJari(7);

        Tabung tab = new Tabung();
        tab.setJariJari(10);
        tab.setTinggi(21);

        Kerucut ker = new Kerucut();
        ker.setJariJari(14);
        ker.setTinggi(9);

        System.out.println("Volume Bola : " + twoDForm.format(bol.volume()) + " cm3");
        System.out.println("Volume tabung : " + twoDForm1.format(tab.volume()) + " cm3");
        System.out.println("Volume kerucut : " + twoDForm2.format(ker.volume()) + " cm3");
    }

}
