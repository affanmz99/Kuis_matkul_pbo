 public class Hewan extends MakhlukHidup {
    private final String EmpatKaki;
    private final String DuaKaki;
    public Hewan(String EmpatKaki, String DuaKaki){
        this.EmpatKaki = EmpatKaki;
        this.DuaKaki = DuaKaki;
    }
    @Override
    public void berdiri(){
        System.out.println("Hewan berdiri dengan "+EmpatKaki+ " dan berdiri dengan "+DuaKaki);
    }
}   

