public class Main {
    public static void main(String[] args) {
        DefaultNation asiaNation = new DefaultNation("나라명", "수도");
        Person person = new Person("이름", "생일", "성별");
        DefaultNation.Citizen asiaCitizen = new Nation.Citizen(asiaNation);
    }
}