public class Course {

    private String name;
    private Challenge[] course;

    public Course(String name, Challenge[] course) {
        this.name = name;
        this.course = course;
    }

    public void doIt(Team team) {
        Participant[] team_on_course = team.getTeam();
        for (int i = 0; i < team_on_course.length; i++) {
            int result = 0;
            for (int j = 0; j < this.course.length; j++) {
                if (team_on_course[i].getAbility() >= this.course[j].getDifficulty()) {
                    result++;
                    System.out.println("Участник " + team_on_course[i].getName() + " успешно прошёл испытание " + this.course[j].getName());
                }
            }
            if (result == course.length) {
                team.getTeam_passed().add(team_on_course[i]);
            }

        }

    }


}
