package br.com.gabriel.springRest.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.gabriel.springRest.model.User;

@Service
public class UserService {

    private List< User > users = new ArrayList<>( Arrays.asList( new User( 1, "Gabriel Morais", "gabriel@hotmail.com" ),
		    new User( 1, "Alessandro", "alessandro@hotmail.com" ),
		    new User( 1, "Camila", "camila@hotmail.com" ),
		    new User( 1, "Priscila", "priscila@hotmail.com" ) ) );

    public List< User > findAll ( ) {

	return Collections.unmodifiableList( users );
    }

    public void save ( User user ) {

	users.add( user );
    }

    public void removeUser ( Integer idUser ) {

	for ( User u : users ) {
	    if ( u.getId( ) == idUser ) {
		users.remove( u );
		break;
	    }
	}
    }

}
