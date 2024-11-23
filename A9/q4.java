interface TVRemote{
    boolean radioSignalBulb = true;
    void volumeUp();
    void volumeDown();

}

interface SmartTVRemote extends TVRemote{
    void goBack();
    void Alixa();

}
class TV implements TVRemote{
    @Override
    public void volumeUp(){
        System.out.println("Volume is up");
    }
    @Override
    public void volumeDown(){
        System.out.println("Volume is up");
    }

}
public class q4 {
    public static void main(String args[]){
        TV tv = new TV();
        tv.volumeDown();
        tv.volumeUp();

    }
}
