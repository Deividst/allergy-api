package com.text.mining.allergyapi.configuration.security;

import com.text.mining.allergyapi.model.MedicalInstitution;
import com.text.mining.allergyapi.service.MedicalInstitutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private MedicalInstitutionService medicalInstitutionService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        MedicalInstitution usuario = medicalInstitutionService.findInstitutionByUserName(username);

        if (usuario == null) {
            throw new UsernameNotFoundException("Could not find user");
        }

        return new MyUserDetails(usuario);
    }

}