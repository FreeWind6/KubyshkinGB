package Lesson_1.Marathon;

public class Team {

    public Team(Competitor... competitors) {
        competitors1 = competitors;
    }

    Competitor[] competitors1;


    public void showResult() {
        for (Competitor c : competitors1) {
            c.info();
        }
    }

// Черновик
/*    Competitor[] competitors = {new Human("Боб"), new Cat("Барсик"), new Dog("Бобик")};

    public Team(Competitor[]... competitors) {
    }


    public void showResult() {
        Team teamShowResult = new Team();
        for (Competitor c : teamShowResult.competitors) {
            c.info();
        }
    }*/
}
