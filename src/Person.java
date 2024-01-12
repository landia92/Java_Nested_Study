public class Person {
    public String name;
    public String birthday;
    public String sex;
    public String nationality;
    public int passportNo;

    public Person(String name, String birthday, String sex) {
        this.name = name;
        this.birthday = birthday;
        this.sex = sex;
    }
    public void setNationality(String nationality){
        this.nationality = nationality;
    }
    public void setIdNumber(int passportNo){
        this.passportNo = passportNo;
    }
}