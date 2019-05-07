package com.huyhoang.action;

import com.huyhoang.service.TutorialService;

public class TutorialAction {

	private String tutor;
	private String language;

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getTutor() {
		return tutor;
	}

	public void setTutor(String tutor) {
		this.tutor = tutor;
	}

	public String execute() {
		TutorialService tutorialService = new TutorialService();
		if (getLanguage() == null) {
			setTutor("Language is needed");
		} else {
			setTutor(tutorialService.getTutorialSite(getLanguage()));
		}
		return "success";
	}
}
