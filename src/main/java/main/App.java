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
		project.setName("Projeto Teste");
		project.setDescription("Descriptions");
		projectController.save(project);

		project.setName("Novo nome do projeto");
		projectController.update(project);

		List<Project> projects = projectController.getAll();
		System.out.println("Total de projetos: " + projects.size());
		
	}
}
