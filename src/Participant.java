public class Participant {

    private String name;
    private int ability;

    public Participant(String name, int ability) {
        this.name = name;
        this.ability = ability;
        System.out.println("Создали участника по имени " + this.name + " с уровнем способности " + this.ability);
    }

    @Override
    public String toString() {
        return "Участник " + this.getName() + " с уровнем способностей " + this.getAbility();
    }


    public String getName() {
        return name;
    }

    public int getAbility() { return ability; }

}
