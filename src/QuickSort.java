import java.util.Random;

public class QuickSort {

    static void sıralamaElemanları(int[] dizi, int i, int j){
        int adım = dizi[i];
        dizi[i] = dizi[j];
        dizi[j] = adım;
    }

    static int diziBolme(int[] dizi, int altDeger, int ustDeger){
        int pivot = dizi[ustDeger];
        int i = (altDeger-1);
        for(int j=altDeger;j<=ustDeger-1;j++){
            if(dizi[j]< pivot){
                i++;
                sıralamaElemanları(dizi,i,j);
            }
        }
        sıralamaElemanları(dizi,i+1,ustDeger);
        return (i+1);
    }

    static void quickSort(int[] dizi, int altDeger, int ustDeger){
        if(altDeger<ustDeger){
            int pivot = diziBolme(dizi,altDeger,ustDeger);
            quickSort(dizi,altDeger,pivot-1);
            quickSort(dizi,pivot+1,ustDeger);
        }
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

        int elemanSayısı = dizi.length;

        quickSort(dizi,0,elemanSayısı-1);
        System.out.println("Dizinin Sıralanmış Hali: ");
        diziYazdirma(dizi);
    }
}
