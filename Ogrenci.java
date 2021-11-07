public class Ogrenci {

    // Encapsulation ( bilgi gizleme - information Hidding)
    // degiskenler private yaparak gizlenir, get-setlerle islem yapilir.

    private int no;
    private String ad;
    private String soyad;
    private String dogumyeri;
    private double  harc;


    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getDogumyeri() {
        return dogumyeri;
    }

    public void setDogumyeri(String dogumyeri) {
        this.dogumyeri = dogumyeri;
    }

    public double getHarc() {
        return harc;
    }

    public void setHarc(double harc) {
        if (harc>0) {
            this.harc = harc;
        }




    }



}
