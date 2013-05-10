package com.example.fbandroidtest;

import java.util.List;

import android.app.Application;

import com.facebook.model.GraphPlace;
import com.facebook.model.GraphUser;

public class ScrumptiousApplication extends Application {
	private List<GraphUser> selectedUsers;
	private GraphPlace selectedPlace;

	public GraphPlace getSelectedPlace() {
		return selectedPlace;
	}

	public void setSelectedPlace(GraphPlace selectedPlace) {
		this.selectedPlace = selectedPlace;
	}

	public List<GraphUser> getSelectedUsers() {
		return selectedUsers;
	}

	public void setSelectedUsers(List<GraphUser> selectedUsers) {
		this.selectedUsers = selectedUsers;
	}
}
