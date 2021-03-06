package com.hadwin.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.hadwin.models.Skill;

public interface SkillRepository extends CrudRepository<Skill, Long> {
	public List<Skill> findByLabel(String label);
}
