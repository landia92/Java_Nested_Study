public class Person {
    protected String name;
    protected String birthday;
    protected String sex;
    protected String nationality;
    protected int passportNo;

    protected Person(String name, String birthday, String sex) {
        this.name = name;
        this.birthday = birthday;
        this.sex = sex;
    }
    protected void setNationality(String nationality){
        this.nationality = nationality;
    }
    protected void setIdNumber(int passportNo){
        this.passportNo = passportNo;
    }
}