//-----PROGRAM QUEUE-----//
import java.util.Queue;
import java.util.LinkedList;

public class kedai {
    
    public static void main(String[] args) {
        
        java.util.Queue<String> antriankedai = new LinkedList<String>();

        System.out.println("----------KEDAI NIRVANA----------\n");

        System.out.println("Urutan Antrian");

        antriankedai.add("Krist Novoselic");
        antriankedai.add("Kurt Cobain");
        antriankedai.add("Dave Grohl");
        antriankedai.add("Pat Smear");

    //--------------------------------------------------------------------------------//
        System.out.println(antriankedai);
        System.out.println(antriankedai.poll() + " Sudah mendapatkan makanan\n");
    //--------------------------------------------------------------------------------//
        System.out.println("Antrian tersisa\n" + "-----" + antriankedai + "-----");
        System.out.println("Pelanggan selanjutnya " + antriankedai.peek());
        System.out.println(antriankedai.poll() + " Sudah mendapatkan makanan\n");
    //--------------------------------------------------------------------------------//
        System.out.println("Antrian tersisa\n" + "-----" + antriankedai + "-----");
        System.out.println("Pelanggan selanjutnya " + antriankedai.peek());       
        System.out.println(antriankedai.poll() + " Sudah mendapatkan makanan\n");       
    //--------------------------------------------------------------------------------//
        System.out.println("Antrian tersisa\n" + "-----" + antriankedai + "-----");
        System.out.println("Pelanggan selanjutnya " + antriankedai.peek());
        System.out.println(antriankedai.poll() + " Sudah mendapatkan makanan\n");       
    //--------------------------------------------------------------------------------//
        System.out.println("Antrian tersisa\n" + "-----" + antriankedai + "-----");
        //System.out.println(antriankedai.peek());
    }
}
