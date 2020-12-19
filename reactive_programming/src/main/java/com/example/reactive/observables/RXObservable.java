package com.example.reactive.observables;

import io.reactivex.Observer;

public class RXObservable  extends io.reactivex.Observable<String>{

	public void testObserver(Observer o) {
		
		this.just("a","b", "c", "d", "e", "f", "g", "h", "i", "j").subscribe(o);
	}
	
	@Override
	protected void subscribeActual(Observer<? super String> observer) {
		// TODO Auto-generated method stub
		
	}

	

}
