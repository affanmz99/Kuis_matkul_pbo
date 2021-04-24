 class Lingkaran extends Bangundatar {
    double jari;
    Lingkaran (double jari){
        this.jari = jari;
    }
    @Override
    double luas()
    {
        return Math.PI * jari * jari;
    }
    @Override
    double keliling()
    {
        return Math.PI * 2.0 * jari;
    }
}   
