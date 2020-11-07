import java.util.Date;

public class PersonUtil {

    public static Person createWomen(String name, String surname, String patronymic,int age, Date date){
        return new Person(name, surname, patronymic,age,"f", date);
    }

    public static Person createMen(String name, String surname, String patronymic,int age, Date date){
        return new Person(name, surname, patronymic,age,"m", date);
    }

    public static Person personWithNameSurname(String name, String surname){
        return new Person(name, surname," ",0," ",new Date(1900,01,01));
    }

}
