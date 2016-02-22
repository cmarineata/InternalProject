public class Main {

    public static void main(String[] args) {


        SMSServiceImpl object = SMSServiceImpl.getInstance();

        object.populateList();
        object.sendMessage("Costina");
        object.sendMessage("Maria");
        object.sendMessage("Ion");
        object.sendMessage("Andrei");
        object.sendMessage("Ana");

        System.out.println(object.getList());
        object.receivedMessage();

     }
}
