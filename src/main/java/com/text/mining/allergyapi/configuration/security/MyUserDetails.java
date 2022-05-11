package com.text.mining.allergyapi.configuration.security;

import com.text.mining.allergyapi.model.MedicalInstitution;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MyUserDetails implements UserDetails {

    private static final long serialVersionUID = 786980730449565102L;
    private final MedicalInstitution institution;

    public MyUserDetails(MedicalInstitution user) {
        this.institution = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("USER"));

        return authorities;
    }

    @Override
    public String getPassword() {
        return institution.getPassword();
    }

    @Override
    public String getUsername() {
        return institution.getUserName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}