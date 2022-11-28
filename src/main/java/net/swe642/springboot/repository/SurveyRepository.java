package net.swe642.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.swe642.springboot.model.SurveyForm;

@Repository
public interface SurveyRepository extends JpaRepository<SurveyForm,Long>{

}
