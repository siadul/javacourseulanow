package zajecia7.ex2;

public class Sender {
    private Letter letter;
    String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setLetter(Letter letter) {
        this.letter = letter;
    }

    String getLetterRecipientAddress() {
        return this.letter.getRecipientAddress();
    }
}
