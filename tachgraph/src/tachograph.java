package hu.bme.mit.train.tachograph

import com.google.common.collect.Table;
import hu.bme.train.system.TrainSystem;
import hu.bme.train.controller.TrainControllerImpl;
import hu.bme.train.user.TrainUserImpl;

public class Tachograph {

private table<Date,Integer,Integer> mytable = HashBasedTable.create();
public void addTableElement(Date time,Integer speed, Integer pos ){
	mytable.put(time, speed, pos);
}
public boolean isEmpty()
{
return mytable.isEmpty();
}

	

}
