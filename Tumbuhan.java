
public class Tumbuhan extends Mahlukhidup {
    private final String Akar;
    public Tumbuhan (String Akar){
        this.Akar = Akar;
    }
    @Override
    public void berdiri(){
        System.out.println("Tumbuhan berdiri dengan "+Akar);
    }
}  
