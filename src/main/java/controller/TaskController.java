package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Task;
import util.ConnectionFactory;

public class TaskController {

	public void save(Task task) {

		String sql = "INSERT INTO tasks (idProject" + "name" + "description" + "completed" + "notes" + "deadeline"
				+ "createdAt" + "updatedAt) VALUES (?,?,?,?,?,?,?,?)";
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			connection = ConnectionFactory.getConnection();
			statement = connection.prepareStatement(sql);
			statement.setInt(1, task.getIdProject());
			statement.setString(2, task.getName());
			statement.setString(3, task.getDescription());
			statement.setBoolean(4, task.isCompleted());
			statement.setString(5, task.getNotes());
			statement.setDate(6, new Date(task.getDeadline().getTime()));
			statement.setDate(7, new Date(task.getCreatedAt().getTime()));
			statement.setDate(8, new Date(task.getUpdatedAt().getTime()));
			statement.execute();
		} catch (Exception e) {
			throw new RuntimeException("Erro ao salvar a tarefa" + e.getMessage());
		} finally {
			ConnectionFactory.closeConnection(connection, statement);
		}

	}

	public void update(Task task) {
		String sql = "UPDATE tasks SET" + "idProject = ?," + "name = ?," + "description = ?," + "notes = ?,"
				+ "completed = ?," + "deadline = ?," + "createdAt = ?," + "updatedAt = ?," + "WHERE id = ?";
		Connection connection = null;
		PreparedStatement statement = null;

		try {
			// conexão com o banco de dados
			connection = ConnectionFactory.getConnection();
			// preparando query
			statement = connection.prepareStatement(sql);
			// setando valores para atualização no banco de dados
			statement.setInt(1, task.getIdProject());
			statement.setString(2, task.getName());
			statement.setString(3, task.getDescription());
			statement.setString(4, task.getNotes());
			statement.setBoolean(5, task.isCompleted());
			statement.setDate(6, new Date(task.getDeadline().getTime()));
			statement.setDate(7, new Date(task.getCreatedAt().getTime()));
			statement.setDate(8, new Date(task.getUpdatedAt().getTime()));
			statement.setInt(9, task.getId());
			// execução da query
			statement.execute();
		} catch (Exception e) {
			throw new RuntimeException("Erro ao atualizar tarefas" + e.getMessage());
		} finally {
			ConnectionFactory.closeConnection(connection, statement);
		}
	}

	public void removeById(int taskId) throws SQLException {
		String sql = "DELETE FROM tasks WHERE id = ?";
		Connection connection = null;
		PreparedStatement statement = null;

		try {
			connection = ConnectionFactory.getConnection();
			statement = connection.prepareStatement(sql);
			statement.setInt(1, taskId);
			statement.execute();
		} catch (Exception e) {
			throw new RuntimeException("Erro ao deletar tarefa (task) " + e.getMessage());
		} finally {
			ConnectionFactory.closeConnection(connection, statement);
		}
	}

	public List<Task> getAll(int idProject) {
		String sql = "SELECT * FROM tasks WHERE idProject = ?";
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;

		// lista de tarefas que será devolvida quando a chamada do metodo acontecer
		List<Task> tasks = new ArrayList<>();

		try {
			connection = ConnectionFactory.getConnection();
			statement = connection.prepareStatement(sql);
			statement.setInt(1, idProject);
			resultSet = statement.executeQuery();
			while (resultSet.next()) {
				Task task = new Task();
				task.setId(resultSet.getInt("id"));
				task.setIdProject(resultSet.getInt("idProject"));
				task.setName(resultSet.getString("name"));
				task.setDescription(resultSet.getString("description"));
				task.setNotes(resultSet.getString("notes"));
				task.setCompleted(resultSet.getBoolean("completed"));
				task.setDeadline(resultSet.getDate("deadline"));
				task.setCreatedAt(resultSet.getDate("createdAt"));
				task.setUpdatedAt(resultSet.getDate("updatedAt"));
				tasks.add(task);
			}
		} catch (Exception e) {
			throw new RuntimeException("Erro ao buscar tarefas " + e.getMessage());
		} finally {
			ConnectionFactory.closeConnection(connection, statement, resultSet);
		}
		// retornando lista de tarefas carregada do banco de dados
		return tasks;
	}
}
