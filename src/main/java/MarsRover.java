public class MarsRover {

    int[] position;

    public MarsRover() {
        position = new int[]{1,1};
    }

    public MarsRover(int x, int y) {
        position = new int[]{x,y};
    }

    public int[] getCurrentPosition() {
        return position;
    }
}
