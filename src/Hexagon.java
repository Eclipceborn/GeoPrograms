

// int r = plane.random(1,3)
// if(r == 1) {
//    square(200)
//   }
//
// if(r == 3) {
//     circle();
//   }

// House();
//sqr();
//tri();
//plane.random(75, 200);


// sqr();
//        tri();
//        Mysqr(250);
//        plane.turn(-270);
//        plane.move(403);
//        sqr();
//        tri();



//plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
//        plane.isTrail = true;
//        plane.trailWidth = 10;
//        plane.move(130);
//        House();
//
//        House();
//        sqr();
//        tri();
//        plane.random(75, 200);



//int r = plane.random(1,3,3);
//        if(r == 1) {
//        House();
//        }
//
//        if(r == 2) {
//        Rectangle();
//        }
//
//        if(r == 3) {
//            Mysqr();
//        }





// Rectangle();
// plane.startingAngle(90);
//        plane.isTrail = true;
//        plane.trailWidth = 10;
//        plane.move(340);
//        plane.turn(90);
//        plane.move(200);
//        plane.turn(90);
//        plane.move(340);
//        plane.turn(90);
//        plane.move(200);
//        plane.turn(90);

public class Hexagon extends World {


    public void go() {


        Rectangle();
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.move(200);
        Rectangle();
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.move(200);
        Rectangle();
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.move(200);
        Rectangle();
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.move(200);
        Rectangle();

    }

    public void yo() {

        plane.setColor(0, 0, 225);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.move(130);
        plane.turn(-120);

    }

    public void ro() {

        plane.setColor(0, 225, 0);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.move(170);
        plane.turn(-120);

    }

    public void circle() {

        plane.setColor(225, 0, 0);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.pausetime = 0;
        plane.move(170);
        plane.turn(-120);

    }


    public void tri() {

        plane.startingAngle(180);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(0, 0, 225);
        plane.move(150);
        plane.turn(-120);
        plane.setColor(0, 75, 0);
        plane.move(150);
        plane.turn(-120);
        plane.setColor(245, 0, 0);
        plane.move(150);


    }

    public void sqr() {
        plane.startingAngle(180);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(0, 0, 225);
        plane.move(150);
        plane.turn(90);
        plane.move(150);
        plane.setColor(0, 0, 22);
        plane.turn(90);
        plane.move(150);
        plane.turn(90);
        plane.move(150);
        plane.turn(90);


    }
    public void Mysqr() {
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.move(300);
        plane.turn(90);
        plane.move(150);
        plane.turn(90);
        plane.move(300);
        plane.turn(90);
        plane.move(150);
        plane.turn(90);

    }


    public void Myname() {
        plane.startingAngle(90);
        plane.pausetime = (0);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.circle(23);
    }

    public void House() {


        sqr();
        tri();


    }

    public void Rectangle() {

        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.move(340);
        plane.turn(90);
        plane.move(200);
        plane.turn(90);
        plane.move(340);
        plane.turn(90);
        plane.move(200);
        plane.turn(90);
        plane.setColor(0, 0, 225);
        plane.move(150);
        plane.turn(90);
        plane.move(150);
        plane.setColor(0, 0, 22);
        plane.turn(90);
        plane.move(150);
        plane.turn(90);
        plane.move(150);
        plane.turn(90);

    }

}



