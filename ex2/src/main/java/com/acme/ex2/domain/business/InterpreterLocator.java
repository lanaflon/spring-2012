package com.acme.ex2.domain.business;


public interface InterpreterLocator {
	// a besoin des interpr�teurs (chacun identifi� par un couple langIn-langOut, exemple : en-fr)
	public abstract Interpreter getAppropriateInterpreter(String langInOut);
}