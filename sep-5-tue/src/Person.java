public class Person {
    private String name;
    private String birthday;

    public Person() {
        this.name = "John";
        this.birthday = "01/01/2000";
    }
    public Person(String name, String birthday){
        this.name = name;
        this.birthday = birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getBirthday() {
        return birthday;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return String.format("Name: %s, Birthday: %s", name, birthday);
    }

}
