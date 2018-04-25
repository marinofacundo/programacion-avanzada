package patronObserver;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
List<IObserver> obs = new ArrayList<IObserver>();

public void add (IObserver o){
	obs.add(o);
}
public void notifyObs(Double v){
	for (IObserver o : obs){
		o.Update(v);
	}
}
}
