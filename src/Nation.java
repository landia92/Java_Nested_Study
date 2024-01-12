import java.util.HashMap;
import java.util.Map;

public abstract class Nation {
    protected String continent = "전세계";
    protected String nationName;
    protected String capital;

    Nation(String nationName, String capital){
        this.nationName = nationName;
        this.capital = capital;
    }

    //출입국 인터페이스
    interface IImmigration{
        Map<Integer, Person> depart(Map<Integer, Person> citizenMap);
        Map<Integer, Person> enter(Map<Integer, Person> citizenMap);
    }

    static class Citizen implements IImmigration{
        protected Map<Integer, Person> citizenMap = new HashMap<>();
        String nationName;

        //국가명 가져오기
        Citizen(Nation nation){
            this.nationName = nation.nationName;
        }

        //국민을 담을 Map선언
        protected Map<Integer, Person> getCitizenMap() {
            return citizenMap;
        }

        //국민에 사람(Person)추가하고 사람(Person)에게 국적과 여권번호 부여
        protected void setCitizenMap(int passportNo, Person person){
            citizenMap.put(passportNo, person);
            person.setNationality(nationName);
            person.setIdNumber(passportNo);
        }

        //여권번호로 Map삭제
        protected void removeCitizenMap(int passportNo){
            citizenMap.remove(passportNo);
        }

        @Override
        //출국
        public Map<Integer, Person> depart(Map<Integer, Person> citizenMap) { return citizenMap; }

        @Override
        //입국
        public Map<Integer, Person> enter(Map<Integer, Person> citizenMap) {
            return citizenMap;
        }
    }

}