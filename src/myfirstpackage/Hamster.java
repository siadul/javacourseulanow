package myfirstpackage;

public class Hamster {
    private String name = "Boo";
    public double age = 2.5;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    String sex = "male"; // jeżeli nie mam private ani public to pole
                         // bądź metoda ma dostęp pakietowy tzn.
                         // można z niej korzystać w obrębie tego
                         // samego pakietu

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
