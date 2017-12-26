package com.micro.user.microuser.core.dao.specification;

import com.micro.commons.jpa.AbstractSpecification;
import com.micro.user.microuser.core.entity.User;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 * @author liwei
 */
public class UserSpecification extends AbstractSpecification<User> {

    @Override
    public Predicate toPredicate(Root<User> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
        return null;
    }
}
