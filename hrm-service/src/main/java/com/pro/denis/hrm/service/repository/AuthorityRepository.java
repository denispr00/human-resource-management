package com.pro.denis.hrm.service.repository;

import com.pro.denis.hrm.domain.security.Authority;
import org.springframework.stereotype.Repository;

@Repository
public class AuthorityRepository extends AbstractRepository<Authority>{

    @Override
    public Class<Authority> getClassT() {
        return Authority.class;
    }
}
