package com.sympatica.DataAccess.repository;

/**
 * Created by NguyenTrung on 11/9/17.
 */

import com.sympatica.entity.ApplicationUser;
import org.springframework.data.repository.CrudRepository;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<ApplicationUser, String> {
    ApplicationUser findByEmail(String email);
    ApplicationUser findById(String id);
}