public class Challenge {

    private String name;
    private int difficulty;

    public Challenge(String name, int difficulty) {
        this.name = name;
        this.difficulty = difficulty;
        System.out.println("Создали курс " + this.name + " с уровнем сложности " + this.difficulty);
    }

    public String getName() {
        return name;
    }

    public int getDifficulty() {
        return difficulty;
    }
}
