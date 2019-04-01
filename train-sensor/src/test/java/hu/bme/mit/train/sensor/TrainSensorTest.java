package hu.bme.mit.train.sensor;

import hu.bme.mit.train.sensor.TrainSensorImpl;
import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainUser;
import hu.bme.mit.train.user.TrainUserImpl;
	
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class TrainSensorTest {

	TrainController mockController;
	TrainUser mockUser;
	TrainSensorImpl trainSensor;


    @Before
    public void before() {
        mockController = mock(TrainController.class);
	mockUser = mock(TrainUser.class);
	trainSensor = new TrainSensorImpl(mockController, mockUser);
	mockController.setSpeedLimit(50);
    }

    @Test
    public void ThisIsAnExampleTestStub() {
        // TODO Delete this and add test cases based on the issues
    }




	@Test
	public void SpeedUnderZero()
	{
		trainSensor.overrideSpeedLimit(-1);
		verify(mockUser, times(1)).setAlarmState(true);
	}

	@Test
	public void SpeedOverMax()
	{
		trainSensor.overrideSpeedLimit(501);
		verify(mockUser, times(1)).setAlarmState(true);
	}

	
	@Test 
	public void RelativeToSlow()
	{
		trainSensor.overrideSpeedLimit(1);
		verify(mockUser, times(1)).setAlarmState(true);
	}

	@Test 
	public void CorrectWorking()
	{
		trainSensor.overrideSpeedLimit(55);
		verify(mockUser, times(0)).setAlarmState(false);
	}
}


	