package br.com.learning.model.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import br.com.learning.model.dto.TaskDTO;
import br.com.learning.model.entity.Task;

@Mapper
public interface TaskMapper {

	TaskMapper INSTANCE = Mappers.getMapper(TaskMapper.class);

	@Mapping(source = "group.id", target = "groupId")
	TaskDTO taskToTaskDTO(Task task);
	
	List<TaskDTO> taskListToTaskDTOList(List<Task> tasks);

}
