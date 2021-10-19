import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class MarsRoverTest {

    @Test
    public void roverDefaultInitializedCoordinates() {
        final int[] expectedCoordinates = {1, 1};
        MarsRover rover = new MarsRover();
        assertArrayEquals(rover.getCurrentPosition(), expectedCoordinates);
    }

    @Test
    public void roverDefaultInitializedDirection() {
        MarsRover rover = new MarsRover();
        assertEquals(rover.getCurrentDirection(), Direction.NORTH);
    }

    @Test
    public void roverCustomInitializedCoordinates() {
        final int[] expectedCoordinates = {3, 4};
        MarsRover rover = new MarsRover(3,4,Direction.NORTH);
        assertArrayEquals(rover.getCurrentPosition(), expectedCoordinates);
    }

    @Test
    public void roverCustomInitializedDirection() {
        final int[] expectedCoordinates = {3, 4};
        MarsRover rover = new MarsRover(3,4, Direction.WEST);
        assertArrayEquals(rover.getCurrentPosition(), expectedCoordinates);
    }



}