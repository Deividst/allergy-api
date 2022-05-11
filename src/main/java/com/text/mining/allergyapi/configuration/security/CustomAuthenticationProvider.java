package com.text.mining.allergyapi.configuration.security;

import com.text.mining.allergyapi.model.MedicalInstitution;
import com.text.mining.allergyapi.service.MedicalInstitutionService;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {

    private final MedicalInstitutionService medicalInstitutionService;

    public CustomAuthenticationProvider(MedicalInstitutionService medicalInstitutionService) {
        this.medicalInstitutionService = medicalInstitutionService;
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        String user = authentication.getName();
        String password = authentication.getCredentials().toString();

        MedicalInstitution institution = this.medicalInstitutionService.findInstitutionByUserName(user);

        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("DONATARIO"));

        if (Objects.isNull(institution) || !institution.getUserName().equals(user) && !institution.getPassword().equals(password)) {
            throw new UsernameNotFoundException("Usuário e/ou senha incorretos");
        }

        return new UsernamePasswordAuthenticationToken(institution.getUserName(), institution.getPassword(), authorities);
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
}