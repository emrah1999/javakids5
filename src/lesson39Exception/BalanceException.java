package lesson39Exception;

public class BalanceException extends Exception{
    private String internalMessage;
    public BalanceException(String  message,String internalMessage){
        super(message);
        this.internalMessage=internalMessage;
    }
    public String getInternalMessage() {
        return internalMessage;
    }
}
