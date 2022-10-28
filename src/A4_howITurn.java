

public class A4_howITurn extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        plane.startingAngle(180);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(0, 0, 225);
        plane.move(150);
        plane.turn(-120);
        plane.setColor(0, 0, 0);
        plane.move(150);
        plane.turn(-120);
        plane.setColor(245, 0, 0);
        plane.move(150);

    }


}
