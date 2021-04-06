package aicrafts.aircraft_app.services;

import aicrafts.aircraft_app.model.entities.UserEntity;
import aicrafts.aircraft_app.repositories.UserRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class AircraftAppDetailsService implements UserDetailsService {
    private final UserRepository userRepository;

    public AircraftAppDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity = userRepository.
                findByUsername(username).
                orElseThrow(() -> new UsernameNotFoundException("User with name " + username + " was not found!"));

        return mapToUserDetails(userEntity);

    }
    //Modification of the given method with the new User
    private UserDetails mapToUserDetails(UserEntity userEntity) {
        List<GrantedAuthority> authorities =
                userEntity.getRoles().
                        stream().
                        map(r -> new SimpleGrantedAuthority("ROLE_" + r.getRole().name())).
                        collect(Collectors.toList());

        return new User(
                userEntity.getUsername(),
                userEntity.getPassword(),
                authorities
        );
    }
}
