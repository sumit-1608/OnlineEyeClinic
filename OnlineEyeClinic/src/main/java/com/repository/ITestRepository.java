package com.repository;

import java.util.List;

import com.entity.Test;
import com.exceptions.TestIdNotFoundException;

public interface ITestRepository {
	Test addTest(Test test);

	Test updateTest(Test test);

	Test removeTest(int testId) throws TestIdNotFoundException;

	Test viewTest(int testId) throws TestIdNotFoundException;

	List<Test> viewAllTests();
}
