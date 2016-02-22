import java.util.*;

public class SMSServiceImpl implements SMSService {

    List<String> myMessages = new ArrayList<>();

    public void populateList() {
        myMessages.add("Ana");
        myMessages.add("Ion");
        myMessages.add("Maria");
    }

    public void sendMessage(String message) {
        if (myMessages.indexOf(message) != -1) {
            myMessages.set(myMessages.indexOf(message), myMessages.get(myMessages.size() - 1));
            myMessages.remove(myMessages.get(myMessages.size() - 1));
            myMessages.add(message);
        } else {
            myMessages.add(message);
        }
    }

    public String receivedMessage() {
        String lastElement = myMessages.get(myMessages.size() - 1);
        System.out.println("Last message received is: " + lastElement);
        return lastElement;
    }

    public List<String> getList() {
        return myMessages;
    }

    // ***Singleton pattern***
    private static SMSServiceImpl instance = new SMSServiceImpl();

    private SMSServiceImpl() {}

    //Get the only object available
    public static SMSServiceImpl getInstance() {
        return instance;
    }


}