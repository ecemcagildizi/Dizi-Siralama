import java.util.Random;

public class BruteForce {

    public static void main(String[] args){
        BruteForce sırala = new BruteForce();
        sırala.diziOlusturma();
    }
    static void diziYazdirma(int[] dizi){
        for(int i=0;i< dizi.length;i++){
            System.out.println(dizi[i]+" ");
        }
        System.out.println();
    }



    public void diziOlusturma(){

        Random rnd = new Random();
        int[] dizi = new int[10000];
        System.out.println("Oluşturulan Dizi: ");
        for(int i=0;i<10000;i++){
            dizi[i] = rnd.nextInt(1000);
            System.out.println(dizi[i]+" ");
        }
        System.out.println();


        System.out.println("Dizinin Sıralanmış Hali: ");
        int gecici;
        int kucukSayi;
        for(int i=0;i< dizi.length-1;i++){
            kucukSayi = i;
            for(int j=i;j< dizi.length;j++){
                if(dizi[j]<dizi[kucukSayi]){
                    kucukSayi = j;
                }
                gecici = dizi[i];
                dizi[i] = dizi[kucukSayi];
                dizi[kucukSayi] = gecici;
            }
        }
        diziYazdirma(dizi);
    }

}
