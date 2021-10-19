import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MarsRoverTest {

    @Test
    public void roverDefaultInitialized() {
        final int[] expectedCoordinates = {1, 1};
        MarsRover rover = new MarsRover();
        assertArrayEquals(rover.getCurrentPosition(), expectedCoordinates);
    }

    @Test
    public void roverCustomInitialized() {
        final int[] expectedCoordinates = {3, 4};
        MarsRover rover = new MarsRover(3,4);
        assertArrayEquals(rover.getCurrentPosition(), expectedCoordinates);
    }


}