package Lesson_1.Marathon;

public class Main {
    public static void main(String[] args) {

        Course course = new Course(new Cross(80), new Wall(2), new Water(50), new Cross(120));
        Team team = new Team(new Human("Боб"), new Cat("Барсик"), new Dog("Бобик"));
        course.doIt(team);
        team.showResult();

// Черновик

/*        Course course = new Course();
        Team team = new Team();
        course.doIt();
        team.showResult();*/


//Исходники
/*        Competitor[] competitors = {new Human("Боб"), new Cat("Барсик"), new Dog("Бобик")};

        Obstacle[] course = {new Cross(80), new Wall(2), new Water(50), new Cross(120)};
        for (Competitor c : competitors) {
            for (Obstacle o : course) {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }
        for (Competitor c : competitors) {
            c.info();
        }*/
    }
}

