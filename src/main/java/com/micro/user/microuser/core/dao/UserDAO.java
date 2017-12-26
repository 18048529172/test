package com.micro.user.microuser.core.dao;

import com.micro.commons.jpa.JpaDAO;
import com.micro.user.microuser.core.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface UserDAO extends JpaDAO<User> {

}
