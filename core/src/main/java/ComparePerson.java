import java.util.Date;
import java.util.HashSet;

public class ComparePerson {

    public static boolean checkEquals(HashSet<Person> persons, Person myPerson){
        for(Person person: persons){
            if(person.getName().equals(myPerson.getName()) ||
            person.getSurname().equals(myPerson.getSurname()) ||
            person.getAge()==myPerson.getAge() ||
            person.getDateOfBirth().equals(myPerson.getDateOfBirth()))
                return true;
        }

        return false;
    }


    public static void main(String[] args) {
        Person mike = new Person("михайлов","михаил","михайлович",
                15,"m",new Date(2015, 02,11));

        Person petr = new Person("petrov","petr","petrov",
                20,"m",new Date(2019, 04,11));

        Person alex = new Person("alexandrov","alex","alexandrovich",
                25,"m",new Date(1999, 02,11));

        Person valentina = new Person("valentinova","valentina","valentinovna",
                15,"f",new Date(1998, 02,11));

        Person anton = new Person("antonov","anton","antonovich",
                26,"m",new Date(1997, 02,11));

        // Создать коллекцию
        HashSet<Person> persons= new HashSet<Person>();
        persons.add(mike);
        persons.add(petr);
        persons.add(alex);
        persons.add(valentina);
        persons.add(anton);

        // Создать человека, совпадения с которым будем искать в коллеции
        Person myPerson = new Person("petrov","petr","antonov",
                23,"m", new Date(1996, 04, 4));

        System.out.println(checkEquals(persons, myPerson));

    }
}
