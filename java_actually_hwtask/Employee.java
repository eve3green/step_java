package java_actually_hwtask;

public class Employee extends User{
    private double salary;
    private String position;
    private String office;
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public Employee(String fullname, int age, boolean sex, String mail_adress, String country, double salary, String position, String office)
    {
        super(fullname, age, sex, mail_adress, country);
        this.salary = salary;
        this.position = position;
        this.office = office;
    }
    public void toStringEmployee()
    {
        String sexS = "";
        if(isSex()) sexS = "male"; else sexS = "female";
        System.out.println("{" +
                " fullname: " + getFullname()+
                " age: " + getAge() +
                " sex: " + sexS +
                " mail: " + getMail_adress() +
                " country: " + getCountry() +
                " salary: " + salary +
                " position: " + position +
                " office: " + office +
                " }");
    }
}
/*Создать класс Employee наследника от User, который должен хранить следующую информацию:
оклад, должность, отдел;*/