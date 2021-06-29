package com.psfroup.server.main.reposetory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psfroup.server.main.model.User;

public interface UserReposetory extends JpaRepository<User,Integer>{

}
