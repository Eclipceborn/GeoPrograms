public class FinalGeoWorldPicture extends World {

    public int red; // variable of type int
    public int blue;
    public int green;

    public void go() {
        plane.showBackGround();

        plane.square(50);
        plane.pausetime = 0;
        Circle();
        Petals();
        EverythingElse();

    }

    public void Petals() {
        for (int row = 1; row < 720; row = row + 1) { // rows
            for (int col = 1; col < 999; col = col + 1) { //columns
                plane.teleport(col, row);
                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                // if color is yellow, change to pink
                if (blue > 80 && green < 190) {
                    plane.setPixelColor(255, 165, 0);}

            }

        }

    }// End of public void triangle
    public void Circle() {
        for (int row = 1; row < 720; row = row + 1) { // rows
            for (int col = 1; col < 999; col = col + 1) { //columns
                plane.teleport(col, row);
                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                // if color is yellow, change to pink
                if (green > 100) {
                    plane.setPixelColor(255, 0, 225);}
                }
            }
        }

    public void EverythingElse() {
        for (int row = 1; row < 720; row = row + 1) { // rows
            for (int col = 1; col < 999; col = col + 1) { //columns
                plane.teleport(col, row);
                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                // if color is yellow, change to pink
                if (red < 70) {
                    plane.setPixelColor(0, 0, 225);}
            }
        }
    }



}