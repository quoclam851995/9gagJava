package com.morsoftware.api;

import com.morsoftware.authentication.form.request.LoginForm;
import com.morsoftware.authentication.form.request.SignupForm;
import com.morsoftware.authentication.form.response.JwtReponse;
import com.morsoftware.authentication.jwt.JwtProvider;
import com.morsoftware.entity.RoleEntity;
import com.morsoftware.entity.UserEntity;
import com.morsoftware.repository.RoleRepository;
import com.morsoftware.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashSet;
import java.util.Set;

@CrossOrigin
@RestController
@RequestMapping("/api/auth")
public class AuthApi {
    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
    UserRepository userRepository;
    @Autowired
    RoleRepository roleRepository;
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    JwtProvider jwtProvider;

    @PostMapping("/signin")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginForm loginRequest) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword())
        );
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtProvider.generateJwtToken(authentication);
        return ResponseEntity.ok(new JwtReponse(jwt));
    }
    @PostMapping("/signup")
    public ResponseEntity<String> registerUser(@Valid @RequestBody SignupForm signupRequest){
        if (userRepository.existsByUserName(signupRequest.getUsername())){
            return new ResponseEntity<String>("Fail -> Username has been available", HttpStatus.BAD_REQUEST);
        }

        if (userRepository.existsByEmail(signupRequest.getEmail())){
            return new ResponseEntity<String>("Fail -> Email has been registered", HttpStatus.BAD_REQUEST);
        }

        UserEntity userEntity = new UserEntity(signupRequest.getFullname(), signupRequest.getUsername(),
                signupRequest.getEmail(), passwordEncoder.encode(signupRequest.getPassword()));
    }
}
