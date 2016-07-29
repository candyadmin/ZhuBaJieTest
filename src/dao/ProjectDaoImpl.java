package dao;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import domain.Project;
import domain.User;
import utils.SourceUtils;

public class ProjectDaoImpl implements ProjectDao{

	@Override
	public void  subProject(Project project) {
		String sql = "insert into project values(null,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try{
			QueryRunner runner = new QueryRunner(SourceUtils.getSource());
			runner.update(sql,project.getProjectName(),project.getClassID(),project.getArea(),project.getIsLocal(),project.getExpectWorkTime(),project.getLocation(),project.getProjectRate(),project.getIsHost(),project.getSummary(),project.getSpecialtyIDs(),project.getOtherRequire(),project.getPubDate(),project.getStatus());
		}catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
