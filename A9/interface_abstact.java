
interface TVRemote{
    boolean radioSignalBulb = true;
    void volumeUp();
    void volumeDown();

}

abstract class SmartTVRemote implements  TVRemote{
    abstract void goBack();
    abstract void Alixa();

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
public class interface_abstact {
    public static void main(String args[]){
        TV tv = new TV();
        tv.volumeDown();
        tv.volumeUp();

    }
}

