package com.example.reactive.observables;

import java.util.List;

import com.example.reactive.models.Shape;
import com.example.reactive.utils.RXUtils;

import io.reactivex.Observer;

public class RXObservable  extends io.reactivex.Observable<Object>{

	
	List<Shape> shapes = RXUtils.shapes(5);
	
	public void testObserver(Observer o) {
		
		this.just("a","b", "c", "d", "e", "f", "g", "h", "i", "j").subscribe(o);
	}
	
	@Override
	protected void subscribeActual(Observer<Object> observer) {
		// TODO Auto-generated method stub
		
	}

	

}
