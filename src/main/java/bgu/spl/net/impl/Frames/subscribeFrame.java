package bgu.spl.net.impl.Frames;

public class subscribeFrame implements frame {
    String receipt;


    public subscribeFrame(String receipt){
        this.receipt=receipt;
    }
    public String toString(){
        String s= "RECEIPT"+"\n"+receipt+"\u0000";
        return s;
    }

}