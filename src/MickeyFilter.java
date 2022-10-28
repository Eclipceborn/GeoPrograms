public class MickeyFilter extends World {

    public int red; // variable of type int
    public int blue;
    public int green;

    public void go() {
        System.out.println("This will be printed to the  window. ");
        plane.teleport(0, 0);
        plane.showBackGround(); //method that shows a picture( file name found on line 12 of run my program

        filter();
        filterhead();


    }

    public void filter() {
        for (int row = 500; row < 680; row = row + 1) { // rows
            for (int col = 50; col < 430; col = col + 1) { //columns
                plane.teleport(col, row);
                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                // if color is yellow, change to pink
                if (blue < 100 && green > 150) {
                    plane.setPixelColor(255, 192, 203);
                }

                //plane.setPixelColor(255,192,203);
            } // end of shoe filter
        }
    }

        public void filterhead() {
            for (int row = 36; row < 264; row = row + 1) { // rows
                for (int col = 38; col < 444; col = col + 1) { //columns
                    plane.teleport(col, row);
                    red = plane.howMuchRed();
                    green = plane.howMuchGreen();
                    blue = plane.howMuchBlue();
                    // if color is yellow, change to pink
                    if (blue < 180 && green < 100) {
                        plane.setPixelColor(200, 85, 168);
                    }
                }
            }

        }
    }