package lab4_4;

public class Japan extends Country{
    public Japan(){
        this.name=new String("Japan");
    }
    public void sendMessageByWTO(String country,String msg){
        wto.sendMessage(this.name,country,msg);
    }
}
