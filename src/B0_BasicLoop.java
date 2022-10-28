public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {


        plane.isTrail = true;
        plane.trailWidth = 50;
        plane.pausetime = 0;
        squareGrid();
        }



        public void squareGrid(){
            for (int row = 0;  row < 10; row = row + 1) {
                squareRow(row);
            }
    }


    public void squareRow(int row) {
        for (int col = 0; col < 10; col = col + 1) {
            plane.setColor(20*row,100,100);
            plane.teleport(col*50, row*50);
            System.out.println(col);
            plane.square(50);

        }

    }

}



//public void 4Square() {
//        plane.isTrail=true;
//        for(int x=0;x<5;x=x+1)
//        {
//            System.out.println(x);
//            plane.turn(90);
//            plane.square(100);
//            plane.move(200);
//
//        }