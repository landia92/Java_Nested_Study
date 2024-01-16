public class Immigration implements IImmigration{
    @Override
    public void setImmigratedPerson(Nation.Citizen nationDepart, Nation.Citizen nationEnter, Person person) {
        nationDepart.removeCitizenMap(person.passportNo);
        nationEnter.setCitizenMap(person.passportNo, person);
    }

}
