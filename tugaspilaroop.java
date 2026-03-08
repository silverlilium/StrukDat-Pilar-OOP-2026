public class tugaspilaroop{
    public static void main(String[] args) {

        Kucing kucing = new Kucing("Hime", 1, "Putih");
        Anjing anjing = new Anjing("Petrik", 4, "Golden Retriever");

        System.out.println("--- Info Kucing ---");
        kucing.info();
        System.out.println("--- Info Anjing ---");
        anjing.info();
        System.out.println();

        kucing.suara();
        anjing.suara();
    }
}

abstract class Hewan{

    private String nama;
    private int umur;

    public Hewan(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama(){
        return nama;
    }

    public int getUmur(){
        return umur;
    }

    public void setUmur(int umur){
        if (umur > 0)
            this.umur = umur;
        else
            System.out.println("Umur tidak bisa negatif");
    }

    public abstract void suara();

    public void info(){
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur + " tahun");
    }
}

class Kucing extends Hewan{

    private String warna;

    public Kucing(String nama, int umur, String warna){
        super(nama, umur);
        this.warna = warna;
    }

    @Override
    public void suara(){
        System.out.println("Suara " + getNama() + " : Meng");
    }

    @Override
    public void info(){
        super.info();
        System.out.println("Warna: " + warna);
    }
}

class Anjing extends Hewan{

    private String ras;

    public Anjing(String nama, int umur, String ras){
        super(nama, umur);
        this.ras = ras;
    }

    @Override
    public void suara(){
        System.out.println("Suara " + getNama() + " : Guk Guk");
    }

    @Override
    public void info(){
        super.info();
        System.out.println("Ras  : " + ras);
    }
}

