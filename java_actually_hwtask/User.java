package java_actually_hwtask;

public class User {
    private String fullname;
    private int age;
    private boolean sex;
    private String mail_adress;
    private String country;

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getMail_adress() {
        return mail_adress;
    }

    public void setMail_adress(String mail_adress) {
        this.mail_adress = mail_adress;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public User(String fullname, int age, boolean sex, String mail_adress, String country)
    {
        this.fullname = fullname;
        this.age = age;
        this.sex = sex;
        this.mail_adress = mail_adress;
        this.country = country;
    }

    public void toStringUser()
    {
        String sexS = "";
        if(sex) sexS = "male"; else sexS = "female";
        System.out.println("{" +
                " fullname: " + fullname+
                " age: " + age +
                " sex: " + sexS +
                " mail: " + mail_adress +
                " country: " + country+
                " }");
    }
}
/*1. Создать класс User, который должен хранить следующую инф. о пользователе: полное имя, возраст, пол,
электронную почту, страну проживания;*/