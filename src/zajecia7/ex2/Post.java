package zajecia7.ex2;

public class Post {
    public void sendLetter(Sender sender) {
        String letterRecipientAddress = sender.getLetterRecipientAddress();
        System.out.println("Sending letter from " + sender.getAddress() +
                " to " + letterRecipientAddress
        );
    }
}
