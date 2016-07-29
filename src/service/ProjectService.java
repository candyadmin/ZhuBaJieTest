package service;

import domain.Project;
import domain.User;

public interface ProjectService  extends Service{
	/*
	 * 发布商品
	 * */
	void subProject(Project project);
}
