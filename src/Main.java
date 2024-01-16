public class Main {
    public static void main(String[] args) {
        AsiaNation korea = new AsiaNation("한국", "서울");
        AsiaNation japan = new AsiaNation("일본", "도쿄");
        Person gillDong = new Person("홍길동", "240101", "남자");
        Person shoma = new Person("쇼마", "240102", "남자");
        AsiaNation.Citizen koreaCitizen = new Nation.Citizen(korea);
        AsiaNation.Citizen japanCitizen = new Nation.Citizen(japan);
        koreaCitizen.setCitizenMap(1234, gillDong);
        japanCitizen.setCitizenMap(2234, shoma);
        System.out.println(koreaCitizen.getCitizenMap());
        System.out.println(japanCitizen.getCitizenMap());
        koreaCitizen.immigratedPerson(japanCitizen, shoma);
        System.out.println(koreaCitizen.getCitizenMap());
        System.out.println(japanCitizen.getCitizenMap());
    }
}