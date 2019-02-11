package hu.bme.mit.train.controller;


public class TrainControllerImplTest {

	TestImpl TrainControllerImpl = new TrainControllerImpl();

	@Test
	public void testSpeedLimit() {

	asserEquals(0,TestImpl.step);
	}

}