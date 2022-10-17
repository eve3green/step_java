package java_actually_hwtask;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public Main(){
    }

    public static void main(String[] args) {
        ArrayList<User> arrayList = new ArrayList();
        //simply use .add for User and Employee existing objects
        User u1 = new User("Ivan Ivanov", 21,true, "ivan@gmail.com", "Ukraine");
        User u2 = new User("Petro Petrov", 11,true, "petro@gmail.com", "Ukraine");
        User u3 = new User("Jane Kale", 17,false, "jane@mail.com", "USA");
        User u4 = new User("Marta Stefan", 19,false, "marta@ukr.net", "Sweden");
        User e1 = new Employee("Empoyee0 Employevich0", 35, true,"corporative@ukr.com", "Ukraine",20000.0,"Middle DA", "Kyiv");
        User e2 = new Employee("Empoyee1 Employevich1", 57, true,"nice@gmail.com", "Canada",42000.0,"Middle DevOps", "Toronto");
        User e3 = new Employee("Empoyee2 Employevich2", 21, false,"ahhh@canada.com", "Canada",25000.0,"Junior DevOps", "Toronto");
        User e4 = new Employee("Empoyee3 Employevich3", 29, false,"jeez@ukr.com", "Ukraine",10000.0,"Manager", "Kyiv");

        arrayList.add(u1);
        arrayList.add(u2);
        arrayList.add(u3);
        arrayList.add(u4);
        arrayList.add(e1);
        arrayList.add(e2);
        arrayList.add(e3);
        arrayList.add(e4);

        //Получить arraylist только с пользователями (экземпляры класса User, не Employee);
        System.out.println("All users");
        ArrayList<User> arrayListUsers = arrayList.stream().filter((var) -> !(var instanceof Employee)).collect(Collectors.toCollection(ArrayList::new));
        arrayListUsers.stream().forEach((var) -> var.toStringUser());

        //Получить средний возраст;
        System.out.println("\nAverage age among people = "+ arrayList.stream().mapToInt(User::getAge).average().getAsDouble());

        //Получить средний возраст среди несовершеннолетних;
        System.out.println("Average age among people under 18 = "+ arrayList.stream().filter((var) -> var.getAge() <= 18).mapToInt(User::getAge).average().getAsDouble());

        //Получить средний оклад на отдел;
        //arrayList.stream().filter((var) -> (var instanceof Employee)); some troubles with inheritance, get confused with it and can`t use
        //Employee method ((9(9(. 

        //Получить пользователей у которых почта "gmail.com";
        System.out.println("\ngmail.com users");
        ArrayList<User> arrayListMails = arrayList.stream().filter((var)-> (var.getMail_adress().contains("gmail.com"))).collect(Collectors.toCollection(ArrayList::new));
        arrayListMails.stream().forEach(User::toStringUser);

        //Получить электронные почты всеx совершеннолетних женщин,
        //не старше 30 лет, проживающих в Украине, которые являются сотрудниками.
        List<String> mails = arrayList.stream().filter((var)->(var.getAge()>=18 && var.getAge() <=30 && var.getCountry() == "Ukraine" && var instanceof Employee && !var.isSex())).map(User::getMail_adress).collect(Collectors.toList());
        System.out.println("\nMails of employees women 30+, from Ukraine");
        mails.stream().forEach(System.out::println);
    }
}

/*
3. Создать объект класса ArrayList, который хранит как экземпляры класса User, так и экземпляры класса Employee;
4. Работа с arraylist:

Использовать StreamAPI!!! Никаих циклов!*/