package com.ravitechie.UserManagerApp.Repository;

import com.ravitechie.UserManagerApp.Entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
