package br.com.gabriel.springRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gabriel.springRest.model.User;

@Repository
public interface UserRepository extends JpaRepository< User, Long > {

    User findByName ( String name );
}
