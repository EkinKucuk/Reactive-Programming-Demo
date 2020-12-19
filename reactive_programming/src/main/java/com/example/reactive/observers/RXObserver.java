package com.example.reactive.observers;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import io.reactivex.disposables.Disposable;

public class RXObserver implements io.reactivex.Observer<String>{

	private static final org.slf4j.Logger logger =  LoggerFactory.getLogger(RXObserver.class);
	
	@Override
	public void onSubscribe(Disposable d) {
		
		logger.info("subscribed");
	}

	@Override
	public void onNext(String t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onError(Throwable e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onComplete() {
		// TODO Auto-generated method stub
		
	}

}
