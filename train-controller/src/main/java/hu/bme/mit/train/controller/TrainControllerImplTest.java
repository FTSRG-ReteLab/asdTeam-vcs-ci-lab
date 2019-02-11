package hu.bme.mit.train.controller;

import hu.bme.mit.train.interfaces.TrainController;


public class TrainControllerImplTest {

	TestImpl TrainControllerImpl = new TrainControllerImpl();

	@Test
	public void testSpeedLimit() {

	assertEquals(0,TestImpl.getReferenceSpeed());
	}

}