public class OgrenciTest {
    public static void main(String[] args) {
       //java da obje olusturma bu sekilde
        Ogrenci ogr = new Ogrenci();
       ogr.setNo(1);
       ogr.setAd("Aziz");
       ogr.setSoyad("Sancar");
       ogr.setDogumyeri("Mardin");
       ogr.setHarc(1500);


        System.out.println(ogr.getNo() + "_" + ogr.getAd()+" "+
                ogr.getSoyad() + " "+ ogr.getHarc());

        ogr.setHarc(2000);

        System.out.println(ogr.getNo() + "_" + ogr.getAd()+" "+
                ogr.getSoyad() + " "+ ogr.getHarc());

        ogr.setHarc(-500);

        System.out.println(ogr.getNo() + "_" + ogr.getAd()+" "+
                ogr.getSoyad() + " "+ ogr.getHarc());


        Ogrenci ogr2 = new Ogrenci(2, "Ugur", "Coskun " ,
                "Turkiye", 5000);
        System.out.println(ogr2);






    }
}
