public class MarsRover {

    int[] position;
    Direction direction;

    public MarsRover() {
        this.position = new int[]{1,1};
        this.direction = Direction.NORTH;
    }

    public MarsRover(int x, int y, Direction direction) {
        this.position = new int[]{x,y};
        this.direction = direction;
    }

    public int[] getCurrentPosition() {
        return this.position;
    }

    public Direction getCurrentDirection() {
        return this.direction;
    }
}
