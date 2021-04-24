public class Manusia extends Mahlukhidup {
    private final String DuaKaki;
    public Manusia(String DuaKaki){
        this.DuaKaki=DuaKaki;
    }
    @Override
    public void berdiri(){
        System.out.println("Manusia berdiri dengan "+DuaKaki);
    }
} 

