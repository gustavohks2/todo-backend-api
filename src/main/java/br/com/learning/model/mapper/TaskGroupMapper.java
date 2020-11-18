package br.com.learning.model.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import br.com.learning.model.dto.TaskGroupDTO;
import br.com.learning.model.entity.TaskGroup;

@Mapper
public interface TaskGroupMapper {
	
	TaskGroupMapper INSTANCE = Mappers.getMapper(TaskGroupMapper.class);
	
	public TaskGroupDTO taskTotaskGroupDTO(TaskGroup taskGroup);
	
}
