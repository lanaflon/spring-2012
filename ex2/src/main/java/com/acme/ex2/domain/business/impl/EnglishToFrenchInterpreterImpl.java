package com.acme.ex2.domain.business.impl;

import com.acme.ex2.domain.business.Interpreter;
import com.acme.ex2.domain.persistence.TranslationDao;

public class EnglishToFrenchInterpreterImpl implements Interpreter {

	private TranslationDao dao;

	public EnglishToFrenchInterpreterImpl(TranslationDao dao) {
		super();
		this.dao = dao;
	}

	@Override
	public String translate(String wordValue) {
		// traitement s�mantique, syntaxique (sp�cifique � une traduction en-fr), etc.. sur wordvalue
		// acc�s au r�f�rentiel des mots et r�cup�ration du r�sultat
		String result = this.dao.getTranslation(wordValue);
		// traitement s�mantique, syntaxique (sp�cifique � une traduction en-fr), etc.. sur le r�sultat
		// renvoie du r�sultat
		return result;
	}

}
