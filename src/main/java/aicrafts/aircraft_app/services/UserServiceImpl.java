package aicrafts.aircraft_app.services;

import aicrafts.aircraft_app.repositories.UserRepository;
import aicrafts.aircraft_app.repositories.UserRoleRepository;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRoleRepository userRoleRepository;
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final ModelMapper modelMapper;
    //Todo implement the UserDetailsService
    private final AircraftAppDetailsService aircraftAppDetailsService;
    private final PasswordEncoder encoder;

    public UserServiceImpl(UserRoleRepository userRoleRepository,
                           UserRepository userRepository,
                           PasswordEncoder passwordEncoder,
                           ModelMapper modelMapper,
                           AircraftAppDetailsService aircraftAppDetailsService, PasswordEncoder encoder) {
        this.userRoleRepository = userRoleRepository;
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.modelMapper = modelMapper;
        this.aircraftAppDetailsService = aircraftAppDetailsService;
        this.encoder = encoder;
    }
    @Override
    public boolean usernameExists(String username) {
        return userRepository.findByUsername(username).isPresent();

    }

    @Override
    public void registerAndLoginUser() {

    }


//    private final UserEntity userRepository;
//    private final PasswordEncoder passwordEncoder;
//    private final ModelMapper modelMapper;
//    private final PasswordEncoder encoder;
//
////    public UserServiceImpl(UserEntity userRepository, PasswordEncoder passwordEncoder, ModelMapper modelMapper, PasswordEncoder encoder) {
////        this.userRepository = userRepository;
////        this.passwordEncoder = passwordEncoder;
////        this.modelMapper = modelMapper;
////        this.encoder = encoder;
////    }
}
