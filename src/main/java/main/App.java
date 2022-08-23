package main;

import java.util.List;

import controller.ProjectController;
import model.Project;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ProjectController projectController = new ProjectController();

		Project project = new Project();
		project.setName("PROJETO MALUCO");
		project.setDescription("MALUCAGEM");
		projectController.save(project);

		project.setName("MALUCAGE222");
		projectController.update(project);
		

		List<Project> projects = projectController.getAll();
		System.out.println("Total de projetos: " + projects.size());
		System.out.println("Dados do projeto");
		for(Project list : projects) {
			System.out.println("Dados: " + list);
		}
		
		projectController.removeById(10);
		
		
	}
}
