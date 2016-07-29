package service;

import dao.ProjectDao;
import dao.UserDao;
import domain.Project;
import domain.User;
import factory.BasicFactory;
import utils.MD5Utils;

public class ProjectServiceImpl implements ProjectService{
	private ProjectDao dao = BasicFactory.getFactory().getDao(ProjectDao.class);
	@Override
	public void subProject(Project project) {
			dao.subProject(project);
	}
}
