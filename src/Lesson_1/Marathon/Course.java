package Lesson_1.Marathon;

public class Course {

    public Course(Obstacle... obstacles) {
        obstacles1 = obstacles;
    }

    Obstacle[] obstacles1;

    public void doIt(Team team) {
        for (Competitor c : team.competitors1) {
            for (Obstacle o : obstacles1) {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }
    }

// Черновик

/*    Obstacle[] course = {new Cross(80), new Wall(2), new Water(50), new Cross(120)};

    public Course(Obstacle... obstacles) {
    }

    public void doIt() {
        Team teamDoIt = new Team();
        for (Competitor c : teamDoIt.competitors) {
            for (Obstacle o : course) {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }
    }*/
}
